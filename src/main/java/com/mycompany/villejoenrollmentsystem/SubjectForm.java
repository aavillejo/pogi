/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.villejoenrollmentsystem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aaron
 */
public class SubjectForm extends javax.swing.JFrame {

    public SubjectForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        subjdesc = new javax.swing.JTextPane();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjID = new javax.swing.JTextPane();
        delete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        subjunits = new javax.swing.JTextPane();
        update = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        subjsched = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b = new javax.swing.JScrollPane();
        subjcode = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        sTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        classListTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        StudentsForm = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane3.setViewportView(subjdesc);

        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        subjID.setEditable(false);
        jScrollPane1.setViewportView(subjID);

        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jScrollPane4.setViewportView(subjunits);

        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        jScrollPane5.setViewportView(subjsched);

        jLabel1.setText("Subject ID");

        jLabel2.setText("Subject Code");

        jLabel3.setText("Subject Units");

        jLabel4.setText("Subject Description");

        jLabel5.setText("Schedule");

        b.setViewportView(subjcode);

        sTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subject ID", "Subject Code", "Subject Description", "Subject Units", "Schedule"
            }
        ));
        sTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(sTable);

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SUBJECTS REGISTRATION");
        jLabel8.setToolTipText("");

        classListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Contact", "Address", "Email", "Gender", "Student Year Level"
            }
        ));
        jScrollPane9.setViewportView(classListTable);

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CLASS LIST");
        jLabel9.setToolTipText("");

        jMenu1.setText("File");

        StudentsForm.setText("StudentsForm");
        StudentsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentForm(evt);
            }
        });
        jMenu1.add(StudentsForm);

        jMenuItem2.setText("TeacherForm");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherForm(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitactionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save)
                    .addComponent(delete)
                    .addComponent(update))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(411, 411, 411))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(319, 319, 319))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ShowRecord() {
    VillejoEnrollmentSystem db = new VillejoEnrollmentSystem();
    db.DBConnect();

    DefaultTableModel model = (DefaultTableModel) sTable.getModel();
    model.setRowCount(0);

    try {
        String query = "SELECT * FROM subjects;";  
        db.rs = db.st.executeQuery(query);
        while (db.rs.next()) {
            String id = db.rs.getString("subjID");
            String code = db.rs.getString("subjcode");
            String desc = db.rs.getString("subjdesc");
            String units = db.rs.getString("subjunits");
            String schedule = db.rs.getString("subjsched");

            model.addRow(new Object[]{id, code, desc, units, schedule});
        }
    } catch (Exception ex) {
        System.out.println(ex);
    }
}
    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        Subjects subj = new Subjects();
        subj.SaveRecord(
        subjcode.getText(),
        subjdesc.getText(),
        Integer.parseInt(subjunits.getText()),
        subjsched.getText()
        );
    ShowRecord();
    }//GEN-LAST:event_saveMouseClicked
    private StudentsForm studentsForm;

public SubjectForm(StudentsForm sf) {
    initComponents();
    this.studentsForm = sf;
}
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int ID = Integer.parseInt(subjID.getText());

        Subjects s = new Subjects();
        s.DeleteRecord(ID);

        ShowRecord();
    }//GEN-LAST:event_deleteMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        int ID = Integer.parseInt(subjID.getText());
        String code = subjcode.getText();
        String desc = subjdesc.getText();
        int unit = Integer.parseInt(subjunits.getText());
        String sched = subjsched.getText();
    }//GEN-LAST:event_updateMouseClicked

    private void StudentForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentForm
        StudentsForm s = new StudentsForm();
        s.setVisible(true);
    }//GEN-LAST:event_StudentForm

    private void TeacherForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherForm
        TeacherForm a = new TeacherForm();
        a.setVisible(true);
    }//GEN-LAST:event_TeacherForm

    private void ExitactionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitactionPerformed
        dispose();
    }//GEN-LAST:event_ExitactionPerformed

    private void loadClassList(int subjectId) {
    VillejoEnrollmentSystem db = new VillejoEnrollmentSystem();
    db.DBConnect();

    DefaultTableModel model = (DefaultTableModel) classListTable.getModel(); 
    model.setRowCount(0);

    try {
        String sql = "SELECT st.studID, st.studname, st.studcontact, st.studaddress, st.studEmail, st.studgender, st.studyrlvl " +
                     "FROM Enroll e " +
                     "JOIN students st ON e.studID = st.studID " +
                     "WHERE e.subjID = ?";
        PreparedStatement pst = db.con.prepareStatement(sql);
        pst.setInt(1, subjectId);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString("studID"),
                rs.getString("studname"),
                rs.getString("studcontact"),
                rs.getString("studaddress"),
                rs.getString("studEmail"),
                rs.getString("studgender"),
                rs.getString("studyrlvl")
            });
        }
        rs.close();
        pst.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
    private void sTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sTableMouseClicked
    int selectedRow = sTable.getSelectedRow();
    if (selectedRow >= 0) {
        int subjId = Integer.parseInt(sTable.getValueAt(selectedRow, 0).toString());

        // populate subject fields in this form
        subjID.setText(sTable.getValueAt(selectedRow, 0).toString());
        subjcode.setText(sTable.getValueAt(selectedRow, 1).toString());
        subjdesc.setText(sTable.getValueAt(selectedRow, 2).toString());
        subjunits.setText(sTable.getValueAt(selectedRow, 3).toString());
        subjsched.setText(sTable.getValueAt(selectedRow, 4).toString());

        if (studentsForm != null) {
            studentsForm.setSelectedSubject(subjId);
        }
        try {
            TeacherForm.setSelectedSubject(subjId);
        } catch (Exception ignore) {}

        loadClassList(subjId);
    }    
    }//GEN-LAST:event_sTableMouseClicked
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ShowRecord();
    sTable.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = sTable.getSelectedRow();
            subjID.setText(sTable.getValueAt(row, 0).toString());      
            subjcode.setText(sTable.getValueAt(row, 1).toString());    
            subjdesc.setText(sTable.getValueAt(row, 2).toString());    
            subjunits.setText(sTable.getValueAt(row, 3).toString());   
            subjsched.setText(sTable.getValueAt(row, 4).toString());
        }
    });
    }//GEN-LAST:event_formWindowOpened
    
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
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem StudentsForm;
    private javax.swing.JScrollPane b;
    private javax.swing.JTable classListTable;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable sTable;
    private javax.swing.JButton save;
    private javax.swing.JTextPane subjID;
    private javax.swing.JTextPane subjcode;
    private javax.swing.JTextPane subjdesc;
    private javax.swing.JTextPane subjsched;
    private javax.swing.JTextPane subjunits;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
