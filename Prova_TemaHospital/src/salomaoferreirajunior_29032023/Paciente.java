
package salomaoferreirajunior_29032023;


import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    Medico med;
    Enfermeiro enf;
    Internacao inter;
    List<Internacao> listInter = new ArrayList();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    Paciente(Medico m, Enfermeiro e, Internacao i){
        this.med = m;
        this.enf = e;
        this.inter = i;
        listInter.add(i);
    }
    
    void alteraNome(String nome){
        setNome(nome);
    }
    
    void visualizarPaciente(){
        System.out.println("=-= Dados Paciente =-=");
        System.out.println("Paciente:"+this.getNome());
        System.out.println("Medico:"+this.med.getNome());
        System.out.println("Enfermeiro:"+this.enf.getNome());
        double valor;
        double valorTotal = 0;
        for(Internacao inter : listInter){
            System.out.println("=-=Internacao=-=");
            System.out.println("Codigo Internacao:" +inter.getCodInternacao());
            System.out.println("Motivo:" + inter.getMotivo());
            System.out.println("Valor Dia:" +inter.getValorDia());
            System.out.println("Total Dias:" +inter.getTotalDias());
            System.out.println("Valor Total:" +inter.getValorTotal());
            System.out.println("------------");
            valor = inter.calcularTotal();
            valorTotal += valor;
            
        }
        System.out.println("Valor De Todas Internacoes:"+valorTotal);
    }
}
