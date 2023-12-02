package org.bth2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class HocVien {
    private static int dem = 0; // số lượng học viên

    // property
    private final int ma;
    private String ten;
    private LocalDate ns;
    private double[] diem;

    // khối khởi động để mã tự động tăng khi tạo mới đối tượng HocVien
    {
        this.ma = ++dem;
    }

    // constructor
    public HocVien() {
    }

    public HocVien(String ten, LocalDate ns) {
        this.ten = ten;
        this.ns = ns;
    }

    public HocVien(String ten, String ns) {
        this.ten = ten;
        this.ns = LocalDate.parse(ns, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // getter, setter
    public static int getDem() {
        return dem;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public LocalDate getNs() {
        return ns;
    }

    public double[] getDiem() {
        return diem;
    }

    // method

    // nhập thông tin cho 1 học viên từ bàn phím
    public void nhapHocVien() {
        System.out.print("Nhap ten: ");
        this.ten = ChuanHoa.chuanHoaTen(CauHinh.SCANNER.nextLine());
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        this.ns = LocalDate.parse(
                ChuanHoa.chuanHoaNgaySinh(CauHinh.SCANNER.nextLine()),
                DateTimeFormatter.ofPattern(CauHinh.DATE_PATTERN)
        );
    }

    // hiển thị thông tin cơ bản của 1 học viên
    public void hienThi() {
        if (this.getDiem() == null)
            System.out.printf(
                    """
                            Ma hoc vien: %d
                            Ho va ten: %s
                            Ngay sinh: %s
                                                    
                            """,
                    this.ma, this.ten,
                    this.ns.format(DateTimeFormatter.ofPattern(CauHinh.DATE_PATTERN))
            );
        else
            System.out.printf(
                    """
                            Ma hoc vien: %d
                            Ho va ten: %s
                            Ngay sinh: %s
                            Diem trung binh: %.2f
                                                        
                            """,
                    this.ma, this.ten,
                    this.ns.format(DateTimeFormatter.ofPattern(CauHinh.DATE_PATTERN)),
                    this.tinhTrungBinh()
            );
    }

    // nhập 3 cột điểm cho 1 học viên từ bàn phím
    public void nhapDiem() {
        this.diem = new double[CauHinh.SO_LUONG];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhap diem thu %d: ", i + 1);
            this.diem[i] = Double.parseDouble(CauHinh.SCANNER.nextLine());
        }
    }

    // tính điểm trung bình 3 môn cho 1 học viên
    public double tinhTrungBinh() {
        // trả về điểm tb 3 môn của học viên này nếu không thể tính được thì trả về 0
        return DoubleStream.of(this.diem).average().orElse(0.0);
    }

    // kiểm tra học viên có nhận được học bổng không
    public boolean isHocBong() {
        // cả 3 môn đều không dưới 5 và điểm trung bình lớn hơn hoặc bằng 8 -> được học bổng
        return Arrays.stream(this.diem).allMatch(d -> d >= 5) && this.tinhTrungBinh() >= 8;
    }

    // tính tuổi của học viên
    public int tinhTuoi() {
        return Period.between(this.getNs(), LocalDate.now()).getYears();
    }
}
