/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.academia.dao;

import br.com.java.academia.interfaces.CRUD;
import br.com.java.academia.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 * Esta classe implementa um DAO (Data Access Object - Genérico) para conexão ao Banco de
 * Dados.
 *
 * @since 20/05/2016
 * @author Pablo Rangel <pablorangel at gmail.com>
 * @param <T> tipo genérico para as classes de modelo a serem persistidas.
 */
public class GenericDAO<T> implements CRUD {

    private T objetoModelo;

    public GenericDAO(T objetoModelo) {
        super();
        this.objetoModelo = objetoModelo;
    }
    
    public T getObjetoModelo() {
        return objetoModelo;
    }

    public void setObjetoModelo(T objetoModelo) {
        this.objetoModelo = objetoModelo;
    }
    
    @Override
    public void inserir() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            s.getTransaction().begin();
            s.save(getObjetoModelo());
        } catch (HibernateException ex) {
            System.err.println("Erro ao incluir registro: " + ex);
            s.getTransaction().rollback();
        } finally {
            s.getTransaction().commit();
            s.flush();
            s.close();
        }
    }

    @Override
    public void alterar() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            s.getTransaction().begin();
            s.update(getObjetoModelo());
        } catch (HibernateException ex) {
            System.err.println("Erro ao incluir alterar: " + ex);
            s.getTransaction().rollback();
        } finally {
            s.getTransaction().commit();
            s.flush();
            s.close();
        }
    }

    @Override
    public void excluir() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            s.getTransaction().begin();
            s.delete(getObjetoModelo());
        } catch (HibernateException ex) {
            System.err.println("Erro ao excluir registro: " + ex);
            s.getTransaction().rollback();
        } finally {
            s.getTransaction().commit();
            s.flush();
            s.close();
        }
    }

    @Override
    public List<T> getList() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List <T> list = null;
        try {
           s.getTransaction().begin();
           Criteria criteria = s.createCriteria(getObjetoModelo().getClass());
           criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
           list = criteria.list(); 
            
        } catch (HibernateException ex) {
            System.err.println("Erro ao buscar registros (lista): " + ex);
            s.getTransaction().rollback();
        } finally {
            s.getTransaction().commit();
            s.flush();
            s.close();
        }
        
        return list;
    }

    @Override
    public void buscar(long id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            s.getTransaction().begin();
            s.load(getObjetoModelo(), id);
        } catch (HibernateException ex) {
            System.err.println("Erro ao buscar registro: " + ex);
            s.getTransaction().rollback();
        } finally {
            s.getTransaction().commit();
            s.flush();
            s.close();
        }
    }

    public List executarConsultaPersonalizada(String sql){
        Session s = HibernateUtil.getSessionFactory().openSession();
        List data = null;
        try {
            s.getTransaction().begin();
            SQLQuery query = s.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            data = query.list();
        } catch (HibernateException ex) {
            System.err.println("Erro ao buscar registros: " + ex);
            s.getTransaction().rollback();
        } finally {
            s.getTransaction().commit();
            s.flush();
            s.close();
        }
        return data;
    }
}
