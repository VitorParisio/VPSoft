package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelProduto;
import model.ModelProdutoVendaProdutos;
import model.ModelVendaProduto;

/**
 *
 * @author Vitor
 */
public class DaoProdutoVendaProdutos extends Conexao{
    
    public ArrayList<ModelProdutoVendaProdutos> getListaProdtudoVendaProdutosDAO(int pCodVenda){
        
        ArrayList<ModelProdutoVendaProdutos> listaModelProdutoVendaProdutos = new ArrayList<>();
        ModelProdutoVendaProdutos modelProdutoVendaProduto = new ModelProdutoVendaProdutos();
        
        ModelProduto modelProduto = new ModelProduto();
        
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        
        try{
            this.conectar();
            this.executarSQL("SELECT produto.id,"
                    + "produto.name,"
                    + "produto.price,"
                    + "produto.estoque,"
                    + "venda_produto.id,"
                    + "venda_produto.id_produto,"
                    + "venda_produto.id_venda,"
                    + "venda_produto.ven_pro_valor,"
                    + "venda_produto.ven_pro_qtd "
                    + "FROM venda_produto INNER JOIN produto ON produto.id = venda_produto.id_produto "
                    + "WHERE venda_produto.id_venda = '"+pCodVenda+"';");
            
            while(this.getResultSet().next()){
                modelProdutoVendaProduto = new ModelProdutoVendaProdutos();
                modelProduto = new ModelProduto();
                modelVendaProduto = new ModelVendaProduto();
                
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setName(this.getResultSet().getString(2));
                modelProduto.setPrice(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                
                modelVendaProduto.setId(this.getResultSet().getInt(5));
                modelVendaProduto.setIdProduto(this.getResultSet().getInt(6));
                modelVendaProduto.setIdVenda(this.getResultSet().getInt(7));
                modelVendaProduto.setVenProValor(this.getResultSet().getDouble(8));
                modelVendaProduto.setVenProQtd(this.getResultSet().getInt(9));
                
                modelProdutoVendaProduto.setModelProduto(modelProduto);
                modelProdutoVendaProduto.setModelVendaProduto(modelVendaProduto);
                
                listaModelProdutoVendaProdutos.add(modelProdutoVendaProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelProdutoVendaProdutos; 
    }
}
