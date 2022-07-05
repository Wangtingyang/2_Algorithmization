package test.Task2;

import java.util.ArrayList;
import java.util.Scanner;


public class Task01 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            A.add(i);
        }
        int k = sc.nextInt();
        int sum = 0;
        if(k <= 0){
            System.out.println("wrong number k");
        }
        else {
            System.out.println(k);
            for(int i : A){
                if(i%k == 0){
                    sum += i;
                }
            }
        }
        System.out.println("Sum of elements: "+sum);
    }
}
