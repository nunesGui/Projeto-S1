package com.bandtec.com.br.EntregavelSprint01;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    private List<Artista> artistas = new ArrayList<>();

    //Endpoint que retorna todos os artistas existentes na lista
    @GetMapping()
    public ResponseEntity getArtista() {
        if (artistas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(artistas);
    }

    //Endpoint que retorna artista específico, usando como parâmetro seu id
    @GetMapping("/{id}")
    public ResponseEntity recuperarArtista(@PathVariable int id) {
        if (artistas.size() >= id) {
            return ResponseEntity.ok().body(artistas.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Endpoint que cadastra cantores na lista
    @PostMapping("/cantor")
    public void cadastrarCantor(@RequestBody Cantor novoCantor) {
        novoCantor.calcValorMensal();
        artistas.add(novoCantor);
    }

    //Endpoint que cadastra atores na lista
    @PostMapping("/ator")
    public void cadastrarAtriz(@RequestBody Ator novoAtor) {
        novoAtor.calcValorMensal();
        artistas.add(novoAtor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirArtista(@PathVariable int id) {
        if (artistas.size() >= id) {
            artistas.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}


