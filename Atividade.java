import java.util.Date;

public class Atividade {
    private String nome;
    private String tag;
    private  String disciplina; 
    private Date dataSubmissão;
    private Date dataModificação;
    private Date dataConclusão;
    
    public Atividade(){
        this.nome = "-----";
        this.tag = "-no tag-";
        this.disciplina = "null";
        this.dataSubmissão = null;
        this.dataModificação = null;
        this.dataConclusão = null;
        
    }
    

    public Atividade(String nome, String tag, String disciplina, Date dataSubmissão, Date dataModificação, Date dataConclusão) {
        this.nome = nome;
        this.tag = tag;
        this.disciplina = disciplina;
        this.dataSubmissão = dataSubmissão;
        this.dataModificação = dataModificação;
        this.dataConclusão = dataConclusão;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Date getDataSubmissão() {
        return this.dataSubmissão;
    }

    public void setDataSubmissão(Date dataSubmissão) {
        this.dataSubmissão = dataSubmissão;
    }

    public Date getDataModificação() {
        return this.dataModificação;
    }

    public void setDataModificação(Date dataModificação) {
        this.dataModificação = dataModificação;
    }

    public Date getDataConclusão() {
        return this.dataConclusão;
    }

    public void setDataConclusão(Date dataConclusão) {
        this.dataConclusão = dataConclusão;
    }
    
    
    
    
    
}
