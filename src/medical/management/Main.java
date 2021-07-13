/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {

   
    public Main() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        d_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        d_hour = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        d_degree = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        entry = new javax.swing.JButton();
        delete_d = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        p_age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p_r_date = new javax.swing.JTextField();
        p_gender = new javax.swing.JComboBox<>();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        p_number = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        New_entry = new javax.swing.JButton();
        delete_p = new javax.swing.JButton();
        Edit_record = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        p_date = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        code_p = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1000, 1080));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 215, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Doctor Information");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 388, 47));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name              :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 201, 56));

        d_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_nameActionPerformed(evt);
            }
        });
        jPanel3.add(d_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 296, 56));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Work Hour     :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 201, 47));
        jPanel3.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -40, -1, -1));

        d_hour.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel3.add(d_hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 296, 47));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Degree          :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 180, 50));

        d_degree.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel3.add(d_degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 296, 47));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Degree", "working Hour"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 580, 760));

        jLabel5.setText("Please enter working hour in 08.00am-07.00pm* format");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        entry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        entry.setText("New Entry");
        entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryActionPerformed(evt);
            }
        });
        jPanel3.add(entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 760, 180, 50));

        delete_d.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete_d.setText("Delete Record");
        delete_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_dActionPerformed(evt);
            }
        });
        jPanel3.add(delete_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 760, 220, 50));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 1040));

        jTabbedPane1.addTab("Doctor List", jPanel6);

        jPanel1.setBackground(new java.awt.Color(153, 203, 241));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 388, 47));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name              :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 201, 56));

        p_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_nameActionPerformed(evt);
            }
        });
        jPanel1.add(p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 296, 56));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age                  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 201, 50));

        p_age.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(p_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 296, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender            :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 201, 52));

        p_r_date.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(p_r_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 700, 296, 47));

        p_gender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " ", " " }));
        jPanel1.add(p_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 290, 50));
        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -40, -1, -1));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Number", "Date of admit", "Release Date", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 140, 800, 770));

        p_number.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(p_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 296, 47));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone Number: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 201, 47));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Release Date       :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 700, 240, 47));

        New_entry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New_entry.setText("New entry");
        New_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_entryActionPerformed(evt);
            }
        });
        jPanel1.add(New_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 870, 180, 50));

        delete_p.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete_p.setText("Delete Record");
        delete_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_pActionPerformed(evt);
            }
        });
        jPanel1.add(delete_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 870, 180, 50));

        Edit_record.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Edit_record.setText("Edit Record");
        Edit_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_recordActionPerformed(evt);
            }
        });
        jPanel1.add(Edit_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 870, 180, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Admit Date       :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 240, 47));

        p_date.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(p_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 296, 47));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("*Select a record then enter all information again to update the data.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 940, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Code                  :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 790, 220, 40));

        code_p.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(code_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 790, 300, 40));

        jTabbedPane1.addTab("Patient Entry", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1936, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void p_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_nameActionPerformed
    
    public void clear_patient_record_text()
    {
        p_name.setText("");
        p_number.setText("");
        p_age.setText("");
        p_date.setText("");
        p_r_date.setText("");
        code_p.setText("");
    }
    
    public void clear_doctor_records_text()
    {
        d_name.setText("");
        d_degree.setText("");
        d_hour.setText("");
    }
    
    public Connection con;
    public void connect()
    {       
        
            //getting connection to the database
            try{
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical management","root","");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }
    public void save_patient_record()
    {
         try {
             
               String name=p_name.getText();
                String age=p_age.getText();
                String number=p_number.getText();
                String gender=(String)p_gender.getSelectedItem();
                String date=p_date.getText();
                String release_date=p_r_date.getText();
                String code=code_p.getText();
             
               //connecting to the database
                connect();

                String query="INSERT INTO patient(Code,Name,Age,Gender,Number,Admit,Release_Date)values(?,?,?,?,?,?,?)";
                PreparedStatement pst=con.prepareStatement(query);
                
                //adding the data record
                pst.setString(1,code);
                pst.setString(2, name);
                pst.setString(3,age);
                pst.setString(4,gender);
                pst.setString(5,number);
                pst.setString(6,date);
                pst.setString(7,release_date);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null,"Saved record successfully.");
                
         }
         catch(Exception e){
             
             JOptionPane.showMessageDialog(null,e);
         }
                
    }
    public void save_edited_data()
    {   
          String name=p_name.getText();
          String age=p_age.getText();
          String number=p_number.getText();
          String gender=(String)p_gender.getSelectedItem();
          String date=p_date.getText();
          String release_date=p_r_date.getText();
          String p_code=code_p.getText();
          
          
          try{
          connect();

             
          String query="UPDATE patient SET Name= \""+name+"\",Age=\""+age+"\",Gender=\""+gender+"\",Number=\""+number+"\",Admit=\""+date+"\",Release_Date=\""+release_date+"\" WHERE patient.Code="+p_code;
                        
          System.out.println(query);
          PreparedStatement pst=con.prepareStatement(query);
          pst.execute();
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,e);
          }
          
    }
  
    public void save_doctor_record()
    {
        try {
             
               String name=d_name.getText();
                String degree=d_degree.getText();
                String work_hour=d_hour.getText();
               
             
            //connecting to the database
            connect();

                String query="INSERT INTO doctor(Name,Degree,Working_Hour)values(?,?,?)";
                PreparedStatement pst=con.prepareStatement(query);
                
                //adding the data record
                pst.setString(1, name);
                pst.setString(2,degree);
                pst.setString(3,work_hour);
                
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null,"Saved record successfully.");
                
         }
         catch(Exception e){
             
             JOptionPane.showMessageDialog(null,e);
         }
    }
    private void New_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_entryActionPerformed
        
        //the release date is null at the begining
        String release_date=null;
        
        String name=p_name.getText();
        String age=p_age.getText();
        String number=p_number.getText();
        String gender=(String)p_gender.getSelectedItem();
        String date=p_date.getText();
        release_date=p_r_date.getText();
        String code=code_p.getText();
        
        
        //adding patient data in jTable.
        
        if(name.equals("")||age.equals("")||number.equals("")||date.equals("")||gender.equals("")||code.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All data.");
        }
        else{
            
            
            
            String data[]={name,age,gender,number,date,release_date,code};
            DefaultTableModel patients=(DefaultTableModel)jTable2.getModel();
            patients.addRow(data);
            
            JOptionPane.showMessageDialog(null,"New Record Added.");
            save_patient_record();
             
            clear_patient_record_text();
            
            
        }
        
        
        
    }//GEN-LAST:event_New_entryActionPerformed

    private void delete_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_pActionPerformed
        
        DefaultTableModel patients=(DefaultTableModel) jTable2.getModel();
        
        int row=jTable2.getSelectedRow();
        
        if(jTable2.getSelectedRowCount()==1)
        {
            patients.removeRow(row);
        }
      else
        {
            JOptionPane.showMessageDialog(null,"Please select a record.");
        }
    }//GEN-LAST:event_delete_pActionPerformed

    private void Edit_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_recordActionPerformed
        
            DefaultTableModel patients=(DefaultTableModel) jTable2.getModel();
            int row=jTable2.getSelectedRow();
        
             if(jTable2.getSelectedRowCount()==1)
             {
                 
                 
               
                 
                String name=p_name.getText();
                String age=p_age.getText();
                String number=p_number.getText();
                String gender=(String)p_gender.getSelectedItem();
                String date=p_date.getText();
                String release_date=p_r_date.getText();
                String code=code_p.getText();
                
                patients.setValueAt(name, jTable2.getSelectedRow(),0);
                patients.setValueAt(age, jTable2.getSelectedRow(),1);
                patients.setValueAt(gender,jTable2.getSelectedRow(),2);
                patients.setValueAt(number, jTable2.getSelectedRow(),3);
                patients.setValueAt(date, jTable2.getSelectedRow(),4);
                patients.setValueAt(release_date, jTable2.getSelectedRow(),5);
                patients.setValueAt(code,jTable2.getSelectedRow(),6);
                
                JOptionPane.showMessageDialog(null,"Updated Successfully.");
                
                save_edited_data();
                
                clear_patient_record_text();
               
                
             }
            else
            {
                JOptionPane.showMessageDialog(null,"Please select a record.");
            }
    }//GEN-LAST:event_Edit_recordActionPerformed

    private void delete_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_dActionPerformed

        DefaultTableModel doctors=(DefaultTableModel)jTable1.getModel();

        int row=jTable1.getSelectedRow();

        if(jTable1.getSelectedRowCount()==1)
        {
            doctors.removeRow(row);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a record to delete.");
        }

    }//GEN-LAST:event_delete_dActionPerformed

    private void entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryActionPerformed
        String name=d_name.getText();
        String degree=d_degree.getText();
        String work_hour=d_hour.getText();
        
        
        //adding information of the doctors in jTable

        if(name.equals("")||degree.equals("")||work_hour.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter all data.");
        }
        else
        {
            String data[]={name,degree,work_hour};
            DefaultTableModel doctors=(DefaultTableModel) jTable1.getModel();
            doctors.addRow(data);
            JOptionPane.showMessageDialog(null,"Record added.");
            save_doctor_record();
            clear_doctor_records_text();
        }
    }//GEN-LAST:event_entryActionPerformed

    private void d_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit_record;
    private javax.swing.JButton New_entry;
    private javax.swing.JTextField code_p;
    private javax.swing.JTextField d_degree;
    private javax.swing.JTextField d_hour;
    private javax.swing.JTextField d_name;
    private javax.swing.JButton delete_d;
    private javax.swing.JButton delete_p;
    private javax.swing.JButton entry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField p_age;
    private javax.swing.JTextField p_date;
    private javax.swing.JComboBox<String> p_gender;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField p_number;
    private javax.swing.JTextField p_r_date;
    // End of variables declaration//GEN-END:variables
}
