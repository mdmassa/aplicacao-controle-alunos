package aluno.telaApp;

import javax.swing.ImageIcon;



public class MenuPrincipal extends javax.swing.JFrame {
    
    ImageIcon imagemAdmin = new ImageIcon("src/Imgs/admin.png");
    ImageIcon imagemFundo = new ImageIcon("src/Imgs/background.jpg");

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotaoMatricularAluno = new javax.swing.JButton();
        BotaoRemover = new javax.swing.JButton();
        BotaoBusca = new javax.swing.JButton();
        BotaoEditarAluno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        ImagemAdmin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Controle do Aluno");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(795, 450));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(51, 72, 0, 0);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Bem-vindo(a) ao Sistema de Controle do Aluno!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 30, 450, 26);

        BotaoMatricularAluno.setBackground(new java.awt.Color(0, 51, 153));
        BotaoMatricularAluno.setForeground(new java.awt.Color(255, 204, 0));
        BotaoMatricularAluno.setText("✚     Matricular novo aluno");
        BotaoMatricularAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotaoMatricularAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMatricularAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoMatricularAluno);
        BotaoMatricularAluno.setBounds(490, 140, 240, 50);

        BotaoRemover.setBackground(new java.awt.Color(0, 51, 153));
        BotaoRemover.setForeground(new java.awt.Color(255, 204, 0));
        BotaoRemover.setText("🆇     Remover aluno existente");
        BotaoRemover.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRemover);
        BotaoRemover.setBounds(490, 320, 240, 50);

        BotaoBusca.setBackground(new java.awt.Color(0, 51, 153));
        BotaoBusca.setForeground(new java.awt.Color(255, 204, 0));
        BotaoBusca.setText("🔍     Fazer uma busca");
        BotaoBusca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBusca);
        BotaoBusca.setBounds(490, 260, 240, 50);

        BotaoEditarAluno.setBackground(new java.awt.Color(0, 51, 153));
        BotaoEditarAluno.setForeground(new java.awt.Color(255, 204, 0));
        BotaoEditarAluno.setText("🖉     Editar aluno matriculado");
        BotaoEditarAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotaoEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEditarAluno);
        BotaoEditarAluno.setBounds(490, 200, 240, 50);

        jLabel2.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("Online");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 340, 60, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrador do sistema");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 320, 204, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(15, 72, 0, 0);

        BotaoSair.setBackground(new java.awt.Color(255, 204, 0));
        BotaoSair.setForeground(new java.awt.Color(0, 51, 153));
        BotaoSair.setText("🡪 Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(0, 0, 89, 40);

        ImagemAdmin.setIcon(imagemAdmin);
        getContentPane().add(ImagemAdmin);
        ImagemAdmin.setBounds(90, 110, 190, 210);

        jLabel5.setIcon(imagemFundo);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -90, 790, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoMatricularAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMatricularAlunoActionPerformed
        MenuPrincipal.this.setVisible(false);
        new MatricularAluno().setVisible(true);
    }//GEN-LAST:event_BotaoMatricularAlunoActionPerformed

    private void BotaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverActionPerformed
        MenuPrincipal.this.setVisible(false);
        new RemoverAluno().setVisible(true);
    }//GEN-LAST:event_BotaoRemoverActionPerformed

    private void BotaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscaActionPerformed
        MenuPrincipal.this.setVisible(false);
        new BuscarAlunoo().setVisible(true);
    }//GEN-LAST:event_BotaoBuscaActionPerformed

    private void BotaoEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarAlunoActionPerformed
        MenuPrincipal.this.setVisible(false);
        new EditarAluno().setVisible(true);
    }//GEN-LAST:event_BotaoEditarAlunoActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        MenuPrincipal.this.setVisible(false);
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_BotaoSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBusca;
    private javax.swing.JButton BotaoEditarAluno;
    private javax.swing.JButton BotaoMatricularAluno;
    private javax.swing.JButton BotaoRemover;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel ImagemAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
