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

public class PrimeiroJogar extends javax.swing.JFrame {

    private String respostaCorreta;
    private String alternativaCorreta;

    private JRadioButton[] botoes;

    public PrimeiroJogar() {

        initComponents();
        setaPergunta();
        setaContador();

        botoes = new JRadioButton[]{jRadioButton2, jRadioButton5, jRadioButton6, jRadioButton7};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ContQ = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        Q1 = new javax.swing.JTextField();
        NextQuestion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton1");

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("____________________________________________________________________________________");

        jLabel11.setFont(new java.awt.Font("Wide Latin", 1, 38)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PYTEACH");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

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

        ContQ.setEditable(false);
        ContQ.setBackground(new java.awt.Color(0, 102, 153));
        ContQ.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 60)); // NOI18N
        ContQ.setBorder(null);
        ContQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ContQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ContQ, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        Q1.setEditable(false);
        Q1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Q1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null));
        Q1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                Q1AncestorRemoved(evt);
            }
        });
        Q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q1ActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel1.setText("1ª FASE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton6)
                                        .addComponent(jRadioButton7))
                                    .addGap(41, 41, 41))))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addGap(14, 14, 14)
                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
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

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
    }//GEN-LAST:event_jRadioButton7ActionPerformed

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
            Contadores.ContadorTentativaF1++;
            Contadores.ContadorAcertoF1++;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            Contadores.ContadorTentativaFinal++;
            Contadores.ContadorTentativaF1++;
        }

        //Validação para próxima fase ou não
        if (Contadores.ContadorTentativaF1 == 3) {
            if (Contadores.ContadorAcertoF1 >= 2) {
                SegundoJogar SegundoJogarFrame = new SegundoJogar();
                SegundoJogarFrame.setVisible(true);
                SegundoJogarFrame.pack();
                SegundoJogarFrame.setLocationRelativeTo(null);
                this.dispose();
            } else if (Contadores.ContadorAcertoF1 < 2) {
                Contadores.zeraContadores();
                Contadores.ContadorTentativaF1 = 0;
                PrimeiroJogar PrimeiroJogarFrame = new PrimeiroJogar();
                PrimeiroJogarFrame.setVisible(true);
                PrimeiroJogarFrame.pack();
                PrimeiroJogarFrame.setLocationRelativeTo(null);
                this.dispose();
            }
        } else {
            PrimeiroJogar PrimeiroJogarFrame = new PrimeiroJogar();
            PrimeiroJogarFrame.setVisible(true);
            PrimeiroJogarFrame.pack();
            PrimeiroJogarFrame.setLocationRelativeTo(null);
            this.dispose();
        }


    }//GEN-LAST:event_NextQuestionActionPerformed

    private void Q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q1ActionPerformed


    }//GEN-LAST:event_Q1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Caso usuário saia
        //Contadores.QuitGame();
        
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

    private void Q1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Q1AncestorRemoved
    }//GEN-LAST:event_Q1AncestorRemoved

    private void ContQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContQActionPerformed
    }//GEN-LAST:event_ContQActionPerformed

    public final void setaPergunta() {
        // Colocando perguntas nivel 1 dentro da lista
        List<Integer> facil = new ArrayList<>();
        for (int i = 1; i <= 17; i++) {
            if (i != 14) {
                facil.add(i);
            }
        }
        for (int i = 110; i <= 122; i++) {
            facil.add(i);
        }

        // Escolher 6 elementos aleatórios para as questões da fase 1 e 2
        List<Integer> aleatorios = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            aleatorios.add(facil.get(random.nextInt(facil.size())));
        }
        int primeiraQ = aleatorios.get(0);

        // PreparedStatement para pergunta
        try (Connection con = MySQL.getConnection()) {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM pergunta WHERE id_Pergunta = ?");
            stmt.setInt(1, primeiraQ);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String pergunta = rs.getString("pergunta");
                Q1.setText(pergunta);

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
            botoes[0] = jRadioButton2;
            botoes[1] = jRadioButton5;
            botoes[2] = jRadioButton6;
            botoes[3] = jRadioButton7;

            for (int i = 0; i < 4; i++) {
                botoes[i].setText(alternativas.get(i));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public final void setaContador() {
        String contadorTentativaF1String = Integer.toString(Contadores.ContadorTentativaF1 + 1);
        //JOptionPane.showMessageDialog(null, contadorTentativaF1String);
        ContQ.setText(contadorTentativaF1String + ".");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContQ;
    private javax.swing.JButton NextQuestion;
    private javax.swing.JTextField Q1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    // End of variables declaration//GEN-END:variables
}
