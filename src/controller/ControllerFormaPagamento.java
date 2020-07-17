package controller;

import model.ModelFormaPagamento;
import DAO.DAOFormaPagamento;
import java.util.ArrayList;

/**
*
* @author Vitor
*/
public class ControllerFormaPagamento {

    private DAOFormaPagamento daoFormaPagamento = new DAOFormaPagamento();

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    public int salvarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.salvarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * recupera FormaPagamento
    * @param pId
    * @return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoController(int pId){
        return this.daoFormaPagamento.getFormaPagamentoDAO(pId);
    }

    /**
    * recupera uma lista deFormaPagamento
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoController(){
        return this.daoFormaPagamento.getListaFormaPagamentoDAO();
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * @return boolean
    */
    public boolean atualizarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.atualizarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * exclui FormaPagamento
    * @param pId
    * @return boolean
    */
    public boolean excluirFormaPagamentoController(int pId){
        return this.daoFormaPagamento.excluirFormaPagamentoDAO(pId);
    }
}