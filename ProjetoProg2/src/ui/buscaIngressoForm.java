package ui;

import config.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class buscaIngressoForm extends javax.swing.JFrame {

    Connection conec = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public buscaIngressoForm() {
        
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

        botaoVoltarInfos = new javax.swing.JButton();
        clearInfoMostradaButton = new javax.swing.JButton();
        buscaPorAlgoButton = new javax.swing.JButton();
        showNumAssento = new javax.swing.JTextField();
        updateNumAssento = new javax.swing.JButton();
        updateTipoButton = new javax.swing.JButton();
        showPreco = new javax.swing.JTextField();
        updatePrecoButton = new javax.swing.JButton();
        entryAtributo = new javax.swing.JTextField();
        boxAtributo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        showInstituicao = new javax.swing.JTextField();
        showCarteiraIdoso = new javax.swing.JTextField();
        updateInstituicaoButton = new javax.swing.JButton();
        updateCarteiraButton = new javax.swing.JButton();
        boxTipo = new javax.swing.JComboBox<>();
        showNomeDoEvento = new javax.swing.JTextField();
        updateNomeDoEvento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        buscaPorAlgoButton.setText("Buscar...");
        buscaPorAlgoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscaPorAlgoButtonMouseClicked(evt);
            }
        });

        showNumAssento.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showNumAssento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNumAssentoActionPerformed(evt);
            }
        });

        updateNumAssento.setText("Atualizar");
        updateNumAssento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateNumAssentoMouseClicked(evt);
            }
        });

        updateTipoButton.setText("Atualizar");
        updateTipoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateTipoButtonMouseClicked(evt);
            }
        });

        showPreco.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrecoActionPerformed(evt);
            }
        });

        updatePrecoButton.setText("Atualizar");
        updatePrecoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePrecoButtonMouseClicked(evt);
            }
        });
        updatePrecoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePrecoButtonActionPerformed(evt);
            }
        });

        entryAtributo.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        entryAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryAtributoActionPerformed(evt);
            }
        });

        boxAtributo.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        boxAtributo.setMaximumRowCount(3);
        boxAtributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preço", "Entrada", "N° Assento", "Carteira Idoso", "Instituição" }));

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setText("Informações de Usuários");

        showInstituicao.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInstituicaoActionPerformed(evt);
            }
        });

        showCarteiraIdoso.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showCarteiraIdoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCarteiraIdosoActionPerformed(evt);
            }
        });

        updateInstituicaoButton.setText("Atualizar");
        updateInstituicaoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateInstituicaoButtonMouseClicked(evt);
            }
        });

        updateCarteiraButton.setText("Atualizar");
        updateCarteiraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateCarteiraButtonMouseClicked(evt);
            }
        });

        boxTipo.setFont(new java.awt.Font("Unispace", 0, 10)); // NOI18N
        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inteira", "Meia" }));

        showNomeDoEvento.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        showNomeDoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNomeDoEventoActionPerformed(evt);
            }
        });

        updateNomeDoEvento.setText("Atualizar");
        updateNomeDoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateNomeDoEventoMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/JoaoGomes.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoVoltarInfos)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                    .addComponent(boxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entryAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(showInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                    .addComponent(updateInstituicaoButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(boxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showPreco)
                                        .addComponent(showNumAssento))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updatePrecoButton)
                                            .addComponent(updateTipoButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(updateNumAssento, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(showCarteiraIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(clearInfoMostradaButton)
                                            .addGap(77, 77, 77)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buscaPorAlgoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateCarteiraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateNomeDoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(showNomeDoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatePrecoButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateTipoButton)
                            .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showNumAssento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateNumAssento)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateInstituicaoButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showCarteiraIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCarteiraButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showNomeDoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateNomeDoEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaPorAlgoButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoVoltarInfos)
                        .addComponent(clearInfoMostradaButton)))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarInfosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarInfosMouseClicked
        ingressoCadastroForm cadForm = new ingressoCadastroForm();
        cadForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoVoltarInfosMouseClicked

    private void botaoVoltarInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarInfosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarInfosActionPerformed

    private void clearInfoMostradaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearInfoMostradaButtonMouseClicked
        entryAtributo.setText("");
        showPreco.setText("");
        showNumAssento.setText("");
        showInstituicao.setText("");
        showCarteiraIdoso.setText("");
    }//GEN-LAST:event_clearInfoMostradaButtonMouseClicked

    private void buscaPorAlgoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaPorAlgoButtonMouseClicked
        fetchIngressoPorAlgo();
    }//GEN-LAST:event_buscaPorAlgoButtonMouseClicked

    private void showNumAssentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNumAssentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showNumAssentoActionPerformed

    private void updateNumAssentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNumAssentoMouseClicked
        atualizarIngresso("numassento");
    }//GEN-LAST:event_updateNumAssentoMouseClicked

    private void updateTipoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateTipoButtonMouseClicked
        atualizarIngresso("tipo");
    }//GEN-LAST:event_updateTipoButtonMouseClicked

    private void showPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPrecoActionPerformed

    private void updatePrecoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePrecoButtonMouseClicked
        atualizarIngresso("preco");
    }//GEN-LAST:event_updatePrecoButtonMouseClicked

    private void updatePrecoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePrecoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePrecoButtonActionPerformed

    private void entryAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryAtributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryAtributoActionPerformed

    private void showInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInstituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showInstituicaoActionPerformed

    private void showCarteiraIdosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCarteiraIdosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showCarteiraIdosoActionPerformed

    private void updateInstituicaoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInstituicaoButtonMouseClicked
        atualizarIngresso("instituicaoMeia");
    }//GEN-LAST:event_updateInstituicaoButtonMouseClicked

    private void updateCarteiraButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateCarteiraButtonMouseClicked
        atualizarIngresso("carteiraIdoso");
    }//GEN-LAST:event_updateCarteiraButtonMouseClicked

    private void showNomeDoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNomeDoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showNomeDoEventoActionPerformed

    private void updateNomeDoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNomeDoEventoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNomeDoEventoMouseClicked

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
            java.util.logging.Logger.getLogger(buscaIngressoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscaIngressoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscaIngressoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscaIngressoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscaIngressoForm().setVisible(true);
            }
        });
    }

    public class vizualizadorIngressos{
        public ResultSet buscaPorAlgo(String s){
            try{
                if(boxAtributo.getSelectedItem().toString().equals("Preço")){
                    String buscaInfo = "SELECT * FROM Ingressos WHERE preco = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                if(boxAtributo.getSelectedItem().toString().equals("Tipo")){
                    String buscaInfo = "SELECT * FROM Ingressos WHERE tipo = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                if(boxAtributo.getSelectedItem().toString().equals("N° Assento")){
                    String buscaInfo = "SELECT * FROM Ingressos WHERE numeroAssento = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                if(boxAtributo.getSelectedItem().toString().equals("Instituição")){
                    String buscaInfo = "SELECT * FROM Ingressos WHERE instituicaoMeia = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                if(boxAtributo.getSelectedItem().toString().equals("Carteira Idoso")){
                    String buscaInfo = "SELECT * FROM Ingressos WHERE numCarteiraIdoso = ?";
                    pst = conec.prepareStatement(buscaInfo);
                    pst.setString(1, s);
                    rs = pst.executeQuery();
                }
                if(boxAtributo.getSelectedItem().toString().equals("Nome do Evento")){
                    String buscaInfo = "SELECT * FROM Ingressos WHERE nomeDoEvento = ?";
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
    
    public void fetchIngressoPorAlgo(){
        vizualizadorIngressos vizugresso = new vizualizadorIngressos();
        
        ResultSet rs = null;
        
        rs = vizugresso.buscaPorAlgo(entryAtributo.getText());
        
        try{
            if(rs.next()){
                showPreco.setText(rs.getString("preco"));
                showNumAssento.setText(rs.getString("numeroAssento"));
                boxTipo.setSelectedItem(rs.getString("tipo"));
                showInstituicao.setText(rs.getString("instituicaoMeia"));
                showCarteiraIdoso.setText(rs.getString("numCarteiraIdoso"));
                showNomeDoEvento.setText(rs.getString("nomeDoEvento"));
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
    
    public void atualizarIngresso(String sel){
        String tempRef = "";
        
        if(boxAtributo.getSelectedItem().equals("Preço")){
            tempRef = "preco";
        }
        if(boxAtributo.getSelectedItem().equals("Entrada")){
            tempRef = "tipo";
        }
        if(boxAtributo.getSelectedItem().equals("N° Assento")){
            tempRef = "numeroAssento";
        }
        if(boxAtributo.getSelectedItem().equals("Instituição")){
            tempRef = "instituicaoMeia";
        }
        if(boxAtributo.getSelectedItem().equals("Carteira Idoso")){
            tempRef = "numCarteiraIdoso";
        }
        if(boxAtributo.getSelectedItem().equals("Nome do Evento")){
            tempRef = "nomeDoEvento";
        }
        
        if(sel.toLowerCase().equals("preco")){
            try{
                String atualizar = "UPDATE Ingressos SET preco = '" + showPreco.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Ingresso atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
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
        
        if(sel.toLowerCase().equals("numassento")){
            try{
                String atualizar = "UPDATE Ingressos SET numeroAssento = '" + showNumAssento.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Ingresso atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
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
        
        if(sel.toLowerCase().equals("tipo")){
            try{
                String atualizar = "UPDATE Ingressos SET tipo = '" + boxTipo.getSelectedItem().toString() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Ingresso atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
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
        
        if(sel.toLowerCase().equals("instituicaomeia")){
            try{
                String atualizar = "UPDATE Ingressos SET instituicaoMeia = '" + showInstituicao.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Ingresso atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
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
        
        if(sel.toLowerCase().equals("carteiraidoso")){
            try{
                String atualizar = "UPDATE Ingressos SET numCarteiraIdoso = '" + showCarteiraIdoso.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Ingresso atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
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
        
        if(sel.toLowerCase().equals("nomedoevento")){
            try{
                String atualizar = "UPDATE Ingressos SET nomeDoEvento = '" + showNomeDoEvento.getText() + "' WHERE " + tempRef + " = '" + entryAtributo.getText() + "'";
                System.out.println(atualizar);
                
                pst = conec.prepareStatement(atualizar);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Ingresso atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                
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
    private javax.swing.JButton botaoVoltarInfos;
    public javax.swing.JComboBox<String> boxAtributo;
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton buscaPorAlgoButton;
    private javax.swing.JButton clearInfoMostradaButton;
    public javax.swing.JTextField entryAtributo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField showCarteiraIdoso;
    private javax.swing.JTextField showInstituicao;
    private javax.swing.JTextField showNomeDoEvento;
    private javax.swing.JTextField showNumAssento;
    private javax.swing.JTextField showPreco;
    private javax.swing.JButton updateCarteiraButton;
    private javax.swing.JButton updateInstituicaoButton;
    private javax.swing.JButton updateNomeDoEvento;
    private javax.swing.JButton updateNumAssento;
    private javax.swing.JButton updatePrecoButton;
    private javax.swing.JButton updateTipoButton;
    // End of variables declaration//GEN-END:variables
}
