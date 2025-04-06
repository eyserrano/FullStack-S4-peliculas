package com.fullstack.peliculas.Model;
//Importamos todas las funcionalidades de jakarta.persistence
import jakarta.persistence.*;

@Entity
@Table(name = "PELICULAS")

public class Peliculas{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "ANIO")
    private Integer anio;

    @Column(name = "DIRECTOR")
    private String director;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "SINOPSIS")
    private String sinopsis;

    // --- Getters ---

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    // --- Setters ---

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
