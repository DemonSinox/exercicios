public class Pessoa {

    //criação da vareavel
    String nome;
    String dataNacimento;

    //Construindo objeto
    public Pessoa (String nome,String dataNacimento){
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }

    //retornando novo valor da vareavel
    public String getNome() {
        return nome;
    }

    public String getDataNacimento (){
        return dataNacimento;
    }

    //dando o novo valor da vareavel
    public void setDados(String nome, String dataNacimento) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }
}
