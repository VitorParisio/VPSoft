package model;

import java.util.ArrayList;

/**
 *
 * @author Vitor
 */
public class ModelVendasCliente {
    private ModelVenda modelVendas;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasCliente> listaModelVendasCliente;

    public ModelVenda getModelVendas() {
        return modelVendas;
    }

    public void setModelVendas(ModelVenda modelVendas) {
        this.modelVendas = modelVendas;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelVendasCliente> getListaModelVendasCliente() {
        return listaModelVendasCliente;
    }

    public void setListaModelVendasCliente(ArrayList<ModelVendasCliente> listaModelVendasCliente) {
        this.listaModelVendasCliente = listaModelVendasCliente;
    }
    
    
}
