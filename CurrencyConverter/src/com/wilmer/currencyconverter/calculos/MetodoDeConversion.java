package com.wilmer.currencyconverter.calculos;

import com.wilmer.currencyconverter.conections.ApiConexion;
import com.wilmer.currencyconverter.conections.ValuesMoney;
import com.wilmer.currencyconverter.modelos.Monedas;

public class MetodoDeConversion extends Monedas {
    public Monedas conversionMoneda(String opcionone, String opcionTwo, double cantidad){
        double total;
        //valor de referencia usado dolar
        ApiConexion consult= new ApiConexion();
        ValuesMoney consultaReferencia = consult.typeMoney("USD");
        Double valueOne = consultaReferencia.conversion_rates().get(opcionone);
        Double valueTwo = consultaReferencia.conversion_rates().get(opcionTwo);
        Monedas datosconversion= new Monedas();
        datosconversion.setNameCurrencyOne(opcionone);
        datosconversion.setNameCurrencyTwo(opcionTwo);
        total = cantidad*valueTwo/valueOne;
        datosconversion.setValueOf(total);
        datosconversion.setCurency(cantidad);
        return datosconversion;





    }
}
