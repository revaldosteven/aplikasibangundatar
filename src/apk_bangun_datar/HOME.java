package apk_bangun_datar;

public class HOME extends javax.swing.JFrame {

    public HOME() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bPersegiPanjang = new javax.swing.JButton();
        bPersegi = new javax.swing.JButton();
        bLingkaran = new javax.swing.JButton();
        bSegitiga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("APLIKASI BANGUN DATAR");

        bPersegiPanjang.setBackground(new java.awt.Color(255, 204, 255));
        bPersegiPanjang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPersegiPanjang.setForeground(new java.awt.Color(255, 0, 255));
        bPersegiPanjang.setText("PERSEGI PANJANG");
        bPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiPanjangActionPerformed(evt);
            }
        });

        bPersegi.setBackground(new java.awt.Color(255, 204, 255));
        bPersegi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPersegi.setForeground(new java.awt.Color(255, 0, 255));
        bPersegi.setText("PERSEGI");
        bPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiActionPerformed(evt);
            }
        });

        bLingkaran.setBackground(new java.awt.Color(255, 204, 255));
        bLingkaran.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bLingkaran.setForeground(new java.awt.Color(255, 0, 255));
        bLingkaran.setText("LINGKARAN");
        bLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLingkaranActionPerformed(evt);
            }
        });

        bSegitiga.setBackground(new java.awt.Color(255, 204, 255));
        bSegitiga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSegitiga.setForeground(new java.awt.Color(255, 0, 255));
        bSegitiga.setText("SEGITIGA");
        bSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSegitigaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bPersegiPanjang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bSegitiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bLingkaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bPersegiPanjang)
                .addGap(18, 18, 18)
                .addComponent(bPersegi)
                .addGap(18, 18, 18)
                .addComponent(bLingkaran)
                .addGap(18, 18, 18)
                .addComponent(bSegitiga)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiPanjangActionPerformed
         new PersegiPanjang().setVisible(true); 
    }//GEN-LAST:event_bPersegiPanjangActionPerformed

    private void bPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiActionPerformed
         new Persegi().setVisible(true);
    }//GEN-LAST:event_bPersegiActionPerformed

    private void bLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLingkaranActionPerformed
       new Lingkaran().setVisible(true);
    }//GEN-LAST:event_bLingkaranActionPerformed

    private void bSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegitigaActionPerformed
       new Segitiga().setVisible(true); 
    }//GEN-LAST:event_bSegitigaActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLingkaran;
    private javax.swing.JButton bPersegi;
    private javax.swing.JButton bPersegiPanjang;
    private javax.swing.JButton bSegitiga;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
