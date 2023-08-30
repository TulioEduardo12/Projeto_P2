/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import config.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Dino
 */
public class buscaInfoForm extends javax.swing.JFrame {

    Connection conec = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public buscaInfoForm() {
        initComponents();
        
        conec = Config.conectarBD();
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
        CaixaDeAtributos = new javax.swing.JComboBox<>();
        showName = new javax.swing.JTextField();
        showCPF = new javax.swing.JTextField();
        showEmail = new javax.swing.JTextField();
        botaoVoltarInfos = new javax.swing.JButton();
        clearInfoMostradaButton = new javax.swing.JButton();
        entryAtributo = new javax.swing.JTextField();
        buscaPorAlgoButton = new javax.swing.JButton();
        updateNameButton = new javax.swing.JButton();
        updateCPFbutton = new javax.swing.JButton();
        updateEmailButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setText("Informações de Usuários");

        CaixaDeAtributos.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        CaixaDeAtributos.setMaximumRowCount(3);
        CaixaDeAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "E-mail" }));

        showName.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNameActionPerformed(evt);
            }
        });

        showCPF.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCPFActionPerformed(evt);
            }
        });

        showEmail.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEmailActionPerformed(evt);
            }
        });

        botaoVoltarInfos.setText("Voltar");
        botaoVoltarInfos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarInfosMouseClicked(evt);
            }
        });
        botaoVoltarInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarInfosActionPerformed(evt);
            }
        });

        clearInfoMostradaButton.setText("Limpar");
        clearInfoMostradaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearInfoMostradaButtonMouseClicked(evt);
            }
        });

        entryAtributo.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        entryAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryAtributoActionPerformed(evt);
            }
        });

        buscaPorAlgoButton.setText("Buscar...");
        buscaPorAlgoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscaPorAlgoButtonMouseClicked(evt);
            }
        });

        updateNameButton.setText("Atualizar");
        updateNameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateNameButtonMouseClicked(evt);
            }
        });
        updateNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNameButtonActionPerformed(evt);
            }
        });

        updateCPFbutton.setText("Atualizar");
        updateCPFbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateCPFbuttonMouseClicked(evt);
            }
        });

        updateEmailButton.setText("Atualizar");
        updateEmailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateEmailButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(showCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(showName, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(showEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CaixaDeAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entryAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoVoltarInfos)
                                .addGap(31, 31, 31)
                                .addComponent(clearInfoMostradaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscaPorAlgoButton)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateNameButton)
                            .addComponent(updateCPFbutton)
                            .addComponent(updateEmailButton))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaixaDeAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateNameButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCPFbutton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmailButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltarInfos)
                    .addComponent(clearInfoMostradaButton)
                    .addComponent(buscaPorAlgoButton))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showNameActionPerformed

    private void showCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showCPFActionPerformed

    private void showEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showEmailActionPerformed

    private void entryAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryAtributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryAtributoActionPerformed

    private void botaoVoltarInfosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarInfosMouseClicked
        cadastroForm cadForm = new cadastroForm();
        cadForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoVoltarInfosMouseClicked

    private void buscaPorAlgoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaPorAlgoButtonMouseClicked
        fetchUsuarioPorAlgo();
    }//GEN-LAST:event_buscaPorAlgoButtonMouseClicked

    private void clearInfoMostradaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearInfoMostradaButtonMouseClicked
        showName.setText("");
        showCPF.setText("");
        showEmail.setText("");
        entryAtributo.setText("");
    }//GEN-LAST:event_clearInfoMostradaButtonMouseClicked

    private void botaoVoltarInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarInfosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarInfosActionPerformed

    private void updateNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNameButtonActionPerformed

    private void updateNameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNameButtonMouseClicked
        atualizarUsuario("nome");
    }//GEN-LAST:event_updateNameButtonMouseClicked

    private void updateCPFbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateCPFbuttonMouseClicked
        atualizarUsuario("cpf");
    }//GEN-LAST:event_updateCPFbuttonMouseClicked

    private void updateEmailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEmailButtonMouseClicked
        atualizarUsuario("email");
    }//GEN-LAST:event_updateEmailButtonMouseClicked

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
            java.util.logging.Logger.getLogger(buscaInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscaInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscaInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscaInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscaInfoForm().setVisible(true);
            }
        });
    }
    
    public class visualizadorUsuario {
        public ResultSet buscaPorAlgo(String s){
            
            try{
                if(CaixaDeAtributos.getSelectedItem().toString().toLowerCase().equals("nome")){
                    String buscaInfo = "SELECT * FROM Usuarios WHERE nomes = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                if(CaixaDeAtributos.getSelectedItem().toString().toLowerCase().equals("cpf")){
                    String buscaInfo = "SELECT * FROM Usuarios WHERE cpf = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                } 
                if(CaixaDeAtributos.getSelectedItem().toString().toLowerCase().equals("e-mail")){
                    String buscaInfo = "SELECT * FROM Usuarios WHERE email = ?";
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
    public void fetchUsuarioPorAlgo(){
        visualizadorUsuario vizuario = new visualizadorUsuario();
        
        ResultSet rs = null;
        
        rs = vizuario.buscaPorAlgo(entryAtributo.getText());
        
        try{
            if(rs.next()){
                showName.setText(rs.getString("nomes"));
                showCPF.setText(rs.getString("cpf"));
                showEmail.setText(rs.getString("email"));
                
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void atualizarUsuario(String sel){
        
        String tempRef = "";
                
        if(CaixaDeAtributos.getSelectedItem().equals("Nome")){
            tempRef = "nomes";
        }
        if(CaixaDeAtributos.getSelectedItem().equals("CPF")){
            tempRef = "cpf";
        }
        if(CaixaDeAtributos.getSelectedItem().equals("E-mail")){
            tempRef = "email";
        }
        
        
        if(sel.toLowerCase().equals("nome")){
            try{
                String atualizar = "UPDATE Usuarios SET nomes = '" + showName.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(sel.toLowerCase().equals("cpf")){
            try{
                String atualizar = "UPDATE Usuarios SET cpf = '" + showCPF.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(sel.toLowerCase().equals("email")){
            try{
                String atualizar = "UPDATE Usuarios SET email = '" + showEmail.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);

                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CaixaDeAtributos;
    private javax.swing.JButton botaoVoltarInfos;
    private javax.swing.JButton buscaPorAlgoButton;
    private javax.swing.JButton clearInfoMostradaButton;
    public javax.swing.JTextField entryAtributo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField showCPF;
    private javax.swing.JTextField showEmail;
    private javax.swing.JTextField showName;
    private javax.swing.JButton updateCPFbutton;
    private javax.swing.JButton updateEmailButton;
    private javax.swing.JButton updateNameButton;
    // End of variables declaration//GEN-END:variables
}
