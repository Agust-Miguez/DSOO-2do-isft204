/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package panels;

import controller.controller_Passanger;
import entitys.DAOimplements.passenger_DAOImpl;
import entitys.passenger;
import static entitys.passenger_.id;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import service.PassengerService;
import table_Model.Pass_Table_Model;


public class pass extends javax.swing.JFrame {
    private final passenger_DAOImpl dao;
    private final JTable table ;
    private final Pass_Table_Model tablel = new Pass_Table_Model();
    private final List <passenger> tablel2 = new ArrayList (); 
    private int fd;
    
    
    public pass() {
        initComponents();
        dao = passenger_DAOImpl.getInstance();
        table = jTable1;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        v_name = new javax.swing.JTextField();
        v_lastname = new javax.swing.JTextField();
        v_dni = new javax.swing.JTextField();
        delbutton3 = new javax.swing.JButton();
        modbutton3 = new javax.swing.JButton();
        v_email = new javax.swing.JTextField();
        v_phone = new javax.swing.JTextField();
        seaIDbutton3 = new javax.swing.JButton();
        seabutton4 = new javax.swing.JButton();
        buttonAdd3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Pasajeros");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 93, 34));

        jLabel22.setText("Nombre");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, -1, -1));

        jLabel23.setText("Telefono");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 231, -1, -1));

        jLabel24.setText("Email");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 191, -1, -1));

        v_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_nameActionPerformed(evt);
            }
        });
        jPanel2.add(v_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 65, 199, -1));
        jPanel2.add(v_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 105, 199, -1));
        jPanel2.add(v_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 148, 199, -1));

        delbutton3.setText("Eliminar");
        delbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbutton3delbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(delbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 311, 81, -1));

        modbutton3.setText("Modificar");
        modbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modbutton3modbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(modbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 352, -1, -1));
        jPanel2.add(v_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 188, 199, -1));
        jPanel2.add(v_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 228, 199, -1));

        seaIDbutton3.setText("Buscar ID");
        seaIDbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaIDbutton3seaIDbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(seaIDbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 434, 81, -1));

        seabutton4.setText("Buscar");
        seabutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seabutton4seabutton1ActionPerformed(evt);
            }
        });
        jPanel2.add(seabutton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 393, 81, -1));

        buttonAdd3.setText("Agregar");
        buttonAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdd3buttonAddActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 276, 81, -1));

        jLabel25.setText("Apellido");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, -1, -1));

        jLabel26.setText("DNI");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 154, -1, -1));

        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, 580, 450));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delbutton3delbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbutton3delbuttonActionPerformed
        fd= table.getSelectedRow();
        tablel.deleteRow(fd);
    }//GEN-LAST:event_delbutton3delbuttonActionPerformed

    private void modbutton3modbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbutton3modbuttonActionPerformed
  
    passenger p = new passenger (v_name, v_lastname, dni, phone, email);
    int rs= table.getSelectedRow();
    
    String name = v_name.getText();
    String last_Name = v_lastname.getText();;
    Long dni = Long.valueOf(v_dni.getText());
    String email = v_email.getText();
    Long phone = Long.valueOf(v_phone.getText());;
    table.get
    tablel.setValueAt(p, rs);
    table.setModel((TableModel) tablel2);
    
       
    }//GEN-LAST:event_modbutton3modbuttonActionPerformed

    public void setFd(int fd) {
        this.fd = fd;
    }

    public void setButtonAdd3(JButton buttonAdd3) {
        this.buttonAdd3 = buttonAdd3;
    }

    public void setDelbutton3(JButton delbutton3) {
        this.delbutton3 = delbutton3;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public void setModbutton3(JButton modbutton3) {
        this.modbutton3 = modbutton3;
    }

    public void setSeaIDbutton3(JButton seaIDbutton3) {
        this.seaIDbutton3 = seaIDbutton3;
    }

    public void setSeabutton4(JButton seabutton4) {
        this.seabutton4 = seabutton4;
    }

    public void setV_dni(JTextField v_dni) {
        this.v_dni = v_dni;
    }

    public void setV_email(JTextField v_email) {
        this.v_email = v_email;
    }

    public void setV_lastname(JTextField v_lastname) {
        this.v_lastname = v_lastname;
    }

    public void setV_name(JTextField v_name) {
        this.v_name = v_name;
    }

    public void setV_phone(JTextField v_phone) {
        this.v_phone = v_phone;
    }

    private void seaIDbutton3seaIDbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaIDbutton3seaIDbuttonActionPerformed
     
    }//GEN-LAST:event_seaIDbutton3seaIDbuttonActionPerformed

    private void seabutton4seabutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seabutton4seabutton1ActionPerformed
    }//GEN-LAST:event_seabutton4seabutton1ActionPerformed

    private void buttonAdd3buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd3buttonAddActionPerformed
        fd = table.getSelectedRow();
        String name = v_name.getText();
        String last_Name = v_lastname.getText();
        Long dni = Long.valueOf(v_dni.getText());
        String email = v_email.getText();
        Long phone = Long.valueOf(v_phone.getText());
        passenger p = new passenger (name, last_Name, dni, phone, email);
        dao.save(p);
        tablel.addRow(p);
        table.setModel(tablel);
    }//GEN-LAST:event_buttonAdd3buttonAddActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentAdded

    private void v_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_nameActionPerformed

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
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new pass().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd3;
    private javax.swing.JButton delbutton3;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modbutton3;
    private javax.swing.JButton seaIDbutton3;
    private javax.swing.JButton seabutton4;
    private javax.swing.JTextField v_dni;
    private javax.swing.JTextField v_email;
    private javax.swing.JTextField v_lastname;
    private javax.swing.JTextField v_name;
    private javax.swing.JTextField v_phone;
    // End of variables declaration//GEN-END:variables
}
