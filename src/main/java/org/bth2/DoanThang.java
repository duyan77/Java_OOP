package org.bth2;

public class DoanThang {
    private Diem diemDau, diemCuoi;

    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }

    public Diem getDiemDau() {
        return diemDau;
    }

    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }

    public void hienThi() {
        System.out.printf("[(%.1f, %.1f), (%.1f, %.1f)]\n", diemDau.getHoanhDo(),
                diemDau.getTungDo(), diemCuoi.getHoanhDo(),
                diemCuoi.getTungDo());
    }

    public double tinhDoDai() {
        return diemDau.tinhKhoangCach(diemCuoi);
    }

    public Diem tinhTrungDiem() {
        double hd = (diemDau.getHoanhDo() + diemCuoi.getHoanhDo()) / 2;
        double td = (diemDau.getTungDo() + diemCuoi.getTungDo()) / 2;

        return new Diem(hd, td);
    }

    public boolean isSongSong(DoanThang doanThang) {
        double v1 =
                (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo()) * (doanThang.getDiemDau().getTungDo() - doanThang.diemCuoi.getTungDo());
        double v2 =
                (this.getDiemDau().getTungDo() - this.getDiemCuoi().getTungDo()) * (doanThang.getDiemDau().getHoanhDo() - doanThang.getDiemCuoi().getHoanhDo());

        return v1 >= v2 - 0.00001 && v1 <= v2 + 0.00001;
    }
}
