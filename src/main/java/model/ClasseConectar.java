package model;

import view.ConexaoBemSucedida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseConectar {
    
    public Connection connectDB(String bdName) {
        Connection conexao = null; 
        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + bdName, "postgres", "1234");
            if (conexao != null) {
                new ConexaoBemSucedida().setVisible(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conexao;   
    }  
}
