package atividadePOO;

public class Televisao {

    private Double tamanho;
    private String resolucao;
    private String conexao;
    private String marca;
    public int canal;
    public int volume;

//Caracteristicas 
public Televisao(Double tamanho, String resolucao, String conexao, String marca){
    this.tamanho = tamanho;
    this.resolucao = resolucao;
    this.conexao = conexao;
    this.marca = marca;
}

//Tamanho
public Double getTamanho(){
    return tamanho;
}
public void setTamanho(Double tamanho){
    this.tamanho = tamanho;
}

//Resolução
public String getResolucao(){
    return resolucao;
}
public void setResolucao(String resolucao){
    this.resolucao  = resolucao;
}

//Conexões (HDMI, USB, etc)
public String getConexao(){
    return conexao;
}
public void setConexao(String conexao){
    this.conexao = conexao;
}

//Marca
public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}
    
//Açoes 
//Assistir progamas
public void progamas(){
    System.out.println("Olha o aviãozinho!");
}

//Mudar canal
public int getCanal(){
    return canal;
}
public void setCanal(int canal){
    this.canal = canal;
    System.out.println("Mudando para o canal " + canal);

}

//Ajustar volume
public int getVolume(){
    return volume;
}
public void setVolume(int volume){
    this.volume = volume;
    System.out.println("Aumentando o volume para " + volume);
}

//Conectar dispositivos
public void conectar(){
    System.out.println("Erro ao conectar dispositivo");
}
}
