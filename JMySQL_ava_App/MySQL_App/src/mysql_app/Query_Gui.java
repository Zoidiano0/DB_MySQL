/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_app;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author RociodelosAngeles
 */
public class Query_Gui extends javax.swing.JInternalFrame {

    /**
     * Creates new form Query_Gui
     */
    public Query_Gui() {
        initComponents();
         Connection cn;
        Statement st;
        Statement st2;
        ResultSet rs;
        ResultSet rs2;
         DefaultListModel model = new DefaultListModel();
          DefaultListModel model2 = new DefaultListModel();
          model.clear();
          model2.clear();
          int cnt=0;
          int cnt2=0;
        try {
                  

            cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ciercom_pre_matricula", "Zoidiano0", "Zoidiano0!");
                       

            st = (Statement) cn.createStatement();
            String s = "select * from estudiante where Estado_Matricula = 0";
            rs = st.executeQuery(s);
           cnt=0;
            while (rs.next()) {        
               
                model.addElement(rs.getString(1)+" "+rs.getString(2));
                cnt++;
                
                
            }
            JLabel_ContNo.setText(String.valueOf(cnt));
            System.out.println(cnt);
            Jlist_NM.setModel(model);
            
            
            //LLenando ya matriculados
             cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ciercom_pre_matricula", "Zoidiano0", "Zoidiano0!");
            st2 = (Statement) cn.createStatement();
            String s2 = "select * from estudiante where Estado_Matricula = 1";
            rs2 = st.executeQuery(s2);
            cnt2=0;
            while (rs2.next()) {        
               
                model2.addElement(rs2.getString(1)+" "+rs2.getString(2));
                cnt2++;
               
                
            }
            Jlist_Mat.setModel(model2);
             JLabel_Cont_M.setText(String.valueOf(cnt2));
            
            System.out.println(cnt2);
            
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
        
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SCroll_No_Mat = new javax.swing.JScrollPane();
        Jlist_NM = new javax.swing.JList<>();
        JLabel_ContNo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jlist_Mat = new javax.swing.JList<>();
        JLabel_Cont_M = new javax.swing.JLabel();
        JButton_Refresh = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("No Matriculado");

        SCroll_No_Mat.setViewportView(Jlist_NM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SCroll_No_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel_ContNo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabel_ContNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SCroll_No_Mat)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Matriculado");

        jScrollPane1.setViewportView(Jlist_Mat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel_Cont_M, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabel_Cont_M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        JButton_Refresh.setText("Refresh");
        JButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButton_Refresh)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButton_Refresh)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_RefreshActionPerformed
        // TODO add your handling code here:
        
       Connection cn;
        Statement st;
        Statement st2;
        ResultSet rs;
        ResultSet rs2;
         DefaultListModel model = new DefaultListModel();
          DefaultListModel model2 = new DefaultListModel();
          model.clear();
          model2.clear();
          int cnt=0;
          int cnt2=0;
        try {
                  

            cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ciercom_pre_matricula", "Zoidiano0", "Zoidiano0!");
                       

            st = (Statement) cn.createStatement();
            String s = "select * from estudiante where Estado_Matricula = 0";
            rs = st.executeQuery(s);
           cnt=0;
            while (rs.next()) {        
               
                model.addElement(rs.getString(1)+" "+rs.getString(2));
                cnt++;
                
                
            }
            JLabel_ContNo.setText(String.valueOf(cnt));
            System.out.println(cnt);
            Jlist_NM.setModel(model);
            
            
            //LLenando ya matriculados
             cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ciercom_pre_matricula", "Zoidiano0", "Zoidiano0!");
            st2 = (Statement) cn.createStatement();
            String s2 = "select * from estudiante where Estado_Matricula = 1";
            rs2 = st.executeQuery(s2);
            cnt2=0;
            while (rs2.next()) {        
               
                model2.addElement(rs2.getString(1)+" "+rs2.getString(2));
                cnt2++;
               
                
            }
            Jlist_Mat.setModel(model2);
             JLabel_Cont_M.setText(String.valueOf(cnt2));
            
            System.out.println(cnt2);
            
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
        
    }//GEN-LAST:event_JButton_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Refresh;
    private javax.swing.JLabel JLabel_ContNo;
    private javax.swing.JLabel JLabel_Cont_M;
    private javax.swing.JList<String> Jlist_Mat;
    private javax.swing.JList<String> Jlist_NM;
    private javax.swing.JScrollPane SCroll_No_Mat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
