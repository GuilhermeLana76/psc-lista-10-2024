package atividadePOO;

public class Relogio {
    private String marca;
    private String tipo;
    private String material;
    private String funcao;
    public int hora;
    public Double cronometro;
    public int data;
    
//Caracteristicas
public Relogio(String marca, String tipo, String material, String funcao){
    this.marca = marca;
    this.tipo = tipo;
    this.material = material;
    this.funcao = funcao;
}

//Marca
public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}

//Tipo
public String getTipo(){
    return tipo;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}

//Material
public String getMaterial(){
    return material;
}
public void setMaterial(String material){
    this.material = material;
}

//Funções
public String getFuncao(){
    return funcao;
}
public void setFuncao(String funcao){
    this.funcao = funcao;
}

//Ações 
//Mostrar Hora
public int getHora(){
    return hora;
}
public void setHora(int hora, int minuto){
    this.hora = hora;


    System.out.println(("A horario enserido é: " + hora + ":" + minuto));
}

//Alarme
public void alarme(){
    System.out.println("PI PI PI PI PI PI");
}

//Cronometro
public Double getCronometro(){
    return cronometro;
}
public void setCronometro(Double cronometro){
    this.cronometro = cronometro;
    System.out.println("Cronometro setado para: " + cronometro);

}

//data
public int getData(){
    return data;
}
public void setData(int data, int mes, int ano){
    this.data = data;
    System.out.println("Hoje é: " + data + "/" + mes + "/" + ano);
}


}

