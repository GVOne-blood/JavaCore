// src/com/example/common/ThietBi.java
package common;

import java.io.Serializable;
import java.util.Date; // Sử dụng java.util.Date cho ngày sản xuất

public class ThietBi implements Serializable {
    private static final long serialVersionUID = 1L; // Quan trọng cho Serializable

    private String loaiMay;    // Desktop, Laptop, Tablet PC
    private String maSP;
    private int soLuong;
    private double donGia;
    private Date ngaySX;       // Sử dụng Date để dễ dàng xử lý hơn
    private String hangSX;

    public ThietBi(String loaiMay, String maSP, int soLuong, double donGia, Date ngaySX, String hangSX) {
        this.loaiMay = loaiMay;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.hangSX = hangSX;
    }

    // Getters (Setters có thể không cần nếu chỉ truyền dữ liệu)
    public String getLoaiMay() { return loaiMay; }
    public String getMaSP() { return maSP; }
    public int getSoLuong() { return soLuong; }
    public double getDonGia() { return donGia; }
    public Date getNgaySX() { return ngaySX; }
    public String getHangSX() { return hangSX; }

    @Override
    public String toString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        return String.format("| %-15s | %-10s | %-8d | %-10.2f | %-10s | %-15s |",
                loaiMay, maSP, soLuong, donGia, sdf.format(ngaySX), hangSX);
    }

    // Dùng cho server hiển thị dạng bảng
    public String toTableRowData(String clientIp, int clientPort) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        return String.format("| %-15s | %-5d | %-15s | %-10s | %-8d | %-10.2f | %-10s | %-15s |",
                clientIp, clientPort, loaiMay, maSP, soLuong, donGia, sdf.format(ngaySX), hangSX);
    }
}