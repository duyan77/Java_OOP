package org.bth3.bai3;

public class Sach extends SanPham {
    private int soTrang;

    public Sach() {
    }

    public Sach(String ten, double gia, int soTrang) {
        super(ten, gia);
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("So trang: " + this.soTrang);
    }

    @Override
    public void nhapSanPham() {
        super.nhapSanPham();
        System.out.print("Nhap so trang: ");
        this.soTrang = Integer.parseInt(CauHinh.SCANNER.nextLine());
    }
}
