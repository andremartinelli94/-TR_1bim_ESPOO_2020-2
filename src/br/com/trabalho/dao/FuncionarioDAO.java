/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho.dao;

import br.com.trabalho.model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class FuncionarioDAO {

    private ArrayList<Funcionario> ListaFunc = new ArrayList<Funcionario>();

    public void addFuncionario(Funcionario f) {
        ListaFunc.add(f);
    }

    public Funcionario removeFuncionario(int index) {
        return ListaFunc.remove(index);
    }

    public Funcionario editarFuncionario(int index) {
        return ListaFunc.get(index);
    }

    public int getTotal() {
        return ListaFunc.size();
    }

    public ArrayList<Funcionario> listaGeral() {
        return ListaFunc;
    }
    
   
}
