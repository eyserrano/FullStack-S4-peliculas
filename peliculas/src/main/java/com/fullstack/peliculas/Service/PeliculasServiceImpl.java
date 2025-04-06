package com.fullstack.peliculas.Service;

import com.fullstack.peliculas.Model.Peliculas;
import com.fullstack.peliculas.Repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculasServiceImpl implements PeliculasService {

    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Peliculas> getAllPeliculas() {
        return peliculasRepository.findAll();
    }

    @Override
    public Optional<Peliculas> getPeliculasById(Long id) {
        return peliculasRepository.findById(id);
    }

    @Override
    public Peliculas createPeliculas(Peliculas peliculas) {
        return peliculasRepository.save(peliculas);
    }

    public Peliculas updatePeliculas(Long id, Peliculas peliculas) {
        if (peliculasRepository.existsById(id)) {
            peliculas.setId(id);
            return peliculasRepository.save(peliculas);
        } else {
            return null;
        }
    }

    @Override
    public void deletePeliculas(Long id) {
        peliculasRepository.deleteById(id);
    }
}

