package trasporto2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nome, cpf, rg;
    Caminhoneiro c1;
    Viagem viagem1;
    Carreta carreta1;
    
    List<Viagem> listViagem = new ArrayList();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1){
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
        listViagem.add(viagem1);
    }
    
    void visualizarViagem(){
        System.out.println("Cliente: "+this.nome);
        System.out.println("Motorista: "+this.c1.getNome());
        System.out.println("Veiculo: "+this.carreta1.getModeloCarreta());
        for(Viagem viagem1 : listViagem){
            System.out.println("Destino: "+viagem1.getDestino());
            System.out.println("Valor KM: "+viagem1.getValorKm()+" Distância: "+viagem1.getDistancia());
            System.out.println("Valor Total Viagem: "+viagem1.getValorViagem());
            System.out.println("-=-=-=-=-=-=-=-");
        }
    }
}
