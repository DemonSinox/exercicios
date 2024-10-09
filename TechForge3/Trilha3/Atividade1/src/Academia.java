public class Academia {

    private String nomeAluno;
    private Integer idadeAluno;
    private Double pesoAluno;
    private Double alturaAluno;

    public void imprimirDados() {
        System.out.println("Dados do aluno:");
        System.out.println("-------------------");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Altura: " + alturaAluno);
        System.out.println("Peso: " + pesoAluno);
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Menor : "+ validacaoDeIdade());
    }


    public String calcularIMC() {
        if (alturaAluno == 0) {
            return "Altura não pode ser zero!";
        }

        double resultadoIMC = pesoAluno / (alturaAluno * alturaAluno);
        String grauIMC;

        if (resultadoIMC < 18.5) {
            grauIMC = "Magreza";
        } else if (resultadoIMC < 25) {
            grauIMC = "Normal";
        } else if (resultadoIMC < 30) {
            grauIMC = "Sobrepeso";
        } else if (resultadoIMC < 35) {
            grauIMC = "Obesidade grau I";
        } else if (resultadoIMC < 40) {
            grauIMC = "Obesidade grau II";
        } else {
            grauIMC = "Obesidade grau III";
        }

        String infoIMC = "Resultado de : "+resultadoIMC+" Grau --> "+grauIMC;

        return infoIMC;
    }


    public Boolean validacaoDeIdade() {
        return idadeAluno < 18;
    }


    public void setAluno(String nome, Integer idade, Double peso, Double altura) {
        this.nomeAluno = nome;
        this.idadeAluno = idade;
        this.pesoAluno = peso;
        this.alturaAluno = altura;
    }
}
