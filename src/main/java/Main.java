/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        int area = length * width;
        int buckets = area / 350;
        if (area < 350) {
            buckets = 1;
        }
        else if (area % 350 > 0) {
            buckets = buckets + 1;
        }
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n", buckets, area);
    }
}
