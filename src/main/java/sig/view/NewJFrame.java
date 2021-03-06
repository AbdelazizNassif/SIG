package sig.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.csv.CSVRecord;
import sig.controller.ActionsHandler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author dell
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        newInvoiceBtn = new javax.swing.JButton();
        newInvoiceBtn.addActionListener(actionsHandler);
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(actionsHandler);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        invoiceNum = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        saveBtn = new javax.swing.JButton();
        saveBtn.addActionListener(actionsHandler);
        cancelBtn = new javax.swing.JButton();
        cancelBtn.addActionListener(actionsHandler);
        dateLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenuItem();
        loadMenu.addActionListener(actionsHandler);
        saveMenu = new javax.swing.JMenuItem();
        saveMenu.addActionListener(actionsHandler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"rere", "rere", "rere", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jScrollPane1.setViewportView(lineTable);

        newInvoiceBtn.setText("New Invoice");
        newInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInvoiceBtnActionPerformed(evt);
            }
        });

        deleteInvoiceBtn.setText("Delete Invoice");
        deleteInvoiceBtn.setToolTipText("");
        deleteInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice  number");

        jLabel2.setText("Customer");

        jLabel3.setText("Date");

        jLabel4.setText("Total");

        jLabel5.setText("jLabel4");

        customerName.setText("jLabel4");

        totalLabel.setText("jLabel4");

        invoiceNum.setText("jLabel4");

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"rere", "rere", "rere", null},
                {"fref", "fefe", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        jScrollPane2.setViewportView(headerTable);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.setToolTipText("");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        dateLabel.setText("jLabel4");

        jMenu1.setText("File");

        loadMenu.setText("Load File");
        loadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenu);

        saveMenu.setText("Save file");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(newInvoiceBtn)
                        .addGap(40, 40, 40)
                        .addComponent(deleteInvoiceBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addGap(50, 50, 50)))
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addGap(40, 40, 40)
                        .addComponent(cancelBtn)
                        .addContainerGap(169, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoiceNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(customerName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(dateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addComponent(totalLabel)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveBtn)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newInvoiceBtn)
                        .addComponent(deleteInvoiceBtn)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuActionPerformed
        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {
            File f = filechooser.getSelectedFile();
            //String filepath = f.getPath();
            //String fi = f.getName();
            //Parsing CSV Data
            //System.out.print(filepath);
            //selected_file.setText(fi);
            DefaultTableModel csv_data = new DefaultTableModel();

            try {

                int start = 0;
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("test.csv"));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                for (CSVRecord csvRecord : csvParser) {
                    if (start == 0) {
                        start = 1;
                        csv_data.addColumn(csvRecord.get(0));
                        csv_data.addColumn(csvRecord.get(1));
                        csv_data.addColumn(csvRecord.get(2));
                        csv_data.addColumn(csvRecord.get(3));
                    } else {
                        Vector row = new Vector();
                        row.add(csvRecord.get(0));
                        row.add(csvRecord.get(1));
                        row.add(csvRecord.get(2));
                        row.add(csvRecord.get(3));
                        csv_data.addRow(row);
                    }
                }

            } catch (Exception ex) {
                System.out.println("Error in Parsing CSV File");
            }
            headerTable.setModel(csv_data);
        }
    }//GEN-LAST:event_loadMenuActionPerformed

    private void newInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newInvoiceBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Title xyz");
        int userSelection = jFileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = jFileChooser.getSelectedFile();
            // write to file
            try {
                FileWriter fileWriter = new FileWriter(fileToSave);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (int i=0; i<headerTable.getRowCount(); i++)
                {
                    for (int j=0; j<headerTable.getColumnCount(); j++)
                    {
                         bufferedWriter.write((String) headerTable.getValueAt(i, j));   
                    }
                    bufferedWriter.newLine();
                    //JOptionPane.showMessageDialog(this, "SUUCCESS", title, HEIGHT);g
                }
                bufferedWriter.close();
                fileWriter.close() ;
            } catch (IOException ioe) {
                System.out.println("Exception");
            }

        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void deleteInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoiceBtnActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JTable headerTable;
    private transient javax.swing.JLabel invoiceNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JButton newInvoiceBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

    private ActionsHandler actionsHandler = new ActionsHandler();

}
