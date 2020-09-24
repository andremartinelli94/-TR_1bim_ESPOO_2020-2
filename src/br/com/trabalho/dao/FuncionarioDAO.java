/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho.dao;

import br.com.trabalho.model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
   
    public Funcionario pequisaFuncionario(String nome, List<Funcionario> listaFuncionario) {
        for (int i = 0; i < listaFuncionario.size(); i++) {
            if(listaFuncionario.get(i).getNome().equals(nome)) {
                return listaFuncionario.get(i);               
            }
        }
        return null;
    }

}
