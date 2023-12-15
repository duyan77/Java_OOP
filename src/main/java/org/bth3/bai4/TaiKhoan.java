package org.bth3.bai4;

public class TaiKhoan {
    private static int dem = 0;
    private final String id;
    private String ten;
    private double soTien;

    {
        this.id = String.format("%06d", ++dem);
    }

    public TaiKhoan(String ten, double soTien) {
        this.ten = ten;
        this.soTien = soTien;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public void hienThi() {
        System.out.printf("So tai khoan: %s\nTen tai khoan: %s\nSo Tien: %.1f\n", this.id, this.ten,
                this.soTien);
    }

    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoan("Nguyen Van A", 100);
        TaiKhoan t2 = new TaiKhoanKyHan("Tran Thi B", 1000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TaiKhoanKyHan("Vo Van C", 2000, KyHan.MOT_THANG);

        t1.hienThi();
        t2.hienThi();
        t3.hienThi();
    }
}
