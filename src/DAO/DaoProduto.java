package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author Vitor
 */
public class DaoProduto extends Conexao {

    /**
     * Cadastrar produto
     *
     * @param pModelProduto
     * @return Integer
     */
    public int salvarProdutoDao(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO produto("
                    + "name,"
                    + "price,"
                    + "estoque,"
                    + "codbarra"
                    + ") values ("
                    + "'" + pModelProduto.getName() + "',"
                    + "'" + pModelProduto.getPrice() + "',"
                    + "'" + pModelProduto.getEstoque() + "',"
                    + "'" + pModelProduto.getCodBarra() + "'"
                    + ");");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     * Deletar produto
     *
     * @param id
     * @return boolean
     */
    public boolean excluirProdutoDao(int id) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM produto WHERE id = '" + id + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Alterar dados Produto
     *
     * @param pModelProduto
     * @return boolean
     */
    public boolean alterProdutoDao(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE produto SET "
                    + "name = '" + pModelProduto.getName() + "',"
                    + "price = '" + pModelProduto.getPrice() + "',"
                    + "estoque = '" + pModelProduto.getEstoque() + "',"
                    + "codbarra = '" + pModelProduto.getCodBarra() + "'"
                    + " WHERE id = '" + pModelProduto.getId() + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Retornar produto pelo ID
     *
     * @param id
     * @return Objeto
     */
    public ModelProduto retronarProdutoDao(int id) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "id, "
                    + "name,"
                    + "price,"
                    + "estoque,"
                    + "codbarra "
                    + "FROM produto WHERE id = '" + id + "'");

            while (this.getResultSet().next()) {
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setName(this.getResultSet().getString(2));
                modelProduto.setPrice(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                modelProduto.setCodBarra(this.getResultSet().getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }
    
    public ModelProduto getCodigoBarraDao(String pCodBarra){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "id, "
                    + "name,"
                    + "price,"
                    + "estoque,"
                    + "codbarra "
                    + "FROM produto WHERE codbarra = '" + pCodBarra + "'");

            while (this.getResultSet().next()) {
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setName(this.getResultSet().getString(2));
                modelProduto.setPrice(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                modelProduto.setCodBarra(this.getResultSet().getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * Retornar produto pelo name
     *
     * @param pNomeProduto
     * @return Objeto
     */
    public ModelProduto retronarProdutoDao(String pNomeProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "id, "
                    + "name,"
                    + "price,"
                    + "estoque,"
                    + "codbarra "
                    + "FROM produto WHERE name = '" + pNomeProduto + "'");

            while (this.getResultSet().next()) {
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setName(this.getResultSet().getString(2));
                modelProduto.setPrice(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                modelProduto.setCodBarra(this.getResultSet().getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * Retorna lista de produtos
     *
     * @return ArrayList
     */
    public ArrayList<ModelProduto> retornarListaProdutoDao() {
        ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "id, "
                    + "name,"
                    + "price,"
                    + "estoque,"
                    + "codbarra "
                    + "FROM produto;");
            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setName(this.getResultSet().getString(2));
                modelProduto.setPrice(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                modelProduto.setCodBarra(this.getResultSet().getString(5));
                listaModelProdutos.add(modelProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelProdutos;
    }

    public boolean alterEstoqueProdutoDao(ArrayList<ModelProduto> pListaModelProduto) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelProduto.size(); i++) {
                this.executarUpdateDeleteSQL("UPDATE produto SET "
                        + "estoque = '" + pListaModelProduto.get(i).getEstoque() + "'"
                        + " WHERE id = '" + pListaModelProduto.get(i).getId() + "'");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
