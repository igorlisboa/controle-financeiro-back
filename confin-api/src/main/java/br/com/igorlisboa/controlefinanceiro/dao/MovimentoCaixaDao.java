package br.com.igorlisboa.controlefinanceiro.dao;

import br.com.igorlisboa.controlefinanceiro.entidades.MovimentoCaixa;
import br.com.igorlisboa.controlefinanceiro.util.ConnectionFactory;
import br.com.igorlisboa.controlefinanceiro.util.Dao;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;


public class MovimentoCaixaDao implements Dao<MovimentoCaixa> {

    @Override
    public Optional<MovimentoCaixa> get(Integer id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("confin");
        EntityManager entityManager = factory.createEntityManager();

        Optional<MovimentoCaixa> result = Optional.ofNullable(entityManager.find(MovimentoCaixa.class, id));

        factory.close();

        return result;
    }

    @Override
    public List<MovimentoCaixa> getAll() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("confin");
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("Select m from MovimentoCaixa m");
        List<MovimentoCaixa> movimentoCaixas = new ArrayList<>();
        try {
          movimentoCaixas = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            factory.close();
        }

        return movimentoCaixas;
    }

    @Override
    public Boolean save(MovimentoCaixa movimentoCaixa) {
        System.out.println("===========================================");
        System.out.println("PASSO 4");
        System.out.println("===========================================");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("confin");
        System.out.println("===========================================");
        System.out.println("PASSO 5");
        System.out.println("===========================================");
        EntityManager entityManager = factory.createEntityManager();
        System.out.println("===========================================");
        System.out.println("PASSO 6");
        System.out.println("===========================================");
        EntityTransaction transaction = entityManager.getTransaction();
        System.out.println("===========================================");
        System.out.println("PASSO 7");
        System.out.println("===========================================");
        Boolean salvou = false;

        try {
            System.out.println("===========================================");
            System.out.println("PASSO 8");
            System.out.println("===========================================");
            transaction.begin();
            entityManager.persist(movimentoCaixa);
            System.out.println("===========================================");
            System.out.println("PASSO 9");
            System.out.println("===========================================");
            transaction.commit();
            salvou = true;
        }catch (Exception e){
            salvou = false;
            System.out.println("===========================================");
            System.out.println("PASSO eeee");
            System.out.println("===========================================");
            e.printStackTrace();
            transaction.rollback();
        }finally {
            System.out.println("===========================================");
            System.out.println("PASSO 10");
            System.out.println("===========================================");
            factory.close();
        }

        return salvou;
    }

    @Override
    public MovimentoCaixa update(MovimentoCaixa movimentoCaixa) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("confin");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        MovimentoCaixa novoValor = null;

        try {
            transaction.begin();
            novoValor = entityManager.merge(movimentoCaixa);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            factory.close();
        }

        return novoValor;
    }

    @Override
    public Boolean delete(MovimentoCaixa movimentoCaixa) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("confin");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Boolean apagou = false;

        try {
            transaction.begin();
            entityManager.remove(movimentoCaixa);
            transaction.commit();
            apagou = true;
        }catch (Exception e){
            apagou = false;
            transaction.rollback();
        }finally {
            factory.close();
        }

        return apagou;
    }
}
