package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

/**
*
* @author Vitor
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pId
    * @return ModelCliente
    */
    public ModelCliente getClienteController(int pId){
        return this.daoCliente.getClienteDAO(pId);
    }
    
    /**
    * recupera Cliente
    * @param pNomeCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteControllerString(String pNomeCliente){
        return this.daoCliente.getClienteDAO(pNomeCliente);
    }

    /**
    * recupera uma lista deCliente
    * @param ""
    * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pId
    * @return boolean
    */
    public boolean excluirClienteController(int pId){
        return this.daoCliente.excluirClienteDAO(pId);
    }
}