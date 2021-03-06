
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raziya
 */
public class VendingMachine extends javax.swing.JFrame {

    /**
     * Creates new form VendingMachine
     */
    public VendingMachine() {
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

//         Create the label and panel
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        
//         Create the Radio Buttons for the products being sold
        
        CokeRB = new javax.swing.JRadioButton();
        PepsiRB = new javax.swing.JRadioButton();
        SpriteRB = new javax.swing.JRadioButton();
        PepsiMaxRB = new javax.swing.JRadioButton();
        WaterRB = new javax.swing.JRadioButton();
        IceTeaRB = new javax.swing.JRadioButton();
        
//         Create the Purchase button, clear button, and cancel button
        purchaseBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        
//         Create the label
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        
//         Create the money text field and the change text field
        moneyTF = new javax.swing.JTextField();
        changeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Vending Machine");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select an item"));

//         Set the text for coke radio button
        CokeRB.setText("Coca Cola R10,00");
        CokeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CokeRBActionPerformed(evt);
            }
        });

//         Set the text for Pepsi radio button
        PepsiRB.setText("Pepsi R10,00");
        PepsiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepsiRBActionPerformed(evt);
            }
        });
        
//         Set the text for Sprite radio button
        SpriteRB.setText("Sprite R10,50");
        SpriteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpriteRBActionPerformed(evt);
            }
        });
        
//         Set the text for PepsiMax radio button
        PepsiMaxRB.setText("Pepsi Max R9,00");
        PepsiMaxRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepsiMaxRBActionPerformed(evt);
            }
        });
        
//         Set the text for Water radio button
        WaterRB.setText("Water R9,50");
        WaterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaterRBActionPerformed(evt);
            }
        });
        
//         Set the text for Ice Tea radio button
        IceTeaRB.setText("Ice Tea R12,00");
        IceTeaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IceTeaRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CokeRB)
                    .addComponent(PepsiRB))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PepsiMaxRB)
                    .addComponent(SpriteRB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IceTeaRB)
                    .addComponent(WaterRB))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CokeRB)
                    .addComponent(SpriteRB)
                    .addComponent(WaterRB))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PepsiRB)
                    .addComponent(PepsiMaxRB)
                    .addComponent(IceTeaRB))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        
//         Set the text for Purchase button
        purchaseBtn.setText("Purchase");
        purchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBtnActionPerformed(evt);
            }
        });
        
//         Set the text for Clear button
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        
//         Set the text for Cancel button
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        
        
//         Set the text for Insert money label
        jLabel2.setText("Insert money :");
        
//         Set the text for Change label
        jLabel3.setText("Change :");

//        Ensure change text field is not be editable 
        changeTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(purchaseBtn)
                                    .addGap(190, 190, 190)
                                    .addComponent(clearBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelBtn))
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moneyTF, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(changeTF))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(moneyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseBtn)
                    .addComponent(clearBtn)
                    .addComponent(cancelBtn))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // cancel selections
        
        System.exit(0);
        
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        
//         If no money is inserted, no purchase occurs.
        
        SpriteRB.setSelected(false);
        CokeRB.setSelected(false);
        WaterRB.setSelected(false);
        PepsiRB.setSelected(false);
        PepsiMaxRB.setSelected(false);
        IceTeaRB.setSelected(false);
        moneyTF.setText(" ");
        changeTF.setText(" ");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void CokeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CokeRBActionPerformed
        
        // changing radio buttons to select only one item
        // Ensure selection of one item per purchase 
        
        if(CokeRB.isSelected()){
            SpriteRB.setSelected(false);
            WaterRB.setSelected(false);
            PepsiRB.setSelected(false);
            PepsiMaxRB.setSelected(false);
            IceTeaRB.setSelected(false);
        }
    }//GEN-LAST:event_CokeRBActionPerformed

    private void SpriteRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpriteRBActionPerformed
        // changing radio buttons to select only one item
        
         if(SpriteRB.isSelected()){
            CokeRB.setSelected(false);
            WaterRB.setSelected(false);
            PepsiRB.setSelected(false);
            PepsiMaxRB.setSelected(false);
            IceTeaRB.setSelected(false);
        }
        
    }//GEN-LAST:event_SpriteRBActionPerformed

    private void WaterRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaterRBActionPerformed
        // changing radio buttons to select only one item
        
         if(WaterRB.isSelected()){
            CokeRB.setSelected(false);
            SpriteRB.setSelected(false);
            PepsiRB.setSelected(false);
            PepsiMaxRB.setSelected(false);
            IceTeaRB.setSelected(false);
        }
        
    }//GEN-LAST:event_WaterRBActionPerformed

    private void PepsiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepsiRBActionPerformed
          // changing radio buttons to select only one item
        
         if(PepsiRB.isSelected()){
            CokeRB.setSelected(false);
            SpriteRB.setSelected(false);
            WaterRB.setSelected(false);
            PepsiMaxRB.setSelected(false);
            IceTeaRB.setSelected(false);
        }
    }//GEN-LAST:event_PepsiRBActionPerformed

    private void PepsiMaxRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepsiMaxRBActionPerformed
          // changing radio buttons to select only one item
        
         if(PepsiMaxRB.isSelected()){
            CokeRB.setSelected(false);
            SpriteRB.setSelected(false);
            PepsiRB.setSelected(false);
            WaterRB.setSelected(false);
            IceTeaRB.setSelected(false);
        }
    }//GEN-LAST:event_PepsiMaxRBActionPerformed

    private void IceTeaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IceTeaRBActionPerformed
          // changing radio buttons to select only one item
        
         if(IceTeaRB.isSelected()){
            CokeRB.setSelected(false);
            SpriteRB.setSelected(false);
            PepsiRB.setSelected(false);
            PepsiMaxRB.setSelected(false);
            WaterRB.setSelected(false);
        }
    }//GEN-LAST:event_IceTeaRBActionPerformed

    private void purchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBtnActionPerformed
        // This pays for our purchase if we have enough money
        
        double money = 0;
        money = Double.parseDouble(moneyTF.getText());
        
        if (SpriteRB.isSelected()){
            money = money - 10.50;
        }else if (CokeRB.isSelected()){
            money = money - 10.00;
        }else if (PepsiRB.isSelected()){
            money = money - 10.00;
        }else if (PepsiMaxRB.isSelected()){
            money = money - 9.00;
        }else if (WaterRB.isSelected()){
            money = money - 9.50;
        }else if (IceTeaRB.isSelected()){
            money = money - 12.00;
        }
        
        if (money < 0){
            JOptionPane.showMessageDialog(rootPane, "Sorry you do not have enough money");
        }else{
            changeTF.setText(Double.toString(money));
        }
        
    }//GEN-LAST:event_purchaseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CokeRB;
    private javax.swing.JRadioButton IceTeaRB;
    private javax.swing.JRadioButton PepsiMaxRB;
    private javax.swing.JRadioButton PepsiRB;
    private javax.swing.JRadioButton SpriteRB;
    private javax.swing.JRadioButton WaterRB;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField changeTF;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moneyTF;
    private javax.swing.JButton purchaseBtn;
    // End of variables declaration//GEN-END:variables
}
