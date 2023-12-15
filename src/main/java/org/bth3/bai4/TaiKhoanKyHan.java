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

        switch (kyHan) {
            case MOT_TUAN -> this.ngayDaoHan = this.ngayDaoHan.plusWeeks(1);
            case MOT_THANG -> this.ngayDaoHan = this.ngayDaoHan.plusMonths(1);
        }
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
}
