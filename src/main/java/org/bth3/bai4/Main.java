package org.bth3.bai4;

public class Main {

    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoan("Nguyen Van A", 100);
        TaiKhoan t2 = new TaiKhoanKyHan("Tran Thi B", 1000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TaiKhoanKyHan("Tran Thi B", 2000, KyHan.MOT_THANG);

        t1.hienThi();
        t2.hienThi();
        t3.hienThi();
    }
}
