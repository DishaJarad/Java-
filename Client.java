import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");

            byte[] fileBytes = new byte[1024];
            InputStream is = socket.getInputStream();

            FileOutputStream fos = new FileOutputStream("received_file.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int bytesRead = is.read(fileBytes, 0, fileBytes.length);
            bos.write(fileBytes, 0, bytesRead);
            bos.flush();

            System.out.println("File received successfully.");

            bos.close();
            fos.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
