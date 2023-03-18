package com.company;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void int32ToString(int ip) {
        int b1 = ((ip) >> 24) & 0x000f;
        int b2 = ((ip << 8) >> 24) & 0x000f;
        int b3 = ((ip << 16) >> 24) & 0x000f;
        int b4 = ((ip << 24) >> 24) & 0x000f;
        System.out.println(b1 + "." + b2 + "." + b3 + "." + b4);
    }

    public static void stringToInt32(String ip) {
        List<Integer> octets = Arrays.stream(ip.split("\\.")).map(Integer::parseInt).toList();
        int ipInt = (octets.get(0) << 24) | (octets.get(1) << 16) | (octets.get(2) << 8) | (octets.get(3));
        System.out.println(ipInt);
    }
}
