package salomaoferreirajunior_07062023;

public class Teste {

    public static void main(String[] args) {
        
        Data dataGarantia1 = new Data();
        dataGarantia1.setDia("07");
        dataGarantia1.setMes("08");
        dataGarantia1.setAno("2026");
        
        Data dataGarantia2 = new Data();
        dataGarantia2.setDia("03");
        dataGarantia2.setMes("02");
        dataGarantia2.setAno("2024");
        //------------------------------------
        
        
        Geladeira geladeira = new Geladeira("Consul", "xyz", "Branca", 10.5, dataGarantia1); //cria geladeira
        geladeira.ligar(); //liga geladeira
        geladeira.dadosAparelho(); //mostra dados
        geladeira.addRede();
        geladeira.desligar(); //desliga geladeira
        //------------------------------------
        System.out.println("=-=-=-=-=-=-=-=");
        
        
        TelefoneMovel teleMo = new TelefoneMovel("Motorola", "Moto G5 Plus", "Dourado", 3.4, dataGarantia2);
        teleMo.ligar(); //liga teleMo
        teleMo.dadosAparelho(); //mostra dados
        teleMo.addRede();
        teleMo.autenticaRede();
        teleMo.desligar(); //desliga teleMo
        System.out.println("=-=-=-=-=-=-=-=");

        TelefoneFixo teleFix = new TelefoneFixo("IntelBras", "tzsds", "Preto", 6.5, dataGarantia1);
        teleFix.ligar(); //liga teleMo
        teleFix.dadosAparelho(); //mostra dados
        teleFix.addRede();
        teleFix.autenticaRede();
        teleFix.desligar(); //desliga teleMo
        System.out.println("=-=-=-=-=-=-=-=");
        
        ComputadorMesa compMesa = new ComputadorMesa("Positivo", "xxzzyy", "Preto", 12.3, dataGarantia2);
        compMesa.dadosAparelho();
        compMesa.ligar();
        compMesa.ligar();
        compMesa.remRede();
        compMesa.autenticaRede();
        compMesa.desligar();
        compMesa.desligar();
        System.out.println("=-=-=-=-=-=-=-=");
        
        ComputadorPortatil compPor = new ComputadorPortatil("LG", "zzzzz", "Branco", 14.5, dataGarantia1);
        compPor.dadosAparelho();
        compPor.ligar();
        compPor.ligar();
        compMesa.addRede();
        compMesa.remRede();
        compPor.autenticaRede();
        compPor.desligar();
        System.out.println("=-=-=-=-=-=-=-=");
}
    
}
