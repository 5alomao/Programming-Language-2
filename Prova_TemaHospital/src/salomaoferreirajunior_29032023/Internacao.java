package salomaoferreirajunior_29032023;

import java.util.List;

public class Internacao {
    private static int cont;
    private int codInternacao;
    private String motivo;
    private double valorDia;
    private double totalDias;
    private double valorTotal;
    private double valorTodasInternacoes = 0;

    public int getCodInternacao() {
        return codInternacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(double totalDias) {
        this.totalDias = totalDias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTodasInternacoes() {
        return valorTodasInternacoes;
    }

    public void setValorTodasInternacoes(double valorTodasInternacoes) {
        this.valorTodasInternacoes = valorTodasInternacoes;
    }

    
    
    Internacao(double valorDia, double totalDia) {
        Internacao.cont = Internacao.cont + 1;
        this.codInternacao = cont;
        this.valorDia = valorDia;
        this.totalDias = totalDia;
        calcularTotal();
    }
    double calcularTotal(){
        setValorTotal(getValorDia() * getTotalDias());
        return valorTotal;
    }
    
    void mostraInternacao(){
        System.out.println("=-= Internações =-=");
        System.out.println("Codigo: "+this.codInternacao);
        System.out.println("Motivo:"+this.motivo);
        System.out.println("Valor:"+this.valorDia);
        System.out.println("Total dias:"+this.totalDias);
        System.out.println("Valor Total:"+this.valorTotal);
        System.out.println("-----");
    }
}
