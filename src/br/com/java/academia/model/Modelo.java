/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.academia.model;

import br.com.java.academia.dao.GenericDAO;
import br.com.java.academia.interfaces.CRUD;
import java.io.Serializable;
import java.util.List;

/**
 * Classe de modelo base.
 * 
 * @author Pablo Rangel <pablorangel at gmail.com>
 * @param <T> tipo genérico para as classes de modelo a serem persistidas.
 * 
 * @since 20/05/2016
 */
public abstract class Modelo<T> implements CRUD, Serializable{
    
    private GenericDAO<T> gDAO;
    
    public Modelo(){
        gDAO = new GenericDAO(this);
    }

    public GenericDAO<T> getgDAO() {
        return gDAO;
    }

    public void setgDAO(GenericDAO<T> gDAO) {
        this.gDAO = gDAO;
    }
    
    @Override
    public void inserir() {
        getgDAO().inserir();
    }

    @Override
    public void alterar() {
        getgDAO().alterar();
    }

    @Override
    public void buscar(long id) {
        getgDAO().buscar(id);
    }

    @Override
    public void excluir() {
        getgDAO().excluir();
    }

    @Override
    public List<T> getList() {
        return getgDAO().getList();
    }

    
}
