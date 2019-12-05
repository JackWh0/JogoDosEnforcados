package view;

public class SelecaoTema extends javax.swing.JFrame {

    TelaJogo telaJogo;
    
    public void pegarTelaJogo(TelaJogo tela){
        telaJogo = tela;
    }

    public SelecaoTema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelecioneOTema = new javax.swing.JLabel();
        btnJogos = new javax.swing.JButton();
        btnProgramacao = new javax.swing.JButton();
        btnTimes = new javax.swing.JButton();
        btnSeries = new javax.swing.JButton();
        btnAnime = new javax.swing.JButton();
        btnFilme = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Forca");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSelecioneOTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lblSelecioneOTema.png"))); // NOI18N
        getContentPane().add(lblSelecioneOTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        btnJogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnJogos.png"))); // NOI18N
        btnJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogosActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 260, 60));

        btnProgramacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnProgramacao.png"))); // NOI18N
        btnProgramacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProgramacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 260, 60));

        btnTimes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnTimes.png"))); // NOI18N
        btnTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimesActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 260, 60));

        btnSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSeries.png"))); // NOI18N
        btnSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeriesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 260, 60));

        btnAnime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAnimes.png"))); // NOI18N
        btnAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 260, 60));

        btnFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnFilmes.png"))); // NOI18N
        btnFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeActionPerformed(evt);
            }
        });
        getContentPane().add(btnFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 260, 60));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_Jogo.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogosActionPerformed
        telaJogo.definirTema("JOGOS");
        telaJogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJogosActionPerformed

    private void btnTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimesActionPerformed
        telaJogo.definirTema("TIMES");
        telaJogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTimesActionPerformed

    private void btnProgramacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramacaoActionPerformed
        telaJogo.definirTema("PROGRAMAÇÃO");
        telaJogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProgramacaoActionPerformed

    private void btnAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimeActionPerformed
        telaJogo.definirTema("ANIMES");
        telaJogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnimeActionPerformed

    private void btnFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeActionPerformed
        telaJogo.definirTema("FILMES");
        telaJogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFilmeActionPerformed

    private void btnSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeriesActionPerformed
        telaJogo.definirTema("SERIES");
        telaJogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeriesActionPerformed

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
            java.util.logging.Logger.getLogger(SelecaoTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecaoTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecaoTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecaoTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecaoTema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAnime;
    private javax.swing.JButton btnFilme;
    private javax.swing.JButton btnJogos;
    private javax.swing.JButton btnProgramacao;
    private javax.swing.JButton btnSeries;
    private javax.swing.JButton btnTimes;
    private javax.swing.JLabel lblSelecioneOTema;
    // End of variables declaration//GEN-END:variables
}
