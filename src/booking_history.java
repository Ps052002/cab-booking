
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.AbstractTableModel;

public class booking_history extends javax.swing.JFrame {

    ArrayList<bookinghistory> al = new ArrayList<>();
    mytablemodel tm = new mytablemodel();

    public booking_history() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jt.setModel(tm);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        jphoto.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back02.jpg");
        Image img = i1.getImage().getScaledInstance(jphoto.getWidth(), jphoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        jphoto.setIcon(i2);
        booking_history();
    }

    void booking_history() {
        al.clear();
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:9000/getadminbookinghistory")
                    .queryString("name", global.user_name)
                    .asString();
            if (res.getStatus() == 200) {

                String ans = res.getBody();
                System.out.println(ans);
                StringTokenizer st = new StringTokenizer(ans, ";;");
                while (st.hasMoreTokens()) {
                    String row = st.nextToken();
                    StringTokenizer st2 = new StringTokenizer(row, "~~");
                    String booking_id = st2.nextToken();
                    String car_id = st2.nextToken();
                    String price_per_day = st2.nextToken();
                    String start_date = st2.nextToken();
                    String end_date = st2.nextToken();
                    String no_of_days = st2.nextToken();
                    String rent = st2.nextToken();
                    String security = st2.nextToken();
                    String name = st2.nextToken();
                    String mobile = st2.nextToken();
                    String address = st2.nextToken();
                    String email = st2.nextToken();
                    String payment_status = st2.nextToken();
                    String booking_status = st2.nextToken();
                    System.out.println(car_id + " " + booking_id + " " + price_per_day + " " + start_date + " " + end_date + " " + no_of_days + " " + rent + " " + security + " " + name + " " + mobile + " " + address + " " + email + " " + payment_status + " " + booking_status);
                    al.add(new bookinghistory(booking_id, car_id, price_per_day, start_date, end_date, no_of_days, rent, security, name, mobile, address, email, payment_status, booking_status));
                }
                tm.fireTableDataChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class mytablemodel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return (14);
        }

        @Override
        public String getColumnName(int j) {
            String[] ss = {"Booking id", "Car Id", "Price Per Day", "Start Date", "End Date ", "No of Days", "Rent", "Security", "Name", "Phone Number", "Address", "Email", "Payment Status", "Booking Status"};
            return ss[j];
        }

        @Override
        public Object getValueAt(int i, int j) {
            bookinghistory c = al.get(i);
            if (j == 0) {
                return c.booking_id;
            } else if (j == 1) {
                return c.car_id;
            } else if (j == 2) {
                return c.price_per_day;
            } else if (j == 3) {
                return c.start_date;
            } else if (j == 4) {
                return c.end_date;
            } else if (j == 5) {
                return c.no_of_days;
            } else if (j == 6) {
                return c.rent;
            } else if (j == 7) {
                return c.security;
            } else if (j == 8) {
                return c.name;
            } else if (j == 9) {
                return c.mobile;

            } else if (j == 10) {
                return c.address;
            } else if (j == 11) {
                return c.email;
            } else if (j == 12) {
                return c.payment_status;
            } else {
                return c.booking_status;
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        delbt = new javax.swing.JButton();
        cancelbt = new javax.swing.JButton();
        jphoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Booking History");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 30, 390, 80);

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Price Per Day", "Start Date", "End Date", "No. of Days", "Rent", "Security", "Name", "Mobile", "Address", "Email"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 1140, 430);
        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(490, 220, 2, 2);

        delbt.setText("delete");
        delbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtActionPerformed(evt);
            }
        });
        getContentPane().add(delbt);
        delbt.setBounds(400, 630, 120, 50);

        cancelbt.setText("cancel");
        cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbt);
        cancelbt.setBounds(120, 630, 100, 40);

        jphoto.setText("jLabel2");
        getContentPane().add(jphoto);
        jphoto.setBounds(1130, 10, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtActionPerformed
        int i = jt.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "please select a row");
        } else {
            String booking_id = al.get(i).booking_id;

            try {
                HttpResponse<String> res = Unirest.get(global.ip_address + "cancel_booking")
                        .queryString("booking_id",booking_id)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    if (ans.equals("success")) {
                        JOptionPane.showMessageDialog(this, "Cancelled Successfully!!");
                        booking_history();
                    } else {
                        JOptionPane.showMessageDialog(this, "error!!");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cancelbtActionPerformed

    private void delbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtActionPerformed
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row");
        } else {
            String booking_id = al.get(i).booking_id;
            try {
                HttpResponse<String> res = Unirest.get(global.ip_address + "user_del_history")
                        .queryString("booking_id", booking_id)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    if (ans.equals("success")) {
                        JOptionPane.showMessageDialog(this, "Deleted successfully!!");
                        booking_history();

                    } else {
                        JOptionPane.showMessageDialog(this, "Error!!");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_delbtActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking_history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbt;
    private javax.swing.JButton delbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jphoto;
    private javax.swing.JTable jt;
    // End of variables declaration//GEN-END:variables

}
