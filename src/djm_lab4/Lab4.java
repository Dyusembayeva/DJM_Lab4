/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djm_lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Lab4 extends javax.swing.JFrame {

    public Lab4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_text = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_result = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("ТЕКСТ:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 340, 20);

        jTextArea_text.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea_text.setColumns(20);
        jTextArea_text.setFont(new java.awt.Font("Sitka Banner", 3, 16)); // NOI18N
        jTextArea_text.setForeground(new java.awt.Color(102, 0, 102));
        jTextArea_text.setRows(5);
        jTextArea_text.setText("Привет\nКак твои дела?\nПривет\nВсё хорошо");
        jScrollPane1.setViewportView(jTextArea_text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 390, 187);

        jButton1.setText("Очистить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 490, 115, 23);

        jTextArea_result.setBackground(new java.awt.Color(204, 255, 204));
        jTextArea_result.setColumns(20);
        jTextArea_result.setFont(new java.awt.Font("Sitka Banner", 3, 16)); // NOI18N
        jTextArea_result.setForeground(new java.awt.Color(0, 51, 153));
        jTextArea_result.setRows(5);
        jScrollPane3.setViewportView(jTextArea_result);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 270, 390, 211);

        jButton3.setText("Найти");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 490, 115, 23);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("ВЫВОД:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 250, 300, 20);

        setSize(new java.awt.Dimension(449, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea_text.setText(null);
        jTextArea_result.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<String> words = new ArrayList<>();

        try {
            for (int i = 0; i < jTextArea_text.getLineCount(); i++) {
                int start = jTextArea_text.getLineStartOffset(i);
                int end = jTextArea_text.getLineEndOffset(i);
                String line = jTextArea_text.getText(start, end - start).trim();

                if (line.equals("")) {
                    continue;
                };
                words.add(line);
            }

            Map< String, Integer> occurrences = new TreeMap< String, Integer>(Collections.reverseOrder());

            for (String word : words) {
                Integer oldCount = occurrences.get(word);
                if (oldCount == null) {
                    oldCount = 0;
                }
                occurrences.put(word, oldCount + 1);
            }

            StringBuilder result = new StringBuilder();

            for (String key : occurrences.keySet()) {
                result.append("Слово " + key + " повторяется " + occurrences.get(key) + " раз" + "\n");
            }
            jTextArea_result.setText(result.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ошибка генерации",
                    "Ошибка чтения", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_result;
    private javax.swing.JTextArea jTextArea_text;
    // End of variables declaration//GEN-END:variables
}
