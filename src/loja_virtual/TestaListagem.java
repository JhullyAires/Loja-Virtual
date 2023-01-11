package loja_virtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TestaListagem {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost/loja_virtual?useTimeZone=true&serverTimezone=UTC&user=root&password=root");
        Statement stm = connection.createStatement();
        boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

        System.out.println(resultado);

        connection.close();
    }
}