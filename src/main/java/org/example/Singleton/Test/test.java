package org.example.Singleton.Test;

import org.example.Facade.Facade;
import org.example.Singleton.SingletonLazy;
import org.example.strategy.ComportamentoAgressivo;
import org.example.strategy.ComportamentoDefensivo;
import org.example.strategy.ComportamentoNormal;
import org.example.strategy.Robo;

public class test {
    public static void main(String[] args) {


        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        ComportamentoNormal Normal = new ComportamentoNormal();
        ComportamentoAgressivo Agressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo Defensivo = new ComportamentoDefensivo();

        Facade facade = new Facade();
        facade.migraCliente("Joao","12345678");
        facade.migraCliente("Breno", "10304056");

    }
}
