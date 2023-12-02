package org.bth2;

//Bài 5: Viết lớp PhanSo gồm hai thuộc tính nguyên là tử số, mẫu số của phân số và một
//        thuộc tính tĩnh chứa số phân số đã được tạo. Lớp này có hai phương thức khởi tạo:
//        - Phương thức khởi tạo không tham số khởi gán tử số là 0, mẫu là số 1.
//        - Phương thức khởi tạo hai tham số tương ứng khởi gán giá trị tử số và mẫu số cho
//        phân số.
//        Các phương thức tĩnh
//        - Tìm ước số chung lớn nhất hai số nguyên.
//        Các phương thức getter, setter của tử số, mẫu số và các phương thức khác thực hiện các
//        chức năng sau:
//        - Rút gọn phân số.
//        - Các phép tính cộng, trừ, nhân, chia hai phân số. Kết quả trả về của các phép tính này
//        là các phân số đã được rút gọn.
//        - So sánh bằng, lớn hơn, bé hơn hai phân số.
//        - Hiển thị phân số dạng tửSố/mẫuSố.
//        Viết phương thức main() kiểm tra các chức năng lớp PhanSo.
//        Tạo mảng các phân số và thực hiện các yêu cầu sau trong main():
//        - Duyệt và hiển thị các phân số trong mảng.
//        - Tính tổng các phân số trong mảng.
//        - Tìm phân số lớn nhất trong mảng.
public class PhanSo {
    private int tuSo, mauSo;
    private static int soLuong = 0;

    public PhanSo() {
        this(0, 1);
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        soLuong++;
    }

    public static int uocChungLN(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return b;
    }

    // getter, setter
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public static PhanSo rutGon(PhanSo phanSo) {
        int gcd = uocChungLN(phanSo.tuSo, phanSo.mauSo);
        return new PhanSo(phanSo.tuSo / gcd, phanSo.mauSo / gcd);
    }

    public PhanSo cong(PhanSo p) {
        int tu = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int mau = this.mauSo * p.mauSo;
        return rutGon(new PhanSo(tu, mau));
    }

    public static int soSanh(PhanSo p1, PhanSo p2) {
        p1 = PhanSo.rutGon(p1);
        p2 = PhanSo.rutGon(p2);

        if (p1.tuSo * p2.mauSo > p2.tuSo * p1.mauSo)
            return 1;
        else if (p1.tuSo * p2.mauSo < p2.tuSo * p1.mauSo)
            return -1;
        return 0;
    }

    public void hienThi() {
        PhanSo kq = PhanSo.rutGon(this);
        System.out.printf("%d/%d\n", kq.tuSo, kq.mauSo);
    }
}

