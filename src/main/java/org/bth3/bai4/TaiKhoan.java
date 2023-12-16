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
        System.out.printf("So tai khoan: %s\nTen tai khoan: %s\nSo Tien: %.1f\nTien Lai: ",
                this.id,
                this.ten,
                this.soTien);
        System.out.println("Tien lai = " + this.tinhLaiSuat());
    }

    // nap tien vao tai khoan
    public void napTien(double tienNap) {
        if (this.isDaoHan())
            this.soTien += tienNap;
    }

    public void rutTien(double tienRut) {
        if (this.soTien >= tienRut && this.isDaoHan())
            this.soTien -= tienRut;
    }

    public boolean isDaoHan() {
        return true;
    }

    public double tinhLaiSuat() {
        return (this.soTien * 0.0001) / 12;
    }

    public void capNhatKyHan() {

    }
}
