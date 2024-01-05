package org.bth4.bai2;

public class Main {
    public static void main(String[] args) {
        GiangVien gv1 = new GVThinhGiang("Nguyen Van A", "02/04/2004", "Ts", "Ts", "05/10/2020", "Tp" +
                ".HCM");
        GiangVien gv2 = new GVCoHuu("Tran Van B", "02/04/2004", "Ts", "Ts", "05/10/2020", 2490000,
                2.34);

        System.out.println(gv1);
        System.out.println(gv2);
        System.out.println("========Sap Xep=========");
        QLGiangVien ql = new QLGiangVien();
        ql.themGiangVien(gv1, gv2);
        ql.tinhTienLuong();
    }
}
