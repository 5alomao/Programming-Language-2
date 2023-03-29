
package salomaoferreirajunior_29032023;

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
    
    void mostraEnfermeiro(){
        System.out.println("=-= Enfermeiro =-=");
        System.out.println("Nome:"+this.nome);
        System.out.println("-----");
    }
}
