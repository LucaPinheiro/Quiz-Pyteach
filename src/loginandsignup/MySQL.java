package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MySQL {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/pyteach";

    private static boolean isConnected = false;
    private static String user = null;
    private static String password = null;

    public static Connection getConnection() throws SQLException {
        if (isConnected) {
            return DriverManager.getConnection(URL, user, password);
        }

        Connection conn = null;
        boolean tryAgain = true;

        while (conn == null && tryAgain) {
            if (user == null || password == null) {
                readCredentialsFromDialog();
            }

            try {
                conn = DriverManager.getConnection(URL, user, password);
                isConnected = true;
            } catch (SQLException error) {
                System.err.println(error);
                int option = JOptionPane.showOptionDialog(null, "Credenciais incorretas. Deseja tentar novamente?", "Acesso ao Banco de Dados",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"Sim", "Não"}, "Sim");

                if (option == JOptionPane.NO_OPTION) {
                    tryAgain = false;
                    break;
                }

                user = null;
                password = null;
            }
        }

        return conn;
    }

    private static void readCredentialsFromDialog() {
        JPasswordField passwordField = new JPasswordField();
        JTextField userField = new JTextField();

        Object[] message = {
            "Usuário:", userField,
            "Senha:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Acesso ao Banco de Dados", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            user = userField.getText();
            password = new String(passwordField.getPassword());
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Acesso ao Banco de Dados", JOptionPane.WARNING_MESSAGE);
        }
    }
}
