package it.figuccia;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
