package earmusicmvc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author abiiaka
 */
public class Controller {

 	// ********** instance variable **********
	 
	 private EarMusicGUI ui;
	 private ArrayList<Client> clientList = new ArrayList();
	 private Client cl = null;
 	
 	// ********** constructors ***********
	 
    //*****************************************************
    // Purpose: create a new controller object
    // Interface: IN: none
    // Returns: none
    // ***************************************************** 
	 public Controller(){
		 System.out.println("Controller works!");
	 } // end contructor
	 
 	// ********** accessors **********
 	
    //*****************************************************
    // Purpose: get details of a client record
    // Interface: IN: index of client in list
    // Returns: client detail: String
    // *****************************************************
	 protected String getClient(int i){
		 cl = clientList.get(i);
		 
		 String detail = "Client ID: " + cl.getId() + "\n";
		 detail += "Brand Cost: " + cl.getBrandCost() + "\n";
		 detail += "Total Cost: " + cl.getTotalCost() + "\n";
		 
		 return detail;
	 } // end getClient
         
 	// ********** mutators **********
	 
    //*****************************************************
    // Purpose: create a new client record and add it to the list
    // Interface: IN: client details
    // Returns: na
    // *****************************************************
	 public void submitButtonClicked(String fn, String ln,
			char bt, char ht, char wt, char mt){
		 System.out.println("submit button clicked");
		 
		 cl = new Client(fn, ln, bt, ht, wt, mt);
		 clientList.add(cl);
		 ui.clientListModel.addElement(cl);
		 // add client record to the list in gui
		 
	 } // end submit button clicked
 
    //*****************************************************
    // Purpose: register the view with the controller
    // Interface: IN: view object
    // Returns: 
    // *****************************************************
	protected void addUI(EarMusicGUI g){
		System.out.println("ui added to controller.");
		this.ui = g;
	} // end addUI
	
	 
	//*****************************************************
    // Purpose: write the client list to a random access disk file
    // Interface: IN: none, client list is property of this class
    // Returns: none
    // ***************************************************** 
	 protected void writeClientList(){
		 try{
			 FileOutputStream fos = new FileOutputStream("client.tmp");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 
			 oos.writeObject(clientList);
			 oos.close();
		 } // end try to open output object stream
		 catch(IOException e){
			 
		 } // end catch io exception
		 
	 } // end writeClientList
	 
	 
	//*****************************************************
    // Purpose: get the client list from disk file, called from gui
    // Interface: IN: none
    // Returns: none
    // *****************************************************
	 protected void getClientList(){
		 try{
			 FileInputStream fis = new FileInputStream("client.tmp");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 
			 try{
				 clientList = (ArrayList<Client>)ois.readObject();
			 } // end try to read client list from disk
			 catch(ClassNotFoundException e){
				 
			 } // end catch class not found
		 } // end try to open streams
		 catch(IOException e){
			 
		 } // end catch IOException
		 
		 ui.loadClientListModel(clientList);
		 
	 } // end getClientList
	 
	 
	//*****************************************************
    // Purpose: set the next id property to n when list is loaded from disk
    // Interface: IN: Client: p
    // Returns: none
    // ***************************************************** 
	 protected void loadListButtonClicked(Client cl){
		 int nid = cl.getId();
		 cl.setNextId(++nid);
	 } // end loadListButtonClicked
}
