package com.fullstack.peliculas.Service;

import com.fullstack.peliculas.Model.Peliculas;
import java.util.List;
import java.util.Optional;

public interface PeliculasService {

    List<Peliculas> getAllPeliculas();

    Optional<Peliculas> getPeliculasById(Long id);

    Peliculas createPeliculas(Peliculas peliculas);

    Peliculas updatePeliculas(Long id, Peliculas peliculas);

    void deletePeliculas(Long id);
}