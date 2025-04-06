package com.fullstack.peliculas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstack.peliculas.Model.Peliculas;;

public interface PeliculasRepository extends JpaRepository<Peliculas, Long>{

}