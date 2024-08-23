public class Banco {

    private Integer numeroConta;
    private String nome;
    private Double saldo;

    public Banco() {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public Integer getNumeroConta() {

        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        if (numeroConta <= 0 ){
            System.out.println("Numero da conta invalido");
        }else {
            this.numeroConta = numeroConta;
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo < 0 ){
            System.out.println("Saldo não pode ser nagativo");
        }else {
            this.saldo = saldo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null ){
            System.out.println("O campo 'Nome' não pode estar vazio");
        }else {
            this.nome = nome;
        }
    }

    //retirar saldo
    public void retirarSaldo (Double retirar){

        if (saldo <= 0 && retirar > saldo){
            System.out.println("Saldo insufiente");
        }else {
            this.saldo = this.saldo - retirar ;

            System.out.println("Saldo retirado : "+retirar);
            System.out.println("Saldo restante : "+saldo);
        }
    }

    //add saldo
    public void addSaldo(Double addSaldo){
        if(addSaldo <= 0){
            System.out.println("valor minimo da tranferencia é de R$ 1,00");
        }else{

            this.saldo = addSaldo + this.saldo;

            System.out.println("Saldo adicionado : "+addSaldo);
            System.out.println("Saldo atual : "+saldo);
        }
    }

    //info da conta
    public void infoConta(){
        if ( numeroConta == null) {
            System.out.println("Conta não existente");
        }else{
            System.out.println("Numero da conta: "+numeroConta);
            System.out.println("Nome: "+nome);
            System.out.println("Saldo atual: "+saldo);
        }
    }


}
