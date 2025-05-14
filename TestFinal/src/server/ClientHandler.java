// src/com/example/server/ClientHandler.java
package server;

import common.ThietBi;
import java.io.*;
import java.net.Socket;
// import java.sql.Connection; // Sẽ dùng cho Câu 2
// import java.sql.PreparedStatement; // Sẽ dùng cho Câu 2
// import java.sql.SQLException; // Sẽ dùng cho Câu 2

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    // private Connection dbConnection; // Sẽ dùng cho Câu 2

    // Constructor cho Câu 1
    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    // Constructor cho Câu 2
    // public ClientHandler(Socket socket, Connection connection) {
    //     this.clientSocket = socket;
    //     this.dbConnection = connection;
    // }


    @Override
    public void run() {
        String clientAddress = clientSocket.getInetAddress().getHostAddress();
        int clientPort = clientSocket.getPort();
        System.out.println("Đã kết nối với client: " + clientAddress + ":" + clientPort);

        try (ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
             // ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream()) // Sẽ dùng cho Câu 2
            ) {
            Object inputObject;
            while ((inputObject = ois.readObject()) != null) {
                if (inputObject instanceof String && "quit".equalsIgnoreCase((String) inputObject)) {
                    System.out.println("Client " + clientAddress + ":" + clientPort + " đã gửi tín hiệu thoát.");
                    break;
                }
                if (inputObject instanceof ThietBi) {
                    ThietBi tb = (ThietBi) inputObject;
                    
                    // Câu 1: Hiển thị ra màn hình server
                    Server.printTableRow(tb.toTableRowData(clientAddress, clientPort));

                    // Câu 2: Lưu vào DB và gửi phản hồi (sẽ bỏ comment và sửa đổi)
                    /*
                    try {
                        saveToDatabase(tb, clientAddress, clientPort);
                        oos.writeObject("Ban ghi nhap thanh cong");
                        oos.flush();
                    } catch (SQLException e) {
                        System.err.println("Lỗi lưu vào DB cho client " + clientAddress + ":" + clientPort + ": " + e.getMessage());
                        oos.writeObject("Loi: " + e.getMessage());
                        oos.flush();
                    }
                    */
                }
            }
        } catch (EOFException e) {
            System.out.println("Client " + clientAddress + ":" + clientPort + " đã ngắt kết nối (EOF).");
        } catch (IOException e) {
            if (e.getMessage() != null && e.getMessage().contains("Connection reset")) {
                 System.out.println("Client " + clientAddress + ":" + clientPort + " đã ngắt kết nối (Connection reset).");
            } else {
                System.err.println("Lỗi I/O với client " + clientAddress + ":" + clientPort + ": " + e.getMessage());
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy lớp đối tượng từ client " + clientAddress + ":" + clientPort + ": " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Lỗi đóng socket cho client " + clientAddress + ":" + clientPort + ": " + e.getMessage());
            }
            System.out.println("Đã đóng kết nối với client: " + clientAddress + ":" + clientPort);
        }
    }

    // Phương thức này sẽ dùng cho Câu 2
    /*
    private void saveToDatabase(ThietBi tb, String clientIp, int clientPort) throws SQLException {
        if (dbConnection == null) {
            System.err.println("Lỗi: Kết nối DB chưa được thiết lập.");
            throw new SQLException("Kết nối DB null");
        }
        String sql = "INSERT INTO thiet_bi (loai_may, ma_sp, so_luong, don_gia, ngay_sx, hang_sx, client_ip, client_port) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = dbConnection.prepareStatement(sql)) {
            pstmt.setString(1, tb.getLoaiMay());
            pstmt.setString(2, tb.getMaSP());
            pstmt.setInt(3, tb.getSoLuong());
            pstmt.setDouble(4, tb.getDonGia());
            pstmt.setDate(5, new java.sql.Date(tb.getNgaySX().getTime())); // Chuyển java.util.Date sang java.sql.Date
            pstmt.setString(6, tb.getHangSX());
            pstmt.setString(7, clientIp);
            pstmt.setInt(8, clientPort);
            pstmt.executeUpdate();
            Server.printTableRow(tb.toTableRowData(clientIp, clientPort) + " -> LƯU DB OK"); // Thêm thông báo đã lưu DB
        }
    }
    */
}