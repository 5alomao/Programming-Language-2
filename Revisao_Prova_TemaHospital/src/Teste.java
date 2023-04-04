import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        Paciente p = new Paciente();
        Paciente p2 = new Paciente();
        Paciente p3 = new Paciente();
        Medico m = new Medico("Gabriel");
        Medico m2 = new Medico("Tadeo");
        Enfermeiro enf = new Enfermeiro();
        Enfermeiro enf2 = new Enfermeiro();
        List<Internacao> listInter = new ArrayList();
        
        System.out.println("Nome Paciente 1:");
        p.setNome(ent.nextLine());
        System.out.println("Nome Paciente 2:");
        p2.setNome(ent.nextLine());
        System.out.println("Nome Paciente 3:");
        p3.setNome(ent.nextLine());

        System.out.println("Nome Enfermeiro 1:");
        enf.setNome(ent.nextLine());
        System.out.println("Nome Enfermeiro 2:");
        enf2.setNome(ent.nextLine());
        
        Internacao inter1 = new Internacao(enf, m, p,"Rim",5,150.50);
        Internacao inter2 = new Internacao(enf2, m2, p2,"Pulmão",10,250);
        Internacao inter3 = new Internacao(enf, m2, p2,"Perna",6,200);
        Internacao inter4 = new Internacao(enf, m, p3,"Braço",4,150);
        Internacao inter5 = new Internacao(enf2, m, p3,"Mão",3,100.50);
        listInter.add(inter1);
        listInter.add(inter2);
        listInter.add(inter3);
        listInter.add(inter4);
        listInter.add(inter5);
        
        p3.alteraNome("Salomão");
        Internacao.internacaoPaciente(p3,listInter);
        
        Internacao.relatorioInternacao(listInter);
    }
}
