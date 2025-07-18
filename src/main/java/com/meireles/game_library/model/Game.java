package com.meireles.game_library.model;

import jakarta.persistence.*;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String titulo;

    @Enumerated(EnumType.STRING)
    private String genero;

    private String plataforma;

    private Integer anoLancamento;
}
