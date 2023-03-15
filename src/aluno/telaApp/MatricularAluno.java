package aluno.telaApp;

import Imgs.ManipularImagem;
import aluno.DAO.AlunoDAO;
import aluno.model.Aluno;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MatricularAluno extends javax.swing.JFrame {
    
    
   
    
    
    ImageIcon imagemFundo = new ImageIcon("src/Imgs/background.jpg");
    ImageIcon imagemAdmin = new ImageIcon("src/Imgs/admin.png");
    BufferedImage imagem;
    public MatricularAluno() {
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
        BotaoProximo1 = new javax.swing.JButton();
        ImagemAdmin1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CampoTurma = new javax.swing.JTextField();
        ComboCurso = new javax.swing.JComboBox<>();
        CampoIdade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        BotaoRetornarMenu1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaAluno = new javax.swing.JTable();
        BotaoEscolherFoto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        AmostraImagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel1.setText("Matricular um novo aluno");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 30, 450, 26);

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

        BotaoProximo1.setBackground(new java.awt.Color(0, 51, 153));
        BotaoProximo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoProximo1.setForeground(new java.awt.Color(255, 207, 7));
        BotaoProximo1.setText("OK");
        BotaoProximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximo1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoProximo1);
        BotaoProximo1.setBounds(650, 356, 108, 40);

        ImagemAdmin1.setIcon(imagemAdmin);
        getContentPane().add(ImagemAdmin1);
        ImagemAdmin1.setBounds(70, 100, 190, 210);

        jLabel8.setBackground(new java.awt.Color(0, 51, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Nome completo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(468, 72, 252, 36);

        CampoNome.setForeground(new java.awt.Color(153, 153, 153));
        CampoNome.setText("Digite o nome do aluno");
        CampoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoNomeFocusLost(evt);
            }
        });
        getContentPane().add(CampoNome);
        CampoNome.setBounds(468, 108, 288, 25);

        jLabel9.setBackground(new java.awt.Color(0, 51, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Foto do aluno");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(468, 216, 144, 36);

        jLabel10.setBackground(new java.awt.Color(0, 51, 153));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Turma");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(612, 144, 144, 36);

        CampoTurma.setForeground(new java.awt.Color(153, 153, 153));
        CampoTurma.setText("Digite a turma do aluno");
        CampoTurma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoTurmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoTurmaFocusLost(evt);
            }
        });
        CampoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoTurma);
        CampoTurma.setBounds(612, 180, 144, 25);

        ComboCurso.setForeground(new java.awt.Color(153, 153, 153));
        ComboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eng. da Computação", "Eng. Quimica", "Eng. Eletrica", "Eng. Mecanica", "Eng. de Materiais" }));
        ComboCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCursoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboCurso);
        ComboCurso.setBounds(612, 252, 144, 25);

        CampoIdade.setForeground(new java.awt.Color(153, 153, 153));
        CampoIdade.setText("dd/mm/aaaa");
        CampoIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoIdadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoIdadeFocusLost(evt);
            }
        });
        CampoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(CampoIdade);
        CampoIdade.setBounds(468, 180, 108, 25);

        jLabel12.setBackground(new java.awt.Color(0, 51, 153));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Data Nascimento");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(468, 144, 144, 36);

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
                "Matricula", "Nome", "Idade", "Curso", "Turma", "Data da Matrícula", "foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jScrollPane2.setBounds(0, 450, 790, 220);

        BotaoEscolherFoto.setBackground(new java.awt.Color(0, 51, 153));
        BotaoEscolherFoto.setForeground(new java.awt.Color(255, 204, 7));
        BotaoEscolherFoto.setText("Escolher");
        BotaoEscolherFoto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BotaoEscolherFotoFocusGained(evt);
            }
        });
        BotaoEscolherFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEscolherFotoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEscolherFoto);
        BotaoEscolherFoto.setBounds(468, 356, 108, 40);

        jLabel11.setBackground(new java.awt.Color(0, 51, 153));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Curso");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(612, 216, 144, 36);

        AmostraImagem.setBackground(new java.awt.Color(255, 255, 255));
        AmostraImagem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AmostraImagem.setForeground(new java.awt.Color(0, 51, 153));
        AmostraImagem.setText("         Imagem");
        getContentPane().add(AmostraImagem);
        AmostraImagem.setBounds(468, 252, 108, 108);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(470, 250, 100, 110);

        jLabel5.setIcon(imagemFundo);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -80, 790, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotaoEscolherFotoActionPerformed(java.awt.event.ActionEvent evet){
        JFileChooser chooser = new JFileChooser();
        int res = chooser.showOpenDialog(null);
        File a=null;
        if(res==JFileChooser.APPROVE_OPTION){
             a = chooser.getSelectedFile();
        }
        
           imagem=ManipularImagem.setImagemDimensao(a.getAbsolutePath() ,120, 160);
           AmostraImagem.setIcon(new ImageIcon(imagem));
            
            
            
        
    }
    private void BotaoProximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximo1ActionPerformed
        String nome = CampoNome.getText();
        String idade = CampoIdade.getText();
        int turma = Integer.parseInt(CampoIdade.getText());
        String curso = (String) ComboCurso.getSelectedItem();
        
        
        Aluno aluno = new Aluno();
        aluno.setNomeAluno(nome);
        aluno.setIdadeNasAluno(idade);
        aluno.setCursoAluno(curso);
        aluno.setTurmaAluno(turma);
        aluno.setDataMatricula(new Date());
        aluno.setFotoAluno(ManipularImagem.getImgBytes(imagem));
        
        AlunoDAO alunodao = new AlunoDAO();
        alunodao.cadastraAluno(aluno);
        
        DefaultTableModel model = (DefaultTableModel) TabelaAluno.getModel();
        model.setRowCount(0);
        tabela();
        CampoNome.setText("Digite o nome do aluno");
        CampoIdade.setText("dd/mm/aaaa");
        CampoIdade.setText("Digite a turma do aluno");
        ImageIcon nullIcon = new ImageIcon();
        AmostraImagem.setIcon(nullIcon);
        
    }//GEN-LAST:event_BotaoProximo1ActionPerformed

    private void BotaoRetornarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetornarMenu1ActionPerformed
        MatricularAluno.this.setVisible(false);
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_BotaoRetornarMenu1ActionPerformed

    private void ComboCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCursoActionPerformed

    private void CampoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNomeFocusGained
        // TODO add your handling code here:
         if (CampoNome.getText().equals("Digite o nome do aluno")){
            CampoNome.setText("");
            CampoNome.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_CampoNomeFocusGained
    }
    private void CampoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNomeFocusLost
        // TODO add your handling code here:
         if (CampoNome.getText().equals("")){
            CampoNome.setText("Digite o nome do aluno");
            CampoNome.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoNomeFocusLost

    private void CampoIdadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIdadeFocusGained
        // TODO add your handling code here:
           if (CampoIdade.getText().equals("dd/mm/aaaa")){
            CampoIdade.setText("");
            CampoIdade.setForeground(new Color(153,153,153));
    } 
    }//GEN-LAST:event_CampoIdadeFocusGained

    private void CampoIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIdadeFocusLost
        // TODO add your handling code here:
        if (CampoIdade.getText().equals("")){
            CampoIdade.setText("dd/mm/aaaa");
            CampoIdade.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoIdadeFocusLost

    private void CampoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdadeActionPerformed

    private void BotaoEscolherFotoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BotaoEscolherFotoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEscolherFotoFocusGained

    private void CampoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTurmaActionPerformed

    private void CampoTurmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoTurmaFocusLost
        // TODO add your handling code here:
        if (CampoTurma.getText().equals("")){
            CampoTurma.setText("Digite a turma do aluno");
            CampoTurma.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoTurmaFocusLost

    private void CampoTurmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoTurmaFocusGained
        // TODO add your handling code here:
        if (CampoTurma.getText().equals("Digite a turma do aluno")){
            CampoTurma.setText("");
            CampoTurma.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoTurmaFocusGained

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatricularAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmostraImagem;
    private javax.swing.JButton BotaoEscolherFoto;
    private javax.swing.JButton BotaoProximo1;
    private javax.swing.JButton BotaoRetornarMenu1;
    private javax.swing.JTextField CampoIdade;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoTurma;
    private javax.swing.JComboBox<String> ComboCurso;
    private javax.swing.JLabel ImagemAdmin1;
    private javax.swing.JTable TabelaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
