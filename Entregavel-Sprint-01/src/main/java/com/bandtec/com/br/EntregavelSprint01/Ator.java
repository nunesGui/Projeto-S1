package com.bandtec.com.br.EntregavelSprint01;

public class Ator extends Artista {

    //Atributos
    private Double valorEstreia;
    private Double valorPeca;
    private Double valorNovela;
    private Double lucro;

    //Construtor
    public Ator(String nome, Integer idade, String profissao, Double valorEstreia, Double valorPeca, Double valorNovela) {
        super(nome, idade, profissao);
        this.valorEstreia = valorEstreia;
        this.valorPeca = valorPeca;
        this.valorNovela = valorNovela;
    }

    //Getters
    public Double getValorEstreia() {
        return valorEstreia;
    }

    public Double getValorPeca() {
        return valorPeca;
    }

    public Double getValorNovela() {
        return valorNovela;
    }

    public Double getLucro() {
        return lucro;
    }

    //Invocação do método da Classe abstrata
    @Override
    public Double calcValorMensal() {
        lucro = (valorEstreia + valorPeca + valorNovela) * 0.2;
        return lucro;
    }
}
