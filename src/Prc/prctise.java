package Prc;

import java.util.Arrays;
import java.util.Scanner;

public class prctise {



    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i < rows; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print((i+j)%2);

            }

            System.out.println();

        }

    }
}




