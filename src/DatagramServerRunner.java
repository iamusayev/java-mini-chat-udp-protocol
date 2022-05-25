import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerRunner {

    public static void main(String[] args) throws IOException {
        try (var datagramServer = new DatagramSocket(77)) {
            while (true) {
                var bytes = new byte[400];

                DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
                datagramServer.receive(packet);
                String request = new String(bytes);
                System.out.println(request);
            }
        }
    }


}
