
public class main {
	
    public static void main(String[] args) {
        // Criando um hospital
        Hospital hospital = new Hospital("Hospital Municipal");

        // Criando dois médicos
        Medico medico1 = new Medico("João", "Rua A, 123", 35, "123456789-01", 'M', "12345", 5000.00, "Cardiologista");
        Medico medico2 = new Medico("Maria", "Rua B, 456", 45, "987654321-10", 'F', "67890", 6000.00, "Pediatra");

        // Criando dois pacientes
        Paciente paciente1 = new Paciente("Lucas", "Rua C, 789", 25, "234567890-12", 'M', "Gripe", "Paracetamol");
        Paciente paciente2 = new Paciente("Ana", "Rua D, 456", 30, "345678901-23", 'F', "Dor de cabeça", "Dipirona");

        // Exibindo informações dos médicos e pacientes
        System.out.println("--- Médicos ---");
        System.out.println(medico1.getNome() + " - CRM: " + medico1.getCrm() + ", Salário: " + medico1.getSalario() + ", Especialização: " + medico1.getEspecializacao());
        System.out.println(medico2.getNome() + " - CRM: " + medico2.getCrm() + ", Salário: " + medico2.getSalario() + ", Especialização: " + medico2.getEspecializacao());

        System.out.println("--- Pacientes ---");
        System.out.println(paciente1.getNome() + " - Idade: " + paciente1.getIdade() + ", CPF: " + paciente1.getCpf() + ", Doença: " + paciente1.getDoenca() + ", Medicação: " + paciente1.getMedicacao());
        System.out.println(paciente2.getNome() + " - Idade: " + paciente2.getIdade() + ", CPF: " + paciente2.getCpf() + ", Doença: " + paciente2.getDoenca() + ", Medicação: " + paciente2.getMedicacao());

        // Testando métodos de andar, sentir dor e ter alta de pacientes
        paciente1.andar();
        paciente1.sentirDor();
        paciente1.terAlta();

        paciente2.andar();
        paciente2.sentirDor();
        paciente2.terAlta();

        // Testando métodos de dar plantão de médicos
        medico1.darPlantao();
        medico2.darPlantao();
    }
}
