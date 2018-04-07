/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earmusicmvc;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author abiiaka
 */
public class EarMusicGUI extends javax.swing.JFrame {
    
   	private Controller c;		// pointer to the controller
	protected DefaultListModel clientListModel = new DefaultListModel();
	protected ClientTableModel clientDetailModel = new ClientTableModel();
    /**
     * Creates new form EarMusicGUI
     */
    public EarMusicGUI() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        jSlider1 = new javax.swing.JSlider();
        jProgressBar1 = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jCheckBox4 = new javax.swing.JCheckBox();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        headsetTypeLabel = new javax.swing.JLabel();
        headsetTypeCombo = new javax.swing.JComboBox<>();
        wirelessTypeLabel = new javax.swing.JLabel();
        wirelessTypeCombo = new javax.swing.JComboBox<>();
        brandTypeLabel = new javax.swing.JLabel();
        brandTypeCombo = new javax.swing.JComboBox<>();
        submitBt = new javax.swing.JButton();
        clearBt = new javax.swing.JButton();
        microphoneTypeLabel = new javax.swing.JLabel();
        microphoneTypeCombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        clientInformationLabel = new javax.swing.JLabel();
        saveListBt = new javax.swing.JButton();
        loadListBt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        clientDetailLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientDetailTable = new javax.swing.JTable();

        jCheckBox1.setText("jCheckBox1");

