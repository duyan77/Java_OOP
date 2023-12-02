package org.bth3.bai2;

public class TamGiacDeu extends TamGiacCan {
    public TamGiacDeu(double abc) throws Exception {
        super(abc, abc);
    }

    @Override
    public void hienThi() {
        System.out.printf("Hinh Tam Giac Deu\nDien tich: %.1f\nChu Vi: %.1f\n", this.tinhDienTich(),
                this.tinhChuVi());
    }
}
