package loginandsignup.Jogar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import loginandsignup.Login;
import java.sql.SQLException;

public class Contadores {

    //Contador total de questões
    public static int ContadorTentativaFinal = 0;

    //Fase 1
    public static int ContadorAcertoF1 = 0;
    public static int ContadorTentativaF1 = 0;

    // Fase 2
    public static int ContadorAcertoF2 = 0;
    public static int ContadorTentativaF2 = 0;

    // Fase 3
    public static int ContadorAcertoF3 = 0;
    public static int ContadorTentativaF3 = 0;

    // Fase 4
    public static int ContadorAcertoF4 = 0;
    public static int ContadorTentativaF4 = 0;

    // Fase 5
    public static int ContadorAcertoF5 = 0;
    public static int ContadorTentativaF5 = 0;

    // Fase 6
    public static int ContadorAcertoF6 = 0;
    public static int ContadorTentativaF6 = 0;

    public static void zeraContadores() {
        ContadorTentativaF1 = 0;
        ContadorTentativaF2 = 0;
        ContadorTentativaF3 = 0;
        ContadorTentativaF4 = 0;
        ContadorTentativaF5 = 0;
        ContadorTentativaF6 = 0;
    }

    public static void zeraContadorFase2() {
        ContadorTentativaF2 = 0;
    }

    public static void main(String[] args) {
        if (ContadorTentativaF2 == 3) {
            if (ContadorAcertoF2 < 2) {
                SegundoJogar.zeraTentativaF2();
                ContadorTentativaF2 = 1; // Set ContadorAcertoF2 to 1
            }
        }
    }

    public static void QuitGame() {
        ContadorTentativaF1 = 0;
        ContadorTentativaF2 = 0;
        ContadorTentativaF3 = 0;
        ContadorTentativaF4 = 0;
        ContadorTentativaF5 = 0;
        ContadorTentativaF6 = 0;
        ContadorAcertoF1 = 0;
        ContadorAcertoF2 = 0;
        ContadorAcertoF3 = 0;
        ContadorAcertoF4 = 0;
        ContadorAcertoF5 = 0;
        ContadorAcertoF6 = 0;
        ContadorTentativaFinal = 0;
    }

    public static void mandaContadores() throws Exception {
        Login login = new Login();
        String ra = login.getRaLoginTextField().getText();
        
        String sql = "INSERT INTO usuariojogo (ra, id_Jogo, Tentativas, AcertosFase1, AcertosFase2, AcertosFase3, AcertosFase4, AcertosFase5, AcertosFase6) "
                + "VALUES (?, 1, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = loginandsignup.MySQL.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, ra); // Substitua "ra" pelo valor adequado para o RA
            statement.setInt(2, ContadorTentativaFinal);
            statement.setInt(3, ContadorAcertoF1);
            statement.setInt(4, ContadorAcertoF2);
            statement.setInt(5, ContadorAcertoF3);
            statement.setInt(6, ContadorAcertoF4);
            statement.setInt(7, ContadorAcertoF5);
            statement.setInt(8, ContadorAcertoF6);

            statement.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
