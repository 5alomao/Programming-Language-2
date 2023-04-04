public class Paciente {
    private String nome;
    private static int cont;
    private int codPaciente;

    public static int getCont() {
        return Paciente.cont;
    }

    public int getCodPaciente() {
        return codPaciente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    Paciente(){
        Paciente.cont = Paciente.cont + 1;
        this.codPaciente = cont;
    }
    
    void alteraNome(String nome){
        setNome(nome);
    }
    
}
