
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class add_car extends javax.swing.JFrame {

    File f;
    JFileChooser jfc;
    String path;

    public add_car() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        photolb1.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back15.jpg");
        Image img = i1.getImage().getScaledInstance(photolb1.getWidth(), photolb1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb1.setIcon(i2);
        setSize(d);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox<>();
        cb1 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        photiolb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        photolb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setBackground(new java.awt.Color(255, 255, 255));
        lb1.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(51, 255, 204));
        lb1.setText("Add Car");
        getContentPane().add(lb1);
        lb1.setBounds(520, 30, 280, 60);

        lb2.setBackground(new java.awt.Color(0, 0, 0));
        lb2.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(51, 255, 204));
        lb2.setText("Car Name:");
        getContentPane().add(lb2);
        lb2.setBounds(390, 130, 120, 20);

        lb3.setBackground(new java.awt.Color(0, 0, 0));
        lb3.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(51, 255, 204));
        lb3.setText("Brand:");
        getContentPane().add(lb3);
        lb3.setBounds(390, 170, 100, 22);

        lb4.setBackground(new java.awt.Color(0, 0, 0));
        lb4.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(51, 255, 204));
        lb4.setText("Car Type:");
        getContentPane().add(lb4);
        lb4.setBounds(390, 210, 110, 22);

        lb5.setBackground(new java.awt.Color(0, 0, 0));
        lb5.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(51, 255, 204));
        lb5.setText("Fuel Type:");
        getContentPane().add(lb5);
        lb5.setBounds(390, 250, 110, 22);

        lb6.setBackground(new java.awt.Color(0, 0, 0));
        lb6.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb6.setForeground(new java.awt.Color(51, 255, 204));
        lb6.setText("Price per day without driver:");
        getContentPane().add(lb6);
        lb6.setBounds(390, 290, 220, 22);

        lb7.setBackground(new java.awt.Color(0, 0, 0));
        lb7.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb7.setForeground(new java.awt.Color(51, 255, 204));
        lb7.setText("Price per day with driver:");
        getContentPane().add(lb7);
        lb7.setBounds(390, 330, 220, 22);

        lb8.setBackground(new java.awt.Color(0, 0, 0));
        lb8.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb8.setForeground(new java.awt.Color(51, 255, 204));
        lb8.setText("Security:");
        getContentPane().add(lb8);
        lb8.setBounds(390, 370, 110, 30);

        lb9.setBackground(new java.awt.Color(0, 0, 0));
        lb9.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb9.setForeground(new java.awt.Color(51, 255, 204));
        lb9.setText("Photo:");
        getContentPane().add(lb9);
        lb9.setBounds(390, 452, 90, 30);

        tf1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(620, 130, 180, 26);

        cb2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Maruti Suzuki Dzire", "Maruti Suzuki Ertiga", "Toyota Innova Crysta", "Honda Amaze", "Hyundai Xcent", "Hyundai Aura", "Mahindra Marazzo", "Mahindra Scorpio" }));
        getContentPane().add(cb2);
        cb2.setBounds(620, 210, 180, 26);

        cb1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Toyta", "Honda City", "Maruti Suzuki", "Mahindra", "BMW", "Zaguar", "FORD", " " }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(620, 170, 180, 26);

        cb3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Petrol", "Disel" }));
        getContentPane().add(cb3);
        cb3.setBounds(620, 250, 180, 26);

        tf2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tf2);
        tf2.setBounds(620, 290, 180, 26);

        tf3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tf3);
        tf3.setBounds(620, 330, 180, 26);

        tf4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tf4);
        tf4.setBounds(620, 370, 180, 30);

        bt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt1.setText("Browser");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(620, 450, 90, 26);
        getContentPane().add(photiolb);
        photiolb.setBounds(480, 500, 240, 130);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Add car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 640, 130, 40);

        lb.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        lb.setForeground(new java.awt.Color(51, 255, 204));
        lb.setText("Discription:");
        getContentPane().add(lb);
        lb.setBounds(390, 410, 120, 30);

        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });
        getContentPane().add(tf7);
        tf7.setBounds(620, 410, 180, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 30, 490, 470);

        photolb1.setText("jLabel1");
        getContentPane().add(photolb1);
        photolb1.setBounds(1030, 150, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        jfc = new JFileChooser();
        int ans = jfc.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            f = jfc.getSelectedFile();
            path = f.getPath();
            ImageIcon i1 = new ImageIcon(path);
            Image img = i1.getImage().getScaledInstance(photiolb.getWidth(), photiolb.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2 = new ImageIcon(img);
            photiolb.setIcon(i2);
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Car_Name = tf1.getText();
        String Brand = (String) cb1.getSelectedItem();
        String Car_Type = (String) cb2.getSelectedItem();
        String Fuel_Type = (String) cb3.getSelectedItem();
        String price_per_day_without_driver = tf2.getText();
        String price_per_day_with_driver = tf3.getText();
        String Security = tf4.getText();
        String discription = tf7.getText();
        System.out.println(Car_Type);
        if (Car_Name.isEmpty() || Brand.isEmpty() || Car_Type.isEmpty() || Fuel_Type.isEmpty() || price_per_day_without_driver.isEmpty() || price_per_day_with_driver.isEmpty() || Security.isEmpty() || discription.isEmpty()) {
            JOptionPane.showMessageDialog(this, "all fields are manadatory");
        } else if (f == null) {
            JOptionPane.showMessageDialog(this, "choose a photo");

        } else {
            try {
                HttpResponse<String> res = Unirest.post("http://localhost:9000/add_car")
                        .queryString("car_name", Car_Name)
                        .queryString("Brand", Brand)
                        .queryString("Car_Type", Car_Type)
                        .queryString("Fuel_Type", Fuel_Type)
                        .queryString("price_per_day_without_driver", price_per_day_without_driver)
                        .queryString("price_per_day_with_driver", price_per_day_with_driver)
                        .queryString("Security", Security)
                        .queryString("discription",discription)
                        .field("photo", f)
                        .asString();
                if (res.getStatus() == 200) { //ok
                    String ans = res.getBody();
                    System.out.println(ans);
                    if (ans.equals("success")) {
                        JOptionPane.showMessageDialog(this, "cars added successfully");
                        this.clearForm();
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "cars not added ");
                    }
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   private void clearForm(){
       tf1.setText("");
       tf2.setText("");
       tf3.setText("");
       tf4.setText("");
       tf7.setText("");
   }
    
    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel photiolb;
    private javax.swing.JLabel photolb1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
}
