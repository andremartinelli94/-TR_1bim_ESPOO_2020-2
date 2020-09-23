/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho.dao;

import br.com.trabalho.model.Departamento;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class DepartamentoDAO {

    private ArrayList<Departamento> ListaDep = new ArrayList<Departamento>();

    public void addFornecedor(Departamento dep) {
        ListaDep.add(dep);
    }

    public Departamento removeDepartamento(int index) {
        return ListaDep.remove(index);
    }

    public Departamento editarDepartamento(int index) {
        return ListaDep.get(index);
    }

    public int getTotal() {
        return ListaDep.size();
    }

    public ArrayList<Departamento> listaGeral() {
        return ListaDep;
    }
    
}
