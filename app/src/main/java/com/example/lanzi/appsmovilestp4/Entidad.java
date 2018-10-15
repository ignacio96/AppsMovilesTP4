package com.example.lanzi.appsmovilestp4;

public class Entidad {

    private String alimento;
    private String contenido1;
    private String contenido2;
    private String contenido3;
    private String contenido4;

    public Entidad(String alimento, String contenido1, String contenido2, String contenido3, String contenido4 ){

        this.alimento = alimento;
        this.contenido1 = contenido1;
        this.contenido2 = contenido2;
        this.contenido3 = contenido3;
        this.contenido4 = contenido4;
    }

    public String getAlimento() { return alimento; }
    public String getContenido1() { return contenido1; }
    public String getContenido2() { return contenido2; }
    public String getContenido3() { return contenido3; }
    public String getContenido4() { return contenido4; }
}
