import java.awt.Color;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
///done
public class vmm1 extends javax.swing.JFrame {

    String total_rent;

    public vmm1(String total) {
        initComponents();
        total_rent = total;
        setSize(500, 500);
        jrent.setText("Rs." + total_rent);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        ImageIcon icon = new ImageIcon("src/images/car4.jpg");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Image resizeimage = icon.getImage().getScaledInstance(jphoto.getWidth(), jphoto.getHeight(), SCALE_SMOOTH);

        jphoto.setIcon(new ImageIcon(resizeimage));
        jPanel2.setSize(500, 150);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Proceed = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jmobile = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jrent = new javax.swing.JLabel();
        jphoto = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Proceed.setBackground(new java.awt.Color(255, 51, 51));
        Proceed.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Proceed.setForeground(new java.awt.Color(0, 0, 102));
        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        getContentPane().add(Proceed);
        Proceed.setBounds(10, 380, 460, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("This payment is secured by razorpay");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 360, 470, 16);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+91" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(165, 170, 70, 40);

        jmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmobileActionPerformed(evt);
            }
        });
        getContentPane().add(jmobile);
        jmobile.setBounds(250, 170, 208, 40);
        getContentPane().add(jemail);
        jemail.setBounds(250, 250, 208, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("E-Mail");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 250, 122, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 170, 110, 40);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel7.setText("Booking Fluent");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(188, 0, 276, 36);

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel8.setText("Cab Booking");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(188, 48, 276, 31);

        jrent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrent.setText("Rs");
        jPanel2.add(jrent);
        jrent.setBounds(188, 85, 159, 43);
        jPanel2.add(jphoto);
        jphoto.setBounds(36, 14, 100, 90);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 470, 147);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String phone;
    String email;
    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
        phone = jmobile.getText();
        global.payment_mobile = phone;
        email = jemail.getText();
        if (phone.length() != 10 || email.indexOf("@") > email.indexOf(".") || email.indexOf("@") == -1 || email.indexOf(".") == -1) {
            JOptionPane.showMessageDialog(null, "Enter Correct Details");
        } else {
            dispose();
            new vmm2(phone, email,total_rent).setVisible(true);
        }
    }//GEN-LAST:event_ProceedActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmobileActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vmm1("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jmobile;
    private javax.swing.JLabel jphoto;
    private javax.swing.JLabel jrent;
    // End of variables declaration//GEN-END:variables
}
