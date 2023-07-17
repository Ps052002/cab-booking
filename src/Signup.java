
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        photolb.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back13.jpg");
        Image img = i1.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb.setIcon(i2);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        pf1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        pf2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        tfphone = new javax.swing.JTextField();
        lb7 = new javax.swing.JLabel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        LB1 = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        photolb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(204, 204, 255));
        lb2.setText("Username:");
        getContentPane().add(lb2);
        lb2.setBounds(440, 230, 130, 30);
        getContentPane().add(tf1);
        tf1.setBounds(620, 230, 204, 30);

        lb3.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(204, 204, 255));
        lb3.setText("Email:");
        getContentPane().add(lb3);
        lb3.setBounds(440, 280, 130, 30);
        getContentPane().add(tfemail);
        tfemail.setBounds(620, 280, 204, 30);

        lb4.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(204, 204, 255));
        lb4.setText("Password:");
        getContentPane().add(lb4);
        lb4.setBounds(440, 330, 160, 30);

        pf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf1ActionPerformed(evt);
            }
        });
        getContentPane().add(pf1);
        pf1.setBounds(620, 330, 204, 30);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Confirm Password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 380, 170, 30);

        pf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf2ActionPerformed(evt);
            }
        });
        getContentPane().add(pf2);
        pf2.setBounds(620, 380, 204, 30);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 430, 130, 30);

        tfphone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfphoneActionPerformed(evt);
            }
        });
        getContentPane().add(tfphone);
        tfphone.setBounds(620, 430, 204, 30);

        lb7.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        lb7.setForeground(new java.awt.Color(204, 204, 255));
        lb7.setText("Gender:");
        getContentPane().add(lb7);
        lb7.setBounds(440, 480, 130, 30);

        buttonGroup1.add(rd1);
        rd1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        rd1.setText("Male");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });
        getContentPane().add(rd1);
        rd1.setBounds(640, 480, 80, 30);

        buttonGroup1.add(rd2);
        rd2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        rd2.setForeground(new java.awt.Color(255, 255, 153));
        rd2.setText("Female");
        rd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd2ActionPerformed(evt);
            }
        });
        getContentPane().add(rd2);
        rd2.setBounds(730, 480, 80, 30);

        LB1.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        LB1.setForeground(new java.awt.Color(204, 255, 204));
        LB1.setText("SIGNUP");
        getContentPane().add(LB1);
        LB1.setBounds(540, 110, 180, 60);

        bt.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        bt.setForeground(new java.awt.Color(153, 0, 153));
        bt.setText("Sign up");
        bt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(570, 550, 110, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 100, 440, 510);

        photolb.setText("jLabel3");
        getContentPane().add(photolb);
        photolb.setBounds(1040, 50, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void pf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf1ActionPerformed
        
        
    }//GEN-LAST:event_pf1ActionPerformed

    private void pf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf2ActionPerformed

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd1ActionPerformed

    private void rd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd2ActionPerformed

    private void tfphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfphoneActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        
        String u = tf1.getText();
        String e = tfemail.getText();
        String p = pf1.getText();
        String cp = pf2.getText();
        String mn = tfphone.getText();
        String g = "";
        //String g=rd2.getText();
        if (rd1.isSelected()) {
            g = "male";
        } else {
            g = "female";
        }
        if (u.equals(" ") || e.equals("") || p.equals("") || cp.equals("") || mn.equals("")) {
            JOptionPane.showMessageDialog(this, "all fields are mandatory");
        } else if(!p.equals(cp)){
            JOptionPane.showMessageDialog(this,"password incorrect");
        }else if (mn.length() != 10 || e.indexOf("@") > e.indexOf(".") || e.indexOf("@") == -1 || e.indexOf(".") == -1) {
            JOptionPane.showMessageDialog(null, "Enter Correct Details");
        }else{
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:9000/Signup")
                        .queryString("username", u)
                        .queryString("email", e)
                        .queryString("password", p)
                        .queryString("confirm_password", cp)
                        .queryString("mobile_no", mn)
                        .queryString("gender", g)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    if (ans.equals("success")) {
                        JOptionPane.showMessageDialog(this, "signup successfull");
                        dispose();
                        global.user_name = u;
                        signinlogin obj = new signinlogin();
                    } else {
                        JOptionPane.showMessageDialog(this, "signup failed");
                    }
                } else {
                    System.out.println(res.getStatusText());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB1;
    private javax.swing.JButton bt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb7;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JLabel photolb;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfphone;
    // End of variables declaration//GEN-END:variables
}
