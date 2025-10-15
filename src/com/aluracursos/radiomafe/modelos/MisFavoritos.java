package com.aluracursos.radiomafe.modelos;

public class MisFavoritos {
    void incluye(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos actuales");
        } else {
            System.out.println(audio.getTitulo() + "Tambien es uno de los favoritos");
        }
    }
}
