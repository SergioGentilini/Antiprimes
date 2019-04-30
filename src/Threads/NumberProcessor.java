package Threads;

import antiprimes.AntiPrimes;
import antiprimes.AntiPrimesSequence;
import antiprimes.Number;

public class NumberProcessor extends Thread{
    private AntiPrimesSequence antiPrimes;
    private Number numeroSuccessivo;

    public NumberProcessor(AntiPrimesSequence aps) {
        antiPrimes = aps;
    }

    public void run() {
        nextAntiPrime(antiPrimes.getLast());
        antiPrimes.addAntiPrime(getNextToProcess());


    }

    public void nextAntiPrime(Number n) {
        numeroSuccessivo = AntiPrimes.nextAntiPrimeAfter(n);
    }

    public Number getNextToProcess() {
        System.out.println("getNextToProcess: " + numeroSuccessivo.getValue());
        return numeroSuccessivo;
    }

    public void acceptRequests() {
    }
}
