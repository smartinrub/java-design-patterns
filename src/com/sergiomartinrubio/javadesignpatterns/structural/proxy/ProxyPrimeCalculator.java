package com.sergiomartinrubio.javadesignpatterns.structural.proxy;

public class ProxyPrimeCalculator implements PrimesCalculator {
    private OriginalPrimesCalculator originalPrimesCalculator = null;
    private long number;

    public ProxyPrimeCalculator(long number) {
        this.number = number;
    }

    @Override
    public long getPrimesCount() {
        if (this.originalPrimesCalculator == null) {
            this.originalPrimesCalculator = new OriginalPrimesCalculator(this.number);
        }
        return this.originalPrimesCalculator.getPrimesCount();
    }
}
