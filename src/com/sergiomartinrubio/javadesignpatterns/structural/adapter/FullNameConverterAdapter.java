package com.sergiomartinrubio.javadesignpatterns.structural.adapter;

/**
 * Adapter
 */
public class FullNameConverterAdapter implements FullNameConverter {

    private ExistingFullNameConverter existingFullNameConverter;

    public FullNameConverterAdapter(ExistingFullNameConverter existingFullNameConverter) {
        this.existingFullNameConverter = existingFullNameConverter;
    }

    @Override
    public String toUpperCase(String firstName, String lastName) {
        return existingFullNameConverter.toUpperCase(firstName + " " + lastName);
    }
}
