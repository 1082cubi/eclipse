package practice.Test2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {


        int A[] = new int[6];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 10)+1;


            for (int j = 0; j < i; j++) {
                if (A[i] == A[j])
                    i--;
                break;

            }
            System.out.println(A[i]);
        }

    }
}