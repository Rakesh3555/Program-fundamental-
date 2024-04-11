package com.chainsys.day3;

import java.util.Scanner;

public class OddEvenCube {
    public static void main(String[] agrs) {
        Scanner oc = new Scanner(System.in);
        int num;
        System.out.println("Enter the n number : ");
        num = oc.nextInt();

        findOddEvenCubes(num);
    }

    public static void findOddEvenCubes(int num){
        System.out.println("Odd number until "+num+" : ");
        for (int oi = 1 ; oi <= num ;oi++) {
            if (oi % 2 != 0) {
                System.out.println(oi + "");
            }
        }

                System.out.println();

                System.out.println("Even numbers until "+num+" :");
                for (int ei = 1 ; ei <= num ;ei++) {
                    if (ei % 2 == 0) {
                        System.out.println(ei + "");
                    }
                }

                        System.out.println();

                        int cube = num*num*num;
                        System.out.println("Cube of n :"+cube);
            }
        }

