package org.bth3.bai4;

public class Main {

    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoan("Nguyen Van A", 100);
        t1.napTien(50);
        TaiKhoan t2 = new TaiKhoanKyHan("Tran Thi B", 1000, KyHan.MOT_TUAN);
        t2.napTien(100);
        t2.rutTien(200);
        TaiKhoan t3 = new TaiKhoanKyHan("Tran Thi B", 2000, KyHan.MOT_THANG);
        t3.napTien(100);
        t3.rutTien(200);

        t1.hienThi();
        t2.hienThi();
        t3.hienThi();
    }
}
