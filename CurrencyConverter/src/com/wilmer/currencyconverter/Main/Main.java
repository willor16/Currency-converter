package com.wilmer.currencyconverter.Main;

import com.wilmer.currencyconverter.modelos.ConversionProces;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConversionProces iniciandoConversion = new ConversionProces();
        iniciandoConversion.procesoConversion();

    }
}