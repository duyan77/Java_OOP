package org.bth2;

import java.util.Arrays;

public class ChuanHoa {
    public static String chuanHoaNgaySinh(String birth) {
        StringBuilder sb = new StringBuilder(birth);

        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");

        return sb.toString();
    }

    public static String chuanHoaTen(String name) {
        StringBuilder res = new StringBuilder();

        Arrays.stream(name.trim().split("\\s+"))
                .forEach(s -> res
                        .append(Character.toUpperCase(s.charAt(0)))
                        .append(s.substring(1).toLowerCase())
                        .append(" ")
                );

        return res.toString().trim();
    }
}
