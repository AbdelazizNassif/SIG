/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class ActionsHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "New Invoice":
                System.out.println("nwe inv");
                break ;
            case "Delete Invoice":
                System.out.println("del inv");
                break ;
//            case "Load File":
//                loadFile ();
//                break ;
        }
    }

//    private void loadFile() {
//        try {
//
//            BufferedReader br = new BufferedReader(new FileReader(new File("test.csv")));
//            List<String[]> elements = new ArrayList<String[]>();
//            String line = null;
//            while((line = br.readLine())!=null) {
//                String[] splitted = line.split(";");
//                elements.add(splitted);
//            }
//            br.close();
//
//            //JTable table = new JTable();
//            String[] columNames = new String[] {
//                    "ID", "Country", "Status", "Person"
//                };
//
//            Object[][] content = new Object[elements.size()][4];
//
//            for(int i=0; i<elements.size(); i++) {
//                content[i][0] = elements.get(i)[0];
//                content[i][1] = elements.get(i)[1];
//                content[i][2] = elements.get(i)[2];
//                content[i][3] = elements.get(i)[3];
//            }
//
//            headerTable.setModel(new DefaultTableModel(content,columNames));
//
//            System.out.println(table.getModel().getValueAt(1, 1));
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
    
}
