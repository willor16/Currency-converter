package com.wilmer.currencyconverter.exceptions;

public class Sindatosencontrados extends RuntimeException{
    private String mensaje;
    public Sindatosencontrados(String mensaje){
        this.mensaje=mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}
