package bancosi;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public void setNome(String nome) { //enviar dados para o atributo;
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() { //retorna o valor do atributo;
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
}
