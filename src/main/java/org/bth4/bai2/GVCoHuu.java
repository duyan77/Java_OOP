package org.bth4.bai2;

public class GVCoHuu extends GiangVien {
    private double luongCB;
    private double heSo;

    public GVCoHuu(String hoTen, String ngaySinh, String hocHam, String hocVi, String ngayBatDau, double luongCB, double heSo) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.luongCB = luongCB;
        this.heSo = heSo;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    @Override
    public double tinhTienLuong(double soGio) {
        return soGio * 90000 + luongCB * heSo;
    }

    @Override
    public String toString() {
        return super.toString() + "Luong co ban:%.2f\nHe so: %.2f".formatted(this.luongCB, this.heSo);
    }
}
