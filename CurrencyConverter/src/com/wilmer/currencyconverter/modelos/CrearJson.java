package com.wilmer.currencyconverter.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrearJson {
    public void crearArchivoJson(List nombreLista) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter guardarDatos = new FileWriter("conversiones.txt");
        String json = gson.toJson(nombreLista);
        guardarDatos.write(json);
        guardarDatos.close();
    }
}
