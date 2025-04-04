import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class NetworkingWithUDP {
    static DatagramSocket ds;

    static {
        try {
            ds = new DatagramSocket();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    static DatagramSocket ds2;

    static {
        try {
            ds2 = new DatagramSocket(8080);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DatagramPacket dp = new DatagramPacket(new byte[]{},10 ); // bộ đệm buff chứa data, length là chiêu dài bộ đệm

        InetAddress in;
        DatagramPacket dp2 = new DatagramPacket(new byte[]{}, 10, 8080);

        // viết chương trình Client/Server sử dụng UDPSocket
        // Server :
            //Tạo ra đối tượng DataGramSocket với số cônnrg xác định
            //Khai báo bộ đệm nhập xuất (Byte)
            //Tạo gói tin gửi nhận DataGramPacket
            //Thực hiện gửi nhận gói tin bằng cách phương thức send(), receive()
            //Đóng Socket giải phóng tài nguyên
        //Client
            //Tạo đối tượng DataGramSocket với số cổng nào đó
            //Các bước còn lại giống Server
            //...

        //bt : xây dựng chương trình ServerTCP đáp ứng nhiều kết nối đồng thời sử dụng kỹ thuật đa luồng(tính diện tích bài 8 học kết hợp)
    }

    public NetworkingWithUDP() throws SocketException {
    }
}
