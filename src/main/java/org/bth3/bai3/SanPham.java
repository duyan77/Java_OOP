package org.bth3.bai3;

public class SanPham {
    private static int PRODUCTS_QUANTITY = 0;
    private final int ma = ++PRODUCTS_QUANTITY;
    private String ten;
    private double gia;

    public SanPham() {
    }

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public static int getProductsQuantity() {
        return PRODUCTS_QUANTITY;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public void hienThi() {
        System.out.printf("Ma: %d\nTen: %s\nGia: %.1f\n", this.ma, this.ten, this.gia);
    }

    // nhập thông tin sản phẩm từ bàn phím
    public void nhapSanPham() {
        System.out.print("Nhap ten: ");
        this.ten = CauHinh.SCANNER.nextLine();
        System.out.print("Nhap gia: ");
        this.gia = Double.parseDouble(CauHinh.SCANNER.nextLine());
    }
}
