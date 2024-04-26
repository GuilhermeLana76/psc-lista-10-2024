package atividadePOO;

public class Animal {

    private String especie;
    private Double peso;
    private String cor;
    private String Habitat;

// Caracteristicas 
public Animal(String especie, Double peso, String cor, String habitat){
    this.especie = especie;
    this.peso = peso;
    this.cor = cor;
    this.Habitat = habitat;
}    

//especie
public String getEspecie(){
    return especie;
}

public void setEspecie(String especie){
    this.especie = especie;
}

//peso
public Double getPeso(){
    return peso;
}

public void setPeso(Double peso){
    this.peso = peso;
}

//cor
public String getCor(){
    return cor;
}

public void setCor(String cor){
    this.cor = cor;

}

//habitat
public String getHabitat(){
    return Habitat;
}

public void setHabitat(String Habitat){
    this.Habitat = Habitat;
}

//AÇÕES 
//Correr
public void Correr(){
    System.out.println("Cuidado! o " + getEspecie() + " Corre rapido!");
}
//Caçar
public void Caçar(String presa){
    System.out.println("O " + getEspecie() + " Caça o " + presa);
}
//Dormir
public void Domir(){
    System.out.println("Silencio! O " + getEspecie() + " Está Dormindo.");
}
//Brincar
public void Brincar(){
    System.out.println("Quem disse que o " + getEspecie() + " não brinca?");
}

    
}
