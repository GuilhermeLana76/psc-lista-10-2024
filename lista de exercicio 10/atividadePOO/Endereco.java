package atividadePOO;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private int cep;
    public String descrever;

//Caracteristicas
public Endereco(String rua, int numero, String bairro, int cep){;
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cep = cep;
}

//Rua
public String getRua(){
    return rua;
}

public void setRua(String rua){
    this.rua = rua;
}

//Numero
public int getNumero(){
    return numero;
}

public void setNumero(int numero){
    this.numero = numero;
}

//Bairro
public String getBairro(){
    return bairro;
}
public void setBairro(String bairro){
    this.bairro = bairro;
}

//CEP
public int getCep(){
    return cep;
}
public void setCep(int cep){
    this.cep = cep;
}

//Ações
//Localizar
public void Localizar(){
    System.out.println("Para localizar ensira o cep no google");
}

//visitar
public void visitar(){
    System.out.println("Ligue para 4002-8922 para agendar uma visita!");
}

//Mapear
public void mapear(){
    System.out.println("Alô Google! mapeie esse endereço por favor!");
}

//Descrever
public String getDescrever(){
    return descrever;
}
public void setDescrever(String construção, String cor, String referencia){
    System.out.println("O endereço é um/uma " + construção + cor + " proximo ao " + referencia);
}

}
