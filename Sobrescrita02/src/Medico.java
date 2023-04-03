
public class Medico extends Pessoa {
    private String crm;
    private double salario;
    private String especializacao;

    public Medico(String nome, String endereco, int idade, String cpf, char sexo, String crm, double salario, String especializacao) {
        super(nome, endereco, idade, cpf, sexo);
        this.crm = crm;
        this.salario = salario;
        this.especializacao = especializacao;
    }

    public void darPlantao() {
        System.out.println("O médico está dando plantão");
    }
}
