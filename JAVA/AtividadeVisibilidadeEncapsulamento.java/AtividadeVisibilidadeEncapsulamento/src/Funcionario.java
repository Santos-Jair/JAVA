import java.util.*;



public class Funcionario {
    private String Nome;
    private Date Data_Admissao;
    private Double Salario;
    private static int Identificador;
    private static int Contador_Funcionarios;

    public Funcionario() {
        Contador_Funcionarios++;
        Identificador = Contador_Funcionarios;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public Date getData_Admissao() {
        return Data_Admissao;
    }
    public void setData_Admissao(Date data_Admissao) 
    {
        Data_Admissao = data_Admissao;
        
    }
    public Double getSalario() {
        return Salario;
    }
    public void setSalario(Double salario) {
        if (salario>1100){
        Salario = salario;
        } else{
            System.out.println("Salário insuficiente!");
        }
    }

    public int getIdentificador() {
        return Identificador;
    }

    

}