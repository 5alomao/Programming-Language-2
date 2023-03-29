package salomaoferreirajunior_29032023;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        Internacao internacao = new Internacao(100,5);
        Internacao internacao2 = new Internacao(200,2);
        Medico medico = new Medico("Tulio",internacao);
        Enfermeiro enfermeiro = new Enfermeiro();
        
        Paciente paciente = new Paciente(medico,enfermeiro,internacao);
        
        System.out.println("Nome do Paciente:");
        paciente.setNome(ent.nextLine());
        System.out.println("Nome do Enfermeiro:");
        enfermeiro.setNome(ent.nextLine());
        System.out.println("Motivo da Internacao");
        internacao.setMotivo(ent.nextLine());
        System.out.println("Motivo da Internacao 2");
        internacao2.setMotivo(ent.nextLine());
        paciente.listInter.add(internacao2);
        paciente.visualizarPaciente();
        
        medico.listPaciente.add(paciente);
        medico.visualizarPacientes();
        
    }
}
