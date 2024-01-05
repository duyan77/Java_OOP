package org.bth4.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NhanVat {
    private static Scanner sc = new Scanner(System.in);
    private static int count = 0;
    private final int id;
    private String name;
    private double blood;
    private int slot;
    private final List<VatPham> listProduct = new ArrayList<>();

    {
        this.id = ++count;
    }

    public void nhapThongTinNhanVat() {
        System.out.print("Nhap ten nhan vat: ");
        this.name = sc.nextLine();

    }

    public void themVatPham(VatPham... vatPham) {
        this.getListProduct().addAll(Arrays.asList(vatPham));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VatPham> getListProduct() {
        return listProduct;
    }

    public double getBlood() {
        return blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        String thongTinVatPham = this.listProduct.stream().map(VatPham::toString).collect(Collectors.joining());
        return ("""
                Ma nhan vat: %d
                Ten nhan vat: %s
                Mau: %.1f
                Luot choi: %d
                Nhung vat pham hien co
                %s""")
                .formatted(this.id, this.name, this.blood, this.slot, thongTinVatPham);
    }
}
