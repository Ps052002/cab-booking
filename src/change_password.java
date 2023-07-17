 
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class change_password extends javax.swing.JFrame {

    public change_password() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tf1.setText(global.admin_name);
        tf1.setEditable(false);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        photolb1.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/car7.jpg");
        Image img = i1.getImage().getScaledInstance(photolb1.getWidth(), photolb1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb1.setIcon(i2);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        ps1 = new javax.swing.JPasswordField();
        ps2 = new javax.swing.JPasswordField();
        ps3 = new javax.swing.JPasswordField();
        bt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        photolb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().setLayout(null);

        lb.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        lb.setForeground(new java.awt.Color(204, 204, 255));
        lb.setText("Reset Password");
        getContentPane().add(lb);
        lb.setBounds(410, 120, 390, 80);

        lb1.setBackground(new java.awt.Color(153, 153, 153));
        lb1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("User Name:");
        getContentPane().add(lb1);
        lb1.setBounds(370, 270, 180, 30);

        lb2.setBackground(new java.awt.Color(153, 153, 153));
        lb2.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Old Password:");
        getContentPane().add(lb2);
        lb2.setBounds(370, 320, 190, 30);

        lb3.setBackground(new java.awt.Color(153, 153, 153));
        lb3.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("New Password:");
        getContentPane().add(lb3);
        lb3.setBounds(370, 370, 180, 30);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm New Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 420, 220, 30);

        tf1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(600, 270, 230, 30);

        ps1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps1ActionPerformed(evt);
            }
        });
        getContentPane().add(ps1);
        ps1.setBounds(600, 320, 230, 30);

        ps2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(ps2);
        ps2.setBounds(600, 370, 230, 30);

        ps3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(ps3);
        ps3.setBounds(600, 420, 230, 30);

        bt.setBackground(new java.awt.Color(204, 255, 255));
        bt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        bt.setText("CHANGE");
        bt.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 51), null, null)));
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(510, 500, 130, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 230, 520, 250);

        photolb1.setText("jLabel1");
        getContentPane().add(photolb1);
        photolb1.setBounds(1080, 120, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_tf1ActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        String username = tf1.getText();
        String op = ps1.getText();
        String np = ps2.getText();
        String change_new_password = ps3.getText();
        if (username.isEmpty() || op.isEmpty() || np.isEmpty() || change_new_password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "all fileds are manadatory");
        } else if (np.equals(" ") && (change_new_password.equals(" "))) {
            JOptionPane.showMessageDialog(this, "both must be same");

        } else {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:9000/change_password")
                        .queryString("username", username)
                        .queryString("old_password", op)
                        .queryString("new_password", np)
                        .asString();
                if(res.getStatus()==200){ //ok
                    String ans=res.getBody();
                    System.out.println(ans);
                    if(ans.equals("success")){
                        JOptionPane.showMessageDialog(this, "password changed successfully");
                    }else{
                        JOptionPane.showMessageDialog(this, "password not changed");
                    }
                }
            
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btActionPerformed

    private void ps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel photolb1;
    private javax.swing.JPasswordField ps1;
    private javax.swing.JPasswordField ps2;
    private javax.swing.JPasswordField ps3;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables

    private void res(String success) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
