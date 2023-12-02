package org.bth3.bai2;

public class Ellipse extends Shape {
    private double bkTrucNho;
    private double bkTrucLon;

    public Ellipse(double bkTrucNho, double bkTrucLon) {
        this.bkTrucNho = bkTrucNho;
        this.bkTrucLon = bkTrucLon;
    }

    public double tinhDienTich() {
        return Math.PI * this.bkTrucLon * this.bkTrucNho;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((Math.pow(bkTrucLon, 2) + Math.pow(bkTrucNho, 2)) / 2);
    }

    public String layTen() {
        return "org.bth3.bai2.Ellipse";
    }

    public void hienThi() {
        System.out.printf("Hinh %s\nDien Tich: %.1f\n", this.layTen(), this.tinhDienTich());
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }
}
