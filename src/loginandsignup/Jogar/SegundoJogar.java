/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup.Jogar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JRadioButton;
import loginandsignup.MySQL;
import javax.swing.*;
import loginandsignup.MenuPrinc;

public class SegundoJogar extends javax.swing.JFrame {

    private String respostaCorreta;
    private String alternativaCorreta;
    private JRadioButton[] botoes;

    public SegundoJogar() {
        initComponents();
        setaPergunta();
        setaContador();
        botoes = new JRadioButton[]{jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4};

    }

    public static void zeraTentativaF2() {
        Contadores.ContadorTentativaF2 = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        QF2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ContTF2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        NextQuestion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        QF2.setEditable(false);
        QF2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        QF2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 153), null));
        QF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QF2ActionPerformed(evt);
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

        ContTF2.setEditable(false);
        ContTF2.setBackground(new java.awt.Color(0, 102, 153));
        ContTF2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 60)); // NOI18N
        ContTF2.setBorder(null);
        ContTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContTF2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ContTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
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
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ContTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
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
        jLabel1.setText("2ª FASE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(QF2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QF2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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

    private void QF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QF2ActionPerformed

    }//GEN-LAST:event_QF2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            Contadores.ContadorTentativaF2++;
            Contadores.ContadorAcertoF2++;
        } else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            Contadores.ContadorTentativaF2++;
            Contadores.ContadorTentativaFinal++;
        }

        //Validação para próxima fase ou não
        if (Contadores.ContadorTentativaF2 == 3) {
            if (Contadores.ContadorAcertoF2 >= 2) {
                TerceiroJogar t = new TerceiroJogar();
                t.setVisible(true);
                t.pack();
                t.setLocationRelativeTo(null);
                this.dispose();
            } else if (Contadores.ContadorAcertoF2 < 2) {
                Contadores.zeraContadores();
                Contadores.ContadorTentativaF2 = 0;
                SegundoJogar SegundoJogarFrame = new SegundoJogar();
                SegundoJogarFrame.setVisible(true);
                SegundoJogarFrame.pack();
                SegundoJogarFrame.setLocationRelativeTo(null);
                this.dispose();
            }
        } else {
            SegundoJogar SegundoJogarFrame = new SegundoJogar();
            SegundoJogarFrame.setVisible(true);
            SegundoJogarFrame.pack();
            SegundoJogarFrame.setLocationRelativeTo(null);
            this.dispose();
        }

    }//GEN-LAST:event_NextQuestionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Caso usuário queira ou não sair
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

    private void ContTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContTF2ActionPerformed

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

        // Escolher 6 elementos aleatórios para as questões da fase 2
        List<Integer> aleatorios = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
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
                QF2.setText(pergunta);

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
        String contadorTentativaF2String = Integer.toString(Contadores.ContadorTentativaF2 + 1);
        ContTF2.setText(contadorTentativaF2String + ".");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContTF2;
    private javax.swing.JButton NextQuestion;
    private javax.swing.JTextField QF2;
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

// Colocar um JoptionPane após o usuário termnar a terceira questão informando se ele passou ou não de fase.
