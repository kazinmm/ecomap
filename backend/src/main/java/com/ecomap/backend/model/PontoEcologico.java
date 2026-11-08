
package com.ecomap.backend.model;

public class PontoEcologico {

    private Long id;
    private String nome;
    private String tipo;
    private String endereco;
    private double latitude;
    private double longitude;

    public PontoEcologico(Long id, String nome, String tipo,
                          String endereco, double latitude,
                          double longitude) {

        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
