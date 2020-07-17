package controller;

import model.ModelUser;
import DAO.DAOUser;
import java.util.ArrayList;

/**
*
* @author Vitor
*/
public class ControllerUser {

    private DAOUser daoUser = new DAOUser();

    /**
    * grava User
    * @param pModelUser
    * @return int
    */
    public int salvarUserController(ModelUser pModelUser){
        return this.daoUser.salvarUserDAO(pModelUser);
    }

    /**
    * recupera User
    * @param pId
    * @return ModelUser
    */
    public ModelUser getUserController(int pId){
        return this.daoUser.getUserDAO(pId);
    }
    
     /**
    * recupera User
    * @param pLogin
    * @return ModelUser
    */
    public ModelUser getUserController(String pLogin){
        return this.daoUser.getUserDAO(pLogin);
    }

    /**
    * recupera uma lista deUser
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelUser> getListaUserController(){
        return this.daoUser.getListaUserDAO();
    }

    /**
    * atualiza User
    * @param pModelUser
    * @return boolean
    */
    public boolean atualizarUserController(ModelUser pModelUser){
        return this.daoUser.atualizarUserDAO(pModelUser);
    }

    /**
    * exclui User
    * @param pId
    * @return boolean
    */
    public boolean excluirUserController(int pId){
        return this.daoUser.excluirUserDAO(pId);
    }

    public boolean getValidarUserController(ModelUser pModelUsuario) {
        return this.daoUser.getValidarUserDAO(pModelUsuario);
    }

  
}