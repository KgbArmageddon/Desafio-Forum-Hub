package com.forumhub.service;

import com.forumhub.dto.TopicoDTO;
import com.forumhub.model.Topico;
import com.forumhub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public TopicoDTO criarTopico(TopicoDTO topicoDTO) {
        Topico topico = new Topico();
        topico.setTitulo(topicoDTO.getTitulo());
        topico.setMensagem(topicoDTO.getMensagem());
        topico.setAutor(topicoDTO.getAutor());
        topico.setCurso(topicoDTO.getCurso());
        topico = topicoRepository.save(topico);
        return topicoDTO;
    }

    public List<TopicoDTO> listarTopicos() {
        return topicoRepository.findAll().stream().map(topico -> {
            TopicoDTO dto = new TopicoDTO();
            dto.setTitulo(topico.getTitulo());
            dto.setMensagem(topico.getMensagem());
            dto.setAutor(topico.getAutor());
            dto.setCurso(topico.getCurso());
            return dto;
        }).collect(Collectors.toList());
    }

    public void excluirTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}
