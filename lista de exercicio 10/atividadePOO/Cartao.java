package atividadePOO;

public class Cartao {
    private int numero;
    private int validade;
    private String nome;
    private String bandeira;
    public Double saldo;
    public Double pagar;
    public Double preço;

//Caracteristicas
public Cartao(int numero, int validade, String nome, String bandeira){
    this.numero = numero;
    this.validade = validade;
    this.nome = nome;
    this.bandeira = bandeira;
}

//Numero
public int getNumero(){
    return numero;
}
public void setNumero(int numero){
    this.numero = numero;
}

//Validade
public int getValidade(){
    return validade;
}
public void setValidade(int validade){
    this.validade = validade;
}

//Nome
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

//Bandeira
public String getBandeira(){
    return bandeira;
}
public void setBandeira(String bandeira){
    this.bandeira = bandeira;
}

//Ações
//Saldo
public Double getSaldo(){
    return saldo;
}
public void setSaldo(Double saldo){
    this.saldo = saldo;
    System.out.println("Você possui: " + saldo + " de saldo em sua conta.");
}

//Pagar
public Double getPagar(){
    return pagar;
}
public void setPagar(Double preço){
    System.out.println("O valor a ser pago é de: " + preço);
    Double saldofinal = saldo - preço;
    System.out.println("seu saldo após o pagamento é " + saldofinal);
 
}

//Cancelar 
public void cancelar(){
    System.out.println("Cartão cancelado.");
}

    
}
