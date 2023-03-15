package aluno.telaApp;

import aluno.DAO.AlunoDAO;
import aluno.model.Aluno;
import java.util.Date;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class RemoverAluno extends javax.swing.JFrame {
    
    ImageIcon imagemAdmin = new ImageIcon("src/Imgs/admin.png");
    ImageIcon imagemFundo = new ImageIcon("src/Imgs/background.jpg");

    
    public RemoverAluno() {
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
        BotaoRemover = new javax.swing.JButton();
        ImagemAdmin1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampoNMatricula = new javax.swing.JTextField();
        BotaoRetornarMenu1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaAluno = new javax.swing.JTable();

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
        jLabel1.setText("Remover aluno existente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 30, 450, 26);

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

        BotaoRemover.setBackground(new java.awt.Color(0, 51, 153));
        BotaoRemover.setForeground(new java.awt.Color(255, 207, 7));
        BotaoRemover.setText("🆇    Remover");
        BotaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRemover);
        BotaoRemover.setBounds(610, 360, 144, 40);

        ImagemAdmin1.setIcon(imagemAdmin);
        getContentPane().add(ImagemAdmin1);
        ImagemAdmin1.setBounds(70, 100, 190, 210);

        jLabel7.setBackground(new java.awt.Color(0, 51, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Nº da matrícula");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 150, 100, 36);

        CampoNMatricula.setForeground(new java.awt.Color(153, 153, 153));
        CampoNMatricula.setText("Digite o numero da matricula que deseja remover");
        CampoNMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoNMatriculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoNMatriculaFocusLost(evt);
            }
        });
        CampoNMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNMatricula);
        CampoNMatricula.setBounds(460, 180, 280, 25);

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

        jLabel5.setIcon(imagemFundo);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -90, 790, 610);

        TabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Idade", "Curso", "Turma", "Data da Matrícula", "foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane2.setBounds(0, 440, 790, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BotaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverActionPerformed
        AlunoDAO alunodao = new AlunoDAO();
        int id = Integer.parseInt(CampoNMatricula.getText());
        
        alunodao.deleteAluno(id);
        DefaultTableModel model = (DefaultTableModel) TabelaAluno.getModel();
        model.setRowCount(0);
        tabela();        
        CampoNMatricula.setText("");
        CampoNMatricula.requestFocusInWindow();

    }//GEN-LAST:event_BotaoRemoverActionPerformed

    private void BotaoRetornarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetornarMenu1ActionPerformed
        RemoverAluno.this.setVisible(false);
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_BotaoRetornarMenu1ActionPerformed

    private void CampoNMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNMatriculaActionPerformed

    private void CampoNMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNMatriculaFocusGained
        if (CampoNMatricula.getText().equals("Digite o numero da matricula que deseja remover")){
            CampoNMatricula.setText("");
            CampoNMatricula.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_CampoNMatriculaFocusGained
    }
    private void CampoNMatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNMatriculaFocusLost
        if (CampoNMatricula.getText().equals("")){
            CampoNMatricula.setText("Digite o numero da matricula que deseja remover");
            CampoNMatricula.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CampoNMatriculaFocusLost
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoRemover;
    private javax.swing.JButton BotaoRetornarMenu1;
    private javax.swing.JTextField CampoNMatricula;
    private javax.swing.JLabel ImagemAdmin1;
    private javax.swing.JTable TabelaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
