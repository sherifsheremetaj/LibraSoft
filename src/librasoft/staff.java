/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librasoft;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class staff extends javax.swing.JFrame {

    /**
     * Creates new form staff
     */
    public staff() {
        initComponents();getContentPane().setBackground(new Color(73,155,255));  setLocation(350,120);setIcon();fetch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        birth = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        adress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb = new javax.swing.JTable();
        date = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        position = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        search = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librasoft/stafff.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name ");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Surname ");

        id.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID ");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Birth ");

        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        sname.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        birth.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        state.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("State");

        city.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("City");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Adress");

        adress.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Position");

        jButton1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Birth", "Gender", "State", "City", "Adress", "Date", "Position"
            }
        ));
        Tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tb);

        date.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");

        position.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Seller", "Other" }));

        gender.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        search.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(31, 31, 31)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(birth, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(state, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(adress, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(position, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
id.setText("");   
sname.setText("");    
name.setText("");    
date.setText("");    
city.setText("");    adress.setText("");    birth.setText("");    
state.setText("");     
       


// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        if(!name.getText().trim().equals("")&&!sname.getText().trim().equals("")&&!id.getText().trim().equals("")&&!date.getText().equals("")){
            model.addRow(new Object[]{id.getText(),name.getText(),sname.getText(),date.getText()});

            try{



                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                PreparedStatement ps=conn.prepareStatement("INSERT INTO staff (ID,Name,Surname,Birth,Gender,State,City,Adress,Date,Position)values(?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1,id.getText());
                ps.setString(2,name.getText());
                  ps.setString(3,sname.getText());
                    ps.setString(4,birth.getText());
            
                ps.setString(5,gender.getSelectedItem().toString());
                 ps.setString(6,state.getText());
                  ps.setString(7,city.getText()); ps.setString(8,adress.getText()); ps.setString(9,date.getText());
                  
                  
                    ps.setString(10,position.getSelectedItem().toString());
                int i=ps.executeUpdate();
    
                if(i>0){
                    JOptionPane.showMessageDialog(null,"Successfully saved  ");
                 id.setText("");   
sname.setText("");    
name.setText("");    
date.setText("");    
city.setText("");    adress.setText("");    birth.setText("");    
state.setText("");  
          
                 
                    ps.close();
                }else{
                    JOptionPane.showMessageDialog(null," Not saved ");

                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Please all fields first ");
        }

    fetch();

    }                                   
    public void fetch(){
        try{
            Connection conn=null;
PreparedStatement ps=null;
ResultSet rs=null;
Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            String g="SELECT * FROM staff ";
            ps=conn.prepareStatement(g);
            rs=ps.executeQuery();
            Tb.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(Exception e){
        Logger.getLogger(Black.class.getName()).log(Level.SEVERE, null, e); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(name.getText().trim().equals("")&&sname.getText().trim().equals("")&&id.getText().trim().equals("")&& date.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please fill all fields first");
    }else{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            String a="update staff set ID=?,Name=?,Surname=?,Birth=?,Gender=?,State=?,City=?,Adress=?,Date=?,Position=? ";
            PreparedStatement ps=conn.prepareStatement(a);
            
      ps.setString(1,id.getText());
                ps.setString(2,name.getText());
                  ps.setString(3,sname.getText());
                    ps.setString(4,birth.getText());
            
                ps.setString(5,gender.getSelectedItem().toString());
                 ps.setString(6,state.getText());
                  ps.setString(7,city.getText()); ps.setString(8,adress.getText()); ps.setString(9,date.getText());
                  
                  
                    ps.setString(10,position.getSelectedItem().toString());
          
            

            int rw=ps.executeUpdate();
            if(rw>0){
                JOptionPane.showMessageDialog(null,"Changes are saved");

            }
            else{
                JOptionPane.showMessageDialog(null,"Changes are not saved");

            }
        }
        catch(Exception e){
            Logger.getLogger(LibraSoft.class.getName()).log(Level.SEVERE, null, e);
        }
        DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        model.setValueAt(id.getText(),Tb.getSelectedRow(),0);
         model.setValueAt(name.getText(),Tb.getSelectedRow(),1);
          model.setValueAt(sname.getText(),Tb.getSelectedRow(),2);
       
        model.setValueAt(birth.getText(),Tb.getSelectedRow(),3);
     model.setValueAt(gender,Tb.getSelectedRow(),4);
       
        model.setValueAt(state.getText(),Tb.getSelectedRow(),5);
        
        model.setValueAt(city.getText(),Tb.getSelectedRow(),6);
       
        model.setValueAt(adress.getText(),Tb.getSelectedRow(),7);
  
        model.setValueAt(date.getText(),Tb.getSelectedRow(),8);
        model.setValueAt(position.getSelectedItem().toString(),Tb.getSelectedRow(),9);
        
        Tb.setDefaultEditor(Object.class, null);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        if(Tb.getSelectedRow()==-1){
            if(Tb.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Table is Empty");
            }
            else{
                JOptionPane.showMessageDialog(null,"Please You must Select a staff member");
            }

        }
 int i= JOptionPane.showConfirmDialog(null,"Do you really want to delete this staff member","Delete",JOptionPane.YES_NO_OPTION);
 if(i==0){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            String a="DELETE FROM staff where Name='"+name.getText()+"'";
            PreparedStatement ps=conn.prepareStatement(a);

            int z= ps.executeUpdate();
            if(z>0){
              
              
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
                model.removeRow(Tb.getSelectedRow());
           id.setText("");   
sname.setText("");    
name.setText("");    
date.setText("");    
city.setText("");    adress.setText("");    birth.setText("");    
state.setText("");   
             
           
            
            
         
        }
        if(i==1){};
       

 }catch(Exception ex){
            Logger.getLogger(LibraSoft.class.getName()).log(Level.SEVERE, null, ex);
 }  }
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbMouseClicked
      DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        id.setText(model.getValueAt(Tb.getSelectedRow(),0).toString());
           name.setText(model.getValueAt(Tb.getSelectedRow(),1).toString());
              sname.setText(model.getValueAt(Tb.getSelectedRow(),2).toString());
        
        birth.setText(model.getValueAt(Tb.getSelectedRow(),3).toString());    
        gender.setSelectedItem(model.getValueAt(Tb.getSelectedRow(),4).toString());
         state.setText(model.getValueAt(Tb.getSelectedRow(),5).toString());  
          city.setText(model.getValueAt(Tb.getSelectedRow(),6).toString());  
           adress.setText(model.getValueAt(Tb.getSelectedRow(),7).toString());  
            date.setText(model.getValueAt(Tb.getSelectedRow(),8).toString());  
            gender.setSelectedItem(model.getValueAt(Tb.getSelectedRow(),9).toString());
    }//GEN-LAST:event_TbMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(search.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Please fill search field first ");
}else{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            PreparedStatement ps=null;
            ResultSet rs=null;
            ps=conn.prepareStatement("Select *FROM staff where Name=?");
            ps.setString(1, search.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"This Person Exists    "   );

            }
            else{
                JOptionPane.showMessageDialog(null,"This Person Don't Exists");
            }}
            catch(Exception e){
                Logger.getLogger(LibraSoft.class.getName()).log(Level.SEVERE, null, e);
            } 
}
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tb;
    private javax.swing.JTextField adress;
    private javax.swing.JTextField birth;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField city;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField state;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("book.png")));
    }}
