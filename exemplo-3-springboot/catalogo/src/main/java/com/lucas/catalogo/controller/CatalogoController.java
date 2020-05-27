package com.lucas.catalogo.controller;

import java.util.List;

import com.lucas.catalogo.model.Musica;
import com.lucas.catalogo.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatalogoController {

    @Autowired
    CatalogoService catalogoService;

    @RequestMapping(value = "/musicas", method=RequestMethod.GET)
    public ModelAndView getMusicas() {
        ModelAndView mv = new ModelAndView("musicas");
        List<Musica> musicas = catalogoService.findAll();  
        mv.addObject("musicas", musicas);
        return mv;
    }

}