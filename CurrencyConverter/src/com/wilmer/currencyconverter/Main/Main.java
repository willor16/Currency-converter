package com.wilmer.currencyconverter.Main;

import com.wilmer.currencyconverter.exceptions.Sindatosencontrados;
import com.wilmer.currencyconverter.modelos.ConversionProces;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConversionProces iniciandoConversion = new ConversionProces();
        try {
            iniciandoConversion.procesoConversion();
        } catch (NullPointerException e) {
            System.out.println("error del tipo: " + e+ "\n no se encontro ningun valor de este tipo en la base de datos"+"\nejecute el programa de nuevo y asegurese de ingrear los datos correctamente"+
                    "\n si desea corroborar los codigos puede sonsultar la documentacion: " +"https://www.exchangerate-api.com/docs/supported-currencies");
        }


    }
}