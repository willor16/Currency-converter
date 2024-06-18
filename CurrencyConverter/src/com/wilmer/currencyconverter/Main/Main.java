package com.wilmer.currencyconverter.Main;

import com.google.gson.Gson;
import com.wilmer.currencyconverter.calculos.MetodoDeConversion;
import com.wilmer.currencyconverter.conections.ApiConexion;
import com.wilmer.currencyconverter.conections.ValuesMoney;
import com.wilmer.currencyconverter.modelos.Monedas;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoEntrada = new Scanner(System.in);
        MetodoDeConversion conversion = new MetodoDeConversion();
        Monedas guardandoDatos = new Monedas();
        String bandera = "continuar";
        String monedaUno = "", monedaDos = "";
        double cantidadUsuario = 0;

        while (bandera.equals("continuar")) {
            System.out.println("**********************************************" +
                             "\nBienvenido al sistema de conversion de monedas" +
                             "\n**********************************************" +
                             "\nListado de monedas disponibles apra convertir." +
                             "\nQUETZAL GUATEMALTECO (GTQ)."+
                             "\nDOLAR ESTADOUNIDENSE (USD)."+
                             "\nEURO EUROPEO (EUR)."+
                             "\nWON SURKOREANO (KRW)."+
                             "\nRUBLO RUSO (RUB)."+
                             "\nYEN JAPONES (JPY)."+
                             "\n**********************************************" +
                             "\nSI LA MONEDA QUE BUSCA NO ESTA EN ESTA LISTA PUEDE CONSULTAR LA SIGUIETNE DOCUMENTACION PARA VER EL CODIGO"+
                             "\nSI EL CODIGO ESTA EN LA DOCUMENTACION ENTONCES LA CONVERSION ESTARA DISPONIBLE DE LO CONTRARIO LAMENTO INFORMALE QUE NOSERA POSIBLE");
            //mensaje temporal para la app
            System.out.println("ingrese la moneda que quiere convertir ejemplo: USD");
            monedaUno = tecladoEntrada.nextLine();
            System.out.println("ingrese la moneda a la que quiere convertir ejemplo: USD");
            monedaDos = tecladoEntrada.nextLine();
            System.out.println("ingrese la cantidad a convertir....");
            cantidadUsuario = tecladoEntrada.nextDouble();
            tecladoEntrada.nextLine();
            guardandoDatos = conversion.conversionMoneda(monedaUno.toUpperCase(), monedaDos.toUpperCase(), cantidadUsuario);

            System.out.println(guardandoDatos);
            System.out.println("continuar/salir");
            bandera = tecladoEntrada.nextLine();

            if (bandera.equals("salir")) {
                System.out.println("VUELVA PRONTO!!");
                break;
            }
        }

    }
}