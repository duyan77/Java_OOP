package org.bth4.oop;

import java.util.Scanner;

public abstract class VatPham {
    protected static final Scanner sc = new Scanner(System.in);
    protected NhanVat n;
    protected String name;

    public VatPham(NhanVat n) {
        this.n = n;
    }

    public abstract void hieuUng(double h);

    public abstract void nhapThongTin();

    public abstract String loaiVatPham();

    @Override
    public String toString() {
        return "Ma: %s\nLoai vat pham: %s\n".formatted(this.name, this.loaiVatPham());
    }
}
