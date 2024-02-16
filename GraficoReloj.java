import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivanc
 */
public class GraficoReloj extends javax.swing.JFrame {

    public GraficoReloj(String Day) {
        initComponents();
        txtDay.setText(Day);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txthours = new javax.swing.JTextField();
        txtSecond = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtminutes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        txthours.setEditable(false);
        txthours.setBackground(new java.awt.Color(102, 102, 102));
        txthours.setFont(new java.awt.Font("Arial", 1, 75)); // NOI18N
        txthours.setForeground(new java.awt.Color(204, 204, 204));
        txthours.setText("00");
        txthours.setBorder(null);

        txtSecond.setEditable(false);
        txtSecond.setBackground(new java.awt.Color(102, 102, 102));
        txtSecond.setFont(new java.awt.Font("Arial", 1, 75)); // NOI18N
        txtSecond.setForeground(new java.awt.Color(204, 204, 204));
        txtSecond.setText("00");
        txtSecond.setBorder(null);

        txtDay.setEditable(false);
        txtDay.setBackground(new java.awt.Color(102, 102, 102));
        txtDay.setFont(new java.awt.Font("Arial", 1, 71)); // NOI18N
        txtDay.setForeground(new java.awt.Color(204, 204, 204));
        txtDay.setText("AM");
        txtDay.setBorder(null);

        txtminutes.setEditable(false);
        txtminutes.setBackground(new java.awt.Color(102, 102, 102));
        txtminutes.setFont(new java.awt.Font("Arial", 1, 75)); // NOI18N
        txtminutes.setForeground(new java.awt.Color(204, 204, 204));
        txtminutes.setText("00");
        txtminutes.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txthours, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtminutes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(txtSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txthours)
                    .addComponent(txtSecond)
                    .addComponent(txtDay)
                    .addComponent(txtminutes))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    public void setDay(String Day){
        txtDay.setText(Day);        
        
    }
    public void setMinute(int minute){
        if(minute<10){
            txtminutes.setText("0"+minute);
        }
        else{
            txtminutes.setText(minute+"");
        }
        
    }
    public void setHours(int hours){
        if(hours<10){
            txthours.setText("0"+hours);
        }
        else{
            txthours.setText(hours+"");
        }
    }
    public void setSecond(int second){
        if(second<10){
            txtSecond.setText("0"+second);
        }
        else{
            txtSecond.setText(""+second);
        }
        
    }


    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtSecond;
    private javax.swing.JTextField txthours;
    private javax.swing.JTextField txtminutes;
    // End of variables declaration                   

    
}