        jToolBar1.setRollover(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox3.setText("jCheckBox3");

        jCheckBox2.setText("jCheckBox2");

        jCheckBox4.setText("jCheckBox4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray)));

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name: ");

        headsetTypeLabel.setText("Headset Type: ");

        headsetTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Headphones", "Earbuds" }));

        wirelessTypeLabel.setText("Wirelss Type:");

        wirelessTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Wireless", "Not Wireless" }));

        brandTypeLabel.setText("Brand Type: ");

        brandTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Beats", "Bose", "JBL", "SkullCandy" }));
        brandTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandTypeComboActionPerformed(evt);
            }
        });

        submitBt.setText("Submit");
        submitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtActionPerformed(evt);
            }
        });

        clearBt.setText("Clear");
        clearBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtActionPerformed(evt);
            }
        });

        microphoneTypeLabel.setText("Microphone Type: ");

        microphoneTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Microphone", "No Microphone" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(submitBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearBt)
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wirelessTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandTypeLabel)
                    .addComponent(brandTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headsetTypeLabel)
                    .addComponent(headsetTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wirelessTypeLabel)
                    .addComponent(microphoneTypeLabel)
                    .addComponent(microphoneTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brandTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brandTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headsetTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headsetTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wirelessTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wirelessTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(microphoneTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(microphoneTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBt)
                    .addComponent(clearBt)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray)));

        clientInformationLabel.setText("Client Information");

        saveListBt.setText("Save List");
        saveListBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveListBtActionPerformed(evt);
            }
        });

        loadListBt.setText("Load List");
        loadListBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadListBtActionPerformed(evt);
            }
        });

        clientList.setModel(clientListModel);
        clientList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                clientListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(clientList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clientInformationLabel))
                    .addComponent(saveListBt)
                    .addComponent(loadListBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(clientInformationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveListBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadListBt)
                        .addGap(18, 18, 18))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray)));

        clientDetailLabel.setText("Client Detail");

        jScrollPane3.setBackground(new java.awt.Color(255, 102, 0));

        clientDetailTable.setModel(clientDetailModel);
        clientDetailTable.setGridColor(new java.awt.Color(255, 153, 0));
        clientDetailTable.setShowGrid(true);
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);
        clientDetailTable.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
        jScrollPane3.setViewportView(clientDetailTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(clientDetailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientDetailLabel))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brandTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandTypeComboActionPerformed
        System.out.println("item selected");
        		
		if(brandTypeCombo.getSelectedItem().equals("Select One")){
			wirelessTypeCombo.setEnabled(true);
			microphoneTypeCombo.setEnabled(true);
			wirelessTypeCombo.setSelectedIndex(0);
			microphoneTypeCombo.setSelectedIndex(0);
			headsetTypeCombo.setEnabled(true);
			headsetTypeCombo.setSelectedIndex(0);			
		} // end if (no selection made
		else{
			if(brandTypeCombo.getSelectedItem().equals("Bose")){
				System.out.println("Bose brand selected");
			wirelessTypeCombo.setEnabled(false);
			microphoneTypeCombo.setEnabled(false);
			wirelessTypeCombo.setSelectedIndex(2);
			microphoneTypeCombo.setSelectedIndex(2);
			headsetTypeCombo.setEnabled(true);
			headsetTypeCombo.setSelectedIndex(0);
			} // end if (intensive care room)
		else{
				System.out.println("other type brand selected");
			wirelessTypeCombo.setEnabled(true);
			microphoneTypeCombo.setEnabled(true);
			wirelessTypeCombo.setSelectedIndex(0);
			microphoneTypeCombo.setSelectedIndex(0);
			headsetTypeCombo.setEnabled(true);
			headsetTypeCombo.setSelectedIndex(0);
			} // end else (not intensive care room)
		} // end else a room selection has been made
        
    }//GEN-LAST:event_brandTypeComboActionPerformed

    private void clearBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtActionPerformed
        System.out.println("clear button clicked");
        resetIn();
    }//GEN-LAST:event_clearBtActionPerformed

    private void submitBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtActionPerformed
         System.out.println("submit button clicked");
         String firstName = firstNameTxt.getText();
		String lastName = lastNameTxt.getText();

		char brandType = getBrandType();
		char headsetType = getHeadsetType();
		char wirelessType = getWirelessType();
		char microphoneType = getMicrophoneType();
		
		System.out.println("first name: " + firstName);
		System.out.println("last name: " + lastName);

		resetIn();
		
		c.submitButtonClicked(firstName, lastName, brandType, headsetType, wirelessType, microphoneType);
         
    }//GEN-LAST:event_submitBtActionPerformed

    private void saveListBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveListBtActionPerformed
        c.writeClientList();
    }//GEN-LAST:event_saveListBtActionPerformed

    private void loadListBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadListBtActionPerformed
        c.getClientList();
    }//GEN-LAST:event_loadListBtActionPerformed

    private void clientListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_clientListValueChanged
        //System.out.println("patient record selected.");
		//patientDetailTxt.setText("blah blahs");
		
		// get the index of the selected record
		int n = clientList.getSelectedIndex();
		
		/**
		 * send the index of the record to the controller
		 * getPatient method
		 * get patient gets the record fro mthe arraylist
		 * calculates the details, appends details to a string 
		 * and return the string to the patient detail text area 
		 * in the gui
		 */
                Client client = c.getClient(n);
		clientDetailModel.setClient(client);
    }//GEN-LAST:event_clientListValueChanged

    protected void loadClientListModel(ArrayList<Client> list){
                c.clear();
		for(Client cl: list) {
			c.addClient(cl);
                }
		
		
		c.loadListButtonClicked(list.get(list.size() - 1));
		
	} // end loadClientListModel
        
    	private void resetIn(){
		firstNameTxt.setText("");
		lastNameTxt.setText("");
		
		brandTypeCombo.setSelectedIndex(0);
		headsetTypeCombo.setSelectedIndex(0);
		wirelessTypeCombo.setSelectedIndex(0);
		microphoneTypeCombo.setSelectedIndex(0);
		
		firstNameTxt.requestFocus();
	} // end reSetInputs()
    
        private char getBrandType(){
		System.out.println("getBrandType open");
		
		char bt = 'U';		// temp brand type code
		
		if(brandTypeCombo.getSelectedItem().toString().equals("Beats")){
			        bt = 'B';
		} // end if (Beats)
                else if(brandTypeCombo.getSelectedItem().toString().equals("Bose")) {
				bt = 'A';
                } else if(brandTypeCombo.getSelectedItem().toString().equals("JBL")){
				bt = 'J';			
		} else if(brandTypeCombo.getSelectedItem().toString().equals("SkullCandy")) {
                                bt = 'O';			
                } // end else (Skull Candy)
		return bt;
	} // end getBrandTyoe
	
	private char getHeadsetType(){
		char ht = 'X';
		
		        if(headsetTypeCombo.getSelectedItem().toString().equalsIgnoreCase("Headphones"))
			ht = 'H';
		else
			if(headsetTypeCombo.getSelectedItem().toString().equalsIgnoreCase("Earbuds"))
				ht = 'E';
		else
				ht = 'S';
		
		System.out.println("getHeadsetType open");
		return ht;
	} // end getHeadsetType

	private char getWirelessType(){
		char wt = 'Q';
		
		    if(wirelessTypeCombo.getSelectedItem().toString().equalsIgnoreCase("Wireless"))
			wt = 'W';
		else
                    if(wirelessTypeCombo.getSelectedItem().toString().equalsIgnoreCase("Not Wireless"))
			wt = 'K';
                else
                        wt = 'P';
		
		System.out.println("getWirelessType open");
		return wt;
	} // end getWirelessType

	private char getMicrophoneType(){
		char mt = 'Z';
		
		System.out.println("getMicrophoneType open");
		
		if(microphoneTypeCombo.getSelectedItem().toString().equalsIgnoreCase("Microphone"))
			mt = 'M';
		else
                    if(microphoneTypeCombo.getSelectedItem().toString().equalsIgnoreCase("No Microphone"))
			mt = 'N';
                else
                        mt = 'L';
		
		return mt;
	} // end getMicrophoneType
    
    
    
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
            java.util.logging.Logger.getLogger(EarMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EarMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EarMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EarMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EarMusicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brandTypeCombo;
    private javax.swing.JLabel brandTypeLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton clearBt;
    private javax.swing.JLabel clientDetailLabel;
    private javax.swing.JTable clientDetailTable;
    private javax.swing.JLabel clientInformationLabel;
    private javax.swing.JList<String> clientList;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JComboBox<String> headsetTypeCombo;
    private javax.swing.JLabel headsetTypeLabel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JButton loadListBt;
    private javax.swing.JComboBox<String> microphoneTypeCombo;
    private javax.swing.JLabel microphoneTypeLabel;
    private javax.swing.JButton saveListBt;
    private javax.swing.JButton submitBt;
    private javax.swing.JComboBox<String> wirelessTypeCombo;
    private javax.swing.JLabel wirelessTypeLabel;
    // End of variables declaration//GEN-END:variables

    void addController(Controller controller) {
        c = controller;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
