package com.sergiomartinrubio.javadesignpatterns.structural.proxy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class OriginalPrimesCalculator implements PrimesCalculator {

    private List<Long> primes;

    public OriginalPrimesCalculator(long n) {
        this.primes = LongStream.rangeClosed(2, n)
                .filter(x -> isPrime(x))
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public long getPrimesCount() {
        return primes.size();
    }

    private boolean isPrime(long number) {
        return LongStream.rangeClosed(2,  (long) Math.sqrt(number))
                .allMatch(x -> number % x != 0);
    }
}
