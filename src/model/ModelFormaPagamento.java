package model;
/**
*
* @author Vitor
*/
public class ModelFormaPagamento {

    private int id;
    private int id_venda;
    private String descricao;
    private int parcelas;

    /**
    * Construtor
    */
    public ModelFormaPagamento(){}

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
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * @return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    /**
    * seta o valor de parcelas
    * @param pParcelas
    */
    public void setParcelas(int pParcelas){
        this.parcelas = pParcelas;
    }
    /**
    * @return parcelas
    */
    public int getParcelas(){
        return this.parcelas;
    }

    @Override
    public String toString(){
        return "ModelFormaPagamento {" + "::id = " + this.id + "::id_venda = " + this.id_venda+ "::descricao = " + this.descricao + "::parcelas = " + this.parcelas +"}";
    }
}