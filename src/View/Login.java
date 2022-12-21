
package View;

import Controle.LoginController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    private final LoginController Controle;

    public Login() {
        initComponents();
        Controle = new LoginController(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textSenha = new javax.swing.JPasswordField();
        textUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        JLabelLogin = new javax.swing.JLabel();
        jButtonEntra = new javax.swing.JButton();
        JLabelTelaPreta = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 210, 40));

        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 210, 40));

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, 60));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, 60));

        JLabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        JLabelLogin.setText("Login");
        getContentPane().add(JLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, 60));

        jButtonEntra.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEntra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonEntra.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntra.setText("ENTRA");
        jButtonEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 210, 40));

        JLabelTelaPreta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/painel-login.png"))); // NOI18N
        getContentPane().add(JLabelTelaPreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Logo.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
       
    }//GEN-LAST:event_textSenhaActionPerformed

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void jButtonEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntraActionPerformed
        Controle.fizTerefa();
        
    }//GEN-LAST:event_jButtonEntraActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelLogin;
    private javax.swing.JLabel JLabelTelaPreta;
    private javax.swing.JButton jButtonEntra;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables



    public void exiberMensagem(String mensagem) {
       JOptionPane.showMessageDialog(null ,mensagem);
    }

    public JLabel getjLabelSenha() {
        return jLabelSenha;
    }

    public void setjLabelSenha(JLabel jLabelSenha) {
        this.jLabelSenha = jLabelSenha;
    }

    public JLabel getjLabelUsuario() {
        return jLabelUsuario;
    }

    public void setjLabelUsuario(JLabel jLabelUsuario) {
        this.jLabelUsuario = jLabelUsuario;
    }

    
    
}
