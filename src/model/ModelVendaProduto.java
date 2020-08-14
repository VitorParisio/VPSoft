package model;
/**
*
* @author Vitor
*/
public class ModelVendaProduto {

    private int id;
    private int idProduto;
    private int idVenda;
    private double venProValor;
    private int venProQtd;
    private String nomeProduto;

    /**
    * Construtor
    */
    public ModelVendaProduto(){}

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
    * seta o valor de idProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.idProduto = pIdProduto;
    }
    /**
    * @return fk_idProduto
    */
    public int getIdProduto(){
        return this.idProduto;
    }

    /**
    * seta o valor de idVenda
    * @param pIdVenda
    */
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    /**
    * @return fk_idVenda
    */
    public int getIdVenda(){
        return this.idVenda;
    }

    /**
    * seta o valor de venProValor
    * @param pVenProValor
    */
    public void setVenProValor(double pVenProValor){
        this.venProValor = pVenProValor;
    }
    /**
    * @return venProValor
    */
    public double getVenProValor(){
        return this.venProValor;
    }

    /**
    * seta o valor de venProQtd
    * @param pVenProQtd
    */
    public void setVenProQtd(int pVenProQtd){
        this.venProQtd = pVenProQtd;
    }
    /**
    * @return venProQtd
    */
    public int getVenProQtd(){
        return this.venProQtd;
    }
    
     public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString(){
        return "ModelVendaProduto {" + "::id = " + this.id + "::idProduto = " + this.idProduto + "::idVenda = " + this.idVenda + "::venProValor = " + this.venProValor + "::venProQtd = " + this.venProQtd +  "::nomeProduto = " + this.nomeProduto+"}";
    }
}