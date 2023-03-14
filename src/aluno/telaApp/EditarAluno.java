package aluno.telaApp;

import Imgs.ManipularImagem;
import aluno.DAO.AlunoDAO;
import aluno.model.Aluno;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class EditarAluno extends javax.swing.JFrame {

    ImageIcon imagemAdmin = new ImageIcon("src/Imgs/admin.png");
    ImageIcon imagemFundo = new ImageIcon("src/Imgs/background.jpg");
    
    public EditarAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
        tabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotaoEditar = new javax.swing.JButton();
        ImagemAdmin1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CampoNMatricula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoTurma = new javax.swing.JTextField();
        ComboCurso = new javax.swing.JComboBox<>();
        CampoIdade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        BotaoRetornarMenu1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaAluno = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        BotaoCarregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Controle do Aluno");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(795, 700));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(51, 72, 0, 0);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Editar matricula");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 30, 150, 26);

        jLabel2.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("Online");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 340, 50, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrador do sistema");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 320, 204, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(15, 72, 0, 0);

        BotaoEditar.setBackground(new java.awt.Color(0, 51, 153));
        BotaoEditar.setForeground(new java.awt.Color(255, 207, 7));
        BotaoEditar.setText("🖉    Editar");
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEditar);
        BotaoEditar.setBounds(640, 360, 108, 40);

        ImagemAdmin1.setIcon(imagemAdmin);
        getContentPane().add(ImagemAdmin1);
        ImagemAdmin1.setBounds(70, 100, 190, 210);

        jLabel8.setBackground(new java.awt.Color(0, 51, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Editar nome completo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 70, 252, 36);

        CampoNome.setForeground(new java.awt.Color(153, 153, 153));
        CampoNome.setText("Digite novo nome do aluno");
        CampoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoNomeFocusLost(evt);
            }
        });
        getContentPane().add(CampoNome);
        CampoNome.setBounds(470, 110, 288, 22);

        jLabel9.setBackground(new java.awt.Color(0, 51, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Editar curso");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 210, 144, 36);

        CampoNMatricula.setForeground(new java.awt.Color(153, 153, 153));
        CampoNMatricula.setText("Nº Matricula");
        CampoNMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoNMatriculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoNMatriculaFocusLost(evt);
            }
        });
        getContentPane().add(CampoNMatricula);
        CampoNMatricula.setBounds(510, 30, 108, 30);

        jLabel10.setBackground(new java.awt.Color(0, 51, 153));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Editar turma");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(630, 140, 130, 36);

        CampoTurma.setForeground(new java.awt.Color(153, 153, 153));
        CampoTurma.setText("Digite nova turma");
        CampoTurma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoTurmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoTurmaFocusLost(evt);
            }
        });
        getContentPane().add(CampoTurma);
        CampoTurma.setBounds(630, 180, 130, 22);

        ComboCurso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ComboCurso.setForeground(new java.awt.Color(0, 51, 153));
        ComboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eng. da Computação", "Eng. Quimica", "Eng. Eletrica", "Eng. Mecanica", "Eng. de Materiais" }));
        getContentPane().add(ComboCurso);
        ComboCurso.setBounds(470, 240, 144, 22);

        CampoIdade.setForeground(new java.awt.Color(153, 153, 153));
        CampoIdade.setText("DD/MM/AAAA");
        CampoIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoIdadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoIdadeFocusLost(evt);
            }
        });
        getContentPane().add(CampoIdade);
        CampoIdade.setBounds(470, 180, 150, 22);

        jLabel12.setBackground(new java.awt.Color(0, 51, 153));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Editar data de nascimento");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 140, 160, 36);

        BotaoRetornarMenu1.setBackground(new java.awt.Color(255, 204, 0));
        BotaoRetornarMenu1.setForeground(new java.awt.Color(0, 51, 153));
        BotaoRetornarMenu1.setText("⮐ Retornar ao menu");
        BotaoRetornarMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetornarMenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRetornarMenu1);
        BotaoRetornarMenu1.setBounds(0, 0, 180, 40);

        TabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Idade", "Curso", "Turma", "Data da Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaAluno);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 440, 790, 220);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("?");
        jLabel6.setToolTipText("Editar campos desejados no numero de matricula digitado");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(760, 20, 20, 32);

        BotaoCarregar.setBackground(new java.awt.Color(0, 51, 153));
        BotaoCarregar.setForeground(new java.awt.Color(255, 207, 7));
        BotaoCarregar.setText("  Carregar");
        BotaoCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCarregarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCarregar);
        BotaoCarregar.setBounds(630, 20, 108, 40);

        jLabel5.setIcon(imagemFundo);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -90, 790, 610);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 130, 38, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        // TODO add your handling code here:
        String nome = CampoNome.getText();
        String idade = CampoIdade.getText();
        int turma = Integer.parseInt(CampoTurma.getText());
        String curso = (String) ComboCurso.getSelectedItem();
        int id = Integer.parseInt(CampoNMatricula.getText());
        
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setNomeAluno(nome);
        aluno.setIdadeNasAluno(idade);
        aluno.setCursoAluno(curso);
        aluno.setTurmaAluno(turma);
        
        
        AlunoDAO alunodao = new AlunoDAO();
        alunodao.updateAluno(aluno);
        
        DefaultTableModel model = (DefaultTableModel) TabelaAluno.getModel();
        model.setRowCount(0);
        tabela();
    }//GEN-LAST:event_BotaoEditarActionPerformed

    private void BotaoRetornarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetornarMenu1ActionPerformed
        EditarAluno.this.setVisible(false);
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_BotaoRetornarMenu1ActionPerformed

    private void CampoNMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNMatriculaFocusGained
        if(CampoNMatricula.getText().equals("Nº Matricula")){
            CampoNMatricula.setText("");
            CampoNMatricula.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoNMatriculaFocusGained

    private void CampoNMatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNMatriculaFocusLost
       if(CampoNMatricula.getText().equals("")){
           CampoNMatricula.setText("Nº Matricula");
           CampoNMatricula.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_CampoNMatriculaFocusLost

    private void CampoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNomeFocusGained
        // TODO add your handling code here: 
        if (CampoNome.getText().equals("Digite novo nome do aluno")){
            CampoNome.setText("");
            CampoNome.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_CampoNomeFocusGained

    private void CampoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNomeFocusLost
        // TODO add your handling code here:
        if(CampoNome.getText().equals("")){
           CampoNome.setText("Digite novo nome do aluno");
           CampoNome.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_CampoNomeFocusLost

    private void CampoIdadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIdadeFocusGained
        // TODO add your handling code here:
        if (CampoIdade.getText().equals("DD/MM/AAAA")){
            CampoIdade.setText("");
            CampoIdade.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_CampoIdadeFocusGained

    private void CampoIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIdadeFocusLost
        // TODO add your handling code here:
         if(CampoIdade.getText().equals("")){
           CampoIdade.setText("DD/MM/AAAA");
           CampoIdade.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_CampoIdadeFocusLost

    private void CampoTurmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoTurmaFocusGained
        // TODO add your handling code here:
          if (CampoTurma.getText().equals("Digite nova turma")){
            CampoTurma.setText("");
            CampoTurma.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_CampoTurmaFocusGained

    private void CampoTurmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoTurmaFocusLost
        // TODO add your handling code here:
          if(CampoTurma.getText().equals("")){
           CampoTurma.setText("Digite nova turma");
           CampoTurma.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_CampoTurmaFocusLost

    private void BotaoCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCarregarActionPerformed
        // TODO add your handling code here:
        Integer id = Integer.parseInt(CampoNMatricula.getText());
        AlunoDAO alunodao = new AlunoDAO();
        Aluno aluno = new Aluno();
        aluno = alunodao.buscar(id);

        
        ComboCurso.setSelectedItem(aluno.getCursoAluno());
        CampoNome.setText(aluno.getNomeAluno());
        CampoIdade.setText(aluno.getIdadeNasAluno());
        CampoTurma.setText(Integer.toString(aluno.getTurmaAluno()));
    }//GEN-LAST:event_BotaoCarregarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCarregar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoRetornarMenu1;
    private javax.swing.JTextField CampoIdade;
    private javax.swing.JTextField CampoNMatricula;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoTurma;
    private javax.swing.JComboBox<String> ComboCurso;
    private javax.swing.JLabel ImagemAdmin1;
    private javax.swing.JTable TabelaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private  void tabela() {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            AlunoDAO alunodao = new AlunoDAO();

            DefaultTableModel model;
            model = (DefaultTableModel) TabelaAluno.getModel();
            ArrayList<Aluno> alunos = (ArrayList<Aluno>) alunodao.getAluno();

            for (int i = 0; i < alunos.size(); i++) {
                model.addRow(new Object[]{
                    alunos.get(i).getId(),
                    alunos.get(i).getNomeAluno(),
                    alunos.get(i).getIdadeNasAluno(),
                    alunos.get(i).getCursoAluno(),
                    alunos.get(i).getTurmaAluno(),
                    alunos.get(i).getDataMatricula(),
                    alunos.get(i).getFotoAluno()
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
