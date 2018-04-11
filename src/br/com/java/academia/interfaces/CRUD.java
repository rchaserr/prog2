package br.com.java.academia.interfaces;

import java.util.List;

/**
 * Interface que define as operações básicas para Inserção, Busca, Alteração e Exclusão (Create, Retrieve, Update e Delete - CRUD)
 * 
 * Esta interface também apresenta operações adicionais para consulta ao Banco de Dados.
 * 
 * @author Pablo Rangel <pablorangel at gmail.com>
 * @param <T> tipo genérico para as classes de modelo a serem persistidas.
 * @since 20/05/2016
 */
public interface CRUD <T>{
    public void inserir ();
    public void alterar ();
    public void buscar (long id);
    public void excluir ();
    public List<T> getList();
}
