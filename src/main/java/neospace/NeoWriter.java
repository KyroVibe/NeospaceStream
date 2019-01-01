package neospace;

import java.net.*;

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
        osw.write(buf);
    }

    public void Flush() {
        osw.flush();
    }

    public void Close() {
        osw.close();
    }

}