/*
Callum MacLeod
October 5th, 2018
Mr. Kaune ICS3U
*/
import java.text.DecimalFormat;


import java.text.DecimalFormat;
/**
 *
 * @author callu
 */
public class MakingPurchasesTwo extends javax.swing.JFrame {
 DecimalFormat x = new DecimalFormat ("#####.##");
//Rounding for decimals and making sure its a monetary number

    public MakingPurchasesTwo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        hstname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        subtotalOutput = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hstOutput = new javax.swing.JLabel();
        cappInput = new javax.swing.JTextField();
        grandTotalOutput = new javax.swing.JLabel();
        ameriInput = new javax.swing.JTextField();
        addInput = new javax.swing.JButton();
        esprInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        latteInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mochInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        machInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        subtotalname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 255));
        jLabel9.setText("Macchiato (2.80$):");

        hstname.setBackground(new java.awt.Color(0, 153, 153));
        hstname.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        hstname.setForeground(new java.awt.Color(102, 0, 255));
        hstname.setText("HST:");

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 255));
        jLabel10.setText("Latte (2.95$):");

        subtotalOutput.setBackground(new java.awt.Color(0, 153, 153));
        subtotalOutput.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        subtotalOutput.setForeground(new java.awt.Color(102, 0, 255));
        subtotalOutput.setText("0.00$");

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 255));
        jLabel11.setText("Espresso (2.70)$:");

        hstOutput.setBackground(new java.awt.Color(0, 153, 153));
        hstOutput.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        hstOutput.setForeground(new java.awt.Color(102, 0, 255));
        hstOutput.setText("0.00$");

        cappInput.setText("0");
        cappInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappInputActionPerformed(evt);
            }
        });

        grandTotalOutput.setBackground(new java.awt.Color(0, 153, 153));
        grandTotalOutput.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        grandTotalOutput.setForeground(new java.awt.Color(102, 0, 255));
        grandTotalOutput.setText("0.00$");

        ameriInput.setText("0");
        ameriInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ameriInputActionPerformed(evt);
            }
        });

        addInput.setText("ADD");
        addInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInputActionPerformed(evt);
            }
        });

        esprInput.setText("0");
        esprInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esprInputActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Callum's MacCoffee Shop");

        latteInput.setText("0");
        latteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latteInputActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Type the number of coffees you would like:");

        mochInput.setText("0");
        mochInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mochInputActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("Cappuccino (2.90$):");

        machInput.setText("0");
        machInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machInputActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 255));
        jLabel7.setText("Mocha (2.85$):");

        subtotalname.setBackground(new java.awt.Color(0, 153, 153));
        subtotalname.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        subtotalname.setForeground(new java.awt.Color(102, 0, 255));
        subtotalname.setText("Subtotal:");

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 255));
        jLabel8.setText("Americano (2.60$):");

        totalname.setBackground(new java.awt.Color(0, 153, 153));
        totalname.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        totalname.setForeground(new java.awt.Color(102, 0, 255));
        totalname.setText("Grand Total:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/the One.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ameriInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(latteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(machInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mochInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(esprInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(58, 58, 58)
                                        .addComponent(cappInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalname)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(grandTotalOutput))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hstname)
                                            .addComponent(subtotalname))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subtotalOutput)
                                            .addComponent(hstOutput)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(addInput))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cappInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addInput)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(ameriInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(esprInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(mochInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(machInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(subtotalname)
                                    .addComponent(subtotalOutput))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hstname)
                                    .addComponent(hstOutput))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalname)
                                    .addComponent(grandTotalOutput))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(latteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cappInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappInputActionPerformed

    }//GEN-LAST:event_cappInputActionPerformed

    private void ameriInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ameriInputActionPerformed

    }//GEN-LAST:event_ameriInputActionPerformed

    private void addInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInputActionPerformed
        final double MACCHIATO = 2.80;//setting final variables for coffee costs
        final double AMERICANO = 2.60;
        final double MOCHA = 2.85;
        final double LATTE = 2.95;
        final double CAPPUCCINO = 2.90;
        final double ESPRESSO = 2.70;
        
        
        
        int mach2;
        double machans;
        mach2 = Integer.parseInt(machInput.getText());
        machans = mach2*MACCHIATO;//Macchiato costs
        
        int moch2;
        double mochans;
        moch2 = Integer.parseInt(mochInput.getText());
        mochans = moch2*MOCHA;//Mocha costs

        
        int latte2;
        double latteans;
        latte2 = Integer.parseInt(latteInput.getText());
        latteans = latte2*LATTE;//Latte costs

        int capp2;
        double cappans;
        capp2 = Integer.parseInt(cappInput.getText());
        cappans = capp2*CAPPUCCINO;//Cappucino costs

        int espr2;
        double esprans;
        espr2 = Integer.parseInt(esprInput.getText());
        esprans = espr2*ESPRESSO;//Espresso costs
        
        int ameri2;
        double amerians;
        ameri2 = Integer.parseInt(ameriInput.getText());
        amerians = ameri2*AMERICANO;//Americano costs
        
        double subtotal = amerians+esprans+cappans+latteans+mochans+machans;
        subtotalOutput.setText(String.valueOf(x.format(subtotal)+"$"));//finding subtotal and printing
        double hst = subtotal*0.13;
        hstOutput.setText(String.valueOf(x.format(hst)+"$"));//finding tax and displaying
        double grandtotal = hst+subtotal;
        grandTotalOutput.setText(String.valueOf(x.format(grandtotal)+"$"));//finding grand total and displaying
        
    }//GEN-LAST:event_addInputActionPerformed

    private void esprInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esprInputActionPerformed

    }//GEN-LAST:event_esprInputActionPerformed

    private void latteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latteInputActionPerformed

    }//GEN-LAST:event_latteInputActionPerformed

    private void mochInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mochInputActionPerformed

    }//GEN-LAST:event_mochInputActionPerformed

    private void machInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machInputActionPerformed

    }//GEN-LAST:event_machInputActionPerformed

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
            java.util.logging.Logger.getLogger(MakingPurchasesTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakingPurchasesTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakingPurchasesTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakingPurchasesTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakingPurchasesTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInput;
    private javax.swing.JTextField ameriInput;
    private javax.swing.JTextField cappInput;
    private javax.swing.JTextField esprInput;
    private javax.swing.JLabel grandTotalOutput;
    private javax.swing.JLabel hstOutput;
    private javax.swing.JLabel hstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField latteInput;
    private javax.swing.JTextField machInput;
    private javax.swing.JTextField mochInput;
    private javax.swing.JLabel subtotalOutput;
    private javax.swing.JLabel subtotalname;
    private javax.swing.JLabel totalname;
    // End of variables declaration//GEN-END:variables
}
