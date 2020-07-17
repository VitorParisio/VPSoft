package model;
/**
*
* @author Vitor
*/
public class ModelCliente {

    private int id;
    private String name;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String fone;

    /**
    * Construtor
    */
    public ModelCliente(){}

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
    * seta o valor de endereco
    * @param pEndereco
    */
    public void setEndereco(String pEndereco){
        this.endereco = pEndereco;
    }
    /**
    * @return endereco
    */
    public String getEndereco(){
        return this.endereco;
    }

    /**
    * seta o valor de bairro
    * @param pBairro
    */
    public void setBairro(String pBairro){
        this.bairro = pBairro;
    }
    /**
    * @return bairro
    */
    public String getBairro(){
        return this.bairro;
    }

    /**
    * seta o valor de cidade
    * @param pCidade
    */
    public void setCidade(String pCidade){
        this.cidade = pCidade;
    }
    /**
    * @return cidade
    */
    public String getCidade(){
        return this.cidade;
    }

    /**
    * seta o valor de uf
    * @param pUf
    */
    public void setUf(String pUf){
        this.uf = pUf;
    }
    /**
    * @return uf
    */
    public String getUf(){
        return this.uf;
    }

    /**
    * seta o valor de cep
    * @param pCep
    */
    public void setCep(String pCep){
        this.cep = pCep;
    }
    /**
    * @return cep
    */
    public String getCep(){
        return this.cep;
    }

    /**
    * seta o valor de fone
    * @param pFone
    */
    public void setFone(String pFone){
        this.fone = pFone;
    }
    /**
    * @return fone
    */
    public String getFone(){
        return this.fone;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::id = " + this.id + "::name = " + this.name + "::endereco = " + this.endereco + "::bairro = " + this.bairro + "::cidade = " + this.cidade + "::uf = " + this.uf + "::cep = " + this.cep + "::fone = " + this.fone +  "}";
    }
}