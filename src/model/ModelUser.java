package model;
/**
*
* @author Vitor
*/
public class ModelUser {

    private int id;
    private String name;
    private String login;
    private String senha;

    /**
    * Construtor
    */
    public ModelUser(){}

    /**
    * seta o valor de id
    * @param pId
    */
    public void setId(int pId){
        this.id = pId;
    }
    /**
    * @return pk_id
    */
    public int getId(){
        return this.id;
    }

    /**
    * seta o valor de name
    * @param pName
    */
    public void setName(String pName){
        this.name = pName;
    }
    /**
    * @return name
    */
    public String getName(){
        return this.name;
    }

    /**
    * seta o valor de login
    * @param pLogin
    */
    public void setLogin(String pLogin){
        this.login = pLogin;
    }
    /**
    * @return login
    */
    public String getLogin(){
        return this.login;
    }

    /**
    * seta o valor de senha
    * @param pSenha
    */
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    /**
    * @return senha
    */
    public String getSenha(){
        return this.senha;
    }

    @Override
    public String toString(){
        return "ModelUser {" + "::id = " + this.id + "::name = " + this.name + "::login = " + this.login + "::senha = " + this.senha +  "}";
    }
}