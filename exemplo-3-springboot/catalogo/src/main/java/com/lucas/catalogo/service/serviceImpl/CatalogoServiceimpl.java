package com.lucas.catalogo.service.serviceImpl;

import java.util.List;

import com.lucas.catalogo.model.Musica;
import com.lucas.catalogo.repository.CatalogoRepository;
import com.lucas.catalogo.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;

public class CatalogoServiceimpl implements CatalogoService {

    @Autowired
    CatalogoRepository catalogoRepository;

    @Override
    public List<Musica> findAll() {
        return catalogoRepository.findAll();
    }

    @Override
    public Musica findById(long id) {
        return catalogoRepository.findById(id).get();
    }

    @Override
    public Musica save(Musica musica) {
        return catalogoRepository.save(musica);
    }

}