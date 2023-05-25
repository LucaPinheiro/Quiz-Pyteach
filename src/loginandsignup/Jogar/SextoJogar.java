package loginandsignup.Jogar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import loginandsignup.MySQL;
import javax.swing.*;
import loginandsignup.Login;
import loginandsignup.MenuPrinc;

public class SextoJogar extends javax.swing.JFrame {

    private String respostaCorreta;
    private String alternativaCorreta;
    private JRadioButton[] botoes;

    public SextoJogar() {
        initComponents();
        setaPergunta();
        setaContador();
        botoes = new JRadioButton[]{jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        QF6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ContTF6 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        NextQuestion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fase 6");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        QF6.setEditable(false);
        QF6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        QF6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null));
        QF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QF6ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(0, 102, 153));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("____________________________________________________________________________________");

        jLabel12.setFont(new java.awt.Font("Wide Latin", 1, 38)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PYTEACH");

        ContTF6.setEditable(false);
        ContTF6.setBackground(new java.awt.Color(0, 102, 153));
        ContTF6.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 60)); // NOI18N
        ContTF6.setBorder(null);
        ContTF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContTF6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ContTF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ContTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel1.setText("6ª FASE");

        NextQuestion.setText("Próxima");
        NextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextQuestionActionPerformed(evt);
            }
        });

        jButton1.setText("Retornar Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(QF6, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QF6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QF6ActionPerformed

    }//GEN-LAST:event_QF6ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void NextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextQuestionActionPerformed
        // obter o botão de opção selecionado pelo usuário
        JRadioButton selectedButton = null;
        for (JRadioButton button : botoes) {
            if (button.isSelected()) {
                selectedButton = button;
                break;
            }
        }

        // comparar a resposta selecionada com as alternativas da pergunta
        if (selectedButton != null && selectedButton.getText().equals(respostaCorreta)) {
            JOptionPane.showMessageDialog(null, "Resposta correta!");
            Contadores.ContadorTentativaFinal++;
            Contadores.ContadorTentativaF6++;
            Contadores.ContadorAcertoF6++;
        } else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            Contadores.ContadorTentativaF6++;
            Contadores.ContadorTentativaFinal++;
        }

        //Validação para passar de fase ou não
        if (Contadores.ContadorTentativaF6 == 3) {
            if (Contadores.ContadorAcertoF6 >= 2) {
                try {
                    ContadorDAO dao = new ContadorDAO();
                    dao.salvarPontos(Login.ra.trim());

                    FeedbackFinal f = new FeedbackFinal();
                    f.setVisible(true);
                    f.pack();
                    f.setLocationRelativeTo(null);
                    this.dispose();
                } catch (Exception ex) {
                    Logger.getLogger(SextoJogar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (Contadores.ContadorAcertoF6 < 2) {
                Contadores.zeraContadores();
                Contadores.ContadorTentativaF6 = 0;
                SextoJogar sframe = new SextoJogar();
                sframe.setVisible(true);
                sframe.pack();
                sframe.setLocationRelativeTo(null);
                this.dispose();
            }
        } else {
            SextoJogar sframe = new SextoJogar();
            sframe.setVisible(true);
            sframe.pack();
            sframe.setLocationRelativeTo(null);
            this.dispose();
        }

    }//GEN-LAST:event_NextQuestionActionPerformed

    public final void setaPergunta() {
        // Colocando perguntas nivel 3 dentro da lista
        List<Integer> dificil = new ArrayList<>();
        for (int i = 85; i <= 92; i++) {
            if (i != 90) {
                dificil.add(i);
            }
        }
        for (int i = 96; i <= 109; i++) {
            dificil.add(i);
        }
        dificil.add(80);
        dificil.add(81);
        dificil.add(94);
        dificil.add(96);

        // Escolher 3 elementos aleatórios para as questões da fase 5 
        List<Integer> aleatorios = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            aleatorios.add(dificil.get(random.nextInt(dificil.size())));
        }
        int primeiraQ = aleatorios.get(0);

        // PreparedStatement para pergunta
        try (Connection con = MySQL.getConnection()) {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM pergunta WHERE id_Pergunta = ?");
            stmt.setInt(1, primeiraQ);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String pergunta = rs.getString("pergunta");
                QF6.setText(pergunta);

                // Consulta SQL para obter a resposta correta da pergunta
                PreparedStatement stmt2 = con.prepareStatement("SELECT substring(resposta, 4) FROM resposta WHERE id_Pergunta = ? AND Correta = true;");
                stmt2.setInt(1, primeiraQ);
                ResultSet rs2 = stmt2.executeQuery();
                if (rs2.next()) {
                    respostaCorreta = rs2.getString("substring(resposta, 4)");
                }
            }

            // PreparedStatement para pergunta para as alternativas
            PreparedStatement stmt2 = con.prepareStatement("SELECT substring(resposta, 4) as resposta, id_Resposta, id_Pergunta FROM resposta WHERE id_Pergunta = ?");
            stmt2.setInt(1, primeiraQ);
            ResultSet rs2 = stmt2.executeQuery();

            ArrayList<String> alternativas = new ArrayList<>();
            while (rs2.next()) {
                String alternativa = rs2.getString("resposta");
                alternativas.add(alternativa);
            }

            //Collections.shuffle(alternativas);
            botoes = new JRadioButton[4];
            botoes[0] = jRadioButton1;
            botoes[1] = jRadioButton2;
            botoes[2] = jRadioButton3;
            botoes[3] = jRadioButton4;

            for (int i = 0; i < 4; i++) {
                botoes[i].setText(alternativas.get(i));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Validação para sair do jogo ou não
        String[] options = {"Sim", "Não"};

        int x = JOptionPane.showOptionDialog(null, "Deseja realmente Voltar ao menu? \n*progresso será perdido*",
                "Retornar ao Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);
        if (x == 0) {
            Contadores.QuitGame();
            JFrame MenuPrincFrame = (JFrame) new MenuPrinc();
            MenuPrincFrame.setVisible(true);
            MenuPrincFrame.pack();
            MenuPrincFrame.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ContTF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContTF6ActionPerformed
    }//GEN-LAST:event_ContTF6ActionPerformed

    public final void setaContador() {
        String contadorTentativaF6String = Integer.toString(Contadores.ContadorTentativaF6 + 1);
        ContTF6.setText(contadorTentativaF6String + ".");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContTF6;
    private javax.swing.JButton NextQuestion;
    private javax.swing.JTextField QF6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
