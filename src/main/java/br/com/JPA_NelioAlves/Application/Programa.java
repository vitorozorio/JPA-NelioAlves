package br.com.JPA_NelioAlves.Application;

import br.com.JPA_NelioAlves.Dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1,"Vitor","suporte2@pontosocorro.com.br");
        Pessoa p2 = new Pessoa(2,"Eduardo","suporte@pontosocorro.com.br");
        Pessoa p3 = new Pessoa(3,"Renan","suporte3@pontosocorro.com.br");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}