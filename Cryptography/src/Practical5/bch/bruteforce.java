/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical5.bch;

import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 *
 * @author Bradlee Hayden
 */
public class bruteforce implements Callable<Double> {

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
    public bruteforce(char minASCII, char maxASCII, String hash, int stringLength) {
        this.minASCII = minASCII;
        this.maxASCII = maxASCII;
        this.hash = bchsha1.hexStringToByteArray(hash);
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
        int d[] = new int[10];
        int targetD = 10;
        int index = 1;

        concat = numChars;

// hash password, check if matches sethash in main class
        byte[] bchSha1Encoding = bchsha1.encode(concat, index, concat.length - index);

        if (Arrays.equals(bchSha1Encoding, this.hash)) {

            end = System.nanoTime();
            String getTime = String.valueOf(setSec(start, end));
            String getPassword = new String(numChars);

// System.out.println("password: " + pass + " time: " + time);
// return true;
            for (int i = 0; i < 6; i++) {

// formula used to add the 4 parity ints, have to -1 from digit index as java starts at 0, must be a better way but i dont know what
// return matched hash if its valid bch, system exit if invalid
                d[6] = (4 * d[0] + 10 * d[1] + 9 * d[2] + 2 * d[3] + d[4] + 7 * d[5]) % 11;
                d[7] = (7 * d[0] + 8 * d[1] + 7 * d[2] + d[3] + 9 * d[4] + 6 * d[5]) % 11;
                d[8] = (9 * d[0] + d[1] + 7 * d[2] + 8 * d[3] + 7 * d[4] + 7 * d[5]) % 11;
                d[9] = (d[0] + 2 * d[1] + 9 * d[2] + 10 * d[3] + 4 * d[4] + d[5]) % 11;

            }
            if (d[6] == 10 || d[7] == 10 || d[8] == 10 || d[9] == 10) {
                System.out.println("invalid BCH");
                System.exit(0);

            } else {
                System.out.println("valid BCH");
                System.out.println("password: " + getPassword + " time: " + getTime);
                return true;
            }

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
                if (numChars[i] == 57) { //if reaches end of string (0) go back to start (9)
                    numChars[i] = 48;
                } else {
                    numChars[i]++;
                }
                return;
            }
            numChars[i] = (byte) minASCII;
        }
    }

}
