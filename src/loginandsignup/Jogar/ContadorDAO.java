
package loginandsignup.Jogar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ContadorDAO {
    
    public void salvarPontos(String ra) throws Exception {
        System.out.println(ra);
        String sql = "INSERT INTO usuariojogo (ra, id_Jogo, Tentativas, AcertosFase1, AcertosFase2, AcertosFase3, AcertosFase4, AcertosFase5, AcertosFase6) "
                + "VALUES (?, 1, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = loginandsignup.MySQL.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, ra); // Substitua "ra" pelo valor adequado para o RA
            statement.setInt(2, Contadores.ContadorTentativaFinal);
            statement.setInt(3, Contadores.ContadorAcertoF1);
            statement.setInt(4, Contadores.ContadorAcertoF2);
            statement.setInt(5, Contadores.ContadorAcertoF3);
            statement.setInt(6, Contadores.ContadorAcertoF4);
            statement.setInt(7, Contadores.ContadorAcertoF5);
            statement.setInt(8, Contadores.ContadorAcertoF6);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
