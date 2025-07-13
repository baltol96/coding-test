package com.codingtest.string.case01_04;

import java.util.*;

public class Case01_04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        in.nextLine();

        for (int i = 0; i < input1; i++) {
            String input = in.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println(reversed);
        }
    }

}
