package trasporto;

public class Caminhoneiro {
    private String nome,cnpj,cpf;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    Caminhoneiro(String nome, String cpf, String cnpj, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.salario = salario;
    }
}
