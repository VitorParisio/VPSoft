package DAO;

import model.ModelCliente;
import conexoes.Conexao;
import java.util.ArrayList;
/**
*
* @author Vitor
*/
public class DAOCliente extends Conexao {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO client ("
                    + "name,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "fone"
                + ") VALUES ("
                    + "'" + pModelCliente.getName() + "',"
                    + "'" + pModelCliente.getEndereco() + "',"
                    + "'" + pModelCliente.getBairro() + "',"
                    + "'" + pModelCliente.getCidade() + "',"
                    + "'" + pModelCliente.getUf() + "',"
                    + "'" + pModelCliente.getCep() + "',"
                    + "'" + pModelCliente.getFone() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Cliente
    * @param pId
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pId){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "name,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "fone"
                 + " FROM"
                     + " client"
                 + " WHERE"
                     + " id = '" + pId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setId(this.getResultSet().getInt(1));
                modelCliente.setName(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setFone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    
    /**
    * recupera Cliente
    * @param pNomeCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(String pNomeCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "name,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "fone"
                 + " FROM"
                     + " client"
                 + " WHERE"
                     + " name = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setId(this.getResultSet().getInt(1));
                modelCliente.setName(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setFone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }


    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "name,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "fone"
                 + " FROM"
                     + " client"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setId(this.getResultSet().getInt(1));
                modelCliente.setName(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setFone(this.getResultSet().getString(8));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE client SET "
                    + "id = '" + pModelCliente.getId() + "',"
                    + "name = '" + pModelCliente.getName() + "',"
                    + "endereco = '" + pModelCliente.getEndereco() + "',"
                    + "bairro = '" + pModelCliente.getBairro() + "',"
                    + "cidade = '" + pModelCliente.getCidade() + "',"
                    + "uf = '" + pModelCliente.getUf() + "',"
                    + "cep = '" + pModelCliente.getCep() + "',"
                    + "fone = '" + pModelCliente.getFone() + "'"
                + " WHERE "
                    + "id = '" + pModelCliente.getId() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Cliente
    * @param pId
    * @return boolean
    */
    public boolean excluirClienteDAO(int pId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM client "
                + " WHERE "
                    + "id = '" + pId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}