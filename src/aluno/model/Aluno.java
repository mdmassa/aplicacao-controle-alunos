package aluno.model;

//import java.sql.Date;
import java.util.Date;

public class Aluno {

    private int id;
    private String nomeAluno;
    private String idadeNasAluno;
    private String cursoAluno;
    private int turmaAluno;
    private Date dataMatricula;
    private byte[] fotoAluno;
    
    
    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the cursoAluno
     */
    public String getCursoAluno() {
        return cursoAluno;
    }

    /**
     * @param cursoAluno the cursoAluno to set
     */
    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    /**
     * @return the turmaAluno
     */
    public int getTurmaAluno() {
        return turmaAluno;
    }

    /**
     * @param turmaAluno the turmaAluno to set
     */
    public void setTurmaAluno(int turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    /**
     * @return the dataMatricula
     */
    public Date getDataMatricula() {
        return dataMatricula;
    }

    /**
     * @param dataMatricula the dataMatricula to set
     */
    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

   
    /**
     * @return the idadeNasAluno
     */
    public String getIdadeNasAluno() {
        return idadeNasAluno;
    }

    /**
     * @param idadeNasAluno the idadeNasAluno to set
     */
    public void setIdadeNasAluno(String idadeNasAluno) {
        this.idadeNasAluno = idadeNasAluno;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return the fotoAluno
     */
    public byte[] getFotoAluno() {
        return fotoAluno;
    }

    /**
     * @param fotoAluno the fotoAluno to set
     */
    public void setFotoAluno(byte[] fotoAluno) {
        this.fotoAluno = fotoAluno;
    }
}
