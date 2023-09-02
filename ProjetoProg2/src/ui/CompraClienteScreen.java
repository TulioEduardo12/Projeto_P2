package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import config.Config;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.List;

public class CompraClienteScreen extends javax.swing.JFrame {

   Connection conec = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
    
    
    public CompraClienteScreen() {
        conec = config.Config.conectarBD();
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eventoSelectBox = new javax.swing.JComboBox<>();
        showLugaresDisponiveis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showPrecoEvento = new javax.swing.JTextField();
        caixaTipoEntrada = new javax.swing.JComboBox<>();
        comprarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RuralTicket™");

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eventos");

        eventoSelectBox.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        eventoSelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o evento" }));
        eventoSelectBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoSelectBoxActionPerformed(evt);
            }
        });
        eventoSelectBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                eventoSelectBoxPropertyChange(evt);
            }
        });

        showLugaresDisponiveis.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        showLugaresDisponiveis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        showLugaresDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLugaresDisponiveisActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("R$");

        jLabel4.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingressos Disponíveis");

        showPrecoEvento.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        showPrecoEvento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        showPrecoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrecoEventoActionPerformed(evt);
            }
        });

        caixaTipoEntrada.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        caixaTipoEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inteira", "Meia" }));
        caixaTipoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTipoEntradaActionPerformed(evt);
            }
        });

        comprarButton.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        comprarButton.setText("Comprar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(showPrecoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(caixaTipoEntrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(60, 60, 60))))
                    .addComponent(eventoSelectBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(showLugaresDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comprarButton)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(eventoSelectBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caixaTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPrecoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showLugaresDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprarButton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventoSelectBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoSelectBoxActionPerformed
        fetchAoMudarBox();
    }//GEN-LAST:event_eventoSelectBoxActionPerformed

    private void showLugaresDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLugaresDisponiveisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showLugaresDisponiveisActionPerformed

    private void showPrecoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrecoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPrecoEventoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        fetchEventoBox();
    }//GEN-LAST:event_formWindowActivated

    private void eventoSelectBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_eventoSelectBoxPropertyChange
        
    }//GEN-LAST:event_eventoSelectBoxPropertyChange

    private void caixaTipoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTipoEntradaActionPerformed
        fetchAoMudarBox();
    }//GEN-LAST:event_caixaTipoEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(CompraClienteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraClienteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraClienteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraClienteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraClienteScreen().setVisible(true);
                
            }
        });
    }
    
    
    
    public class vizuCompraIngressos{
        public ResultSet mostreDadosIngressos(String s){
            try{
                    
                    String sql = "SELECT * FROM Eventos WHERE nomeEvento = ?";
                    pst = conec.prepareStatement(sql);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                    
  
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return rs;
        }
    }
    
    public void fetchAoMudarBox(){ // para quando troca alguma opção na Box
        vizuCompraIngressos vi = new vizuCompraIngressos();
        
            ResultSet rs = null;
            
            rs = vi.mostreDadosIngressos(eventoSelectBox.getSelectedItem().toString());
            
            
            
            try{
                
                if(rs.next()){ 
                    
                    System.out.println("checkpoint");
                    
                    if(caixaTipoEntrada.getSelectedItem().toString().equals("Meia")){
                        double rawPreco = Double.parseDouble(rs.getString("precoBase"));
                        String retorno = "" + (rawPreco/2);
                        System.out.println(retorno);
                        showPrecoEvento.setText(retorno);
                    } else{
                    showPrecoEvento.setText(rs.getString("precoBase"));                        
                    }
                    
                    showPrecoEvento.setEditable(false);
                    showLugaresDisponiveis.setText(rs.getString("numeroIngressos"));
                    showPrecoEvento.setEditable(false);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } finally{
                    try{
                        rs.close();
                            pst.close();
                    }   catch(Exception e){
                            
                        }
                    }
    }
    
    public void fetchEventoBox(){ //para quando inicializa a janela
        try{
            
            
            String select = "SELECT nomeEvento FROM Eventos";
        
            pst = conec.prepareStatement(select);
            rs = pst.executeQuery();
            while(rs.next()){
                eventoSelectBox.addItem(rs.getString("nomeEvento"));
            }
            
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
    }
    
    public void comprarIngresso(){
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> caixaTipoEntrada;
    private javax.swing.JButton comprarButton;
    private javax.swing.JComboBox<String> eventoSelectBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField showLugaresDisponiveis;
    private javax.swing.JTextField showPrecoEvento;
    // End of variables declaration//GEN-END:variables
}