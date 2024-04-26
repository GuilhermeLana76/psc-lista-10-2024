package atividadePOO;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    public int frear;
    public int Acelerar;

// Caracteristicas
public Carro(String marca, String modelo, int ano, String placa){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.placa = placa;
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

//Ano
public int getAno(){
    return ano;
}

public void setAno(int ano){
    this.ano = ano;
}

//Placa
public String getPlaca(){
    return placa;
}

public void setPlaca(String placa){
    this.placa = placa;
}

//AÇÕES
//Acelerar
public int getAcelerar(){
    return Acelerar;
}
public void setAcelerar(int velocidade){

    Acelerar = velocidade;
    System.out.println("O carro está a " + velocidade + "Km por hora");
}

//Frear
public int getFrear(){
    return frear;

}
public void setFrear(int freio){
    frear = Acelerar - freio;
    System.out.println("O carro freiou " + freio + "Km's agora está a " + frear + "Km's por hr");
}

//Virar
public void Virar(){
    System.out.println("Não se esqueça da seta!");
}

//Estacionar
public void Estacionar(){
    System.out.println("Melhor andar 2 quarteirões do que fazer baliza!");
}
}
