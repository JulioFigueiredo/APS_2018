 
package kanew;

public class TAG {

    private String nomeDaTag;
    private String[] TipoDaTag;{

    TipoDaTag[0]= "INFORMÁTICA";
    TipoDaTag[1]= "HUMANAS";
    TipoDaTag[2]= "EXATAS";
    TipoDaTag[3]= "PROVA DE";
    TipoDaTag[4]= "TRABALHO DE";
    TipoDaTag[5]= "CIÊNCIAS DA NATUREZA";
}
    public TAG (){
        this.TipoDaTag= null;
        this.nomeDaTag= null;
    }
    public TAG(String nomeTag, String[] TipoTag){
        this.nomeDaTag = nomeTag;
        this.TipoDaTag = TipoTag;
    }
    public String getNomeDaTag() {
        return nomeDaTag;
    }

    public void setNomeDaTag(String nomeDaTag) {
        this.nomeDaTag = nomeDaTag;
    }
    
    
    
}
