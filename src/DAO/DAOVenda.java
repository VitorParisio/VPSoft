package DAO;

import model.ModelVenda;
import conexoes.Conexao;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Vitor
 */
public class DAOVenda extends Conexao {

    /**
     * grava Venda
     *
     * @param pModelVenda
     * @return int
     */
    public int salvarVendaDAO(ModelVenda pModelVenda) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO venda ("
                    + "id_client,"
                    + "data_venda,"
                    + "valor,"
                    + "total,"
                    + "ven_desconto"
                    + ") VALUES ("
                    + "'" + pModelVenda.getIdClient() + "',"
                    + "'" + pModelVenda.getDataVenda() + "',"
                    + "'" + pModelVenda.getValor() + "',"
                    + "'" + pModelVenda.getTotal() + "',"
                    + "'" + pModelVenda.getVenDesconto() + "'"
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
     * recupera Venda
     *
     * @param pId
     * @return ModelVenda
     */
    public ModelVenda getVendaDAO(int pId) {
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "id_client,"
                    + "data_venda,"
                    + "valor,"
                    + "total,"
                    + "ven_desconto"
                    + " FROM"
                    + " venda"
                    + " WHERE"
                    + " id = '" + pId + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVenda.setId(this.getResultSet().getInt(1));
                modelVenda.setIdClient(this.getResultSet().getInt(2));
                modelVenda.setDataVenda(this.getResultSet().getDate(3));
                modelVenda.setValor(this.getResultSet().getDouble(4));
                modelVenda.setTotal(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
     * recupera uma lista de Venda
     *
     * @return ArrayList
     */
    public ArrayList<ModelVenda> getListaVendaDAO() {
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "id_client,"
                    + "data_venda,"
                    + "valor,"
                    + "total,"
                    + "ven_desconto"
                    + " FROM"
                    + " venda"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setId(this.getResultSet().getInt(1));
                modelVenda.setIdClient(this.getResultSet().getInt(2));
                modelVenda.setDataVenda(this.getResultSet().getDate(3));
                modelVenda.setValor(this.getResultSet().getDouble(4));
                modelVenda.setTotal(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
                listamodelVenda.add(modelVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
     * atualiza Venda
     *
     * @param pModelVenda
     * @return boolean
     */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE venda SET "
                    + "id = '" + pModelVenda.getId() + "',"
                    + "id_client = '" + pModelVenda.getIdClient() + "',"
                    + "data_venda = '" + pModelVenda.getDataVenda() + "',"
                    + "valor = '" + pModelVenda.getValor() + "',"
                    + "total = '" + pModelVenda.getTotal() + "',"
                    + "ven_desconto = '" + pModelVenda.getVenDesconto() + "'"
                    + " WHERE "
                    + "id = '" + pModelVenda.getId() + "'"
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
     * exclui Venda
     *
     * @param pId
     * @return boolean
     */
    public boolean excluirVendaDAO(int pId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM venda "
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

    public boolean getRelatorioVendaDAO() {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT"
                    + " produto.id AS produto_id,"
                    + " produto.name AS produto_name,"
                    + " venda.valor AS venda_valor,"
                    + " venda.total AS venda_total,"
                    + " venda.ven_desconto AS venda_ven_desconto,"
                    + " venda_produto.ven_pro_valor AS venda_produto_ven_pro_valor,"
                    + " venda_produto.ven_pro_qtd AS venda_produto_ven_pro_qtd"
                    + " FROM"
                    + " produto produto INNER JOIN venda_produto venda_produto ON produto.id = venda_produto.id_produto"
                    + " INNER JOIN venda venda ON venda_produto.id_venda = venda.id;"
            );
            JRResultSetDataSource JrRs = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relvenda/relvenda.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), JrRs);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/Vitor/Documents/NetBeansProjects/VPSoft/rel/relvenda.pdf");
            File file = new File("C:/Users/Vitor/Documents/NetBeansProjects/VPSoft/rel/relvenda.pdf");

            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
