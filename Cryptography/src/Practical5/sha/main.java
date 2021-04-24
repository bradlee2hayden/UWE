/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical5.sha;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Administrator
 */
public class main {

    public static void main(String[] args) {
// set hashed string for brute forcing
        final String hash = "c2543fff3bfa6f144c2f06a7de6cd10c0b650cae";

// catch variable
        int runCount = 1;
// 6 due to max string length of bch
        int maxLength = 6;

        double timeCount = 0;

        List<Callable<Double>> bruteForcer = new ArrayList<>();

        // loop maxlength (6 charc) and call bruteforce class, fill constructor params with 0 - z for bch values, hash string and loop count
        for (int i = 1; i <= maxLength; i++) {
            bruteForcer.add(new bruteForcing('0', 'z', hash, i));

        }

        for (int i = 0; i < runCount; i++) {
            try {
                ExecutorService esPlane = Executors.newCachedThreadPool();
                double time = esPlane.invokeAny(bruteForcer);
                timeCount += time;
                esPlane.shutdownNow();
            } catch (InterruptedException | ExecutionException e) {
            }
        }
    }
}
