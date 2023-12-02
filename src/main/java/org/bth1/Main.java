package org.bth1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File fo = new File("src/main/resources/data.txt"); // file io
        FileWriter fw = new FileWriter(fo, true); // file writer -> viết dữ liệu vào file
        try (PrintWriter w = new PrintWriter(fw)) {
            w.println(888);
            w.println("Nguyen Van B");
            w.printf("%.1f %.1f %.1f\n", 8.85, 9.91, 7.77);
        }

        // doc du lieu tu file
        File f = new File("src/main/resources/data1.txt");
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                int m = Integer.parseInt(sc.nextLine());
                String t = sc.nextLine();
                double d = Double.parseDouble(sc.nextLine());
                System.out.printf("%d - %s -%.1f\n", m, t, d);
            }
        }
    }
}