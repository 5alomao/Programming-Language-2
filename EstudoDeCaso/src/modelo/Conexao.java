package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String database = "jdbc:mysql://localhost:3306/estudocaso3si"; // caminho do banco de dados
    private static final String user = "root";
    private static final String password = "";
    
    private static Connection connect = null;
    
    Conexao(){
        
    }
    
    //Método para abrir a conexão com o Banco de Dados
    public static Connection getConexao(){
        if(connect == null){
            try{
                Class.forName(driver); //definir o driver que será utilizado
                connect = DriverManager.getConnection(database,user,password); // defenir banco de dados, usuario e a senha na conexão
            }catch(ClassNotFoundException exception){
                System.out.println("Não encontrou o driver: "+ exception.getMessage());
            }catch(SQLException exception){
                System.out.println("Erro de conexão: "+ exception.getMessage());
            }
        }
        return connect;
    }
    
    //Método para passar os camandos SQL - Insert, Delete, Update, Select
    public static PreparedStatement getPreparedStatement(String sql){ 
        if(connect == null)
            connect = getConexao();
        try{
            return connect.prepareStatement(sql); //passa o comando sql
        }catch(SQLException exception){
            System.out.println("Erro de SQL: "+exception.getMessage());
        }
        return null;
    }
    
    
}
