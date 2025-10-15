package com.aluracursos.radiomafe.main;

import com.aluracursos.radiomafe.modelos.Cancion;
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

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproduciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        for (int i = 0; i < 2500; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 3000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miPodcast.getTotalDeReproduciones());
        System.out.println("Total de me gusta: " + miPodcast.getTotalDeMeGusta());
    }
}
