package com.sergiomartinrubio.javadesignpatterns.structural.proxy;

public class Client {

    private static final long NUMBER = 2000000;

    public static void main(String[] args) {
        PrimesCalculator calculator = new ProxyPrimeCalculator(NUMBER);
        System.out.println("Proxy created!");

        long nPrimes = calculator.getPrimesCount();
        System.out.println("Number of Primes in " + NUMBER + " is " + nPrimes);
    }
}
