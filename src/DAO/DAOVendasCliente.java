package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVenda;
import model.ModelVendasCliente;

/**
 *
 * @author Vitor
 */
public class DAOVendasCliente extends Conexao{
    
    public ArrayList<ModelVendasCliente> getListaVendaClienteDAO() {
        ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "venda.id,"
                    + "venda.id_client,"
                    + "venda.data_venda,"
                    + "venda.valor,"
                    + "venda.total,"
                    + "venda.ven_desconto,"
                            + "client.id,"
                            + "client.name,"
                            + "client.endereco,"
                            + "client.bairro,"
                            + "client.cidade,"
                            + "client.uf,"
                            + "client.cep,"
                            + "client.fone"
                    + " FROM"
                    + " venda INNER JOIN client "
                            + "ON client.id = venda.id_client; "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();  
                
                modelVenda.setId(this.getResultSet().getInt(1));
                modelVenda.setIdClient(this.getResultSet().getInt(2));
                modelVenda.setDataVenda(this.getResultSet().getDate(3));
                modelVenda.setValor(this.getResultSet().getDouble(4));
                modelVenda.setTotal(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
                
                modelCliente.setId(this.getResultSet().getInt(7));
                modelCliente.setName(this.getResultSet().getString(8));
                modelCliente.setEndereco(this.getResultSet().getString(9));
                modelCliente.setBairro(this.getResultSet().getString(10));
                modelCliente.setCidade(this.getResultSet().getString(11));
                modelCliente.setUf(this.getResultSet().getString(12));
                modelCliente.setCep(this.getResultSet().getString(13));
                modelCliente.setFone(this.getResultSet().getString(14));
                
                modelVendasCliente.setModelVendas(modelVenda);
                modelVendasCliente.setModelCliente(modelCliente);
                
                listaModelVendasCliente.add(modelVendasCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }
    
}
