public class Universidade {

    //criação da vareavel
    String nomeUniversidade;
    String materia;

    //Construindo objeto
    public Universidade( String nomeUniversidade,String materia){
        this.nomeUniversidade = nomeUniversidade;
        this.materia = materia;
    }

    //retornando novo valor da vareavel
    public String getmateria(){
        return materia;
    }
    public String getNomeUniversidade(){
        return nomeUniversidade;
    }

    //dando o novo valor da vareavel
    public void setUniversidade(String nomeUniversidade, String materia){
        this.nomeUniversidade = nomeUniversidade;
        this.materia = materia;
    }
}
