package org.bth4.oop;

public class VatPhamMau extends VatPham {
    private static int count = 0;

    {
        this.name = "A%02d".formatted(++count);
    }

    public VatPhamMau(NhanVat n) {
        super(n);
    }

    @Override
    public void hieuUng(double h) { // so mau duoc tang them
        this.n.setBlood(n.getBlood() + h);
    }

    @Override
    public void nhapThongTin() {
        System.out.print("Nhap so mau: ");
        this.hieuUng(Double.parseDouble(sc.nextLine()));
        this.n.themVatPham(this);
    }

    @Override
    public String loaiVatPham() {
        return "Vat pham tang mau";
    }
}
