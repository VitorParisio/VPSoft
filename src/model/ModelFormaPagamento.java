package model;
/**
*
* @author Vitor
*/
public class ModelFormaPagamento {

    private int id;
    private String descricao;
    private float desconto;
    private int parcelas;
    private int situacao;

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

    /**
    * seta o valor de desconto
    * @param pDesconto
    */
    public void setDesconto(float pDesconto){
        this.desconto = pDesconto;
    }
    /**
    * @return desconto
    */
    public float getDesconto(){
        return this.desconto;
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

    /**
    * seta o valor de situacao
    * @param pSituacao
    */
    public void setSituacao(int pSituacao){
        this.situacao = pSituacao;
    }
    /**
    * @return situacao
    */
    public int getSituacao(){
        return this.situacao;
    }

    @Override
    public String toString(){
        return "ModelFormaPagamento {" + "::id = " + this.id + "::descricao = " + this.descricao + "::desconto = " + this.desconto + "::parcelas = " + this.parcelas + "::situacao = " + this.situacao +  "}";
    }
}