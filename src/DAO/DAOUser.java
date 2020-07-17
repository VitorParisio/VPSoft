package DAO;

import model.ModelUser;
import conexoes.Conexao;
import java.util.ArrayList;

/**
 *
 * @author Vitor
 */
public class DAOUser extends Conexao {

    /**
     * grava User
     *
     * @param pModelUser
     * @return int
     */
    public int salvarUserDAO(ModelUser pModelUser) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO user ("
                    + "name,"
                    + "login,"
                    + "senha"
                    + ") VALUES ("
                    + "'" + pModelUser.getName() + "',"
                    + "'" + pModelUser.getLogin() + "',"
                    + "'" + pModelUser.getSenha() + "'"
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
     * recupera User
     *
     * @param pId
     * @return ModelUser
     */
    public ModelUser getUserDAO(int pId) {
        ModelUser modelUser = new ModelUser();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "name,"
                    + "login,"
                    + "senha"
                    + " FROM"
                    + " user"
                    + " WHERE"
                    + " id = '" + pId + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUser.setId(this.getResultSet().getInt(1));
                modelUser.setName(this.getResultSet().getString(2));
                modelUser.setLogin(this.getResultSet().getString(3));
                modelUser.setSenha(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUser;
    }

    /**
     * recupera User
     *
     * @param pLogin
     * @return ModelUser
     */
    public ModelUser getUserDAO(String pLogin) {
        ModelUser modelUser = new ModelUser();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "name,"
                    + "login,"
                    + "senha"
                    + " FROM"
                    + " user"
                    + " WHERE"
                    + " login = '" + pLogin + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUser.setId(this.getResultSet().getInt(1));
                modelUser.setName(this.getResultSet().getString(2));
                modelUser.setLogin(this.getResultSet().getString(3));
                modelUser.setSenha(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUser;
    }
    
    /**
     * recupera uma lista de User
     *
     * @return ArrayList
     */
    public ArrayList<ModelUser> getListaUserDAO() {
        ArrayList<ModelUser> listamodelUser = new ArrayList();
        ModelUser modelUser = new ModelUser();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "name,"
                    + "login,"
                    + "senha"
                    + " FROM"
                    + " user"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUser = new ModelUser();
                modelUser.setId(this.getResultSet().getInt(1));
                modelUser.setName(this.getResultSet().getString(2));
                modelUser.setLogin(this.getResultSet().getString(3));
                modelUser.setSenha(this.getResultSet().getString(4));
                listamodelUser.add(modelUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUser;
    }

    /**
     * atualiza User
     *
     * @param pModelUser
     * @return boolean
     */
    public boolean atualizarUserDAO(ModelUser pModelUser) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE user SET "
                    + "id = '" + pModelUser.getId() + "',"
                    + "name = '" + pModelUser.getName() + "',"
                    + "login = '" + pModelUser.getLogin() + "',"
                    + "senha = '" + pModelUser.getSenha() + "'"
                    + " WHERE "
                    + "id = '" + pModelUser.getId() + "'"
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
     * exclui User
     *
     * @param pId
     * @return boolean
     */
    public boolean excluirUserDAO(int pId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM user "
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

    public boolean getValidarUserDAO(ModelUser pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "name,"
                    + "login,"
                    + "senha"
                    + " FROM"
                    + " user"
                    + " WHERE"
                    + " login = '" + pModelUsuario.getLogin() + "' AND senha = '" + pModelUsuario.getSenha() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
