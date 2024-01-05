package org.bth4.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QLNhanVat {
    private final List<NhanVat> nhanVatList = new ArrayList<>();

    public void themNhanVat(NhanVat... nhanVat) {
        this.nhanVatList.addAll(Arrays.stream(nhanVat).toList());
    }

    public NhanVat timNhanVat(NhanVat n) {
        return this.nhanVatList.stream().filter(nhanVat -> nhanVat.equals(n))
                .findFirst().orElse(null);
    }

    public NhanVat timNhanVat(int id) {
        return this.nhanVatList.stream().filter(nhanVat -> nhanVat.getId() == id)
                .findFirst().orElse(null);
    }

    public void themVatPham(NhanVat nhanVat, VatPham... vatPhams) {
        var nhanVatThemVatPham = this.timNhanVat(nhanVat);
        nhanVatThemVatPham.themVatPham(vatPhams);
    }

    public void sapXep() {
        this.nhanVatList.sort(Comparator.comparingInt(NhanVat::getSlot).reversed()
                .thenComparing(NhanVat::getId));
    }

    public void hienThi() {
        this.nhanVatList.forEach(System.out::println);
    }
}
