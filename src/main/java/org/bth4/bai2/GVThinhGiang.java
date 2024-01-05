package org.bth4.bai2;

public class GVThinhGiang extends GiangVien {
    private String noiCongTac;

    public GVThinhGiang(String hoTen, String ngaySinh, String hocHam, String hocVi,
                        String ngayBatDau, String noiCongTac) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.noiCongTac = noiCongTac;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    @Override
    public double tinhTienLuong(double soGio) {
        return soGio * 90000;
    }

    @Override
    public String toString() {
        return super.toString() + "Noi cong tac: %s".formatted(this.noiCongTac);
    }
}
