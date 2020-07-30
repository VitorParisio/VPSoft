/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCliente;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;

/**
 *
 * @author Vitor
 */
public class ViewDataClient extends javax.swing.JFrame {
    
    ControllerCliente controllerCliente = new ControllerCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();

    public ViewDataClient() {
        initComponents();
        setLocationRelativeTo(null);
        carregarCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataClient = new javax.swing.JTable();
        btnSearchDataClient = new javax.swing.JButton();
        txtSearchDataClient = new javax.swing.JTextField();
        clientPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VPSoft - Clientes");
        setResizable(false);

        tbDataClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Endereço", "Bairro", "Cidade", "Cep", "UF", "Fone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDataClient);
        if (tbDataClient.getColumnModel().getColumnCount() > 0) {
            tbDataClient.getColumnModel().getColumn(0).setMinWidth(60);
            tbDataClient.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbDataClient.getColumnModel().getColumn(0).setMaxWidth(60);
            tbDataClient.getColumnModel().getColumn(1).setMinWidth(150);
            tbDataClient.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbDataClient.getColumnModel().getColumn(1).setMaxWidth(150);
            tbDataClient.getColumnModel().getColumn(2).setMinWidth(300);
            tbDataClient.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbDataClient.getColumnModel().getColumn(2).setMaxWidth(300);
            tbDataClient.getColumnModel().getColumn(3).setMinWidth(100);
            tbDataClient.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbDataClient.getColumnModel().getColumn(3).setMaxWidth(100);
            tbDataClient.getColumnModel().getColumn(4).setMinWidth(100);
            tbDataClient.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbDataClient.getColumnModel().getColumn(4).setMaxWidth(100);
            tbDataClient.getColumnModel().getColumn(5).setMinWidth(100);
            tbDataClient.getColumnModel().getColumn(5).setPreferredWidth(100);
            tbDataClient.getColumnModel().getColumn(5).setMaxWidth(100);
            tbDataClient.getColumnModel().getColumn(6).setMinWidth(60);
            tbDataClient.getColumnModel().getColumn(6).setPreferredWidth(60);
            tbDataClient.getColumnModel().getColumn(6).setMaxWidth(60);
            tbDataClient.getColumnModel().getColumn(7).setMinWidth(150);
            tbDataClient.getColumnModel().getColumn(7).setPreferredWidth(150);
            tbDataClient.getColumnModel().getColumn(7).setMaxWidth(150);
        }

        btnSearchDataClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/searcher.png"))); // NOI18N
        btnSearchDataClient.setText("Pesquisar");
        btnSearchDataClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDataClientActionPerformed(evt);
            }
        });

        clientPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pdf20.png"))); // NOI18N
        clientPDF.setText("PDF");
        clientPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchDataClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clientPDF))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchDataClient)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchDataClient)
                        .addComponent(clientPDF)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchDataClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDataClientActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) this.tbDataClient.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.tbDataClient.setRowSorter(classificador);
        String texto = this.txtSearchDataClient.getText().toUpperCase();

        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_btnSearchDataClientActionPerformed

    private void clientPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientPDFActionPerformed
        // TODO add your handling code here:
        this.controllerCliente.getRelatorioCliente();
    }//GEN-LAST:event_clientPDFActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDataClient().setVisible(true);
            }
        });
    }
    
     private void carregarCliente() {
        this.listaModelCliente = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) this.tbDataClient.getModel();
        modelo.setNumRows(0);
        int cont = this.listaModelCliente.size();

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                this.listaModelCliente.get(i).getId(),
                this.listaModelCliente.get(i).getName(),
                this.listaModelCliente.get(i).getEndereco().toUpperCase(),
                this.listaModelCliente.get(i).getBairro().toUpperCase(),
                this.listaModelCliente.get(i).getCidade().toUpperCase(),
                this.listaModelCliente.get(i).getCep(),
                this.listaModelCliente.get(i).getUf().toUpperCase(),
                this.listaModelCliente.get(i).getFone()
            });
        }
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchDataClient;
    private javax.swing.JButton clientPDF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDataClient;
    private javax.swing.JTextField txtSearchDataClient;
    // End of variables declaration//GEN-END:variables
}
