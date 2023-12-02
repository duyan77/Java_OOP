package org.bth2;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        // bài 7

        // khởi tạo học viên
        HocVien h1 = new HocVien("A", LocalDate.of(2001, 5, 15));
        HocVien h2 = new HocVien("B", LocalDate.of(2004, 3, 20));
        HocVien h3 = new HocVien("C", "15/01/1999");

        // tạo đối tượng quản lí học viên
        QuanLyHocVien ql = new QuanLyHocVien();

        // thêm học viên
        ql.themHv(h1, h2, h3);
        ql.themHv();
        ql.themHv("./src/main/resources/hv.txt");

        // thông tin các học viên
        System.out.println("Danh sach " + HocVien.getDem() + " hoc vien");
        ql.hienThiDs();

//        tìm kiếm học viên
        ql.timKiem(1).hienThi();
        ql.timKiem("nguyen van ").forEach(HocVien::hienThi);

        // nhập điểm cho từng học viên
        System.out.println("Nhap diem cho hoc vien");
        ql.nhapDiemDs();

        // thông tin các học viên nhận được học bổng
        System.out.println("Danh sach hoc bong");
        ql.dsHocBong();
        ql.xuatFileHocBong(); // xuất file các học viên được học bổng

        // sắp xếp tăng dần theo điểm trung bình
        System.out.println("Danh sach theo diem trung binh tang dan");
        ql.sapXepTheoDiem(false);

        // thống kê độ tuổi của học viên
        System.out.println("Danh sach hoc vien theo tung do tuoi");
        ql.thongKeTuoi();
    }
}