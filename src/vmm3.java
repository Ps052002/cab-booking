
import java.awt.Color;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Btech
 */
public class vmm3 extends javax.swing.JFrame {

    /**
     * Creates new form vmm3
     */
    String email;
    String bank_name;
    String total_rent;
    String totalrent;
    public vmm3(String phone, String email, String bank_name,String total) {
        initComponents();
        
        setSize(415, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);
        jPanel1.setBackground(Color.yellow);
        this.email = email;
        lb_phone.setText(phone);
        jrent.setText("Rs. "+total);
        bt_pay.setText("Pay Rs. "+total);
        ImageIcon icon = new ImageIcon("src/images/vmm_logo.jpg");
//Code to resize image inside label namely(jphoto)
        Image resizeimage = icon.getImage().getScaledInstance(jphoto.getWidth(), jphoto.getHeight(), SCALE_SMOOTH);

        jphoto.setIcon(new ImageIcon(resizeimage));
        setVisible(true);

        ImageIcon icon1 = new ImageIcon("src/images/kotak.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage1 = icon1.getImage().getScaledInstance(lb_photo1.getWidth(), lb_photo1.getHeight(), SCALE_SMOOTH);

        lb_photo1.setIcon(new ImageIcon(resizeimage1));

        ImageIcon icon2 = new ImageIcon("src/images/axis.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage2 = icon2.getImage().getScaledInstance(lb_photo2.getWidth(), lb_photo2.getHeight(), SCALE_SMOOTH);

        lb_photo2.setIcon(new ImageIcon(resizeimage2));

        ImageIcon icon3 = new ImageIcon("src/images/icici.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage3 = icon3.getImage().getScaledInstance(lb_photo3.getWidth(), lb_photo3.getHeight(), SCALE_SMOOTH);

        lb_photo3.setIcon(new ImageIcon(resizeimage3));

        ImageIcon icon4 = new ImageIcon("src/images/pnb.jpg");

//Code to resize image inside label namely(jphoto)
        Image resizeimage4 = icon4.getImage().getScaledInstance(lb_photo4.getWidth(), lb_photo4.getHeight(), SCALE_SMOOTH);

        lb_photo4.setIcon(new ImageIcon(resizeimage4));

        ImageIcon icon5 = new ImageIcon("src/images/sbi.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage5 = icon5.getImage().getScaledInstance(lb_photo5.getWidth(), lb_photo5.getHeight(), SCALE_SMOOTH);

        lb_photo5.setIcon(new ImageIcon(resizeimage5));

        ImageIcon icon6 = new ImageIcon("src/images/yes.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage6 = icon6.getImage().getScaledInstance(lb_photo6.getWidth(), lb_photo6.getHeight(), SCALE_SMOOTH);

        lb_photo6.setIcon(new ImageIcon(resizeimage6));

        bt_pay.setText("Pay Rs."+total +"(" + bank_name + ")");
        getContentPane().setBackground(Color.WHITE);
        setBackground(Color.WHITE);
        jPanel1.setBackground(Color.WHITE);
        
        setVisible(true);

    }

    public vmm3(String phone, String email,String total) {
        initComponents();
        setSize(415, 500);
        total_rent = total;
        totalrent = total+"";
        
        setLocationRelativeTo(null);
        this.email = email;
        lb_phone.setText(phone);
        jrent.setText(totalrent);
        bt_pay.setText("Pay Rs. "+total);
        ImageIcon icon = new ImageIcon("src/images/vmm_logo.jpg");
//Code to resize image inside label namely(jphoto)
        Image resizeimage = icon.getImage().getScaledInstance(jphoto.getWidth(), jphoto.getHeight(), SCALE_SMOOTH);

        jphoto.setIcon(new ImageIcon(resizeimage));
        setVisible(true);

        ImageIcon icon1 = new ImageIcon("src/images/kotak.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage1 = icon1.getImage().getScaledInstance(lb_photo1.getWidth(), lb_photo1.getHeight(), SCALE_SMOOTH);

        lb_photo1.setIcon(new ImageIcon(resizeimage1));

        ImageIcon icon2 = new ImageIcon("src/images/axis.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage2 = icon2.getImage().getScaledInstance(lb_photo2.getWidth(), lb_photo2.getHeight(), SCALE_SMOOTH);

        lb_photo2.setIcon(new ImageIcon(resizeimage2));

        ImageIcon icon3 = new ImageIcon("src/images/icici.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage3 = icon3.getImage().getScaledInstance(lb_photo3.getWidth(), lb_photo3.getHeight(), SCALE_SMOOTH);

        lb_photo3.setIcon(new ImageIcon(resizeimage3));

        ImageIcon icon4 = new ImageIcon("src/images/pnb.jpg");

//Code to resize image inside label namely(jphoto)
        Image resizeimage4 = icon4.getImage().getScaledInstance(lb_photo4.getWidth(), lb_photo4.getHeight(), SCALE_SMOOTH);

        lb_photo4.setIcon(new ImageIcon(resizeimage4));

        ImageIcon icon5 = new ImageIcon("src/images/sbi.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage5 = icon5.getImage().getScaledInstance(lb_photo5.getWidth(), lb_photo5.getHeight(), SCALE_SMOOTH);

        lb_photo5.setIcon(new ImageIcon(resizeimage5));

        ImageIcon icon6 = new ImageIcon("src/images/yes.png");

//Code to resize image inside label namely(jphoto)
        Image resizeimage6 = icon6.getImage().getScaledInstance(lb_photo6.getWidth(), lb_photo6.getHeight(), SCALE_SMOOTH);
        
        lb_photo6.setIcon(new ImageIcon(resizeimage6));
        
        getContentPane().setBackground(Color.WHITE);
        setBackground(Color.WHITE);
        jPanel1.setBackground(Color.WHITE);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jrent = new javax.swing.JLabel();
        jphoto = new javax.swing.JLabel();
        lb_photo1 = new javax.swing.JLabel();
        lb_photo2 = new javax.swing.JLabel();
        lb_photo3 = new javax.swing.JLabel();
        lb_photo4 = new javax.swing.JLabel();
        lb_photo5 = new javax.swing.JLabel();
        lb_photo6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lb_phone = new javax.swing.JLabel();
        bt_pay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel7.setText("Booking Fluent");

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel8.setText("Cab Booking");

        jrent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrent.setText("Rs");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrent, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 147);

        lb_photo1.setText("lb_photo1");
        lb_photo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_photo1MouseClicked(evt);
            }
        });
        getContentPane().add(lb_photo1);
        lb_photo1.setBounds(10, 200, 90, 70);

        lb_photo2.setText("lb_photo2");
        lb_photo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_photo2MouseClicked(evt);
            }
        });
        getContentPane().add(lb_photo2);
        lb_photo2.setBounds(150, 200, 100, 70);

        lb_photo3.setText("lb_photo3");
        lb_photo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_photo3MouseClicked(evt);
            }
        });
        getContentPane().add(lb_photo3);
        lb_photo3.setBounds(290, 200, 100, 70);

