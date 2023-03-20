public class pessoa {
    public String nome;
    public String sexo;
    public String endereco;
    public Date data_nascimento;

}
public class Clinte {
    public Contrato contrato;
    public Pessoa Pessoa;
    public Historico historico;


}
public class Plano {
    public String nome;
    public String tipo;
    public Double valor;
    

}
public class Contrato {
    public Cliente Contratante;
    public Plano Plano;
    public Date Data_assinatura;
    public Fatura Fatura;
    public double Tarifa;


}

public class Pessoa_Contrato {
    public Contrato contrato;
    public Pessoa Pessoa;
    public Boolean Istitular;


}
public class Fatura {
    public Contrato contrato;
    public Date Data_Vencimento;
    public Boolean Istitular;
    public double multa;
    public double juros;

}
public class Profissional_Saúde {
    public String conselho;
    public String idconselho;
    public Pessoa Pessoa;
}

public class Consulta {
    public Date data_consulta;
    public Cliente Cliente;
    public Profissional_Saúde Profissional_Saúde;

}

public class Exame {
    public Date data_consulta;
    public Cliente Cliente;
    public Profissional_Saúde Profissional_Saúde;
    public Boolean ispronto;


}

public class historico {
    public Consulta Consulta;
    public Exame Exame;
    public Pessoa_Contrato Pessoa_Contrato;
}


