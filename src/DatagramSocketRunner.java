import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DatagramSocketRunner {


    public static void main(String[] args) throws IOException {

        try (var datagramSocket = new DatagramSocket();
             Scanner sc = new Scanner(System.in);) {
            while (sc.hasNextLine()) {
                String request = sc.nextLine();
                var bytes = request.getBytes();
                var localhost = InetAddress.getByName("localhost");
                DatagramPacket packet = new DatagramPacket(bytes,bytes.length,localhost,77);
                datagramSocket.send(packet);
            }
        }
    }
}
