package org.bth3.bai2;

public class TamGiacCan extends TamGiac {
    public TamGiacCan(double ab, double c) throws Exception {
        super(ab, ab, c);
    }

    @Override
    public void hienThi() {
        System.out.printf("Hinh Tam Giac Can\nDien tich: %.1f\nChu Vi: %.1f\n", this.tinhDienTich(),
                this.tinhChuVi());
    }
}
