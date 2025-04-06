package com.fullstack.peliculas.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.fullstack.peliculas.Model.Peliculas;
import com.fullstack.peliculas.Service.PeliculasService;

import java.util.List;
import java.util.Optional;

//Garatizo que ls respuestas se realicen en JSon por medio de REST
@RestController
@RequestMapping("/peliculas")
@CrossOrigin(origins = "*") // Permite peticiones desde cualquier origen
public class PeliculasController {

    @Autowired
    private PeliculasService peliculasService;

    @GetMapping
    public List<Peliculas> getAllPeliculas() {
        return peliculasService.getAllPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Peliculas> getPeliculasById(@PathVariable Long id) {
        return peliculasService.getPeliculasById(id);
    }

    @PostMapping
    public Peliculas createPeliculas(@RequestBody Peliculas peliculas) {
        return peliculasService.createPeliculas(peliculas);
    }

    @PutMapping("/{id}")
    public Peliculas updatePeliculas(@PathVariable Long id, @RequestBody Peliculas peliculas) {
        return peliculasService.updatePeliculas(id, peliculas);
    }

     @DeleteMapping("/{id}")
    public void deletePeliculas(@PathVariable Long id) {
        peliculasService.deletePeliculas(id);
    }
}
