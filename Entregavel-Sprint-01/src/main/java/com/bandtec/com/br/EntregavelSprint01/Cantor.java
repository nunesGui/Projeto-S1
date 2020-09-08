package com.bandtec.com.br.EntregavelSprint01;

public class Cantor extends Artista {

    //Atributos
    private Double valorTour;
    private Double valorCD;
    private Double valorClipeMusical;
    private Double lucro;

    //Construtor
    public Cantor
            (String nome, Integer idade, String profissao, Double valorTour, Double valorCD, Double valorClipeMusical) {
        super(nome, idade, profissao);
        this.valorTour = valorTour;
        this.valorCD = valorCD;
        this.valorClipeMusical = valorClipeMusical;
    }

    //Invocação do método da Classe abstrata
    @Override
    public Double calcValorMensal() {
        lucro = (valorCD + valorClipeMusical + valorTour) * 0.3;
        return lucro;
    }

    //Getters
    public Double getValorTour() {
        return valorTour;
    }

    public Double getValorCD() {
        return valorCD;
    }

    public Double getValorClipeMusical() {
        return valorClipeMusical;
    }

    public Double getLucro() { return lucro; }


}
