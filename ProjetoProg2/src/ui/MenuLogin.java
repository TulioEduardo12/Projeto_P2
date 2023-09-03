package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import config.Config;
import javax.swing.JOptionPane;

public class MenuLogin extends javax.swing.JFrame {
    
    Connection conec = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public MenuLogin() {
        
        conec = Config.conectarBD();
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
        jLabel3 = new javax.swing.JLabel();
        EntryUsuario = new javax.swing.JTextField();
        EntrySenha = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel2.setText("Usuário :");

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 22)); // NOI18N
        jLabel3.setText("Senha :");

        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EntryUsuario)
                            .addComponent(EntrySenha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(LoginButton)
                .addGap(31, 188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntryUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntrySenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class VisuSenha{
        public ResultSet AuxPass(String s){
             try{
        
                String checar = "SELECT * FROM Login WHERE Password = ?";
                pst = conec.prepareStatement(checar);
                pst.setString(1, s);
                rs = pst.executeQuery();
             }catch(Exception e){
           
           }
             return rs;
        }
    
    }
    
    
    public class VisuLogin{
        public ResultSet Auxlogin(String s){
             try{
        
                String checar = "SELECT * FROM Login WHERE User = ?";
                pst = conec.prepareStatement(checar);
                pst.setString(1, s);
                rs = pst.executeQuery();
             }catch(Exception e){
           
           }
             return rs;
        }
    
    }
    
    public void fetchPass(){
        VisuSenha vs = new VisuSenha();
        ResultSet rs = null;
        rs = vs.AuxPass(EntrySenha.getText());
        
        try{
            if(rs.next()){
                
                if(EntrySenha.getText().equals(rs.getString("Password"))){
                    this.setVisible(false);
                    MenuPrincipal showmenuprincipal = new MenuPrincipal();
                    showmenuprincipal.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Deu certo, pode aprovar o login");
                }
                
            } else{
                JOptionPane.showMessageDialog(null, "Senha Invalida");
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
    
    public void fetchLogin(){
        VisuLogin vl = new VisuLogin();
        ResultSet rs = null;
        rs = vl.Auxlogin(EntryUsuario.getText());
        
        try{
            if(rs.next()){
                
                if(EntryUsuario.getText().equals(rs.getString("User"))){
                    fetchPass();
                }
                
            } else{
                JOptionPane.showMessageDialog(null, "Usuario Invalido");
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
    
    
    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
       fetchLogin();
    }//GEN-LAST:event_LoginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EntrySenha;
    private javax.swing.JTextField EntryUsuario;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
