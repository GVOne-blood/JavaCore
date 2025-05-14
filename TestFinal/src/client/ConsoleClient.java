// src/com/example/client/ConsoleClient.java
package client;

import common.ThietBi;
import java.io.*;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsoleClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8088;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             // ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()); // Sẽ dùng cho Câu 2
            ) {
            System.out.println("Đã kết nối tới server: " + SERVER_ADDRESS + ":" + SERVER_PORT);

            while (true) {
                System.out.println("\n--- NHẬP THÔNG TIN THIẾT BỊ ---");
                System.out.print("Loại máy tính (Desktop, Laptop, Tablet PC, gõ 'quit' để thoát ở Mã SP): ");
                String loaiMay = scanner.nextLine();

                System.out.print("Mã sản phẩm (gõ 'quit' để thoát): ");
                String maSP = scanner.nextLine();
                if ("quit".equalsIgnoreCase(maSP) || "quit".equalsIgnoreCase(loaiMay)) { // Thoát nếu nhập quit ở mã SP hoặc loại máy
                    oos.writeObject("quit"); // Gửi tín hiệu kết thúc cho server
                    break;
                }

                System.out.print("Số lượng: ");
                int soLuong = Integer.parseInt(scanner.nextLine());

                System.out.print("Đơn giá: ");
                double donGia = Double.parseDouble(scanner.nextLine());

                Date ngaySX = null;
                while (ngaySX == null) {
                    System.out.print("Ngày sản xuất (dd/MM/yyyy): ");
                    String ngaySXStr = scanner.nextLine();
                    try {
                        ngaySX = dateFormat.parse(ngaySXStr);
                    } catch (ParseException e) {
                        System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
                    }
                }

                System.out.print("Hãng sản xuất: ");
                String hangSX = scanner.nextLine();

                ThietBi tb = new ThietBi(loaiMay, maSP, soLuong, donGia, ngaySX, hangSX);
                oos.writeObject(tb);
                oos.flush();
                System.out.println("Đã gửi thông tin thiết bị tới server.");

                // Nhận phản hồi từ server (cho Câu 2)
                // String response = (String) ois.readObject();
                // System.out.println("Server: " + response);

            }
        } catch (UnknownHostException e) {
            System.err.println("Không tìm thấy server: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi I/O: " + e.getMessage());
        // } catch (ClassNotFoundException e) { // Sẽ dùng cho Câu 2
        //     System.err.println("Lỗi ClassNotFound: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Lỗi nhập liệu số: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Client đã kết thúc.");
        }
    }
}