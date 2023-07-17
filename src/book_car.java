
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class book_car extends javax.swing.JFrame {

    String id, price_per_day, start_date, end_date, no_of_days, security, total_rent, mobile, email;

    public book_car(String id, String price_per_day, String start_date, String end_date, String no_of_days, String security, String total_rent) {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.id = id;
        this.price_per_day = price_per_day;
        this.start_date = start_date;
        this.end_date = end_date;
        this.no_of_days = no_of_days;
        this.security = security;
        this.total_rent = total_rent;
        jname.setText(global.user_name);
        jname.setEditable(false);
        jid.setText(id);
        jppd.setText(price_per_day);
        jstartdate.setText(start_date);
        jenddate.setText(end_date);
        jnodays.setText(no_of_days);
        jrent.setText(total_rent);
        jsecurity.setText(security);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        photolb.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back02.jpg");
        Image img = i1.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb.setIcon(i2);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        lb15 = new javax.swing.JLabel();
        lb16 = new javax.swing.JLabel();
        lb17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lb19 = new javax.swing.JLabel();
        lb20 = new javax.swing.JLabel();
        lb21 = new javax.swing.JLabel();
        lb22 = new javax.swing.JLabel();
        lb23 = new javax.swing.JLabel();
        lb24 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jmobile = new javax.swing.JTextField();
        jaddress = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jppd = new javax.swing.JLabel();
        jstartdate = new javax.swing.JLabel();
        jenddate = new javax.swing.JLabel();
        jnodays = new javax.swing.JLabel();
        jrent = new javax.swing.JLabel();
        jsecurity = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btproceed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        photolb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jid.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jid.setForeground(new java.awt.Color(255, 255, 204));
        jid.setText("id");
        getContentPane().add(jid);
        jid.setBounds(550, 110, 350, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 120, 210, 0);

        lb1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(204, 204, 204));
        lb1.setText("Car ID:");
        getContentPane().add(lb1);
        lb1.setBounds(350, 110, 170, 30);

        lb2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText("Price Per Day:");
        getContentPane().add(lb2);
        lb2.setBounds(350, 150, 170, 30);

        lb3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(204, 204, 204));
        lb3.setText("Start Date:");
        getContentPane().add(lb3);
        lb3.setBounds(350, 190, 170, 30);

        lb4.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(204, 204, 204));
        lb4.setText("End Date:");
        getContentPane().add(lb4);
        lb4.setBounds(350, 230, 180, 30);

        lb6.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb6.setForeground(new java.awt.Color(204, 204, 204));
        lb6.setText("Rent:");
        getContentPane().add(lb6);
        lb6.setBounds(350, 310, 150, 30);

        lb7.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb7.setForeground(new java.awt.Color(204, 204, 204));
        lb7.setText("Security:");
        getContentPane().add(lb7);
        lb7.setBounds(350, 350, 120, 30);

        lb8.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb8.setForeground(new java.awt.Color(204, 204, 204));
        lb8.setText("Name:");
        getContentPane().add(lb8);
        lb8.setBounds(350, 390, 110, 30);

        lb9.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb9.setForeground(new java.awt.Color(204, 204, 204));
        lb9.setText("Phone Number:");
        getContentPane().add(lb9);
        lb9.setBounds(350, 430, 150, 30);

        lb10.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb10.setForeground(new java.awt.Color(204, 204, 204));
        lb10.setText("Address:");
        getContentPane().add(lb10);
        lb10.setBounds(350, 470, 150, 30);

        lb11.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb11.setForeground(new java.awt.Color(204, 204, 204));
        lb11.setText("Email:");
        getContentPane().add(lb11);
        lb11.setBounds(350, 510, 100, 30);

        bt.setBackground(new java.awt.Color(102, 102, 102));
        bt.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        bt.setForeground(new java.awt.Color(204, 255, 255));
        bt.setText("Submit");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(500, 630, 140, 50);
        getContentPane().add(lb15);
        lb15.setBounds(260, 40, 190, 0);
        getContentPane().add(lb16);
        lb16.setBounds(260, 70, 170, 0);
        getContentPane().add(lb17);
        lb17.setBounds(260, 130, 0, 0);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(260, 100, 140, 0);
        getContentPane().add(lb19);
        lb19.setBounds(260, 160, 0, 0);
        getContentPane().add(lb20);
        lb20.setBounds(260, 190, 0, 0);
        getContentPane().add(lb21);
        lb21.setBounds(260, 230, 0, 0);
        getContentPane().add(lb22);
        lb22.setBounds(260, 260, 0, 0);
        getContentPane().add(lb23);
        lb23.setBounds(260, 290, 0, 0);
        getContentPane().add(lb24);
        lb24.setBounds(260, 330, 0, 0);

        jname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jname);
        jname.setBounds(550, 390, 330, 30);

        jmobile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmobileActionPerformed(evt);
            }
        });
        getContentPane().add(jmobile);
        jmobile.setBounds(550, 430, 330, 30);

        jaddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jaddress);
        jaddress.setBounds(550, 470, 330, 30);

        jemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });
        getContentPane().add(jemail);
        jemail.setBounds(550, 510, 330, 30);

        jppd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jppd.setForeground(new java.awt.Color(255, 255, 204));
        jppd.setText("jLabel1");
        getContentPane().add(jppd);
        jppd.setBounds(550, 150, 310, 30);

        jstartdate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jstartdate.setForeground(new java.awt.Color(255, 255, 204));
        jstartdate.setText("jLabel3");
        getContentPane().add(jstartdate);
        jstartdate.setBounds(550, 190, 340, 30);

        jenddate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jenddate.setForeground(new java.awt.Color(255, 255, 204));
        jenddate.setText("jLabel15");
        getContentPane().add(jenddate);
        jenddate.setBounds(550, 230, 330, 30);

        jnodays.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jnodays.setForeground(new java.awt.Color(255, 255, 204));
        jnodays.setText("jLabel16");
        getContentPane().add(jnodays);
        jnodays.setBounds(550, 270, 300, 30);

        jrent.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jrent.setForeground(new java.awt.Color(255, 255, 204));
        jrent.setText("jLabel17");
        getContentPane().add(jrent);
        jrent.setBounds(550, 310, 330, 30);

        jsecurity.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jsecurity.setForeground(new java.awt.Color(255, 255, 204));
        jsecurity.setText("jLabel19");
        getContentPane().add(jsecurity);
        jsecurity.setBounds(550, 350, 310, 30);

        lb5.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(204, 204, 204));
        lb5.setText("No. of Days:");
        getContentPane().add(lb5);
        lb5.setBounds(350, 270, 150, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("payment");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 550, 100, 30);

        btproceed.setBackground(new java.awt.Color(51, 0, 51));
        btproceed.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        btproceed.setForeground(new java.awt.Color(255, 204, 204));
        btproceed.setText("Proceed");
        btproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btproceedActionPerformed(evt);
            }
        });
        getContentPane().add(btproceed);
        btproceed.setBounds(550, 550, 330, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Booking Submission");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 20, 640, 70);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(290, 100, 620, 510);

        photolb.setText("jLabel1");
        getContentPane().add(photolb);
        photolb.setBounds(1130, 30, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        if (global.payment_status == "pending") {
            JOptionPane.showMessageDialog(this, "Please make payment first to proceed");
        } else {
            String car_id = jid.getText();
            String price_per_day = jppd.getText();
            String start_date = jstartdate.getText();
            String end_date = jenddate.getText();
            String no_of_days = jnodays.getText();
            String rent = jrent.getText();
            String security = jsecurity.getText();
            String name = jname.getText();
            mobile = jmobile.getText();
            String address = jaddress.getText();
            email = jemail.getText();
            try {
                HttpResponse<String> res = Unirest.get(global.ip_address + "book_car")
                        .queryString("car_id", car_id)
                        .queryString("price_per_day", price_per_day)
                        .queryString("start_date", start_date)
                        .queryString("end_date", end_date)
                        .queryString("no_of_days", no_of_days)
                        .queryString("rent", rent)
                        .queryString("security", security)
                        .queryString("name", name)
                        .queryString("mobile", mobile)
                        .queryString("address", address)
                        .queryString("email", email)
                        .queryString("payment_status",global.payment_status)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    if (ans.equals("success")) {
                        JOptionPane.showMessageDialog(this, "Booking successfull!!");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Unsuccessfull!!");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btActionPerformed

    private void jmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmobileActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void btproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btproceedActionPerformed
        
        String name = jname.getText();
        String mobile = jmobile.getText();
        String address = jaddress.getText();
        String email = jemail.getText();
        
        
        if (name.equals(" ") || mobile.equals("") || address.equals("") || email.equals("")) {
            JOptionPane.showMessageDialog(this, "all fields are mandatory");
        }else if (mobile.length() != 10 || email.indexOf("@") > email.indexOf(".") || email.indexOf("@") == -1 || email.indexOf(".") == -1) {
            JOptionPane.showMessageDialog(null, "Enter Correct Details");
        }else{
            vmm1 obj = new vmm1(total_rent);
        }
    }//GEN-LAST:event_btproceedActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book_car("", "", "", "", "", "", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JButton btproceed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jaddress;
    private javax.swing.JTextField jemail;
    private javax.swing.JLabel jenddate;
    private javax.swing.JLabel jid;
    private javax.swing.JTextField jmobile;
    private javax.swing.JTextField jname;
    private javax.swing.JLabel jnodays;
    private javax.swing.JLabel jppd;
    private javax.swing.JLabel jrent;
    private javax.swing.JLabel jsecurity;
    private javax.swing.JLabel jstartdate;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb17;
    private javax.swing.JLabel lb19;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb20;
    private javax.swing.JLabel lb21;
    private javax.swing.JLabel lb22;
    private javax.swing.JLabel lb23;
    private javax.swing.JLabel lb24;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel photolb;
    // End of variables declaration//GEN-END:variables
}
