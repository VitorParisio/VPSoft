/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutoVendaProdutos;
import java.util.ArrayList;
import model.ModelProdutoVendaProdutos;

/**
 *
 * @author Vitor
 */
public class ControllerProdutoVendaProdutos {
    
    private DaoProdutoVendaProdutos daoProdutoVendaProdutos = new DaoProdutoVendaProdutos();
    
    public ArrayList<ModelProdutoVendaProdutos> getListaProdutoVendaProdutoController(int pCodVenda){
        return this.daoProdutoVendaProdutos.getListaProdtudoVendaProdutosDAO(pCodVenda);
    }
}
