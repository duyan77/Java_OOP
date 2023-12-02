package org.bth3.bai2;

public class TamGiac extends Shape {
    private final double a;
    private final double b;
    private final double c;
    private final double p;

    public TamGiac(double a, double b, double c) throws Exception {
        if (Shape.ktTamGiac(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
            p = (a + b + c) / 2;
        } else throw new Exception("Invalid data");
    }

    public final double tinhDienTich() {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public final double tinhChuVi() {
        return p * 2;
    }

    public void hienThi() {
        System.out.printf("Hinh Tam Giac\nDien tich: %.1f\nChu Vi: %.1f\n", this.tinhDienTich(),
                this.tinhChuVi());
    }
}
