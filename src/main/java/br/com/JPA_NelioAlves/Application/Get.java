package br.com.JPA_NelioAlves.Application;

import br.com.JPA_NelioAlves.Dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Get {

    public static void main(String []args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

        em.close();
        emf.close();

    }
}
