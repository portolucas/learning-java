package com.lucas.catalogo.service;

import java.util.List;

import com.lucas.catalogo.model.Musica;

public interface CatalogoService {

    List<Musica> findAll();

    Musica findById(long id);

    Musica save(Musica musica);
}