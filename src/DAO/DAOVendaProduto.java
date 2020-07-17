package DAO;

import model.ModelVendaProduto;
import conexoes.Conexao;
import java.util.ArrayList;

/**
 *
 * @author Vitor
 */
public class DAOVendaProduto extends Conexao {

    /**
     * grava VendaProduto
     *
     * @param pModelVendaProduto
     * @return int
     */
    public int salvarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO venda_produto ("
                    + "id_produto,"
                    + "id_venda,"
                    + "ven_pro_valor,"
                    + "ven_pro_qtd"
                    + ") VALUES ("
                    + "'" + pModelVendaProduto.getIdProduto() + "',"
                    + "'" + pModelVendaProduto.getIdVenda() + "',"
                    + "'" + pModelVendaProduto.getVenProValor() + "',"
                    + "'" + pModelVendaProduto.getVenProQtd() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera VendaProduto
     *
     * @param pId
     * @return ModelVendaProduto
     */
    public ModelVendaProduto getVendaProdutoDAO(int pId) {
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "id_produto,"
                    + "id_venda,"
                    + "ven_pro_valor,"
                    + "ven_pro_qtd"
                    + " FROM"
                    + " venda_produto"
                    + " WHERE"
                    + " id = '" + pId + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendaProduto.setId(this.getResultSet().getInt(1));
                modelVendaProduto.setIdProduto(this.getResultSet().getInt(2));
                modelVendaProduto.setIdVenda(this.getResultSet().getInt(3));
                modelVendaProduto.setVenProValor(this.getResultSet().getDouble(4));
                modelVendaProduto.setVenProQtd(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendaProduto;
    }

    /**
     * recupera uma lista de VendaProduto
     *
     * @return ArrayList
     */
    public ArrayList<ModelVendaProduto> getListaVendaProdutoDAO() {
        ArrayList<ModelVendaProduto> listamodelVendaProduto = new ArrayList();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "id_produto,"
                    + "id_venda,"
                    + "ven_pro_valor,"
                    + "ven_pro_qtd"
                    + " FROM"
                    + " venda_produto"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendaProduto = new ModelVendaProduto();
                modelVendaProduto.setId(this.getResultSet().getInt(1));
                modelVendaProduto.setIdProduto(this.getResultSet().getInt(2));
                modelVendaProduto.setIdVenda(this.getResultSet().getInt(3));
                modelVendaProduto.setVenProValor(this.getResultSet().getDouble(4));
                modelVendaProduto.setVenProQtd(this.getResultSet().getInt(5));
                listamodelVendaProduto.add(modelVendaProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendaProduto;
    }

    /**
     * atualiza VendaProduto
     *
     * @param pModelVendaProduto
     * @return boolean
     */
    public boolean atualizarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE venda_produto SET "
                    + "id = '" + pModelVendaProduto.getId() + "',"
                    + "id_produto = '" + pModelVendaProduto.getIdProduto() + "',"
                    + "id_venda = '" + pModelVendaProduto.getIdVenda() + "',"
                    + "ven_pro_valor = '" + pModelVendaProduto.getVenProValor() + "',"
                    + "ven_pro_qtd = '" + pModelVendaProduto.getVenProQtd() + "'"
                    + " WHERE "
                    + "id = '" + pModelVendaProduto.getId() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendaProduto
     *
     * @param pId
     * @return boolean
     */
    public boolean excluirVendaProdutoDAO(int pId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM venda_produto "
                    + " WHERE "
                    + "id_venda = '" + pId + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarVendaProdutoDAO(ArrayList<ModelVendaProduto> pListaModelVendaProduto) {
        try {
            this.conectar();
            int cont = pListaModelVendaProduto.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "INSERT INTO venda_produto ("
                        + "id_produto,"
                        + "id_venda,"
                        + "ven_pro_valor,"
                        + "ven_pro_qtd"
                        + ") VALUES ("
                        + "'" + pListaModelVendaProduto.get(i).getIdProduto() + "',"
                        + "'" + pListaModelVendaProduto.get(i).getIdVenda() + "',"
                        + "'" + pListaModelVendaProduto.get(i).getVenProValor() + "',"
                        + "'" + pListaModelVendaProduto.get(i).getVenProQtd() + "'"
                        + ");"
                );
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
