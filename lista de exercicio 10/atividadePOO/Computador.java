package atividadePOO;

public class Computador {
    private String fabricante;
    private String processador;
    private int ram;
    private int armazenamento;


//Caracteristicas
public Computador(String fabricante, String processador, int ram, int armazenamento){
    this.fabricante = fabricante;
    this.processador = processador;
    this.ram = ram;
    this.armazenamento = armazenamento;
}

//Fabricante
public String getFabricante(){
    return fabricante;
}
public void setFabricante(String fabricante){
    this.fabricante = fabricante;
}

//Processador
public String getProcessador(){
    return processador;
}
public void setProcessador(String processador){
    this.processador = processador;
}

//Memoria RAM
public int getRam(){
    return ram;
}
public void setRam(int ram){
    this.ram = ram;
}

//Armazenamento
public int getArmazenamento(){
    return armazenamento;
}
public void setArmazenamento(int armazenamento){
    this.armazenamento = armazenamento;
}

//Ações
//Iniciar
public void Iniciar(){
    System.out.println("Iniciando sistema...");
}

//Abrir Programas
public void programas(){
    System.out.println("Abrindo programas...");
}

//Salvar arquivos
public void arquivos(){
    System.out.println("Abrindo arquivos...");
}
//Desligar
public void desligar(){
    System.out.println("Desligando...");
}

}


