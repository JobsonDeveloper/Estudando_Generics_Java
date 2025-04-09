package br.com.jobson.domain;

public class Fiat extends Automovel{
    private Double valorDeEntrada;

    public Fiat(String nome, Double valor, Long codigo, Double valorDeEntrada) {
        super(nome, valor, codigo);
        this.valorDeEntrada = valorDeEntrada;
    }

    public Double getValorDeEntrada() {
        return valorDeEntrada;
    }

    public void setValorDeEntrada(Double valorDeEntrada) {
        this.valorDeEntrada = valorDeEntrada;
    }

    @Override
    public String toString() {
        return "Valor de entrada: " + valorDeEntrada + ", "
                + super.toString();
    }
}
