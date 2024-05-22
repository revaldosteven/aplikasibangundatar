
package apk_bangun_datar;


public class Lingkaran extends javax.swing.JFrame { 


    public Lingkaran() {
        initComponents();
        reset();
    } 
    void reset() {
        tJari.setText("");

        vkeliling.setText("");
        vLuas.setText("");

    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tJari = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vLuas = new javax.swing.JTextField();
        vkeliling = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("LINGKARAN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("JARI-JARI");

        tJari.setBackground(new java.awt.Color(255, 204, 255));
        tJari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJariActionPerformed(evt);
            }
        });

        bHitung.setBackground(new java.awt.Color(255, 204, 255));
        bHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apk_bangun_datar/calculator.png"))); // NOI18N
        bHitung.setText("HITUNG");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bReset.setBackground(new java.awt.Color(255, 204, 255));
        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apk_bangun_datar/refresh.png"))); // NOI18N
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bKembali.setBackground(new java.awt.Color(255, 204, 255));
        bKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apk_bangun_datar/left-arrow.png"))); // NOI18N
        bKembali.setText("KEMBALI");
        bKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembaliActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("LUAS");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("KELILING");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("HASIL");

        vLuas.setBackground(new java.awt.Color(255, 204, 255));

        vkeliling.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bHitung)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tJari)
                            .addComponent(vLuas)
                            .addComponent(vkeliling)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(bReset))
                                .addGap(18, 18, 18)
                                .addComponent(bKembali))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tJari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bReset)
                    .addComponent(bKembali))
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vkeliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tJariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJariActionPerformed
        
    }//GEN-LAST:event_tJariActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
       double jari = Double.parseDouble(tJari.getText());

        double luas = Math.PI * jari * jari;
        double keliling = 2 * Math.PI * jari;
        vLuas.setText(""+luas);
        vkeliling.setText(""+keliling);
    }//GEN-LAST:event_bHitungActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
         new HOME().setVisible(true);
        dispose();
    }//GEN-LAST:event_bKembaliActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lingkaran().setVisible(true);
            }
        });
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bKembali;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tJari;
    private javax.swing.JTextField vLuas;
    private javax.swing.JTextField vkeliling;
    // End of variables declaration//GEN-END:variables
}
