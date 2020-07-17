package controller;

import model.ModelVendaProduto;
import DAO.DAOVendaProduto;
import java.util.ArrayList;

/**
*
* @author Vitor
*/
public class ControllerVendaProduto {

    private DAOVendaProduto daoVendaProduto = new DAOVendaProduto();

    /**
    * grava VendaProduto
    * @param pModelVendaProduto
    * @return int
    */
    public int salvarVendaProdutoController(ModelVendaProduto pModelVendaProduto){
        return this.daoVendaProduto.salvarVendaProdutoDAO(pModelVendaProduto);
    }

    /**
    * recupera VendaProduto
    * @param pId
    * @return ModelVendaProduto
    */
    public ModelVendaProduto getVendaProdutoController(int pId){
        return this.daoVendaProduto.getVendaProdutoDAO(pId);
    }

    /**
    * recupera uma lista deVendaProduto
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelVendaProduto> getListaVendaProdutoController(){
        return this.daoVendaProduto.getListaVendaProdutoDAO();
    }

    /**
    * atualiza VendaProduto
    * @param pModelVendaProduto
    * @return boolean
    */
    public boolean atualizarVendaProdutoController(ModelVendaProduto pModelVendaProduto){
        return this.daoVendaProduto.atualizarVendaProdutoDAO(pModelVendaProduto);
    }

    /**
    * exclui VendaProduto
    * @param pId
    * @return boolean
    */
    public boolean excluirVendaProdutoController(int pId){
        return this.daoVendaProduto.excluirVendaProdutoDAO(pId);
    }

    public boolean salvarVendaProdutoController(ArrayList<ModelVendaProduto> pListaModelVendaProduto) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(pListaModelVendaProduto);
    }
}