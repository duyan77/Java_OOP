package org.bth2;

public class HinhChuNhat {
    private Diem diemTrenTrai, diemDuoiPhai;

    public HinhChuNhat(Diem diemTrenTrai, Diem diemDuoiPhai) throws Exception {
        if (diemDuoiPhai.getHoanhDo() > diemTrenTrai.getHoanhDo() && diemDuoiPhai.getTungDo() < diemTrenTrai.getTungDo()) {
            this.diemTrenTrai = diemTrenTrai;
            this.diemDuoiPhai = diemDuoiPhai;
        } else throw new Exception("Invalid input");
    }

    public Diem getDiemTrenTrai() {
        return diemTrenTrai;
    }

    public void setDiemTrenTrai(Diem diemTrenTrai) {
        this.diemTrenTrai = diemTrenTrai;
    }

    public Diem getDiemDuoiPhai() {
        return diemDuoiPhai;
    }

    public void setDiemDuoiPhai(Diem diemDuoiPhai) {
        this.diemDuoiPhai = diemDuoiPhai;
    }

    public double tinhDienTich() {
        double chieuRong = diemTrenTrai.getTungDo() - diemDuoiPhai.getTungDo();
        double chieuDai = diemDuoiPhai.getHoanhDo() - diemTrenTrai.getHoanhDo();

        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        double chieuRong = diemTrenTrai.getTungDo() - diemDuoiPhai.getTungDo();
        double chieuDai = diemDuoiPhai.getHoanhDo() - diemTrenTrai.getHoanhDo();

        return (chieuDai + chieuRong) * 2;
    }
}
