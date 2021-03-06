
package platformer;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author jorda
 */
public class GameForm extends javax.swing.JFrame {

    /**
     * Creates new form GameForm
     */
            
                        //hp  atk
    Game g = new Game();
    Player p = g.getPlayer();
    ArrayList<Enemy> enemyList = g.getEnemyList();
    
    
    public GameForm() {
        initComponents();
        
        g.shuffleEnemies(enemyList);
        Enemy currEnemy = enemyList.remove(0);
        
        
        gameOverLabel.setVisible(false);
        gameOverButton.setVisible(false);
        

        
        enemyName.setText(currEnemy.getName());
        enemyHp.setText(String.valueOf(currEnemy.getHp()));
        enemyAtk.setText(String.valueOf(currEnemy.getAtk()));
        
        playerAtk.setText("ATK: " + String.valueOf(p.getAtk()));
        playerHp.setText("HP: " + String.valueOf(p.getHp()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GamePanel = new javax.swing.JPanel();
        playerTitleLabel = new javax.swing.JLabel();
        playerHp = new javax.swing.JLabel();
        playerAtk = new javax.swing.JLabel();
        decHp = new javax.swing.JButton();
        incAtk = new javax.swing.JButton();
        gameOverLabel = new javax.swing.JLabel();
        gameOverButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enemyName = new javax.swing.JLabel();
        enemyHp = new javax.swing.JLabel();
        enemyAtk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        GamePanel.setRequestFocusEnabled(false);

        playerTitleLabel.setText("Player Stats");

        decHp.setText("Decrement HP");
        decHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decHpActionPerformed(evt);
            }
        });

        incAtk.setText("Increment ATK");
        incAtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incAtkActionPerformed(evt);
            }
        });

        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setText("GAME OVER");

        gameOverButton.setText("EXIT");
        gameOverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameOverButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enemy");

        javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(GamePanel);
        GamePanel.setLayout(GamePanelLayout);
        GamePanelLayout.setHorizontalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerAtk, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(playerHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerTitleLabel)))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(decHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(incAtk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(gameOverButton))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(gameOverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1)))
                .addGap(139, 139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addComponent(enemyHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enemyAtk))
                    .addComponent(enemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        GamePanelLayout.setVerticalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(decHp)
                .addGap(18, 18, 18)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(incAtk)
                    .addComponent(jLabel1))
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GamePanelLayout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(playerTitleLabel))
                            .addGroup(GamePanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(enemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(GamePanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(gameOverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GamePanelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(enemyHp)
                                            .addComponent(enemyAtk))))))
                        .addGap(34, 34, 34)
                        .addComponent(playerHp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(gameOverButton)
                        .addGap(51, 51, 51)))
                .addComponent(playerAtk, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void decHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decHpActionPerformed
        
        p.setHp( p.getHp()-1 );
        playerHp.setText("HP: " + String.valueOf(p.getHp()));
        
        if(p.getHp() <= 0){ // player is dead
            incAtk.setEnabled(false);
            decHp.setEnabled(false);
            gameOverLabel.setVisible(true);
            gameOverButton.setVisible(true);
        }
        
    }//GEN-LAST:event_decHpActionPerformed

    private void incAtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incAtkActionPerformed
        p.setAtk( p.getAtk()+1 );
        playerAtk.setText("ATK: " + String.valueOf(p.getAtk()));
    }//GEN-LAST:event_incAtkActionPerformed

    private void gameOverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameOverButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_gameOverButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GamePanel;
    private javax.swing.JButton decHp;
    private javax.swing.JLabel enemyAtk;
    private javax.swing.JLabel enemyHp;
    private javax.swing.JLabel enemyName;
    private javax.swing.JButton gameOverButton;
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JButton incAtk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel playerAtk;
    private javax.swing.JLabel playerHp;
    private javax.swing.JLabel playerTitleLabel;
    // End of variables declaration//GEN-END:variables
}
