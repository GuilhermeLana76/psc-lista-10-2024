package atividadePOO;

public class Celular {
    private String marca;
    private String modelo;
    private String sistema;
    private int numero;
    public int numeroLigar;
    public String mensagem;

//Caracteristicas
public Celular(String marca, String modelo, String sistema, int numero){
    this.marca = marca;
    this.modelo = modelo;
    this.sistema = sistema;
    this.numero = numero;
}

//Marca
public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}

//Modelo
public String getModelo(){
    return modelo;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}

//Sistema operacional
public String getSistema(){
    return sistema;
}
public void setSistema(String sistema){
    this.sistema = sistema;
}

//Numero de serie
public int getNumero(){
    return numero;
}
public void setNumero(int numero){
    this.numero = numero;
}

//Ações 
//Ligar
public int getNumeroLigar(){
    return numeroLigar;
}
public void setNumeroligar(int numeroLigar){
    this.numeroLigar = numeroLigar;
    
    System.out.println("Ligando para " + numeroLigar);
}
//Mensagem
public String getMensagem(){
    return mensagem;
}
public void setMensagem(String mensagem){
    this.mensagem = mensagem;

    System.out.println("Mensagem digitada: " + mensagem);
}

//Fotos
public void fotos(){
    System.out.println("Diga X!");
}

//Internet
public void internet(){
    System.out.println("Sem conexão!");
}
    
}
