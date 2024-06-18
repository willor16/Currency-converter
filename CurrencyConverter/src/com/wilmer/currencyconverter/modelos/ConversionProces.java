package com.wilmer.currencyconverter.modelos;

import com.google.gson.Gson;
import com.wilmer.currencyconverter.calculos.MetodoDeConversion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversionProces extends Monedas{
    public void procesoConversion() throws IOException {
        Scanner tecladoEntrada = new Scanner(System.in);
        MetodoDeConversion conversion = new MetodoDeConversion();
        MensajeMenu menu = new MensajeMenu();
        Monedas guardandoDatos = new Monedas();
        CrearJson saveFile= new CrearJson();
        Gson gson = new Gson();
        String bandera = "continuar";
        String optionFIle;
        String monedaUno = "", monedaDos = "";
        List<Monedas> listadoDeConversiones= new ArrayList<>();
        double cantidadUsuario = 0;

        while (bandera.equals("continuar")) {
            System.out.println(menu);
            //mensaje temporal para la app
            System.out.println("ingrese la moneda que quiere convertir ejemplo: USD");
            monedaUno = tecladoEntrada.nextLine();
            System.out.println("ingrese la moneda a la que quiere convertir ejemplo: USD");
            monedaDos = tecladoEntrada.nextLine();
            System.out.println("ingrese la cantidad a convertir....");
            cantidadUsuario = tecladoEntrada.nextDouble();
            tecladoEntrada.nextLine();
            guardandoDatos = conversion.conversionMoneda(monedaUno.toUpperCase(), monedaDos.toUpperCase(), cantidadUsuario);
            listadoDeConversiones.add(guardandoDatos);
            System.out.println(guardandoDatos);
            System.out.println("continuar/salir");
            bandera = tecladoEntrada.nextLine();

            if (bandera.equals("salir")) {
                System.out.println("¿desea guardar un archivo json de las conversiones realizadas?: escriba si o no");
                optionFIle=tecladoEntrada.nextLine();
                if (optionFIle.equals("si")){
                    saveFile.crearArchivoJson(listadoDeConversiones);
                    System.out.println();
                }

                System.out.println("VUELVA PRONTO!!");
                System.out.println(listadoDeConversiones);
                break;
            }
        }
    }

}
