package br.com.jobson.dao;

public interface ICarroDAO<T> {
    public Boolean cadastrar(T objeto);

    public T consultar(T verificador);
}