        lb_photo4.setText("lb_photo4");
        lb_photo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_photo4MouseClicked(evt);
            }
        });
        getContentPane().add(lb_photo4);
        lb_photo4.setBounds(10, 290, 90, 70);

        lb_photo5.setText("lb_photo5");
        lb_photo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_photo5MouseClicked(evt);
            }
        });
        getContentPane().add(lb_photo5);
        lb_photo5.setBounds(150, 290, 100, 70);

        lb_photo6.setText("lb_photo6");
        lb_photo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_photo6MouseClicked(evt);
            }
        });
        getContentPane().add(lb_photo6);
        lb_photo6.setBounds(290, 290, 100, 70);

        jPanel1.setLayout(null);

        jLabel11.setBackground(new java.awt.Color(255, 51, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("< Netbanking");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 10, 160, 30);

        lb_phone.setBackground(new java.awt.Color(255, 51, 51));
        lb_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jPanel1.add(lb_phone);
        lb_phone.setBounds(230, 10, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 150, 400, 50);

        bt_pay.setBackground(new java.awt.Color(255, 51, 51));
        bt_pay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_pay.setText("Pay $100");
        bt_pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_payMouseClicked(evt);
            }
        });
        getContentPane().add(bt_pay);
        bt_pay.setBounds(0, 390, 400, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_photo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_photo1MouseClicked
        bank_name = "Kotak Bank";
        dispose();
        new vmm3(lb_phone.getText(), email, bank_name,totalrent).setVisible(true);
    }//GEN-LAST:event_lb_photo1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        dispose();
        new vmm2(lb_phone.getText(), email,totalrent).setVisible(true);

    }//GEN-LAST:event_jLabel11MouseClicked

    private void bt_payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_payMouseClicked
        dispose();
        new vmm4().setVisible(true);
    }//GEN-LAST:event_bt_payMouseClicked

    private void lb_photo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_photo2MouseClicked
        bank_name = "Axis Bank";
        dispose();
        new vmm3(lb_phone.getText(), email, bank_name,totalrent).setVisible(true);
    }//GEN-LAST:event_lb_photo2MouseClicked

    private void lb_photo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_photo3MouseClicked
        bank_name = "ICICI Bank";        // TODO add your handling code here:
        dispose();
        new vmm3(lb_phone.getText(), email, bank_name,totalrent).setVisible(true);
    }//GEN-LAST:event_lb_photo3MouseClicked

    private void lb_photo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_photo4MouseClicked
        bank_name = "PNB";
        dispose();
        new vmm3(lb_phone.getText(), email, bank_name,totalrent).setVisible(true);
    }//GEN-LAST:event_lb_photo4MouseClicked

    private void lb_photo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_photo5MouseClicked
        bank_name = "SBI";
        dispose();
        new vmm3(lb_phone.getText(), email, bank_name,totalrent).setVisible(true);
    }//GEN-LAST:event_lb_photo5MouseClicked

    private void lb_photo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_photo6MouseClicked
        bank_name = "Yes Bank";
        dispose();
        new vmm3(lb_phone.getText(), email, bank_name,totalrent).setVisible(true);
    }//GEN-LAST:event_lb_photo6MouseClicked

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
            java.util.logging.Logger.getLogger(vmm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vmm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vmm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vmm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vmm3("","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pay;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jphoto;
    private javax.swing.JLabel jrent;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_photo1;
    private javax.swing.JLabel lb_photo2;
    private javax.swing.JLabel lb_photo3;
    private javax.swing.JLabel lb_photo4;
    private javax.swing.JLabel lb_photo5;
    private javax.swing.JLabel lb_photo6;
    // End of variables declaration//GEN-END:variables
}
