package com.forumhub.controller;

import com.forumhub.dto.TopicoDTO;
import com.forumhub.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<TopicoDTO> criarTopico(@RequestBody TopicoDTO topicoDTO) {
        return ResponseEntity.ok(topicoService.criarTopico(topicoDTO));
    }

    @GetMapping
    public List<TopicoDTO> listarTopicos() {
        return topicoService.listarTopicos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirTopico(@PathVariable Long id) {
        topicoService.excluirTopico(id);
        return ResponseEntity.noContent().build();
    }
}
