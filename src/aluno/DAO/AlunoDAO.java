package aluno.DAO;

//import java.util.Date;
import java.sql.Date;
import aluno.model.Aluno;
import aluno.connection.ConexaoDb;
import java.sql.Connection;
import aluno.model.Aluno;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void cadastraAluno(Aluno aluno) {
        String sql = "INSERT INTO ALUNO(nome,idade,curso,turma,dataMatricula,ftaluno) VALUES(?,?,?,?,?,?)";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConexaoDb.CreatConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1, aluno.getNomeAluno());
            pstm.setString(2, aluno.getIdadeNasAluno());
            pstm.setString(3, aluno.getCursoAluno());
            pstm.setInt(4, aluno.getTurmaAluno());
            pstm.setDate(5, new java.sql.Date(aluno.getDataMatricula().getTime()));
            pstm.setBytes(6, aluno.getFotoAluno());

            pstm.execute();

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

    public void deleteAluno(int id) {
        String sql = "DELETE FROM aluno WHERE matricula = ?";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConexaoDb.CreatConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, id);

            pstm.execute();
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

    public void updateAluno(Aluno aluno) {
        String sql = "UPDATE aluno SET nome = ?, idade = ?, curso = ?, turma = ?,ftaluno = ?"
                + " WHERE matricula = ?";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConexaoDb.CreatConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1, aluno.getNomeAluno());
            pstm.setString(2, aluno.getIdadeNasAluno());
            pstm.setString(3, aluno.getCursoAluno());
            pstm.setInt(4, aluno.getTurmaAluno());
            pstm.setBytes(5, aluno.getFotoAluno());

            //escolher a posiçao q deseja atualizar
            pstm.setInt(6, aluno.getId());

            pstm.execute();
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

    public List<Aluno> getAluno() {
        String sql = "SELECT * FROM aluno ";

        List<Aluno> alunos = new ArrayList<Aluno>(45);

        Connection con = null;
        PreparedStatement pstm = null;

        ResultSet rset = null;

        try {
            con = ConexaoDb.CreatConnection();
            pstm = con.prepareStatement(sql);

            rset = pstm.executeQuery();
            while (rset.next()) {
                Aluno aluno = new Aluno();

                aluno.setId(rset.getInt("matricula"));
                aluno.setNomeAluno(rset.getString("nome"));
                aluno.setIdadeNasAluno(rset.getString("idade"));
                aluno.setCursoAluno(rset.getString("curso"));
                aluno.setTurmaAluno(rset.getInt("turma"));
                aluno.setDataMatricula(rset.getDate("dataMatricula"));
                aluno.setFotoAluno(rset.getBytes("ftaluno"));

                alunos.add(aluno);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return alunos;
    }

    public Aluno buscar(int id) {
        String sql = "SELECT nome,idade,curso,turma,ftaluno FROM aluno WHERE matricula=? ";

        Aluno aluno = new Aluno();

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            con = ConexaoDb.CreatConnection();
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            rset = pstm.executeQuery();

            while (rset.next()) {
                aluno.setNomeAluno(rset.getString("nome"));
                aluno.setIdadeNasAluno(rset.getString("idade"));
                aluno.setCursoAluno(rset.getString("curso"));
                aluno.setTurmaAluno(rset.getInt("turma"));
                //aluno.setDataMatricula(rset.getDate("dataMatricula"));
                aluno.setFotoAluno(rset.getBytes("ftaluno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return aluno;
    }
    public Aluno buscarImagem(int id) {
        String sql = "SELECT ftaluno FROM aluno WHERE matricula=? ";

        Aluno aluno = new Aluno();

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            con = ConexaoDb.CreatConnection();
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            rset = pstm.executeQuery();

            if(rset.next()) {
                
                aluno.setFotoAluno(rset.getBytes("ftaluno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return aluno;
    }

}
