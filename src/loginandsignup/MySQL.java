package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class MySQL {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/pyteach";
    private static final String CONFIG_FILE = "config.properties";

    private static boolean isConnected = false; // Variável para controlar se a conexão já foi estabelecida
    private static String user = null; // Variável para armazenar o nome de usuário
    private static String password = null; // Variável para armazenar a senha

    public static Connection getConnection() throws Exception {
        if (isConnected) {
            // Conectado
            return DriverManager.getConnection(URL, user, password);
        }

        Connection conn = null;
        boolean tentarNovamente = true;

        while (conn == null && tentarNovamente) {
            if (user == null || password == null) {
                readCredentialsFromProperties();
            }

            try {
                conn = DriverManager.getConnection(URL, user, password);
                isConnected = true; // Conectado
            } catch (SQLException error) {
                System.err.println(error);
                int option = JOptionPane.showConfirmDialog(null, "Credenciais incorretas. Deseja tentar novamente?");
                if (option != JOptionPane.YES_OPTION) {
                    tentarNovamente = false; // Não tentar novamente
                    break;
                }
                user = null;
                password = null;
            }
        }

        return conn;
    }

    private static void readCredentialsFromProperties() {
        try {
            Properties props = new Properties();
            FileInputStream input = new FileInputStream(CONFIG_FILE);
            props.load(input);

            user = props.getProperty("db.user");
            password = props.getProperty("db.password");
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo de configuração: " + e.getMessage());
            user = JOptionPane.showInputDialog(null, "Digite o nome de usuário do banco de dados:");
            password = JOptionPane.showInputDialog(null, "Digite a senha do banco de dados:");
      }
    }
}
