import java.io.*;

class BufferReaderExample {
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter your name: ");
        try {
            String name = br.readLine();
            System.out.println("Welcome " + name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}