package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MySQL {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/pyteach";

    private static final String USER = "root";

    private static final String PASSWORD = "dbpassword";

    public static Connection getConnection() throws Exception {
        try {
            //Class.forName(DRIVER);

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println("Connected");

            return conn;

        } catch (SQLException error) {
            System.err.println(error);
            JOptionPane.showMessageDialog(null, "É necessário colocar sua senha do Banco De Dados.");
            String senha = JOptionPane.showInputDialog(null, "Digite sua senha: ");
            Connection conn = null;
            boolean senhaCorreta = false;

            while (!senhaCorreta) {
                try {
                    conn = DriverManager.getConnection(URL, USER, senha);
                    senhaCorreta = true;
                } catch (SQLException e) {
                    System.err.println(e);
                    JOptionPane.showMessageDialog(null, "Senha incorreta! Digite novamente.");
                    senha = JOptionPane.showInputDialog(null, "Digite sua senha: ");
                }
            }

            return conn;
        }

    }
}
