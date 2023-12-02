package org.bth1;

import java.util.Arrays;
import java.util.Scanner;

//Cho ma trận a có kích thước m × n. Viết chương trình giải các bài toán sau:
//        a) Sinh ngẫu nhiên các giá trị nguyên từ 1 đến 100 cho ma trận.
//        b) Tính tổng trên từng dòng và tổng trên từng cột.
//        c) Tìm chỉ số dòng có tổng lớn nhất và chỉ số cột có tổng nhỏ nhất.
//        d) Nhập chỉ số dòng d, tính tổng và tìm giá trị nhỏ nhất dòng d.
//        e) Nhập chỉ số cột c, tính tổng và tím giá trị lớn nhất cột c.
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập m = ");
        int m = sc.nextInt();
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];

        // sinh số ngẫu nhiên
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100 + 1);
            }
        }

        // duyet mang
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        // tong tren tung dong
        int idx = 0;
        for (int[] ints : a) {
            System.out.println("Tong tren dong so " + idx + " = " + Arrays.stream(ints).sum());
            System.out.println();
            idx++;
        }

        // tong tren tung cot
        for (int j = 0; j < n; j++) {
            int tong = 0;
            for (int i = 0; i < n; i++) {
                tong += a[i][j];
            }
            System.out.println("Tong cot thu " + j + " = " + tong);
            System.out.println();
        }

        //  chi so dong co tong lon nhat
        int maxVal = Integer.MIN_VALUE;
        for (int[] ints : a) {
            int t = Arrays.stream(ints).sum();
            maxVal = Math.max(maxVal, t);
        }

        System.out.printf("Tong lon nhat tren dong = %d\n", maxVal);

        // chi so cot co tong nho nhat
        int minVal = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int t = 0;
            for (int i = 0; i < m; i++) {
                t += a[i][j];
            }
            minVal = Math.min(minVal, t);
        }

        System.out.printf("Tong nho nhat tren cot = %d\n", minVal);

        // tinh tong dong d
        System.out.print("Nhap dong d = ");
        int d = sc.nextInt();
        int sumOfRow = Arrays.stream(a[d]).sum();
        System.out.printf("Tong dong %d = %d\n", d, sumOfRow);

        // tim gia tri nho nhat dong d
        int minValOfRow = Arrays.stream(a[d]).min().orElse(Integer.MAX_VALUE);
        System.out.printf("Gia tri nho nhat dong %d = %d\n", d, minValOfRow);

        // tinh tong cot c
        System.out.print("Nhap cot c = ");
        int c = sc.nextInt();
        int sumOfCol = 0;

        for (int i = 0; i < m; i++) {
            sumOfCol += a[i][c];
        }
        System.out.printf("Tong cot %d = %d\n", c, sumOfCol);

        // tim gia tri lon nhat cot c
        int maxValOfCol = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            maxValOfCol = Math.max(maxValOfCol, a[i][c]);
        }
        System.out.printf("Gia tri lon nhat cot %d = %d", c, maxValOfCol);
    }
}