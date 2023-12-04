import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Pessoa {
    String nome;
    int idade;
    String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}

class Motorista extends Pessoa {
    public Motorista(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }
    // Métodos específicos de Motorista
}

class Cobrador extends Pessoa {
    public Cobrador(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }
    // Métodos específicos de Cobrador
}

class Passageiro extends Pessoa {
    String tipoCartao;

    public Passageiro(String nome, int idade, String cpf, String tipoCartao) {
        super(nome, idade, cpf);
        this.tipoCartao = tipoCartao;
    }
    // Métodos específicos de Passageiro
}

class Veiculo {
    String placa;
    String modelo;
    int capacidade;

    public Veiculo(String placa, String modelo, int capacidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }
}

class PontoParada {
    String nome;
    String localizacao;

    public PontoParada(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }
}

class Trajeto {
    String nome;
    List<Trecho> trechos;

    public Trajeto(String nome) {
        this.nome = nome;
        this.trechos = new ArrayList<>();
    }

    public void adicionarTrecho(Trecho trecho) {
        trechos.add(trecho);
    }
}

class Trecho {
    PontoParada pontoOrigem;
    PontoParada pontoDestino;
    int intervalo;

    public Trecho(PontoParada pontoOrigem, PontoParada pontoDestino, int intervalo) {
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
        this.intervalo = intervalo;
    }
}

class Jornada {
    Motorista motorista;
    Cobrador cobrador;
    Veiculo veiculo;
    Trajeto trajeto;
    LocalDateTime inicio;
    LocalDateTime fim;

    public Jornada(Motorista motorista, Veiculo veiculo, Trajeto trajeto) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.trajeto = trajeto;
    }

    public Jornada(Motorista motorista, Cobrador cobrador, Veiculo veiculo, Trajeto trajeto) {
        this.motorista = motorista;
        this.cobrador = cobrador;
        this.veiculo = veiculo;
        this.trajeto = trajeto;
    }

    public void registrarInicio(LocalDateTime dataHora) {
        this.inicio = dataHora;
    }

    public void registrarFim(LocalDateTime dataHora) {
        this.fim = dataHora;
    }
}

class Checkpoint {
    PontoParada pontoParada;
    LocalDateTime horaChegada;

    public Checkpoint(PontoParada pontoParada, LocalDateTime horaChegada) {
        this.pontoParada = pontoParada;
        this.horaChegada = horaChegada;
    }
}

class RegistroEmbarque {
    Passageiro passageiro;
    PontoParada pontoEmbarque;
    String cartaoUsado;

    public RegistroEmbarque(Passageiro passageiro, PontoParada pontoEmbarque, String cartaoUsado) {
        this.passageiro = passageiro;
        this.pontoEmbarque = pontoEmbarque;
        this.cartaoUsado = cartaoUsado;
    }
}