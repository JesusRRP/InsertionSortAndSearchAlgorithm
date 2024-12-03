/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertionsortandsearchalgorithm;

/**
 *
 * @author jesusrrp
 */

public class JumpSearch {

    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;

        int step = (int) Math.sqrt(n);

        int prev = 0;
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;
            }
        }
        
        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (arr[prev] == x) {
            return prev;
        }

        return -1;
    }

}
