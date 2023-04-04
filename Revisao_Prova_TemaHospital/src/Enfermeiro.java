public class Enfermeiro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    Enfermeiro(){
        
    }
    
    Enfermeiro(String nome){
        this.nome = nome;
    }
    
    void alteraNome(String nome){
        setNome(nome);
    }
}
