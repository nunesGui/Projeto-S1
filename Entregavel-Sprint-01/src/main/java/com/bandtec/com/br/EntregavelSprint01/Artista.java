package com.bandtec.com.br.EntregavelSprint01;

public abstract class Artista {

    //Atributos
    private String nome;
    private Integer idade;
    private String profissao;

    //Construtor
    public Artista(String nome, Integer idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    //Método
    public abstract Double calcValorMensal();
}
