
public class Paciente extends Pessoa {
    private String doenca;
    private String medicacao;

    public Paciente(String nome, String endereco, int idade, String cpf, char sexo, String doenca, String medicacao) {
        super(nome, endereco, idade, cpf, sexo);
        this.doenca = doenca;
        this.medicacao = medicacao;
    }

    public void sentirDor() {
        System.out.println("O paciente está sentindo dor");
    }

    public void terAlta() {
        System.out.println("O paciente recebeu alta");
    }
}
