package neospace;

import java.io.*;

public class NeoWriter {

    private OutputStreamWriter osw;

    public NeoWriter(OutputStream ou) {
        osw = new OutputStreamWriter(ou);
    }

    public void Write(String a) {
        char[] buf = new char[a.length()];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = a.charAt(i);
        }
        try {
            osw.write(buf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Flush() {
        try {
            osw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Close() {
        try {
            osw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}