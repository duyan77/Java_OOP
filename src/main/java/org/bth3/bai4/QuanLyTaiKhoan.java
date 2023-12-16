package org.bth3.bai4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiKhoan {
    List<TaiKhoan> list = new ArrayList<>();

    // tim kiem tai khoan theo so tai khoan
    public TaiKhoan timKiem(String id) {
        return this.list.stream().filter(taiKhoan -> taiKhoan.getId().equals(id))
                .findFirst().orElse(null);
    }

    public List<TaiKhoan> timKiemTheoTen(String ten) {
        return null;
    }
}
