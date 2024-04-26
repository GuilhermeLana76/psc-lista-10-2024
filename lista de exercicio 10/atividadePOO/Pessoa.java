package atividadePOO;

public class Pessoa {

    private String nome;
    private Double altura;
    private int idade;
    private String cpf;

// Caracteristicas
public Pessoa(String nome, Double altura, int idade, String cpf){
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.altura = altura;
}

//nome
public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

//altura 
public Double getAltura(){
    return altura;
}

public void setAltura(Double altura){
    this.altura = altura;
}

//idade 
public int getIdade(){
    return idade;
}

public void setIdade(int idade){
    this.idade = idade;
}

//cpf 
public String getCpf(){
    return cpf;
}

public void setCpf(String cpf){
    this.cpf = cpf;
}

//Ações
//Andar
public void Andar(){
    System.out.println("Nu que cansaço");
}
//Domir
public void Dormir(){
    System.out.println("ZZZZZZZ");
}
//Comer
public void Comer(String comida){
    System.out.println("hummm que " + comida + " bom demais da conta sôh");
}
//Ler
public void Ler(String livro){
    System.out.println("Tenho que terminar de ler o livro " + livro);
}


    
}
