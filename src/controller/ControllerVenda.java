package controller;

import model.ModelVenda;
import DAO.DAOVenda;
import java.util.ArrayList;

/**
*
* @author Vitor
*/
public class ControllerVenda {

    private DAOVenda daoVenda = new DAOVenda();

    /**
    * grava Venda
    * @param pModelVenda
    * @return int
    */
    public int salvarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.salvarVendaDAO(pModelVenda);
    }

    /**
    * recupera Venda
    * @param pId
    * @return ModelVenda
    */
    public ModelVenda getVendaController(int pId){
        return this.daoVenda.getVendaDAO(pId);
    }

    /**
    * recupera uma lista deVenda
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaController(){
        return this.daoVenda.getListaVendaDAO();
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * @return boolean
    */
    public boolean atualizarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.atualizarVendaDAO(pModelVenda);
    }

    /**
    * exclui Venda
    * @param pId
    * @return boolean
    */
    public boolean excluirVendaController(int pId){
        return this.daoVenda.excluirVendaDAO(pId);
    }

    public boolean gerarRelatorioVenda() {
       return this.daoVenda.getRelatorioVendaDAO();
    }
}