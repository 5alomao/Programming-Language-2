
package salomaoferreirajunior_07062023;

public class Geladeira extends Aparelho{

    public Geladeira(String marca, String modelo, String cor, Double peso, Data dataG) {
        super(marca, modelo, cor, peso, dataG);
    }

    @Override
    void ligar() {
        if(this.getEstado() == true)
            System.out.println("Geladeira já está Ligado!"); 
        else{
            this.setEstado(true);
            System.out.println("Geladeira Ligado com sucesso !");
        }
    }

    @Override
    void desligar() {
        if(this.getEstado() == false)
          System.out.println("Geladeira já está Desligado!");  
        else{   
            this.setEstado(false);
            System.out.println("Geladeira Desligado com sucesso !");
        }
    }

    @Override
    void dadosAparelho() {
        System.out.println("Dados da Geladeira");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Data de Garantia: "+this.dataGarantia.getDia()+"/"+this.dataGarantia.getMes()+"/"+this.dataGarantia.getAno());
        if(this.getEstado())
            System.out.println("Estado: Ligada");
        else
            System.out.println("Estado: Desligada");
    }

    @Override
    void addRede() {
        System.out.println("Geladeira não pode ser inserido na Rede!");
    }
    
    @Override
    void remRede() {
        System.out.println("Não existe geladeira inserida na Rede!");
    }

}
