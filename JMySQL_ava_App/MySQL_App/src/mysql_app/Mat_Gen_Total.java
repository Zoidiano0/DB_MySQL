/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_app;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author RociodelosAngeles
 */
public class Mat_Gen_Total extends javax.swing.JInternalFrame implements Printable{
 Connection_MySQL cm = new Connection_MySQL();
       Connection cn= cm.get_Connection();
 DefaultListModel model = new DefaultListModel();
          DefaultListModel model2 = new DefaultListModel();
          ArrayList<String> Mat_Cod = new ArrayList<String>();
          ArrayList<String> Mat_Num = new ArrayList<String>();
          ArrayList<String> Todo = new ArrayList<String>();
            Statement st;
            ResultSet rs;
            Statement st2;
            ResultSet rs2;
            int cnt=0;
            int cntt=0;
    /**
     * Creates new form Mat_Gen_Total
     */
    public Mat_Gen_Total() {
        initComponents();
        /// Ontiene Las aterias
        cnt=0;
        try {
            //init
            com.mysql.jdbc.Statement st;
            
            st = (com.mysql.jdbc.Statement) cn.createStatement();
            String s = "select * from materias";
            rs = st.executeQuery(s);
             while (rs.next()) {        
                 Mat_Cod.add(rs.getString(1));
            // Pbtenermos Cuantos Por materia
        try {
            
            com.mysql.jdbc.Statement st2;
            
            st2 = (com.mysql.jdbc.Statement) cn.createStatement();
            System.out.println(rs.getString(1));
            String s2 = "select * from materias_has_estudiante where Materias_Codigo = \'"+rs.getString(1)+"\';";
            rs2 = st2.executeQuery(s2);
            cnt=0;
            while (rs2.next()) {        
                System.err.println(cnt);
                cnt++;
            
            }  
            
        }
        catch ( Exception e ){
            
        }
           cntt+=cnt;
            model.addElement(rs.getString(2)+" \t\t"+String.valueOf(cnt));
            JL_General.setModel(model);
            JLTotal.setText(String.valueOf(cntt));
        

//end
            
           
            
           
           
                
                
            }  
            JL_General.setModel(model);
        }
        catch ( Exception e ){
            
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_General = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        JLTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("IMPRIMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Resumen General De Matriculados");

        JL_General.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JL_General);

        jLabel2.setText("Total");

        JLTotal.setText("#");

        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(JLTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JLTotal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PrinterJob job = PrinterJob.getPrinterJob(); //crea un trabajo de impresion que se asocia con la impresora predeterminada
            job.setPrintable(this);//Se pasa la instancia del Formulario (JFrame)
            boolean x = job.printDialog();//Se Abre el dialogo Para Imprimir
            if (x == true) {
                job.print();
            } else {
                //Se canceló la impresión
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "No Se Logró Imprimir Por El Siguiente Motivo" + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            PrinterJob job = PrinterJob.getPrinterJob(); //crea un trabajo de impresion que se asocia con la impresora predeterminada
            job.setPrintable(this);//Se pasa la instancia del Formulario (JFrame)
            boolean x = job.printDialog();//Se Abre el dialogo Para Imprimir
            if (x == true) {
                job.print();
            } else {
                //Se canceló la impresión
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "No Se Logró Imprimir Por El Siguiente Motivo" + ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
 public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            this.printAll(graphics);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTotal;
    private javax.swing.JList<String> JL_General;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
