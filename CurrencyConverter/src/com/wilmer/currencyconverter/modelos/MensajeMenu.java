package com.wilmer.currencyconverter.modelos;

public class MensajeMenu {
    @Override
    public String toString() {
        return  "**********************************************" +
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
                "\nhttps://www.exchangerate-api.com/docs/supported-currencies"+
                "\nSI EL CODIGO ESTA EN LA DOCUMENTACION ENTONCES LA CONVERSION ESTARA DISPONIBLE DE LO CONTRARIO LAMENTO INFORMALE QUE NO SERA POSIBLE";
    }
}
