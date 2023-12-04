import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Classe base para representar uma pessoa genérica
class Pessoa {
    String nome;
    int idade;
    String cpf;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}

// Classe Motorista que herda de Pessoa
class Motorista extends Pessoa {
    // Construtor da classe Motorista
    public Motorista(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }
    // Métodos específicos de Motorista
}

// Classe Cobrador que herda de Pessoa
class Cobrador extends Pessoa {
    // Construtor da classe Cobrador
    public Cobrador(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }
    // Métodos específicos de Cobrador
}

// Classe Passageiro que herda de Pessoa
class Passageiro extends Pessoa {
    String tipoCartao;

    // Construtor da classe Passageiro
    public Passageiro(String nome, int idade, String cpf, String tipoCartao) {
        super(nome, idade, cpf);
        this.tipoCartao = tipoCartao;
    }
    // Métodos específicos de Passageiro
}

// Classe para representar um Veículo
class Veiculo {
    String placa;
    String modelo;
    int capacidade;

    // Construtor da classe Veiculo
    public Veiculo(String placa, String modelo, int capacidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }
}

// Classe para representar um Ponto de Parada
class PontoParada {
    String nome;
    String localizacao;

    // Construtor da classe PontoParada
    public PontoParada(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }
}

// Classe para representar um Trajeto
class Trajeto {
    String nome;
    List<Trecho> trechos;

    // Construtor da classe Trajeto
    public Trajeto(String nome) {
        this.nome = nome;
        this.trechos = new ArrayList<>();
    }

    // Método para adicionar um trecho ao trajeto
    public void adicionarTrecho(Trecho trecho) {
        trechos.add(trecho);
    }
}

// Classe para representar um Trecho
class Trecho {
    PontoParada pontoOrigem;
    PontoParada pontoDestino;
    int intervalo;

    // Construtor da classe Trecho
    public Trecho(PontoParada pontoOrigem, PontoParada pontoDestino, int intervalo) {
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
        this.intervalo = intervalo;
    }
}

// Classe para representar uma Jornada
class Jornada {
    Motorista motorista;
    Cobrador cobrador;
    Veiculo veiculo;
    Trajeto trajeto;
    LocalDateTime inicio;
    LocalDateTime fim;

    // Construtor da classe Jornada
    public Jornada(Motorista motorista, Veiculo veiculo, Trajeto trajeto) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.trajeto = trajeto;
    }

    // Sobrecarga do construtor para incluir um cobrador na jornada
    public Jornada(Motorista motorista, Cobrador cobrador, Veiculo veiculo, Trajeto trajeto) {
        this.motorista = motorista;
        this.cobrador = cobrador;
        this.veiculo = veiculo;
        this.trajeto = trajeto;
    }

    // Método para registrar o início da jornada
    public void registrarInicio(LocalDateTime dataHora) {
        this.inicio = dataHora;
    }

    // Método para registrar o fim da jornada
    public void registrarFim(LocalDateTime dataHora) {
        this.fim = dataHora;
    }
}

// Classe para representar um Checkpoint
class Checkpoint {
    PontoParada pontoParada;
    LocalDateTime horaChegada;

    // Construtor da classe Checkpoint
    public Checkpoint(PontoParada pontoParada, LocalDateTime horaChegada) {
        this.pontoParada = pontoParada;
        this.horaChegada = horaChegada;
    }
}

// Classe para representar um Registro de Embarque
class RegistroEmbarque {
    Passageiro passageiro;
    PontoParada pontoEmbarque;
    String cartaoUsado;

    // Construtor da classe RegistroEmbarque
    public RegistroEmbarque(Passageiro passageiro, PontoParada pontoEmbarque, String cartaoUsado) {
        this.passageiro = passageiro;
        this.pontoEmbarque = pontoEmbarque;
        this.cartaoUsado = cartaoUsado;
    }
}
