package neospace;

import java.io.InputStream;
import java.io.InputStreamReader;

public class NeoReader {

    private InputStreamReader isr;

    public static void Test() {
        System.out.println("Testing Bitches");
    }

    public NeoReader(InputStream in) {
        isr = new InputStreamReader(in);
    }

    public String readLine() {
        char[] seq = new char[256];
        try {
            isr.read(seq);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = "";
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == Character.UNASSIGNED) {
                return a;
            } else {
                a += seq[i];
            }
        }
        return a;
    }

}