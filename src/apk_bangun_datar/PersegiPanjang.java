
package apk_bangun_datar;


public class PersegiPanjang extends javax.swing.JFrame { 


    public PersegiPanjang() {
       initComponents();
        reset();
    } 
    
void reset(){
        tLebar.setText("");
        tPanjang.setText("");
        vKeliling.setText("");
        vLuas.setText("");
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tPanjang = new javax.swing.JTextField();
        tLebar = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        vLuas = new javax.swing.JTextField();
        vKeliling = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("PERSEGI PANJANG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("PANJANG");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("LEBAR");

        tPanjang.setBackground(new java.awt.Color(255, 204, 255));
        tPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPanjangActionPerformed(evt);
            }
        });

        tLebar.setBackground(new java.awt.Color(255, 204, 255));

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("HASIL");

        vLuas.setBackground(new java.awt.Color(255, 204, 255));

        vKeliling.setBackground(new java.awt.Color(255, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("LUAS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("KELILING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tPanjang))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(31, 31, 31)
                            .addComponent(tLebar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bHitung)
                            .addGap(18, 18, 18)
                            .addComponent(bReset)
                            .addGap(18, 18, 18)
                            .addComponent(bKembali)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bReset)
                    .addComponent(bKembali))
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
          double panjang = Double.parseDouble(tPanjang.getText());
      double lebar = Double.parseDouble(tLebar.getText());
       
       double luas = panjang*lebar;
       double keliling = 2 * (panjang+lebar);
       vLuas.setText(""+luas);
       vKeliling.setText(""+keliling);
    }//GEN-LAST:event_bHitungActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
        new HOME().setVisible(true); 
        dispose();
    }//GEN-LAST:event_bKembaliActionPerformed

    private void tPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPanjangActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersegiPanjang().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField tLebar;
    private javax.swing.JTextField tPanjang;
    private javax.swing.JTextField vKeliling;
    private javax.swing.JTextField vLuas;
    // End of variables declaration//GEN-END:variables
}
