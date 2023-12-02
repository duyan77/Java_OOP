package org.bth2;

public class HinhTron {
    private Diem tam;
    private double banKinh;

    public HinhTron(Diem tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public Diem getTam() {
        return tam;
    }

    public void setTam(Diem tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public int xacDinhTuongDoiDiem(Diem d) {
        double kc = this.tam.tinhKhoangCach(d);
        if (kc > this.banKinh) return 1; // nam ngoai
            // nam trong
        else if (kc < this.banKinh) {
            return -1;
        }
        return 0; // nam tren duong tron
    }

    public int xacDinhTuongDoiDuongTron(HinhTron h) {
        double kc = this.tam.tinhKhoangCach(h.tam);
        if (kc > this.banKinh + h.banKinh) return 1;
        else if (kc < this.banKinh + h.banKinh) {
            return -1;
        }
        return 0;
    }

    public void viTriDiem(Diem d) {
        if (this.xacDinhTuongDoiDiem(d) == 1)
            System.out.println("Diem nam ngoai duong tron");
        else if (this.xacDinhTuongDoiDiem(d) == -1)
            System.out.println("Diem nam trong duong tron");
        else System.out.println("Diem nam tren duong tron");
    }

    public void viTriDuongTron(HinhTron ht) {
        if (this.xacDinhTuongDoiDuongTron(ht) == 1)
            System.out.println("Hai duong tron khong giao nhau");
        else if (this.xacDinhTuongDoiDuongTron(ht) == -1)
            System.out.println("Hai duong tron giao nhau");
        else System.out.println("Hai duong tron tiep xuc nhau");
    }
}