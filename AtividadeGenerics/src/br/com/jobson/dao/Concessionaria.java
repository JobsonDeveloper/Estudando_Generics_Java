package br.com.jobson.dao;

import br.com.jobson.domain.Automovel;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria<T> implements IConcessionariaDAO<T>{
    private List<T> concessionaria;

    @Override
    public void cadastrar(T automovel) {
        if(this.concessionaria == null) {
            this.concessionaria = new ArrayList<>();
        }
        this.concessionaria.add(automovel);
    }

    @Override
    public void mostrarTudo() {
        for(T automovel : this.concessionaria) {
            System.out.println(automovel.getClass().getSimpleName() + ", " + automovel.toString());
        }
    }
}
