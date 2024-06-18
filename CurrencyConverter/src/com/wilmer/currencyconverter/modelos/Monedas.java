package com.wilmer.currencyconverter.modelos;

import com.wilmer.currencyconverter.conections.ApiConexion;
import com.wilmer.currencyconverter.conections.ValuesMoney;

public class Monedas {
    private String nameCurrencyOne;
    private String nameCurrencyTwo;
    private double curency;
    private double valueOf;

    public String getNameCurrencyOne(){
        return nameCurrencyOne;
    }
    public String getNameCurrencyTwo(){
        return nameCurrencyTwo;
    }
    public double getValueOf(){
        return valueOf;
    }
    public double getCurency(){
        return curency;
    }

    public void setCurency(double curency){
        this.curency=curency;
    }
    public void setNameCurrencyOne(String nameCurrencyOne){
        this.nameCurrencyOne=nameCurrencyOne;
    }
    public void setNameCurrencyTwo(String nameCurrencyTwo){
        this.nameCurrencyTwo=nameCurrencyTwo;
    }

    public void setValueOf(double valueOf) {
        this.valueOf = valueOf;
    }

    @Override
    public String toString() {
        return "convertido de: " + getNameCurrencyOne()+" a ---> " + getNameCurrencyTwo()
                + "\n la cantidad convertida es: "+ getCurency()
                + "\n el monto en "+ getNameCurrencyTwo() +" es: " + getValueOf();
    }
}
