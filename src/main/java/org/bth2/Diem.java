package org.bth2;

/*
Viết lớp Diem để thao tác với điểm trong không gian hai chiều, lớp này chứa 2
thuộc tính kiểu số thực thể hiện hoành độ, tung độ và các phương thức:
- Phương thức khởi tạo hai tham số để tạo đối tượng với hoành độ và tung độ chỉ định.
- Các phương thức lấy giá trị (được gọi là các phương thức getter) và thiết lập giá trị
(được gọi là các phương thức setter) của các thuộc tính tương ứng.
- Phương thức hiển thị thông tin một điểm dạng (hoành độ, tung độ).
- Phương thức tính khoảng cách giữa hai điểm. Biết công thức tính khoảng cách hai
điểm A(x1, y1) và B(x2, y2) như sau:

*/

public class Diem {
    private double hoanhDo, tungDo;

    public Diem(double hoanhDo, double tungDo) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    public void hienThi() {
        System.out.printf("(%.1f, %.1f)\n", hoanhDo, tungDo);
    }

    public double tinhKhoangCach(Diem d2) {
        return Math.sqrt(Math.pow(this.hoanhDo - d2.hoanhDo, 2) + Math.pow(this.tungDo - d2.tungDo, 2));
    }
}
