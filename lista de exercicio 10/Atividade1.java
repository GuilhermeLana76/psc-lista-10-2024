import atividadePOO.Pessoa;
import atividadePOO.Animal;
import atividadePOO.Carro;
import atividadePOO.Cartao;
import atividadePOO.Celular;
import atividadePOO.Computador;

public class Atividade1 {
    public static void main(String[] args) {

//CARACTERISTICAS PESSOA 
    atividadePOO.Pessoa pessoa = new atividadePOO.Pessoa("gui", 1.70, 19, "022");

    System.out.println("~~1.PESSOA.JAVA~~");
    System.out.println(pessoa.getNome());
    System.out.println(pessoa.getCpf());
    System.out.println(pessoa.getIdade());
    System.out.println(pessoa.getAltura());

    pessoa.setAltura(1.60);
    pessoa.setCpf("174");
    pessoa.setIdade(19);
    pessoa.setNome("Ana");

    System.out.println("\nNome: " + pessoa.getNome());
    System.out.println("Cpf " + pessoa.getCpf());
    System.out.println("Idade " + pessoa.getIdade());
    System.out.println("Altura " + pessoa.getAltura() + "\n");

//AÇÕES PESSOA 
    pessoa.Ler("Diario de um Banana");
    pessoa.Andar();
    pessoa.Dormir();
    pessoa.Comer("pão de queijo");

// CARACTERISTICAS ANIMAL 
    atividadePOO.Animal animal = new atividadePOO.Animal("leão", 150.0, "rosa", "pasto");

    System.out.println("\n ~~2.ANIMAL.JAVA~~");
    System.out.println("Especie: " + animal.getEspecie());
    System.out.println("Peso: " + animal.getPeso());
    System.out.println("Cor: " + animal.getCor());
    System.out.println("Habitat: " + animal.getHabitat() + "\n");

// AÇÕES ANIMAL 
    animal.Correr();
    animal.Caçar("Zebra");
    animal.Domir();
    animal.Brincar();

//CARACTERISTICAS CARRO
    atividadePOO.Carro carro = new atividadePOO.Carro("Citroen", "C3", 2012, "00X00");
    
    System.out.println("\n~~3..CARRO.JAVA~~");
    System.out.println("Marca: " + carro.getMarca());
    System.out.println("Modelo: " + carro.getModelo());
    System.out.println("Ano: " + carro.getAno());
    System.out.println("Placa: " + carro.getPlaca() + "\n");

//AÇÕES CARRO

    carro.setAcelerar(60);
    carro.setFrear(10);
    carro.Virar();
    carro.Estacionar();

//CARACTERISTICAS ENDEREÇO

    atividadePOO.Endereco endereco = new atividadePOO.Endereco("Eufrasia Augusta", 765, "Santa Helena", 32015220);

    System.out.println("\n ~~4.ENDEREÇO.JAVA~~");
    System.out.println("Rua: " + endereco.getRua());
    System.out.println("Numero: " + endereco.getNumero());
    System.out.println("Bairro: " + endereco.getBairro());
    System.out.println("Cep: " + endereco.getCep() + "\n");

//AÇÕES ENDEREÇO

    endereco.Localizar();
    endereco.visitar();
    endereco.mapear();
    endereco.setDescrever("Casa ", "Azul","igreja de pedra");

//CARACTERISTICAS CARTAO

    atividadePOO.Cartao cartao = new atividadePOO.Cartao(10000, 2025, "Guilherme", "Visa");

    System.out.println("\n~~5.CARTÃO.JAVA~~");
    System.out.println("Número: " + cartao.getNumero());
    System.out.println("Validade: " + cartao.getValidade());
    System.out.println("Nome do titular: " + cartao.getNome());
    System.out.println("Bandeira: " + cartao.getBandeira() + "\n");

//AÇÕES CARTÃO

    cartao.setSaldo(1800.00);
    cartao.setPagar(800.0);
    cartao.cancelar();

//CARACTERISTICAS CELULAR

    atividadePOO.Celular celular = new atividadePOO.Celular("iPhone","XR", "IOS", 988341245);

    System.out.println("\n~~6.CELULAR.JAVA~~");
    System.out.println("Marca: " + celular.getMarca());
    System.out.println("Modelo: " + celular.getModelo());
    System.out.println("Sistema: " + celular.getSistema());
    System.out.println("Número: " + celular.getSistema() + "\n");

//AÇÕES CELULAR

    celular.setNumeroligar(75020162);
    celular.setMensagem("Olá");
    celular.fotos();
    celular.internet();

//CARACTERISTICAS COMPUTADOR

    atividadePOO.Computador computador = new atividadePOO.Computador("Samsung", "i5", 4, 256);

    System.out.println("\n~~7.COMPUTADOR.JAVA~~");
    System.out.println("Fabricante: " + computador.getFabricante());
    System.out.println("Processador: " + computador.getProcessador());
    System.out.println("Memoria RAM: " + computador.getRam() + " Gigas");
    System.out.println("Armazenamento: " + computador.getArmazenamento() + "GB\n");
    
//AÇÕES COMPUTADOR

    computador.Iniciar();
    computador.arquivos();
    computador.programas();
    computador.desligar();

//CARACTERISTICAS RELOGIO

    atividadePOO.Relogio relogio = new atividadePOO.Relogio("Casio", "Digital", "Prata", "Marcar hora");

    System.out.println("\n~~8.RELOGIO.JAVA~~");
    System.out.println("Marca: " + relogio.getMarca()); 
    System.out.println("Tipo: " + relogio.getTipo());
    System.out.println("Material: " + relogio.getMaterial());
    System.out.println("Função principal: " + relogio.getFuncao() + "\n");

//AÇÔES RELOGIO

    relogio.setHora(13, 30);
    relogio.alarme();
    relogio.setCronometro(10.00);
    relogio.setData(26, 11, 2004);

//CARACTERISTICAS TELEVISAO

    atividadePOO.Televisao televisao = new atividadePOO.Televisao(70.0, "4k", "HDMI", "Sansung");

    System.out.println("\n~~9.TELEVISAO.JAVA~~");
    System.out.println("Tamanho: " + televisao.getTamanho() + " polegadas");
    System.out.println("Resolução: " + televisao.getResolucao());
    System.out.println("Conexão: " + televisao.getConexao());
    System.out.println("Marca: " + televisao.getMarca() + "\n");
    

//AÇÔES TELEVISÃO

    televisao.setCanal(12);
    televisao.progamas();
    televisao.setVolume(50);
    televisao.conectar();

//CARACTERISTICAS TELEVISÃO

    atividadePOO.Livro livro = new atividadePOO.Livro("As cronicas de narnia", "C. S. Lewis", "Fantasia", 1536);

    System.out.println("\n~~10.LIVRO.JAVA~~");
    System.out.println("Titulo: " + livro.getTitulo());
    System.out.println("Autor: " + livro.getAutor());
    System.out.println("Genero: " + livro.getGenero());
    System.out.println("Paginas: " + livro.getPaginas() + "\n");

//AÇÕES TELEVISÃO

    livro.Ler();
    livro.setMarcar(50);
    livro.setAnotacao("Reler a pagina 50 - linha 10");
    livro.Emprestar();

    
    }
}