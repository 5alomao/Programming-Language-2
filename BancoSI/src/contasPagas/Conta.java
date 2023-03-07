/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author Salomão
 */
public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    Produto pro;
    Cliente cli;
    
    void visualizarConta(){
        System.out.println("IDENTIFICADOR: "+this.idConta);
        System.out.println("PRODUTO: "+this.pro.getDescProduto());
        System.out.println("CLIENTE: "+this.cli.getNome()+" Cpf: "+this.cli.getCpf());
        System.out.println("VALOR: "+this.pro.getValorProduto());
        System.out.println("DATA VENCIMENTO: "+this.dataVencimento);
        System.out.println("DATA PAGAMENTO: "+this.dataPagamento);
        System.out.println("-----------------------");
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
}
