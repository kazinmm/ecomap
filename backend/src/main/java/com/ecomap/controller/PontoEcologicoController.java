
package com.ecomap.backend.controller;

import com.ecomap.backend.model.PontoEcologico;
import com.ecomap.backend.service.PontoEcologicoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pontos")
@CrossOrigin(origins = "*")
public class PontoEcologicoController {

    private final PontoEcologicoService service;

    public PontoEcologicoController(PontoEcologicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<PontoEcologico> listarTodos() {
        return service.listarTodos();
    }
}
