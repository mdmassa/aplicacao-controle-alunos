package aluno.telaApp;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    
    ImageIcon imagemLogin = new ImageIcon("src/Imgs/login.png");
    ImageIcon imagemFundo = new ImageIcon("src/Imgs/background.jpg");

    
    public TelaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotaoEntrar = new javax.swing.JButton();
        BotaoSairApp = new javax.swing.JButton();
        LabelLogin = new javax.swing.JLabel();
        CampoLogin = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        LabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Controle do Aluno");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(795, 450));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(51, 72, 0, 0);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Sistema de Controle do Aluno - Login");
        getContentPane().add(LabelTitulo);
        LabelTitulo.setBounds(36, 108, 460, 26);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(15, 72, 0, 0);

        BotaoEntrar.setBackground(new java.awt.Color(255, 204, 0));
        BotaoEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoEntrar.setForeground(new java.awt.Color(0, 51, 153));
        BotaoEntrar.setText("Entrar");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrar);
        BotaoEntrar.setBounds(36, 324, 100, 40);

        BotaoSairApp.setBackground(new java.awt.Color(255, 204, 0));
        BotaoSairApp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoSairApp.setForeground(new java.awt.Color(0, 51, 153));
        BotaoSairApp.setText("Sair");
        BotaoSairApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairAppActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSairApp);
        BotaoSairApp.setBounds(144, 324, 100, 40);

        LabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelLogin.setForeground(new java.awt.Color(255, 204, 7));
        LabelLogin.setText("Login");
        getContentPane().add(LabelLogin);
        LabelLogin.setBounds(36, 144, 40, 36);

        CampoLogin.setForeground(new java.awt.Color(153, 153, 153));
        CampoLogin.setText("Digite seu login");
        CampoLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoLoginFocusLost(evt);
            }
        });
        CampoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(CampoLogin);
        CampoLogin.setBounds(36, 180, 288, 25);

        LabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelSenha.setForeground(new java.awt.Color(255, 204, 7));
        LabelSenha.setText("Senha");
        getContentPane().add(LabelSenha);
        LabelSenha.setBounds(36, 216, 80, 36);

        CampoSenha.setForeground(new java.awt.Color(153, 153, 153));
        CampoSenha.setText("123456789");
        CampoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoSenhaFocusLost(evt);
            }
        });
        getContentPane().add(CampoSenha);
        CampoSenha.setBounds(36, 252, 288, 25);

        jLabel2.setIcon(imagemLogin);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(432, 36, 324, 324);

        LabelBackground.setIcon(imagemFundo);
        getContentPane().add(LabelBackground);
        LabelBackground.setBounds(0, -90, 800, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed

        if( CampoLogin.getText().equals("adm") && CampoSenha.getText().equals("123456")){
            new MenuPrincipal().setVisible(true);
        TelaLogin.this.setVisible(false);
        }else{
         JOptionPane.showMessageDialog(this,"Login ou senha incorreto");
        }
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void BotaoSairAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairAppActionPerformed
        TelaLogin.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_BotaoSairAppActionPerformed

    private void CampoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLoginActionPerformed
        
        
    }//GEN-LAST:event_CampoLoginActionPerformed

    private void CampoLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoLoginFocusGained
        // TODO add your handling code here:
        if (CampoLogin.getText().equals("Digite seu login")){
            CampoLogin.setText("");
            CampoLogin.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoLoginFocusGained

    private void CampoLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoLoginFocusLost
        // TODO add your handling code here:
         if (CampoLogin.getText().equals("")){
            CampoLogin.setText("Digite seu login");
            CampoLogin.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoLoginFocusLost

    private void CampoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSenhaFocusGained
        if (CampoSenha.getText().equals("123456789")){
            CampoSenha.setText("");
            CampoSenha.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoSenhaFocusGained

    private void CampoSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSenhaFocusLost
        if (CampoSenha.getText().equals("")){
            CampoSenha.setText("123456789");
            CampoSenha.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoSenhaFocusLost

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JButton BotaoSairApp;
    private javax.swing.JTextField CampoLogin;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel LabelBackground;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
