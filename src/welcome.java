
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class welcome extends javax.swing.JFrame {

    public welcome() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        lb.setText("WELCOME " + global.admin_name);
        setSize(d);
        photolb3.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back02.jpg");
        Image img = i1.getImage().getScaledInstance(photolb3.getWidth(), photolb3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb3.setIcon(i2);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        jbooking = new javax.swing.JButton();
        photolb3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        lb.setForeground(new java.awt.Color(204, 204, 0));
        lb.setText("Welcome");
        getContentPane().add(lb);
        lb.setBounds(530, 40, 430, 60);

        bt.setBackground(new java.awt.Color(204, 255, 255));
        bt.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        bt.setText("Change Password");
        bt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        bt.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(420, 280, 400, 50);

        bt3.setBackground(new java.awt.Color(204, 255, 255));
        bt3.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        bt3.setText("Manage Car");
        bt3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        bt3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(420, 180, 400, 50);

        bt1.setBackground(new java.awt.Color(204, 255, 255));
        bt1.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        bt1.setText("LogOut");
        bt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        bt1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(420, 480, 400, 50);

        jbooking.setBackground(new java.awt.Color(204, 255, 255));
        jbooking.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jbooking.setText("Bookings");
        jbooking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        jbooking.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbookingActionPerformed(evt);
            }
        });
        getContentPane().add(jbooking);
        jbooking.setBounds(420, 380, 400, 50);

        photolb3.setText("jLabel1");
        getContentPane().add(photolb3);
        photolb3.setBounds(1220, 20, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        change_password obj = new change_password();
    }//GEN-LAST:event_btActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        manage_car obj3 = new manage_car();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        dispose();
        adminlogin obj4 = new adminlogin();
    }//GEN-LAST:event_bt1ActionPerformed

    private void jbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbookingActionPerformed
        admin_booking_history obj = new admin_booking_history();
    }//GEN-LAST:event_jbookingActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt3;
    private javax.swing.JButton jbooking;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel photolb3;
    // End of variables declaration//GEN-END:variables
}
