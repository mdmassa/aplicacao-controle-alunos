package aluno.telaApp;

import Imgs.ManipularImagem;
import aluno.DAO.AlunoDAO;
import aluno.model.Aluno;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class BuscarAlunoo extends javax.swing.JFrame {

    ImageIcon imagemFundo = new ImageIcon("src/Imgs/background.jpg");

    public BuscarAlunoo() {
        initComponents();
        this.setLocationRelativeTo(null);
        tabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BntRetornar = new javax.swing.JButton();
        BntBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NomeText = new javax.swing.JTextField();
        DataNText = new javax.swing.JTextField();
        CursoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IdText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaAluno = new javax.swing.JTable();
        TurmaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        InscricaoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(795, 450));
        setMinimumSize(new java.awt.Dimension(795, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        BntRetornar.setBackground(new java.awt.Color(255, 204, 7));
        BntRetornar.setForeground(new java.awt.Color(0, 51, 153));
        BntRetornar.setText("⮐ Retornar ao menu");
        BntRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntRetornarActionPerformed(evt);
            }
        });
        getContentPane().add(BntRetornar);
        BntRetornar.setBounds(0, 0, 140, 37);

        BntBuscar.setBackground(new java.awt.Color(0, 51, 153));
        BntBuscar.setForeground(new java.awt.Color(255, 204, 7));
        BntBuscar.setText("🔍 Buscar");
        BntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BntBuscar);
        BntBuscar.setBounds(630, 260, 96, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("                Imagem");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 70, 150, 200);

        NomeText.setEditable(false);
        NomeText.setBackground(new java.awt.Color(255, 255, 255));
        NomeText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeText.setText("Nome do aluno");
        NomeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NomeTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NomeTextFocusLost(evt);
            }
        });
        getContentPane().add(NomeText);
        NomeText.setBounds(470, 150, 260, 22);

        DataNText.setEditable(false);
        DataNText.setBackground(new java.awt.Color(255, 255, 255));
        DataNText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DataNText.setText("DD/MM/AAAA");
        DataNText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DataNTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DataNTextFocusLost(evt);
            }
        });
        DataNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNTextActionPerformed(evt);
            }
        });
        getContentPane().add(DataNText);
        DataNText.setBounds(470, 180, 131, 22);

        CursoText.setEditable(false);
        CursoText.setBackground(new java.awt.Color(255, 255, 255));
        CursoText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CursoText.setText("Curso");
        CursoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CursoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CursoTextFocusLost(evt);
            }
        });
        CursoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursoTextActionPerformed(evt);
            }
        });
        getContentPane().add(CursoText);
        CursoText.setBounds(470, 210, 260, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 5, 153));
        jLabel2.setText("Fazer uma busca");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 10, 360, 28);

        IdText.setForeground(new java.awt.Color(153, 153, 153));
        IdText.setText("ID");
        IdText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IdTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdTextFocusLost(evt);
            }
        });
        IdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextActionPerformed(evt);
            }
        });
        getContentPane().add(IdText);
        IdText.setBounds(470, 80, 71, 32);

        TabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Idade", "Curso", "Turma", "Data da Matrícula", "foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Long.class
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
        jScrollPane2.setBounds(0, 320, 780, 230);

        TurmaText.setEditable(false);
        TurmaText.setBackground(new java.awt.Color(255, 255, 255));
        TurmaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TurmaText.setText("Turma");
        TurmaText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TurmaTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TurmaTextFocusLost(evt);
            }
        });
        TurmaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurmaTextActionPerformed(evt);
            }
        });
        getContentPane().add(TurmaText);
        TurmaText.setBounds(610, 180, 120, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Informações do aluno encontrado");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 130, 260, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Digite a nº da matrícula para busca");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 60, 260, 16);

        jPanel1.setMinimumSize(new java.awt.Dimension(46, 16));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 70, 150, 200);

        jLabel3.setIcon(imagemFundo);
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-13, -10, 800, 330);

        InscricaoText.setEditable(false);
        InscricaoText.setBackground(new java.awt.Color(255, 255, 255));
        InscricaoText.setForeground(new java.awt.Color(153, 153, 153));
        InscricaoText.setText("Data da Matricula");
        InscricaoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InscricaoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InscricaoTextFocusLost(evt);
            }
        });
        InscricaoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscricaoTextActionPerformed(evt);
            }
        });
        getContentPane().add(InscricaoText);
        InscricaoText.setBounds(470, 260, 110, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CursoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CursoTextActionPerformed

    private void BntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntBuscarActionPerformed
        // TODO add your handling code here:

//SimpleDateFormat in= new SimpleDateFormat("yyyy-MM-dd");
//SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        Integer id = Integer.parseInt(IdText.getText());
        AlunoDAO alunodao = new AlunoDAO();
        Aluno aluno = new Aluno();
        aluno = alunodao.buscar(id);
        
        //jLabel1.setIcon(aluno.getFotoAluno());
        ManipularImagem.exibiImagemLabel(aluno.getFotoAluno(), jLabel1);
        CursoText.setText(aluno.getCursoAluno());
        NomeText.setText(aluno.getNomeAluno());
        DataNText.setText(aluno.getIdadeNasAluno());
        
        TurmaText.setText(Integer.toString(aluno.getTurmaAluno()));
        // InscricaoText.setText(out.format(in.parse(aluno.getDataMatricula().toString())));

        


    }//GEN-LAST:event_BntBuscarActionPerformed

    private void BntRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntRetornarActionPerformed
        BuscarAlunoo.this.setVisible(false);
        new MenuPrincipal().setVisible(true);


    }//GEN-LAST:event_BntRetornarActionPerformed

    private void IdTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdTextFocusGained
        if (IdText.getText().equals("ID")) {
            IdText.setText("");
            IdText.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_IdTextFocusGained

    private void IdTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdTextFocusLost
        if (IdText.getText().equals("")) {
            IdText.setText("ID");
            IdText.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_IdTextFocusLost

    private void NomeTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomeTextFocusGained

    }//GEN-LAST:event_NomeTextFocusGained

    private void NomeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomeTextFocusLost

    }//GEN-LAST:event_NomeTextFocusLost

    private void DataNTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DataNTextFocusGained

    }//GEN-LAST:event_DataNTextFocusGained

    private void DataNTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DataNTextFocusLost

    }//GEN-LAST:event_DataNTextFocusLost

    private void CursoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CursoTextFocusGained

    }//GEN-LAST:event_CursoTextFocusGained

    private void CursoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CursoTextFocusLost

    }//GEN-LAST:event_CursoTextFocusLost

    private void TurmaTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TurmaTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TurmaTextFocusGained

    private void TurmaTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TurmaTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TurmaTextFocusLost

    private void TurmaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurmaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurmaTextActionPerformed

    private void IdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextActionPerformed

    private void InscricaoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InscricaoTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_InscricaoTextFocusGained

    private void InscricaoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InscricaoTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_InscricaoTextFocusLost

    private void InscricaoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscricaoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InscricaoTextActionPerformed

    private void DataNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataNTextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAlunoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntBuscar;
    private javax.swing.JButton BntRetornar;
    private javax.swing.JTextField CursoText;
    private javax.swing.JTextField DataNText;
    private javax.swing.JTextField IdText;
    private javax.swing.JTextField InscricaoText;
    private javax.swing.JTextField NomeText;
    private javax.swing.JTable TabelaAluno;
    private javax.swing.JTextField TurmaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void tabela() {
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
