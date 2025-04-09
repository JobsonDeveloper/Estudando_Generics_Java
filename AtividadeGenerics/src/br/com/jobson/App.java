package br.com.jobson;

import br.com.jobson.dao.Concessionaria;
import br.com.jobson.domain.Fiat;
import br.com.jobson.domain.Uno;

public class App {
    public static void main(String[] args) {
        Concessionaria<Object> concessionaria = new Concessionaria();
        Fiat fiat = new Fiat("Fiat Fastback", 120.000, 15L, 80.000);
        Uno uno = new Uno("Qualquer", 12.00, 445L);
        concessionaria.cadastrar(fiat);
        concessionaria.cadastrar(uno);
        concessionaria.mostrarTudo();
    }
}
