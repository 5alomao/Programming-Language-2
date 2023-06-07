/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salomaoferreirajunior_07062023;

/**
 *
 * @author 17413319608
 */
public class ComputadorMesa extends Computador implements Comunicacao{

    public ComputadorMesa(String marca, String modelo, String cor, Double peso, Data dataG) {
        super(marca, modelo, cor, peso, dataG);
    }

    @Override
    void ligar() {
        if(this.getEstado() == true)
            System.out.println("Computador de Mesa já está Ligado!"); 
        else{
            this.setEstado(true);
            System.out.println("Computador de Mesa Ligado com sucesso !");
        }
    }

    @Override
    void desligar() {
        if(this.getEstado() == false)
          System.out.println("Computador de Mesa já está Desligado!");  
        else{   
            this.setEstado(false);
            System.out.println("Computador de Mesa Desligado com sucesso !");
        }
    }

    @Override
    void dadosAparelho() {
        System.out.println("Dados do Computador de Mesa");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Data de Garantia: "+this.dataGarantia.getDia()+" "+this.dataGarantia.getMes()+" "+this.dataGarantia.getAno());
        if(this.getEstado())
            System.out.println("Estado: Ligado");
        else
            System.out.println("Estado: Desligado");
        this.autenticaRede();
    }

    @Override
    public void autenticaRede() {
        if(this.getRede() == true)
            System.out.println("Rede: Conectado");
        else
            System.out.println("Rede: Desconectado");
    }

    @Override
    void addRede() {
        if(this.getRede()== true)
            System.out.println("Computador de Mesa já está na Rede!"); 
        else{
            this.setRede(true);
            System.out.println("Computador de Mesa inserido na Rede com sucesso !");
        }
    }
    
    @Override
    void remRede() {
        if(this.getRede() == false)
          System.out.println("Computador de Mesa já não está na Rede!");  
        else{   
            this.setRede(false);
            System.out.println("Computador de Mesa retirado da Rede com sucesso !");
        }
    }
    
}
