package br.com.JPA_NelioAlves.Application;

import br.com.JPA_NelioAlves.Dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null,"Vitor","suporte2@pontosocorro.com.br");
        Pessoa p2 = new Pessoa(null,"Eduardo","suporte@pontosocorro.com.br");
        Pessoa p3 = new Pessoa(null,"Renan","suporte3@pontosocorro.com.br");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pronto");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}