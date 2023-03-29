
package salomaoferreirajunior_29032023;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    
    private String nome;
    Paciente p;
    
    List<Internacao> listInter = new ArrayList();
    List<Paciente> listPaciente = new ArrayList();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    Medico(String nome,Internacao i){
        this.nome = nome;
        listInter.add(i);
    }
    
    void visualizarPacientes(){
        for(Paciente p : listPaciente){
            System.out.println("=-= Pacientes =-=");
            System.out.println("Nome:"+p.getNome());
            System.out.println("-------");
        }
    }
    void alteraNome(String nome){
        setNome(nome);
    }
    void visualizarInternacoes(){
        for(Internacao inter : listInter){
            System.out.println("=-=Internacao=-=");
            System.out.println("Codigo Internacao:" +inter.getCodInternacao());
            System.out.println("Motivo:" + inter.getMotivo());
            System.out.println("Valor Dia:" +inter.getValorDia());
            System.out.println("Total Dias:" +inter.getTotalDias());
            System.out.println("Valor Total:" +inter.getValorTotal());
            System.out.println("------------");
        }
    }
}
