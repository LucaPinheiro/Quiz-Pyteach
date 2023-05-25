package loginandsignup.Jogar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import loginandsignup.MySQL;
import javax.swing.*;
import loginandsignup.MenuPrinc;

public class QuartoJogar extends javax.swing.JFrame {

    private String respostaCorreta;
    private String alternativaCorreta;
    private JRadioButton[] botoes;

    public QuartoJogar() {
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
        QF4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ContTF4 = new javax.swing.JTextField();
        NextQuestion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        QF4.setEditable(false);
        QF4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        QF4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null));
        QF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QF4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(0, 102, 153));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("____________________________________________________________________________________");

        jLabel12.setFont(new java.awt.Font("Wide Latin", 1, 38)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PYTEACH");

        ContTF4.setEditable(false);
        ContTF4.setBackground(new java.awt.Color(0, 102, 153));
        ContTF4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 60)); // NOI18N
        ContTF4.setBorder(null);
        ContTF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContTF4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ContTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)))
                .addContainerGap(800, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ContTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NextQuestion.setText("Próxima");
        NextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextQuestionActionPerformed(evt);
            }
        });

        jButton1.setText("Retornar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel1.setText("4ª FASE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(QF4, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QF4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QF4ActionPerformed

    }//GEN-LAST:event_QF4ActionPerformed

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
            Contadores.ContadorTentativaF4++;
            Contadores.ContadorAcertoF4++;
        } else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            Contadores.ContadorTentativaF4++;
            Contadores.ContadorTentativaFinal++;
        }

        //Validação para próxima fase ou não
        if (Contadores.ContadorTentativaF4 == 3) {
            if (Contadores.ContadorAcertoF4 >= 2) {
                QuintoJogar q = new QuintoJogar();
                q.setVisible(true);
                q.pack();
                q.setLocationRelativeTo(null);
                this.dispose();
            } else if (Contadores.ContadorAcertoF4 < 2) {
                Contadores.zeraContadores();
                Contadores.ContadorTentativaF4 = 0;
                QuartoJogar q = new QuartoJogar();
                q.setVisible(true);
                q.pack();
                q.setLocationRelativeTo(null);
                this.dispose();
            }
        } else {
            QuartoJogar q = new QuartoJogar();
            q.setVisible(true);
            q.pack();
            q.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_NextQuestionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Validação para sair ou não do game

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

    private void ContTF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContTF4ActionPerformed
    }//GEN-LAST:event_ContTF4ActionPerformed

    public final void setaPergunta() {
        // Colocando perguntas nivel 2 dentro da lista
        List<Integer> medio = new ArrayList<>();
        for (int i = 18; i <= 24; i++) {
            if (i != 14) {
                medio.add(i);
            }
        }
        for (int c = 29; c <= 34; c++) {
            medio.add(c);
        }
        medio.add(27);
        for (int i = 123; i <= 133; i++) {
            medio.add(i);
        }

        // Escolher 3 elementos aleatórios para as questões da fase 4 
        List<Integer> aleatorios = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            aleatorios.add(medio.get(random.nextInt(medio.size())));
        }
        int primeiraQ = aleatorios.get(0);

        // PreparedStatement para pergunta
        try (Connection con = MySQL.getConnection()) {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM pergunta WHERE id_Pergunta = ?");
            stmt.setInt(1, primeiraQ);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String pergunta = rs.getString("pergunta");
                QF4.setText(pergunta);

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

    public final void setaContador() {
        String contadorTentativaF4String = Integer.toString(Contadores.ContadorTentativaF4 + 1);
        ContTF4.setText(contadorTentativaF4String + ".");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContTF4;
    private javax.swing.JButton NextQuestion;
    private javax.swing.JTextField QF4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
