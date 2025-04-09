package br.com.jobson.dao;

public interface IConcessionariaDAO<T> {
    public void cadastrar(T automovel);

    public void mostrarTudo();
}
