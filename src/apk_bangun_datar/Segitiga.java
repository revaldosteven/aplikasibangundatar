
package apk_bangun_datar;


public class Segitiga extends javax.swing.JFrame { 


    public Segitiga() {
        initComponents();
        reset();
    } 
    void reset() {
        tAlas.setText("");
        tTinggi.setText("");
        tA.setText("");
        tB.setText("");
        tC.setText("");
        vKeliling.setText("");
        vLuas.setText("");
    } 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tAlas = new javax.swing.JTextField();
        tTinggi = new javax.swing.JTextField();
        tA = new javax.swing.JTextField();
        tB = new javax.swing.JTextField();
        tC = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LUAS = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vLuas = new javax.swing.JTextField();
        vKeliling = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("SEGITIGA");

        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("ALAS");

        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("TINGGI");

        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("SISI A");

        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("SISI B");

        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("SISI C");

        tAlas.setBackground(new java.awt.Color(255, 204, 255));

        tTinggi.setBackground(new java.awt.Color(255, 204, 255));

        tA.setBackground(new java.awt.Color(255, 204, 255));

        tB.setBackground(new java.awt.Color(255, 204, 255));

        tC.setBackground(new java.awt.Color(255, 204, 255));

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("HASIL");

        LUAS.setForeground(new java.awt.Color(153, 0, 153));
        LUAS.setText("LUAS");

        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("KELILING");

        vLuas.setBackground(new java.awt.Color(255, 204, 255));

        vKeliling.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tAlas, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(tTinggi)
                                    .addComponent(tA)
                                    .addComponent(tB)
                                    .addComponent(tC)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bHitung)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bReset)
                                        .addGap(28, 28, 28)
                                        .addComponent(bKembali))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel7))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LUAS)
                                    .addComponent(jLabel9))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
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
                    .addComponent(tAlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bReset)
                    .addComponent(bKembali))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LUAS)
                    .addComponent(vLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(vKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        double alas = Double.parseDouble(tAlas.getText());
        double tinggi = Double.parseDouble(tTinggi.getText());
         double a = Double.parseDouble(tA.getText());
          double b = Double.parseDouble(tB.getText());
           double c = Double.parseDouble(tC.getText());

        double luas = 0.5 * alas * tinggi;
        double keliling = a+b+c;
        vLuas.setText("" + luas);
       vKeliling.setText("" + keliling);
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
                new Segitiga().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LUAS;
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bKembali;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tA;
    private javax.swing.JTextField tAlas;
    private javax.swing.JTextField tB;
    private javax.swing.JTextField tC;
    private javax.swing.JTextField tTinggi;
    private javax.swing.JTextField vKeliling;
    private javax.swing.JTextField vLuas;
    // End of variables declaration//GEN-END:variables
}
