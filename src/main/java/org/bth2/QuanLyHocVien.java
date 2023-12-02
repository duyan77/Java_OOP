package org.bth2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class QuanLyHocVien {
    private final List<HocVien> hocVienList;

    public QuanLyHocVien() {
        hocVienList = new ArrayList<>();
    }

    public void themHv(HocVien... hocViens) {
        this.hocVienList.addAll(Arrays.asList(hocViens));
    }

    // chức năng nhập học viên từ bàn phím
    public void themHv() {
        HocVien hocVien = new HocVien();
        hocVien.nhapHocVien();
        this.hocVienList.add(hocVien);
    }

    // thêm học viên từ file
    public void themHv(String src) {
        File f = new File(src);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String t = sc.nextLine();
                String ns = ChuanHoa.chuanHoaNgaySinh(sc.nextLine());
                HocVien h = new HocVien(t, ns);
                this.hocVienList.add(h);
            }
        } catch (FileNotFoundException e) {
            e.getCause();
        }
    }

    public void hienThiDs() {
        this.hocVienList.forEach(HocVien::hienThi);
    }

    public void nhapDiemDs() {
        this.hocVienList.forEach(hocVien -> {
            System.out.println("Hoc vien " + hocVien.getTen());
            hocVien.nhapDiem();
        });
    }

    public HocVien timKiem(int id) {
        return this.hocVienList.stream()
                .filter(hocVien -> hocVien.getMa() == id)
                .findFirst()
                .orElse(null);
    }

    public List<HocVien> timKiem(String kw) {
        return this.hocVienList.stream()
                .filter(hocVien -> hocVien.getTen().toLowerCase()
                        .contains(kw.toLowerCase())
                )
                .collect(Collectors.toList());
    }

    // phương thức trả về list học viên được nhận học bổng
    public List<HocVien> timHocBong() {
        return this.hocVienList.stream()
                .filter(HocVien::isHocBong)
                .collect(Collectors.toList());
    }

    // danh sách các học viên được nhận học bổng
    public void dsHocBong() {
        this.timHocBong().stream()
                .map(hocVien -> hocVien.getMa() + "-"
                        + hocVien.getTen() + "-"
                        + String.format("%.2f", hocVien.tinhTrungBinh())
                )
                .forEach(System.out::println);
    }

    // sắp xếp theo điểm trung bình tăng dần
    public void sapXepTheoDiem(boolean isChanged) {
        if (!isChanged) // danh sách học viên không bị thay đổi khi sử dụng phương thức này
            this.hocVienList.stream()
                    .sorted(Comparator.comparingDouble(HocVien::tinhTrungBinh))
                    .forEach(HocVien::hienThi);
        else // sắp xếp và thay đổi danh sách học viên
            this.hocVienList.sort(Comparator.comparingDouble(HocVien::tinhTrungBinh));
    }

    // xuất file danh sách học viên được nhận học bổng
    public void xuatFileHocBong() throws IOException {
        File fo = new File("./src/main/resources/hocbong.txt");
        FileWriter fw = new FileWriter(fo, true);

        try (PrintWriter w = new PrintWriter(fw)) {
            // mã-tên-đtb
            this.timHocBong().forEach(hocVien -> w.printf("%d-%s-%.2f\n",
                            hocVien.getMa(),
                            hocVien.getTen(),
                            hocVien.tinhTrungBinh()
                    )
            );
        }
    }

    // Danh sách học viên theo độ tuổi chỉ định
    public List<HocVien> doTuoi(int from, int to) {
        return this.hocVienList.stream()
                .filter(hocVien -> hocVien.tinhTuoi() >= from && hocVien.tinhTuoi() <= to)
                .collect(Collectors.toList());
    }

    public List<HocVien> doTuoi(int from) {
        return this.hocVienList.stream()
                .filter(hocVien -> hocVien.tinhTuoi() >= from)
                .collect(Collectors.toList());
    }

    //    Thống kê số lượng học viên có độ tuổi nhỏ hơn 18, từ 18 đến 23, từ 24 trở lên
    public void thongKeTuoi() {
        System.out.println("Hoc vien nho hon 18");
        this.doTuoi(1, 17).forEach(HocVien::hienThi);

        System.out.println("Hoc vien tu 18 den 23");
        this.doTuoi(18, 23).forEach(HocVien::hienThi);

        System.out.println("Hoc vien tu 24 tro len");
        this.doTuoi(24).forEach(HocVien::hienThi);
    }
}