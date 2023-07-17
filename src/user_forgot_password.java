import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class user_forgot_password extends javax.swing.JFrame {

    String username;
   // String otp;

    public user_forgot_password() {
        initComponents();
        photolb.setBounds(0,0,500,500);
        ImageIcon i1 =  new ImageIcon("src/uploads/back2.jpg");
        Image img = i1.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(), Image.SCALE_SMOOTH);
        photolb.setIcon(new ImageIcon(img));
        jPanel1.setBounds(40, 100, 420, 130);
        jPanel2.setBounds(40, 100, 420, 130);
        jPanel3.setBounds(40, 100, 420, 150);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Forgot Password");
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jotp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jnewpassword = new javax.swing.JTextField();
        jconfirmpassword = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        photolb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Enter Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 200, 30);

        jLabel7.setText("Username");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 50, 80, 16);
        jPanel1.add(jusername);
        jusername.setBounds(200, 50, 150, 22);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generate otp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 90, 120, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 50, 420, 130);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel2.setText("Enter otp");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 50, 120, 20);

        jotp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jotpActionPerformed(evt);
            }
        });
        jPanel2.add(jotp);
        jotp.setBounds(200, 50, 150, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("Otp Verification");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(113, 10, 240, 28);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(140, 90, 130, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 200, 420, 120);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Set New Password");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(120, 10, 210, 30);

        jLabel4.setText("New Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 60, 140, 16);

        jLabel5.setText("Confirm New password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 90, 150, 16);
        jPanel3.add(jnewpassword);
        jnewpassword.setBounds(260, 50, 130, 22);
        jPanel3.add(jconfirmpassword);
        jconfirmpassword.setBounds(260, 90, 130, 22);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(140, 120, 140, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 340, 420, 150);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USER FORGOT PASSWORD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 10, 340, 30);

        photolb.setText("jLabel9");
        getContentPane().add(photolb);
        photolb.setBounds(10, 0, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jotpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jotpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jotpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        username = jusername.getText();
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a Username");
        } else {
            try {
                HttpResponse<String> res;
                res = Unirest.get("http://localhost:9000/user-forgot-password")
                        .queryString("username", username)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    if (ans.equals("fails")) {
                        JOptionPane.showMessageDialog(this, "No User found with this username");
                    } else {
                       // otp = ans;
                        JOptionPane.showMessageDialog(this,"otp sent to registered mobile no");
                        jPanel1.setVisible(false);
                        jPanel2.setVisible(true);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String otpfield = jotp.getText();
        if (otpfield.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter an otp");
        } else {
            if (otpfield.equals(global.otp)) {
                global.otp="";
                jPanel2.setVisible(false);
                jPanel3.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Correct otp");
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String newpassword = jnewpassword.getText();
        String confirmnewpassword = jconfirmpassword.getText();
        if (newpassword.isEmpty() || confirmnewpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all the field");
        } else {
            if (newpassword.equals(confirmnewpassword)) {
                try {
                    HttpResponse<String> res = Unirest.get("http://localhost:9000/set-new-password")
                            .queryString("username", username)
                            .queryString("newPassword", newpassword)
                            .asString();
                    if (res.getStatus() == 200) {
                        String ans = res.getBody();
//                        JOptionPane.showMessageDialog(this, ans);
                        if (ans.equals("updated")) {
                            JOptionPane.showMessageDialog(this, "Password Updated Successfully");
                            dispose();
                            signinlogin obj = new signinlogin();
                        } else {
                            JOptionPane.showMessageDialog(this, "Something went wrong!! Error Occured");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "New Password and Confirm New Password must be same");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_forgot_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jconfirmpassword;
    private javax.swing.JTextField jnewpassword;
    private javax.swing.JTextField jotp;
    private javax.swing.JTextField jusername;
    private javax.swing.JLabel photolb;
    // End of variables declaration//GEN-END:variables
}
