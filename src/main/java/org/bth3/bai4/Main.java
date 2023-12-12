package org.bth3.bai4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoanKyHan acc = new TaiKhoanKyHan("Bank01", "duyan", "0774126944", "abc@gmail.com", 100,
                LocalDate.of(2023, 11, 26), "ok", KyHan.MOT_TUAN);

        System.out.println("acc.withDraw(50) = " + acc.withDraw(50));
        sc.close();
    }
}
