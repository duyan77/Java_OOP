package org.bth4.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        QLNhanVat ql = new QLNhanVat();
        do {
            System.out.print("""
                    1. Them nhan vat vao danh sach
                    2. Them vat pham cho nhan vat
                    3. Hien thi thong tin nhan vat va thong tin cac vat pham nhan vat dang co
                    4. Xac dinh tong so luot choi cua nhan vat theo so luong vat pham
                    5. Sap xep giam dan cac nhan vat theo so luong vat pham
                    0. Thoat
                    Chon:\s""");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    NhanVat tmp = new NhanVat();
                    tmp.nhapThongTinNhanVat();
                    ql.themNhanVat(tmp);
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("Nhap ma nhan vat can them vat pham: ");
                    NhanVat nv = ql.timNhanVat(Integer.parseInt(sc.nextLine()));
                    int c;
                    System.out.print("""
                            Chon loai vat pham
                            1. Vat pham tang mau
                            2. Vat pham tang luot choi
                            Chon:\s""");
                    c = Integer.parseInt(sc.nextLine());
                    VatPham v;
                    if (c == 1) v = new VatPhamMau(nv);
                    else v = new VatPhamLuot(nv);
                    v.nhapThongTin();
                }

                case 3 -> {
                    System.out.println("Thong tin cac nhan vat");
                    ql.hienThi();
                }

                case 4 -> {
                    System.out.print("Nhap ma nhan vat: ");
                    NhanVat nv = ql.timNhanVat(Integer.parseInt(sc.nextLine()));
                    System.out.println("Tong so luot choi cua nhan vat: " + nv.getSlot());
                }

                case 5 -> {
                    ql.sapXep();
                    System.out.println("Danh sach sau khi sap xep");
                    ql.hienThi();
                }

                case 0 -> {
                    System.out.println("Chuong trinh ket thuc!");
                }

                default -> {
                    System.out.println("Nhap sai! Nhap lai");
                }
            }
        } while (choice != 0);
    }
}
