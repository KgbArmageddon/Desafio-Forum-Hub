package com.forumhub.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private String status;
    private String autor;
    private String curso;

    // Getters e Setters
}
