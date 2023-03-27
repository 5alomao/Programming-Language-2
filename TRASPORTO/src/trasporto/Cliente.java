package trasporto;

public class Cliente {
    private String nome, cpf, rg;
    Caminhoneiro c1;
    Viagem viagem1;
    Carreta carreta1;

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
    }
    
    void visualizarViagem(){
        System.out.println("Cliente: "+this.nome);
        System.out.println("Motorista: "+this.c1.getNome());
        System.out.println("Veiculo: "+this.carreta1.getModeloCarreta());
        System.out.println("Destino: "+this.viagem1.getDestino());
        System.out.println("Valor KM: "+this.viagem1.getValorKm()+" Distância: "+this.viagem1.getDistancia());
        System.out.println("Valor Total Viagem: "+this.viagem1.getValorViagem());
    }
}
