import java.util.List;

public class Internacao {
    private String motivo;
    private static int cont;
    private int idInternacao;
    private int qntdDias;
    private double valorDia;
    private double totalInternacao;
    
    Medico m;
    Enfermeiro enf;
    Paciente p;
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public static int getCont() {
        return Internacao.cont;
    }


    public int getIdInternacao() {
        return idInternacao;
    }

    public void setIdInternacao(int idInternacao) {
        this.idInternacao = idInternacao;
    }

    public int getQntdDias() {
        return qntdDias;
    }

    public void setQntdDias(int qntdDias) {
        this.qntdDias = qntdDias;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getTotalInternacao() {
        return totalInternacao;
    }

    public void setTotalInternacao(double totalInternacao) {
        this.totalInternacao = totalInternacao;
    }
    
    Internacao(Enfermeiro e, Medico m, Paciente p, String motivo, int qntdDias, double valorDia){
        this.enf = e;
        this.m = m;
        this.p = p;
        Internacao.cont = Internacao.cont + 1;
        this.idInternacao = cont;
        this.motivo = motivo;
        this.qntdDias = qntdDias;
        this.valorDia = valorDia;
        calcularTotalDia();
    }
    
    void calcularTotalDia(){
        setTotalInternacao(this.getQntdDias()*this.getValorDia());
    }
    
    public static void relatorioInternacao(List<Internacao> listInter){
        double valorTotal=0, valor;
            
        for(Internacao internacao : listInter){
            valor=internacao.getTotalInternacao();
            System.out.println("=-= Dados Internacao =-=");
            System.out.println("Codigo:"+internacao.getIdInternacao());
            System.out.println("Paciente:"+internacao.p.getNome());
            System.out.println("Medico:"+internacao.m.getNome());
            System.out.println("Enfermeiro:"+internacao.enf.getNome());
            System.out.println("Motivo:"+internacao.getMotivo());
            System.out.println("Quantidade de Dias:"+internacao.getQntdDias());
            System.out.println("Valor do Dia:"+internacao.getValorDia());
            System.out.println("Total Internação:"+internacao.getTotalInternacao());
            System.out.println("--------------");
            valorTotal += valor;
        }
        System.out.println("Valor Todas Internações do Hospital:"+valorTotal);
    }
    
    public static void internacaoPaciente(Paciente p, List<Internacao> listInter){
        double valorTotal=0, valor;
        System.out.println("=-= Internações do Paciente =-=");
        System.out.println(p.getNome());
        for(Internacao internacao : listInter){
            if(p.getCodPaciente() == internacao.p.getCodPaciente()){
                valor=internacao.getTotalInternacao();
                System.out.println("=-= Dados Internacao =-=");
                System.out.println("Codigo:"+internacao.getIdInternacao());
                System.out.println("Medico:"+internacao.m.getNome());
                System.out.println("Enfermeiro:"+internacao.enf.getNome());
                System.out.println("Motivo:"+internacao.getMotivo());
                System.out.println("Quantidade de Dias:"+internacao.getQntdDias());
                System.out.println("Valor do Dia:"+internacao.getValorDia());
                System.out.println("Total Internação:"+internacao.getTotalInternacao());
                System.out.println("--------------");
                valorTotal += valor;
            }
        }
        System.out.println("Valor Todas Internações:"+valorTotal);
        System.out.println("-----------------");
    }
}
