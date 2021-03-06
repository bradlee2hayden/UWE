/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical5.bch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Bradlee Hayden
 */
public class bch {

    public static void main(String[] args) {
        // set hashed string for brute forcing
        final String hash = "902608824fae2a1918d54d569d20819a4288a4e4";

// catch variable
        int runCount = 1;
// 10 due to max string length of bch
        int maxLength = 10;

        double timeCount = 0;

        List<Callable<Double>> bchBruteForce = new ArrayList<>();

        // loop maxlength (10 bch charc) and call bruteforce class, fill constructor params with 0 - 9 for bch values, hash string and loop count
        for (int i = 1; i <= maxLength; i++) {
            bchBruteForce.add(new bruteforce('0', '9', hash, i));

        }

        for (int i = 0; i < runCount; i++) {
            try {
                ExecutorService esPlane = Executors.newCachedThreadPool();
                double time = esPlane.invokeAny(bchBruteForce);
                timeCount += time;
                esPlane.shutdownNow();
            } catch (InterruptedException | ExecutionException e) {
            }
        }
    }
}

//            "902608824fae2a1918d54d569d20819a4288a4e4"  password:  0000118435 time: 0.2381115
//            "88d0b34055b79644196fce25f876bc1a5ef654d3"  password:  1111110565 time: 515.7931234
//            "5b8f495b7f02b62eb228c5dbece7c2f81b60b9a3"  password:  8888880747 time: 3521.4578756
