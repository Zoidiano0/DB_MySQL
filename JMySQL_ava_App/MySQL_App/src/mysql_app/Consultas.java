/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_app;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author RociodelosAngeles
 */
public class Consultas extends javax.swing.JInternalFrame {
Connection_MySQL cm = new Connection_MySQL();
       Connection cn= cm.get_Connection();
        ArrayList<String> Mat_Cod = new ArrayList<String>();
         DefaultListModel model = new DefaultListModel();
    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        
         try {
            
            Statement st;
            ResultSet rs;
            st = (Statement) cn.createStatement();
            String s = "select * from materias";
            rs = st.executeQuery(s);
            while (rs.next()) {        
            Mat_Cod.add(rs.getString(1));
                
            JCB_MAt.addItem(rs.getString(2));
                
                
            }                
                
                
            
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_ES = new javax.swing.JList<>();
        JCB_MAt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JT_Cedula = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Estudiantes Matriculados En Materias ");

        JL_ES.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JL_ES);

        JCB_MAt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        JCB_MAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_MAtActionPerformed(evt);
            }
        });

        jLabel2.setText("Anilacion De Matriculas ( Completa ) ");

        jLabel3.setText("Ingrese Cedula para Anular");

        JT_Cedula.setText("Cedula");
        JT_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_CedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(JCB_MAt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84)
                        .addComponent(JT_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JCB_MAt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JT_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCB_MAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_MAtActionPerformed
        
         try {
            model.clear();
            Statement st;
            ResultSet rs;
            st = (Statement) cn.createStatement();
            String s = "SELECT * FROM estudiante inner join materias_has_estudiante \n" +
"on estudiante.Cedula = materias_has_estudiante.Estudiante_Cedula\n" +
"where Materias_Codigo = \'"+  Mat_Cod.get(JCB_MAt.getSelectedIndex()) +"\';";
            rs = st.executeQuery(s);
            while (rs.next()) {  
                
            model.addElement(rs.getString(2) + rs.getString(4));
                
                
            }                
                JL_ES.setModel(model);
                
            
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_JCB_MAtActionPerformed
String MAT_Cod = "";
    private void JT_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_CedulaActionPerformed
        // TODO add your handling code here:
        Statement st;
            ResultSet rs;
        // obtener el codigo de matricula 
            
            try {
            st = (Statement) cn.createStatement();
            String s3 = "SELECT idMatricula FROM ciercom_pre_matricula.matricula where Estudiante = \'"+ JT_Cedula.getText() + "\';";
            rs = st.executeQuery(s3);
            
            while (rs.next()) {        
               
                MAT_Cod = rs.getString(1);
            }
                System.out.println("Codigo Matricula "+MAT_Cod);
        } catch (Exception e) {
        }
              
           //Borrar Materias      
            try {
            model.clear();
            
            st = (Statement) cn.createStatement();
            String s = "DELETE FROM materias_has_estudiante WHERE Estudiante_Cedula =\'"+ JT_Cedula.getText()+"\';";
            st.executeUpdate(s);
                       
                JL_ES.setModel(model);
                
            
        } catch (Exception e) {
        System.out.println(e);
                System.out.println("NO ejecuto");
            }
            // Borrar Matricula
        
        try {
            model.clear();
            
            st = (Statement) cn.createStatement();
            String s = "DELETE FROM matricula WHERE idMatricula=\'"+MAT_Cod+"\';";
            st.executeUpdate(s);
                            
               
                
            
        } catch (Exception e) {
        System.out.println(e);
        System.out.println("NO ejecuto");
            }
        
        try {
            
                       

            st = (Statement) cn.createStatement();
            
            String s = "UPDATE estudiante SET Estado_Matricula =? WHERE Cedula=\'"+JT_Cedula.getText()+"\';";
            PreparedStatement pst = cn.prepareStatement(s,Statement.RETURN_GENERATED_KEYS);
           pst.setBoolean(1, false);
           
           int ra = pst.executeUpdate();
           
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(this, "Matricula Eliminada!");
        
        
    }//GEN-LAST:event_JT_CedulaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCB_MAt;
    private javax.swing.JList<String> JL_ES;
    private javax.swing.JTextField JT_Cedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}