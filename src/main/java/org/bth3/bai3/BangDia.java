package org.bth3.bai3;

public class BangDia extends SanPham {
    private double thoiLuong;

    public BangDia() {

    }

    public BangDia(String ten, double gia, double thoiLuong) {
        super(ten, gia);
        this.thoiLuong = thoiLuong;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Thoi luong phat: " + this.thoiLuong);
    }

    @Override
    public void nhapSanPham() {
        super.nhapSanPham();
        System.out.print("Nhap thoi luong phat: ");
        this.thoiLuong = Double.parseDouble(CauHinh.SCANNER.nextLine());
    }
}
