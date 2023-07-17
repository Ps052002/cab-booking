
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class adminlogin extends javax.swing.JFrame {

    public adminlogin() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println(d);
        setSize(d);
        photolb2.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back3.jpg");
        Image img = i1.getImage().getScaledInstance(photolb2.getWidth(), photolb2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb2.setIcon(i2);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        bt = new javax.swing.JButton();
        pf1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        photolb2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(0, 0, 102));
        lb1.setText("Username:");
        getContentPane().add(lb1);
        lb1.setBounds(500, 340, 130, 30);

        lb2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(0, 0, 102));
        lb2.setText("Password:");
        getContentPane().add(lb2);
        lb2.setBounds(500, 400, 130, 30);

        lb3.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        lb3.setForeground(new java.awt.Color(102, 0, 51));
        lb3.setText("LOGIN");
        getContentPane().add(lb3);
        lb3.setBounds(580, 190, 170, 60);

        tf1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(630, 340, 220, 30);

        bt.setBackground(new java.awt.Color(0, 51, 51));
        bt.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        bt.setForeground(new java.awt.Color(204, 204, 204));
        bt.setText("Login");
        bt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(255, 153, 153)));
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(620, 490, 130, 50);

        pf1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(pf1);
        pf1.setBounds(630, 400, 220, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(490, 300, 390, 160);

        photolb2.setText("jLabel1");
        getContentPane().add(photolb2);
        photolb2.setBounds(1230, 30, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed


    }//GEN-LAST:event_tf1ActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        String U = tf1.getText();
        String P = pf1.getText();
        if (U.equals("") || P.equals("")) {
            JOptionPane.showMessageDialog(this, "All Fields are mandatory!!");
        } else {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:9000/checklogin")
                        .queryString("username", U)
                        .queryString("password", P)
                        .asString();

                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    if(ans.equals("success")){
                        JOptionPane.showMessageDialog(this,"login successfull");
                        dispose();
                        global.admin_name = U;
                        welcome obj = new welcome();
                    }else{
                        JOptionPane.showMessageDialog(this, "Login failure");
                    }
                }
            } catch (Exception ex) {

            }

        }
    }//GEN-LAST:event_btActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JLabel photolb2;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables

    
}
