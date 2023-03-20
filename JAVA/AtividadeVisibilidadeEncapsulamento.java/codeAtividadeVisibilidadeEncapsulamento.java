import java.util.Date;



pubic class Funcionario {
    public String Nome;
    public Date Data_Admissao;
    private Double Salario;

        public Double getSalario (){
            return this.Salario;
        }

        public void setSalario (double Nome) {
            this.Salario = Salario;
        }
        public String ge Nome (){
            return this Nome;
        }

        public void se Nome (String Nome) {
            this Nome = Nome;
        }
        public Date getData_Admissao (){
            return this.Data_Admissao;
        }

        public void setData_Admissao (double Data_Admissao) {
            this.data_admissao = data_admissao;
        }
}
public class Principal {
    public static void main(String[] args) {
        Funcionario Funcionario = new Funcionario();
        Funcionario.setNome("João");
        Funcionario.setSalario(1300.00);

        System.out.println(" Nome: " + Funcionario.getNome());
        System.out.println ("Salario: " + Funcionario.getIdade());
    }
}