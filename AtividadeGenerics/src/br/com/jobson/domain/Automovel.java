package br.com.jobson.domain;

public class Automovel {
    private String nome;
    private Double valor;
    private Long codigo;

    public Automovel(String nome, Double valor, Long codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Modelo: " + nome + ", Preço: " + valor + ", Codigo: " + codigo;
    }
}
