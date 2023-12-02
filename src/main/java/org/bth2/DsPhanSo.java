package org.bth2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsPhanSo {
    private final List<PhanSo> ds = new ArrayList<>();

    public void them(PhanSo... phanSo) {
        ds.addAll(Arrays.asList(phanSo));
    }

    public void hienThiDs() {
        ds.forEach(PhanSo::hienThi);
    }

    public void xoa(PhanSo phanSo) {
        ds.remove(phanSo);
    }

    public void xoa(int tu, int mau) {
        ds.removeIf(phanSo -> PhanSo.soSanh(phanSo, new PhanSo(tu, mau)) == 0);
    }

    public PhanSo timMax() {
        return ds.stream().max((PhanSo::soSanh)).orElse(null);
    }

    public PhanSo timMin() {
        return ds.stream().min((PhanSo::soSanh)).orElse(null);
    }

    public void sapXep() {
        ds.sort((PhanSo::soSanh));
    }

    public static void main(String[] args) {
        DsPhanSo ds = new DsPhanSo();
        ds.them(new PhanSo(1, 2), new PhanSo(1, 3));
        ds.sapXep();
        ds.xoa(1, 3);

        ds.timMax().hienThi();
        System.out.println();
        ds.timMin().hienThi();
    }
}
