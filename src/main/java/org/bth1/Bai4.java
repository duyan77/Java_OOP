package org.bth1;

import java.util.*;
import java.util.stream.IntStream;

//Cho mảng gồm n số nguyên. Lập trình giải các bài toán sau
//        a) Tính tổng các số nguyên tố.
//        b) Tìm số dương lớn nhất và số âm bé nhất trong dãy. Trong trường hợp không có số
//        âm hay số dương nào trong dãy thì in ra *.
//        c) Tìm số nguyên tố nhỏ nhất trong mảng.
//        d) Sắp xếp giảm dần
//        e) Nhập x, tìm vị trí xuất hiện của x bằng tìm kiếm nhị phân.

public class Bai4 {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 3, 5, 9, 10};

        // cau a
        System.out.println(Arrays.stream(a).filter(Bai4::isPrime).sum());

        // cau b
        // so duong lon nhat
        System.out.println(Arrays.stream(a).filter(x -> x > 0).max().orElse(-99));

        // so am be nhat
        System.out.println(Arrays.stream(a).filter(x -> x < 0).min().orElse(-99));

        // tim so nguyen to nho nhat trong mang
        System.out.println(Arrays.stream(a).filter(Bai4::isPrime).min().orElse(-1));

        // sap xep giam dan
        List<Integer> list = new ArrayList<>();

        IntStream.of(a).forEach(list::add);

        list.sort(Collections.reverseOrder());
        list.forEach(x -> System.out.printf("%d\t", x));
        System.out.println();

        // tim kiem nhi phan
        Scanner sc = new Scanner(System.in);

        Arrays.sort(a);

        System.out.print("Nhap vao so can tim : ");

        int val = sc.nextInt(), indexOfVal = Arrays.binarySearch(a, val);
        System.out.printf("Vi tri cua %d = %d", val, indexOfVal);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
}
