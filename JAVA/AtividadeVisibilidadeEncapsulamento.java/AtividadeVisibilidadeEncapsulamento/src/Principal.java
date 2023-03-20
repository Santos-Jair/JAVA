import java.util.Date;
import java.text.DateFormat;
import java.text.*;

public class Principal {
    
    public static void main (String[] args) {

        Funcionario Funcionario = new Funcionario();
        Funcionario.setNome("João");
        Funcionario.setSalario(1000.00);

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data_Admissao = formatador.parse("26/06/2020");
            Funcionario.setData_Admissao(data_Admissao);
        } catch (ParseException e) {
            System.out.println("Erro ao definir data de admissão");
        }

        System.out.println("1º Nome do primeiro funcionario: " + Funcionario.getNome());
        System.out.println ("1º Salario: " + Funcionario.getSalario());
        System.out.println("Identificador: " + Funcionario.getIdentificador());
        System.out.println("1º Data de Admissão:" + Funcionario.getData_Admissao());
    }
}
