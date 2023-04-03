
public class Pessoa {
    private String nome;
    private String endereco;
    private int idade;
    private String cpf;
    private char sexo;

    public Pessoa(String nome, String endereco, int idade, String cpf, char sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public void andar() {
        System.out.println("A pessoa está andando");
    }
}

