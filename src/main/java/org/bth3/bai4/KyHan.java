package org.bth3.bai4;

import java.time.LocalDate;

public enum KyHan {

    MOT_TUAN(1, 0.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate date) {
            return date.plusWeeks(MOT_TUAN.period);
        }

        @Override
        public double tinhLai(double soTien) {
            return (soTien * MOT_TUAN.lai) / 100 / 12 / 4;
        }
    },
    MOT_THANG(1, 4.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate date) {
            return date.plusMonths(MOT_THANG.period);
        }

        @Override
        public double tinhLai(double soTien) {
            return (soTien * MOT_THANG.lai) / 100 / 12;
        }
    },
    MOT_NAM(1, 6.8) {
        @Override
        public LocalDate tinhDaoHan(LocalDate date) {
            return date.plusYears(MOT_TUAN.period);
        }

        @Override
        public double tinhLai(double soTien) {
            return (soTien * MOT_NAM.lai) / 100;
        }
    };

    private final int period;
    private final double lai;

    KyHan(int period, double lai) {
        this.period = period;
        this.lai = lai;
    }

    public abstract LocalDate tinhDaoHan(LocalDate date);

    public abstract double tinhLai(double soTien);
}
