package org.bth4.oop;

public class VatPhamLuot extends VatPham {
    private static int count = 0;

    {
        this.name = "B%02d".formatted(++count);
    }

    public VatPhamLuot(NhanVat n) {
        super(n);
    }

    @Override
    public void hieuUng(double h) { // so luot choi duoc tang them
        this.n.setSlot(n.getSlot() + (int) h);
    }

    @Override
    public void nhapThongTin() {
        System.out.print("Nhap so luot choi: ");
        this.hieuUng(Integer.parseInt(sc.nextLine()));
        this.n.themVatPham(this);
    }

    @Override
    public String loaiVatPham() {
        return "Vat pham tang luot choi";
    }
}
