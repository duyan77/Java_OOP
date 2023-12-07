package org.bth3.bai3;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws Exception {

        // thêm các loại sản phẩm vào danh sách quản lý
        QLSanPham ql = new QLSanPham();
        SanPham s1 = new Sach("OOP", 50, 90);
        SanPham s2 = new BangDia("OU", 20, 20);

        try {
            ql.them(s1, s2);
            ql.them("org.bth3.bai3.Sac");
            ql.them("org.bth3.bai3.BangDia");
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
                 InstantiationException | IllegalAccessException e) {
            System.err.println("Duong dan bi sai!!!");
        } catch (Exception e) {
            System.err.println("Them san pham khong thanh cong!!!");
        } finally {
            System.out.println("==Danh sach " + SanPham.getProductsQuantity() + " san pham==");
            ql.hienThi();
        }

        try {
            ql.timKiem(1).hienThi(); // tìm kiếm theo id 1
            ql.timKiem("O").forEach(SanPham::hienThi); // tìm kiếm theo tên chứa "O"
        } catch (NullPointerException e) {
            System.err.println("Khong tim thay san pham theo id");
        }

        ql.xoa(1); // xóa sản phẩm có id 1
        ql.xoa("OU"); // xóa sản phẩm có tên "OU"
        ql.xoa(s1); // xóa sản phẩm s1

        // sắp xếp sản phẩm theo giá bán giảm dần
        System.out.println("==Danh sach san pham theo gia giam dan==");
        ql.sapXepTheoGia();
        ql.hienThi();
    }
}