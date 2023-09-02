package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import config.Config;
import javax.swing.JOptionPane;

public class buscaEventoForm extends javax.swing.JFrame {

    Connection conec = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public buscaEventoForm() {
        
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

        boxAtributo = new javax.swing.JComboBox<>();
        entryAtribute = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        showNomeEvento = new javax.swing.JTextField();
        showEventoDisponibilidade = new javax.swing.JTextField();
        showEventoPrecoBase = new javax.swing.JTextField();
        updateEventoNome = new javax.swing.JButton();
        updateEventoDisp = new javax.swing.JButton();
        updateEventoPrecoBase = new javax.swing.JButton();
        eventoSaveButton = new javax.swing.JButton();
        eventoLimparButton = new javax.swing.JButton();
        eventoVoltarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boxAtributo.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        boxAtributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome do Evento", "Disponibilidade", "Preço Base" }));
        boxAtributo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                boxAtributoPropertyChange(evt);
            }
        });

        entryAtribute.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        entryAtribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryAtributeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setText("Gerenciamento de Evento");

        showNomeEvento.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showNomeEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNomeEventoActionPerformed(evt);
            }
        });

        showEventoDisponibilidade.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showEventoDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEventoDisponibilidadeActionPerformed(evt);
            }
        });

        showEventoPrecoBase.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showEventoPrecoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEventoPrecoBaseActionPerformed(evt);
            }
        });

        updateEventoNome.setText("Atualizar");
        updateEventoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateEventoNomeMouseClicked(evt);
            }
        });
        updateEventoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEventoNomeActionPerformed(evt);
            }
        });

        updateEventoDisp.setText("Atualizar");
        updateEventoDisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateEventoDispMouseClicked(evt);
            }
        });
        updateEventoDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEventoDispActionPerformed(evt);
            }
        });

        updateEventoPrecoBase.setText("Atualizar");
        updateEventoPrecoBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateEventoPrecoBaseMouseClicked(evt);
            }
        });
        updateEventoPrecoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEventoPrecoBaseActionPerformed(evt);
            }
        });

        eventoSaveButton.setText("Buscar");
        eventoSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventoSaveButtonMouseClicked(evt);
            }
        });

        eventoLimparButton.setText("Limpar");
        eventoLimparButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventoLimparButtonMouseClicked(evt);
            }
        });
        eventoLimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoLimparButtonActionPerformed(evt);
            }
        });

        eventoVoltarButton1.setText("Voltar");
        eventoVoltarButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventoVoltarButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateEventoNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(entryAtribute, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showEventoDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateEventoDisp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showEventoPrecoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateEventoPrecoBase))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eventoVoltarButton1)
                                .addGap(96, 96, 96)
                                .addComponent(eventoLimparButton)))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eventoSaveButton)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryAtribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEventoNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showEventoDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEventoDisp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showEventoPrecoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEventoPrecoBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventoSaveButton)
                    .addComponent(eventoLimparButton)
                    .addComponent(eventoVoltarButton1))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entryAtributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryAtributeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryAtributeActionPerformed

    private void showNomeEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNomeEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showNomeEventoActionPerformed

    private void showEventoDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEventoDisponibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showEventoDisponibilidadeActionPerformed

    private void showEventoPrecoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEventoPrecoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showEventoPrecoBaseActionPerformed

    private void updateEventoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEventoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEventoNomeActionPerformed

    private void updateEventoDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEventoDispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEventoDispActionPerformed

    private void updateEventoPrecoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEventoPrecoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEventoPrecoBaseActionPerformed

    private void eventoLimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoLimparButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventoLimparButtonActionPerformed

    private void eventoVoltarButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoVoltarButton1MouseClicked
        eventoCadastroForm evtCad = new eventoCadastroForm();
        evtCad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eventoVoltarButton1MouseClicked

    private void eventoLimparButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoLimparButtonMouseClicked
        showNomeEvento.setText("");
        showEventoDisponibilidade.setText("");
        showEventoPrecoBase.setText("");
    }//GEN-LAST:event_eventoLimparButtonMouseClicked

    private void updateEventoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEventoNomeMouseClicked
        atualizarEvento("nome do evento");
    }//GEN-LAST:event_updateEventoNomeMouseClicked

    private void updateEventoDispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEventoDispMouseClicked
        atualizarEvento("disponibilidade");
    }//GEN-LAST:event_updateEventoDispMouseClicked

    private void updateEventoPrecoBaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEventoPrecoBaseMouseClicked
        atualizarEvento("preço base");
    }//GEN-LAST:event_updateEventoPrecoBaseMouseClicked

    private void eventoSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoSaveButtonMouseClicked
        fetchEventoPorAlgo();
    }//GEN-LAST:event_eventoSaveButtonMouseClicked

    private void boxAtributoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_boxAtributoPropertyChange
      
    }//GEN-LAST:event_boxAtributoPropertyChange

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
            java.util.logging.Logger.getLogger(buscaEventoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscaEventoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscaEventoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscaEventoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscaEventoForm().setVisible(true);
            }
        });
    }

    
    public class visualizadorEvento {
        public ResultSet buscaPorAlgo(String s){
            
            try{
                if(boxAtributo.getSelectedItem().toString().toLowerCase().equals("nome do evento")){
                    String buscaInfo = "SELECT * FROM Eventos WHERE nomeEvento = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                if(boxAtributo.getSelectedItem().toString().toLowerCase().equals("disponibilidade")){
                    String buscaInfo = "SELECT * FROM Eventos WHERE numeroIngressos = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                } 
                if(boxAtributo.getSelectedItem().toString().toLowerCase().equals("preço base")){
                    String buscaInfo = "SELECT * FROM Eventos WHERE precoBase = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } 
            return rs;
        }
        
}
    public void fetchEventoPorAlgo(){
        visualizadorEvento vizevento = new visualizadorEvento();
        
        ResultSet rs = null;
        
        rs = vizevento.buscaPorAlgo(entryAtribute.getText());
        
        try{
            if(rs.next()){
                showNomeEvento.setText(rs.getString("nomeEvento"));
                showEventoDisponibilidade.setText(rs.getString("numeroIngressos"));
                showEventoPrecoBase.setText(rs.getString("precoBase"));
                
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
                    try{
                        rs.close();
                            pst.close();
                    }   catch(Exception e){
                            
                        }
                    }
    }
    
    public void atualizarEvento(String sel){
        
        String tempRef = "";
                
        if(boxAtributo.getSelectedItem().equals("Nome do Evento")){
            tempRef = "nomeEvento";
        }
        if(boxAtributo.getSelectedItem().equals("Disponibilidade")){
            tempRef = "numeroIngressos";
        }
        if(boxAtributo.getSelectedItem().equals("Preço Base")){
            tempRef = "precoBase";
        }
        
        
        if(sel.toLowerCase().equals("nome do evento")){
            try{
                String atualizar = "UPDATE Eventos SET nomeEvento = '" + showNomeEvento.getText() + "' WHERE " + tempRef + " = '" + entryAtribute.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Evento atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } finally{
                    try{
                        rs.close();
                            pst.close();
                    }   catch(Exception e){
                            
                        }
                    }
        }
        if(sel.toLowerCase().equals("disponibilidade")){
            try{
                String atualizar = "UPDATE Eventos SET numeroIngressos = '" + showEventoDisponibilidade.getText() + "' WHERE " + tempRef + " = '" + entryAtribute.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Evento atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } finally{
                    try{
                        rs.close();
                            pst.close();
                    }   catch(Exception e){
                            
                        }
                    }
        }
        if(sel.toLowerCase().equals("preço base")){
            try{
                String atualizar = "UPDATE Eventos SET precoBase = '" + showEventoPrecoBase.getText() + "' WHERE " + tempRef + " = '" + entryAtribute.getText() + "'";
                System.out.println(atualizar);

                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Evento atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } finally{
                    try{
                        rs.close();
                            pst.close();
                    }   catch(Exception e){
                            
                        }
                    }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAtributo;
    private javax.swing.JTextField entryAtribute;
    private javax.swing.JButton eventoLimparButton;
    private javax.swing.JButton eventoSaveButton;
    private javax.swing.JButton eventoVoltarButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField showEventoDisponibilidade;
    private javax.swing.JTextField showEventoPrecoBase;
    private javax.swing.JTextField showNomeEvento;
    private javax.swing.JButton updateEventoDisp;
    private javax.swing.JButton updateEventoNome;
    private javax.swing.JButton updateEventoPrecoBase;
    // End of variables declaration//GEN-END:variables
}