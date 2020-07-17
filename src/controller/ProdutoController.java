package controller;

import DAO.DaoProduto;
import java.util.ArrayList;
import model.ModelProduto;

public class ProdutoController {
    private DaoProduto daoProduto = new DaoProduto();
    
    public int salvarProdutoController(ModelProduto produto){
        return this.daoProduto.salvarProdutoDao(produto);
    }
    
    public boolean excluirProdutoController(int codigo){
        return this.daoProduto.excluirProdutoDao(codigo);
    }
    
    public boolean alterarProdutoController(ModelProduto produto){
        return this.daoProduto.alterProdutoDao(produto);
    }
    
    public ModelProduto retornaProdutoController(int codigo){
        return this.daoProduto.retronarProdutoDao(codigo);
    }
    
    public ModelProduto retornaProdutoControllerString(String pNomeProduto){
        return this.daoProduto.retronarProdutoDao(pNomeProduto);
    }
    
    public ArrayList<ModelProduto> retornaListaProdutoController(){
        return this.daoProduto.retornarListaProdutoDao();
    }

    public boolean alterarEstoqueProdutoController(ArrayList<ModelProduto> pListaModelProduto) {
       return this.daoProduto.alterEstoqueProdutoDao(pListaModelProduto);
    }

    public ModelProduto getCodigoBarraController(String pCodigoBarra) {
        return this.daoProduto.getCodigoBarraDao(pCodigoBarra);
    }
}
