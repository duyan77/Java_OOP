package org.bth3.bai2;

public class Shape {
    public static boolean ktTamGiac(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public double tinhDienTich() {
        return 0;
    }

    public void hienThi() {
        System.out.println();
    }
}
