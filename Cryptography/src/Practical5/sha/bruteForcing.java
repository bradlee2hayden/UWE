/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical5.sha;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class bruteForcing implements Callable<Double> {

    protected final int minASCII;
    protected final int maxASCII;
    private final int stringLength;
    protected final byte[] numChars;
    private final byte[] hash;
    private long start;
    private long end;

    /**
     * bruteforce constructor
     *
     * @param minASCII
     * @param maxASCII
     * @param hash
     * @param stringLength
     */
    public bruteForcing(char minASCII, char maxASCII, String hash, int stringLength) {
        this.minASCII = minASCII;
        this.maxASCII = maxASCII;
        this.hash = sha1.hexStringToByteArray(hash);
        this.stringLength = stringLength;
        this.numChars = new byte[stringLength + 1];
    }

// execute here
    @Override
    public Double call() throws Exception {
        setArray();
        start = System.nanoTime();

        while (numChars[0] == 0 && !Thread.currentThread().isInterrupted()) {

            if (getBruteForce()) {
                return setSec(start, end);
            }
            ASCIIReset();

        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected void setArray() {
        Arrays.fill(numChars, 1, numChars.length, (byte) minASCII);
    }

    private boolean getBruteForce() {
        byte[] concat;
        int index = 1;

        concat = numChars;

        byte[] sha1Res = sha1.encode(concat, index, concat.length - index);

        if (Arrays.equals(sha1Res, this.hash)) {

            end = System.nanoTime();
            String time = String.valueOf(setSec(start, end));
            String pass = new String(numChars);

            System.out.println("passoword: " + pass + " time: " + time);
            return true;
        }

        return false;
    }

    private double setSec(long startTime, long endTime) {
        return ((endTime - startTime) / 5000000000.0);
    }

// go through setchars and reset at certain ascii char
    protected void ASCIIReset() {
        for (int i = numChars.length - 1; i >= 0; i--) {
            if (numChars[i] < maxASCII) {
                if (numChars[i] == 57) { //if reaches end of string (9) go back to start (a)
                    numChars[i] = 97;
                } else {
                    numChars[i]++;
                }
                return;
            }
            numChars[i] = (byte) minASCII;
        }
    }
}
