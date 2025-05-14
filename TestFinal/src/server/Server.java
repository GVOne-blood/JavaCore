// src/com/example/server/Server.java
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int PORT = 8088;
    private static final int MAX_THREADS = 10; // Số client tối đa phục vụ đồng thời

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREADS);
        // Connection dbConnection = DBConnection.getConnection(); // Sẽ dùng cho Câu 2

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server đang lắng nghe trên cổng " + PORT + "...");
            System.out.println("--- BẢNG THEO DÕI DỮ LIỆU CLIENT GỬI TỚI ---");
            printTableHeader();

            while (true) {
                Socket clientSocket = serverSocket.accept();
                // Truyền dbConnection vào ClientHandler cho Câu 2
                // ClientHandler clientHandler = new ClientHandler(clientSocket, dbConnection);
                ClientHandler clientHandler = new ClientHandler(clientSocket); // Câu 1
                executorService.execute(clientHandler);
            }   
        } catch (IOException e) {
            System.err.println("Lỗi Server: " + e.getMessage());
            e.printStackTrace();
        } finally {
            executorService.shutdown();
            // if (dbConnection != null) { // Sẽ dùng cho Câu 2
            //     try {
            //         dbConnection.close();
            //     } catch (SQLException e) {
            //         System.err.println("Lỗi đóng kết nối DB: " + e.getMessage());
            //     }
            // }
        }
    }

    public static void printTableHeader() {
        System.out.println("+-----------------+-------+-----------------+------------+----------+------------+------------+-----------------+");
        System.out.println("| Client IP       | Port  | Loại máy        | Mã SP      | Số lượng | Đơn giá    | Ngày SX    | Hãng SX         |");
        System.out.println("+-----------------+-------+-----------------+------------+----------+------------+------------+-----------------+");
    }

    public static void printTableRow(String rowData) {
        System.out.println(rowData);
        System.out.println("+-----------------+-------+-----------------+------------+----------+------------+------------+-----------------+");
    }
}