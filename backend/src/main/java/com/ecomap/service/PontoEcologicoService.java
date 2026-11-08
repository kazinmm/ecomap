
package com.ecomap.backend.service;

import com.ecomap.backend.model.PontoEcologico;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PontoEcologicoService {

    public List<PontoEcologico> listarTodos() {

        return Arrays.asList(

            new PontoEcologico(
                1L,
                "CDL Anápolis",
                "Coleta de lixo eletrônico",
                "Rua Conde Afonso Celso, 25 - Centro",
                -16.3312,
                -48.9599
            ),

            new PontoEcologico(
                2L,
                "Cebrac Anápolis",
                "Coleta de eletrônicos de pequeno porte",
                "Rua Rui Barbosa, 155 - 2º andar, Centro",
                -16.325653,
                -48.957199
            ),

            new PontoEcologico(
                3L,
                "Mundo Animal Pet Center",
                "Coleta de eletrônicos de pequeno porte",
                "Rua Dr. Genserico, 270 - Centro",
                -16.322509,
                -48.953975
            )

        );
    }
}
