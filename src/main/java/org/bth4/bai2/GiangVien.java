package org.bth4.bai2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiangVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate ngayBatDau;

    public GiangVien(String hoTen, String ngaySinh, String hocHam, String hocVi, String ngayBatDau) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDau = LocalDate.parse(ngayBatDau, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public abstract double tinhTienLuong(double soGio);

    @Override
    public String toString() {
        return """
                                
                Ho ten: %s
                Ngay sinh: %s
                Hoc ham: %s
                Hoc vi: %s
                Ngay bat dau: %s
                """
                .formatted(this.hoTen,
                        this.ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM" + "/yyyy")),
                        this.hocHam, this.hocVi,
                        this.ngayBatDau.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                );
    }
}
