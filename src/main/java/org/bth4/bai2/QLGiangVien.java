package org.bth4.bai2;

import java.util.*;
import java.util.stream.Collectors;

public class QLGiangVien {
    private List<GiangVien> list = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public void themGiangVien(GiangVien... gv) {
        this.list.addAll(Arrays.asList(gv));
    }

    public void xoaGiangVien(GiangVien giangVien) {
        this.list.remove(giangVien);
    }

    public void xoaGiangVien(String ten) {
        this.list.removeIf(giangVien -> giangVien.getHoTen().equals(ten));
    }

    public List<GiangVien> traCuu(String kw) {
        return this.list.stream().filter(giangVien -> giangVien.getHoTen().contains(kw))
                .collect(Collectors.toList());
    }

    public void tinhTienLuong() {
        Map<GiangVien, Double> map = new HashMap<>();
        this.list.forEach(giangVien -> {
            System.out.printf("Nhap so gio lam cho giang vien %s: ", giangVien.getHoTen());
            map.put(giangVien, giangVien.tinhTienLuong(Integer.parseInt(sc.nextLine())));
        });

        map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .forEachOrdered(giangVienDoubleEntry -> {
                    System.out.println(giangVienDoubleEntry.getKey());
                    System.out.println("Luong: " + giangVienDoubleEntry.getValue());
                });
    }
}
