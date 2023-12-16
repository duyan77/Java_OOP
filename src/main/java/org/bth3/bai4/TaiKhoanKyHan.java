package org.bth3.bai4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaiKhoanKyHan extends TaiKhoan {
    private LocalDate ngayDaoHan;
    private KyHan kyHan;

    public TaiKhoanKyHan(String ten, double soTien, KyHan kyHan) {
        super(ten, soTien);
        this.ngayDaoHan = LocalDate.now();
        this.kyHan = kyHan;
        this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());
    }

    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ky han: %s\nNgay Dao Han: %s\n",
                this.kyHan,
                ngayDaoHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
    }

    @Override
    public boolean isDaoHan() {
        return LocalDate.now().equals(this.ngayDaoHan);
    }

    @Override
    public double tinhLaiSuat() {
        return this.kyHan.tinhLai(this.getSoTien());
    }

    @Override
    public void capNhatKyHan() {
        this.ngayDaoHan = this.kyHan.tinhDaoHan(this.ngayDaoHan);
    }
}
