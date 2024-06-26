package DAO;

import model.ModelFormaPagamento;
import conexoes.Conexao;
import java.util.ArrayList;

/**
 *
 * @author Vitor
 */
public class DAOFormaPagamento extends Conexao {

    /**
     * grava FormaPagamento
     *
     * @param pModelFormaPagamento
     * @return int
     */
    public int salvarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO forma_pagamento ("
                    + "id_venda,"
                    + "descricao,"
                    + "parcela"
                    + ") VALUES ("
                    + "'" + pModelFormaPagamento.getId_venda() + "',"
                    + "'" + pModelFormaPagamento.getDescricao() + "',"
                    + "'" + pModelFormaPagamento.getParcelas() + "'"
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
     * recupera FormaPagamento
     *
     * @param pId
     * @return ModelFormaPagamento
     */
    public ModelFormaPagamento getFormaPagamentoDAO(int pId) {
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "id_venda,"
                    + "descricao,"
                    + "parcela"
                    + " FROM"
                    + " forma_pagamento"
                    + " WHERE"
                    + " id_venda = '" + pId + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFormaPagamento.setId(this.getResultSet().getInt(1));
                modelFormaPagamento.setId_venda(this.getResultSet().getInt(2));
                modelFormaPagamento.setDescricao(this.getResultSet().getString(3));
                modelFormaPagamento.setParcelas(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }

    /**
     * recupera uma lista de FormaPagamento
     *
     * @return ArrayList
     */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoDAO() {
        ArrayList<ModelFormaPagamento> listamodelFormaPagamento = new ArrayList();
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "id_venda,"
                    + "descricao,"
                    + "parcela"
                    + " FROM"
                    + " forma_pagamento"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFormaPagamento = new ModelFormaPagamento();
                modelFormaPagamento.setId(this.getResultSet().getInt(1));
                modelFormaPagamento.setId_venda(this.getResultSet().getInt(2));
                modelFormaPagamento.setDescricao(this.getResultSet().getString(3));
                modelFormaPagamento.setParcelas(this.getResultSet().getInt(4));

                listamodelFormaPagamento.add(modelFormaPagamento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelFormaPagamento;
    }

    /**
     * atualiza FormaPagamento
     *
     * @param pModelFormaPagamento
     * @return boolean
     */
    public boolean atualizarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE forma_pagamento SET "
                    + "id = '" + pModelFormaPagamento.getId() + "',"
                    + "descricao = '" + pModelFormaPagamento.getDescricao() + "',"
                    + "parcelas = '" + pModelFormaPagamento.getParcelas() + "'"
                    + " WHERE "
                    + "id = '" + pModelFormaPagamento.getId() + "'"
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
     * exclui FormaPagamento
     *
     * @param pId
     * @return boolean
     */
    public boolean excluirFormaPagamentoDAO(int pId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM forma_pagamento "
                    + " WHERE "
                    + "id = '" + pId + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
