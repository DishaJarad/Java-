import java.net.URL;

class urldemo {
    public static void main(String args[]) {
        try {
            URL hp = new URL("http://www.gppune.ac.in/");
            System.out.println("Protocol: " + hp.getProtocol());
            System.out.println("Port: " + hp.getPort());
            System.out.println("Host: " + hp.getHost());
            System.out.println("File: " + hp.getPath());
            System.out.println("Ext:" + hp.toExternalForm());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}