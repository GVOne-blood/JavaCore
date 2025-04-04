import java.io.IOException;
import java.net.*;
public class NetworkingWithSocket {
    // InetAddress
    public static InetAddress getByName(String host) //trả về tên của host
            throws UnknownHostException {
        return InetAddress.getAllByName(host)[0];
    }

    public static InetAddress[] getAllByName(String host)
            throws UnknownHostException {

        return null;
        }
    // ServerSocket
        //Constructors


    {
        try {
            ServerSocket ss = new ServerSocket();
            ServerSocket ss2 = new ServerSocket(8080);
            ServerSocket ss3 = new ServerSocket(8080, 100);

            // method

            ss.accept();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    //Socket

   Socket s = new Socket();

//        try {
//            Socket s2 = new Socket("www.google.com", 8080);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        public static void main(String[] args) {
        InetAddress inet;
        InetAddress [] inets;
        try{
            inet = InetAddress.getByName("www.dantri.com.vn");
            //inet = InetAddress.getByName(args[0]); // lấy từ terminal dòng đầu tiên
            inets = InetAddress.getAllByName("www.google.com");
            System.out.println("Name : " + inet.getHostName());
            System.out.println("IP : " + inet.getAddress());
            for (InetAddress i : inets) {
                System.out.println("Name : " + inet.getHostName());
                System.out.println("IP : " + inet.getAddress());
            }
        } catch (UnknownHostException e) {
           // throw new RuntimeException(e);

        }
        // SOcket
            // Kỹ thuật lập trình mạng theo mô hình client/server theo mô hình TCPSocket
            //Chuong trình gồm 2 phần mềm
            //1 Chương trình Server gồm
                // Tạo đối tượng ServerSocket
                // Đặt đối tượng ServerSocket ở chế độ lắng nghe, chờ tín hiệu kết nối từ máy khách
                // nếu có, nó tạo ra 1 đối tượng Socket mới để phục vụ, ServerSocket tiếp tục có thể đặt ở trạng thái nghe chờ kết nối mới
                // Tạo ra luồng nhập xuất cho Socket vừa kết nối(Có thể kiểu Byte, Char)
                // Thực hiện trao đổi dữ liệu qua mạng thông qua luồng nhập suất của Socket
                // Đóng Socket, giải phóng tài nguyên
            //2 Chương trình Client
                // Tạo đối tượng Socket
                // Thiết lập kết nối với máy từ xa
                // Tạo luồng nhập xuất cho Socket (Byte, Char)
                //  Thực hiện truyền dữ liệu qua mạng qua luồng nhập xuất của Socket
                // Đóng Socket giải phóng tài nguyên (nếu kết thúc)
//
            // Ví dụ 1
            // Viết network application sử dụng TCPSocket, gồm:
            // Chương trình Client :
                //+ Tạo ra 1 Socket và thiết lập kết nối với Server
                //+ Gửi đến Server chuỗi HelloWorld
                //+ Đọc kết quả trả về và hiển thị
                //+ Kết thúc chương trình
            // Chương trình Server
                //+ Nhận kết nối gửi tới từ Client
                //+ Nhận chuỗi gửi tới từ máy khách
                //+ Hiển thị tên, IP, port, chuỗi nhận được từ máy khách ra màn hình
                //+ Đổi chuỗi nhận được thành chuỗi in hoa, trả kết quả về cho máy khách
                //+ Kết thức chương trình
            //  Client.java | Server.java
            // Ví dụ 2
            // Chuỗi bất kỳ nhập từ bàn phím, chương trình chỉ kết thúc khi nhập vào chuôi "Quit"
            // Ví dụ 3
            // Sưa vd2 để ctrinh trơ thành ctrinh chat giua 2 may

            // Ví dụ 4
            // Viết chương trình ứng dụng mạng theo mô hình Client/ Server dùng TPCSocket
            // Client :
                // Log in với giao diện GUI
                    // CHương trình cho phép nhập tài khoản gửi tới Server, nếu đúng sẽ hiển thị hộp thông báo log in thành công (JOptionPane)
                    // nếu sai hiển thị "Tai khoan khong ton tai " và kết thúc chương trình
    }
}
