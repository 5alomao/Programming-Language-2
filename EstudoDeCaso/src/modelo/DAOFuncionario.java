package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFuncionario { //Data Acess Object (DAO)
    
    DAOCidade objDAOCidade = new DAOCidade(); //cria objeto do DAOCidade
    
    public List<Funcionario> getLista(){
        String sql = "select * from funcionario";
        List<Funcionario> listaFuncionario = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery(); //armazena os dados no rs
            while(rs.next()){ //passando dados para o objeto
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setCodigoFuncionario(rs.getInt("codFuncionario")); //campo do BD
                objFuncionario.setNomeFuncionario(rs.getString("nome")); //campo do BD
                objFuncionario.setSalarioFuncionario(rs.getDouble("salario")); //campo do BD
                
                java.sql.Date dt = rs.getDate("nascimento");
                Calendar c = Calendar.getInstance(); //converte para calendaria
                c.setTime(dt);
                objFuncionario.setNascimentoFuncionario(c); //manda para o objeto
                
                objFuncionario.setObjCidade(objDAOCidade.localizar(rs.getInt("objCidade")));

                listaFuncionario.add(objFuncionario); 
            }
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista() do DAOFuncionario: "+exception.getMessage());
        }
        return listaFuncionario;
    }
    
    public boolean incluir(Funcionario obj) {
        String sql = "insert into funcionario (nome, salario, nascimento, objCidade) values(?,?,?,?)"; // ? = valores do formulário
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); // passando comando sql pra conexão
            pst.setString(1, obj.getNomeFuncionario()); // 1 = primeira ? = nome
            pst.setDouble(2, obj.getSalarioFuncionario()); // 2 = segunda ? = salario
            //pst.setDate(3, obj.getNascimentoFormatado()); // 3 = segunda ? = nascimento
            //pst.setInt(4, obj.getObjCidade()); // 4 = segunda ? = objCidade
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario incluido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não incluido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOFuncionario" + e.getMessage());
        }
        return false;
    }
    
    public boolean alterar(Cidade obj) {
        String sql = "update cidade set nome = ?, uf = ? where codCidade = ?"; // ? = valores do formulário
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); // passando comando sql pra conexão
            pst.setString(1, obj.getNomeCidade()); // 1 = primeira ? = nome
            pst.setString(2, obj.getUfCidade()); // 2 = segunda ? = uf
            pst.setInt(3, obj.getCodigoCidade()); // 3 = terceiro ? = codCidade
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade alterada");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não alterada");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOCidade" + e.getMessage());
        }
        return false;
    }
    public boolean remover(Funcionario obj) {
        String sql = "delete from funcionario where codFuncionario = ?"; // ? = valores do formulário
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); // passando comando sql pra conexão
            pst.setInt(1, obj.getCodigoCidade()); // 1 = primeiro ? = codCidade
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade removida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não removida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOCidade" + e.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Cidade obj) {
        if (obj.getCodigoCidade() == null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
}