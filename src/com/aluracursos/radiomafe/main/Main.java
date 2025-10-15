package com.aluracursos.radiomafe.main;

import com.aluracursos.radiomafe.modelos.Cancion;
import com.aluracursos.radiomafe.modelos.MisFavoritos;
import com.aluracursos.radiomafe.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("High On Life");
        miCancion.setCantante("Martin Garrix, Bonn");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Mikatholic");
        miPodcast.setTitulo("Dark & Light");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 6000; i++) {
            miCancion.reproduce();
        }

        System.out.println("Canción reproducida: " + miCancion.getTotalDeReproduciones() + " veces");
        System.out.println("Canción con: " + miCancion.getTotalDeMeGusta() + " me gusta");

        for (int i = 0; i < 2500; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 3000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Podcast reproducido: " + miPodcast.getTotalDeReproduciones() + " veces");
        System.out.println("Podcast tiene: " + miPodcast.getTotalDeMeGusta() + " me gusta");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.incluye(miPodcast);
        favoritos.incluye(miCancion);
    }
}
