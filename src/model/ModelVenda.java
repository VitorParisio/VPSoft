package model;

import java.sql.Date;



/**
*
* @author Vitor
*/
public class ModelVenda {

    private int id;
    private int  idClient;
    private Date dataVenda;
    private double valor;
    private double total;
    private double venDesconto;

    /**
    * Construtor
    */
    public ModelVenda(){}

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
    * seta o valor de idClient
    * @param pIdClient
    */
    public void setIdClient(int  pIdClient){
        this.idClient = pIdClient;
    }
    /**
    * @return fk_idClient
    */
    public int  getIdClient(){
        return this.idClient;
    }

    /**
    * seta o valor de dataVenda
    * @param pDataVenda
    */
    public void setDataVenda(Date pDataVenda){
        this.dataVenda = pDataVenda;
    }
    /**
    * @return dataVenda
    */
    public Date getDataVenda(){
        return this.dataVenda;
    }

    /**
    * seta o valor de valor
    * @param pValor
    */
    public void setValor(double pValor){
        this.valor = pValor;
    }
    /**
    * @return valor
    */
    public double getValor(){
        return this.valor;
    }

    /**
    * seta o valor de total
    * @param pTotal
    */
    public void setTotal(double pTotal){
        this.total = pTotal;
    }
    /**
    * @return total
    */
    public double getTotal(){
        return this.total;
    }

    /**
    * seta o valor de venDesconto
    * @param pVenDesconto
    */
    public void setVenDesconto(double pVenDesconto){
        this.venDesconto = pVenDesconto;
    }
    /**
    * @return venDesconto
    */
    public double getVenDesconto(){
        return this.venDesconto;
    }

    @Override
    public String toString(){
        return "ModelVenda {" + "::id = " + this.id + "::idClient = " + this.idClient + "::dataVenda = " + this.dataVenda + "::valor = " + this.valor + "::total = " + this.total + "::venDesconto = " + this.venDesconto +  "}";
    }
}