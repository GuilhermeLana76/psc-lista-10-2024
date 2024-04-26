package atividadePOO;

public class Livro {

    private String titulo;
    private String autor;
    private String genero;
    private int paginas;
    public int marcar;
    public String anotacao;

//Caracteristicas 

public Livro(String titulo, String autor, String genero, int paginas){
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.paginas = paginas;
}

//Titulo
public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo = titulo;
}

//Autor
public String getAutor(){
    return autor;
}
public void setAutor(String autor){
    this.autor = autor;
}

//Gênero
public String getGenero(){
    return genero;
}
public void setGenero(String genero){
    this.genero = genero;
}

//Número de paginas
public int getPaginas(){
    return paginas;
}
public void setPaginas(int paginas){
    this.paginas = paginas;
}

//Ações
//Ler
public void Ler(){
    System.out.println("Boa leitura!");
}

//Marcar Paginas
public int getMarcar(){
    return marcar;
}
public void setMarcar(int marcar){
    this.marcar = marcar;
    System.out.println("Você marcou a pagina " + marcar);
}

//Escrever anotações
public String getAnotacao(){
    return anotacao;
}
public void setAnotacao(String anotacao){
    this.anotacao = anotacao;
}

//Emprestar
public void Emprestar(){
    System.out.println("Tome cuidado com meu livro!");
}

}
