package org.bth3.bai3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QLSanPham {
    private final List<SanPham> listSanPham = new ArrayList<>();

    // thêm sản phẩm
    public void them(SanPham... sanPham) {
        this.listSanPham.addAll(Arrays.asList(sanPham));
    }

    public void them(String classPath) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SanPham s = (SanPham) Class.forName(classPath).getDeclaredConstructor().newInstance();
        s.nhapSanPham();
        this.listSanPham.add(s);
    }

    public void xoa(SanPham sanPham) {
        this.listSanPham.remove(sanPham);
    }

    // xóa sản phẩm theo mã sản phẩm
    public void xoa(int id) {
        this.listSanPham.removeIf(sanPham -> sanPham.getMa() == id);
    }

    // xóa sản phẩm theo tên của sản phẩm
    public void xoa(String ten) {
        this.listSanPham.removeIf(sanPham -> sanPham.getTen().equalsIgnoreCase(ten));
    }

    // hiển thị danh sách sản phẩm
    public void hienThi() {
        this.listSanPham.forEach(SanPham::hienThi);
    }

    // tìm kiếm sản phẩm theo id nếu không có trả về null
    public SanPham timKiem(int id) {
        return this.listSanPham.stream()
                .filter(sanPham -> sanPham.getMa() == id)
                .findFirst().orElse(null);
    }

    public List<SanPham> timKiem(String kw) {
        return this.listSanPham.stream()
                .filter(sanPham -> sanPham.getTen().toLowerCase().contains(kw.toLowerCase()))
                .collect(Collectors.toList());
    }

    // sắp xếp sản phẩm theo giá bán giảm dần
    public void sapXepTheoGia() {
        this.listSanPham.sort((o1, o2) -> Double.compare(o2.getGia(), o1.getGia()));
    }
}
