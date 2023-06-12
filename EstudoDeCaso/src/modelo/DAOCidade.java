package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOCidade { //Data Acess Object (DAO)
    public List<Cidade> getLista(){
        String sql = "select * from cidade";
        List<Cidade> listaCidade = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery(); //armazena os dados no rs
            while(rs.next()){ //passando dados para o objeto
                Cidade objCidade = new Cidade();
                objCidade.setCodigoCidade(rs.getInt("codCidade")); //campo do BD
                objCidade.setNomeCidade(rs.getString("nome")); //campo do BD
                objCidade.setUfCidade(rs.getString("uf")); //campo do BD
                listaCidade.add(objCidade); 
            }
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+exception.getMessage());
        }
        return listaCidade;
    }
    public boolean incluir(Cidade obj) {
        String sql = "insert into cidade (nome,uf) values(?,?)"; // ? = valores do formulário
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); // passando comando sql pra conexão
            pst.setString(1, obj.getNomeCidade()); // 1 = primeira ? = nome
            pst.setString(2, obj.getUfCidade()); // 2 = segunda ? = uf
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade incluida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não incluida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOCidade" + e.getMessage());
        }
        return false;
  }
    
}
