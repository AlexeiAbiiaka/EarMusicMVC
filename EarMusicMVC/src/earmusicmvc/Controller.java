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
	 protected Client getClient(int i){
		 return clientList.get(i);
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
                 addClient(cl);
		 
	 } // end submit button clicked
 
         public void addClient(Client cl) {
		 clientList.add(cl);
		 ui.clientListModel.addElement(cl);
		 // add client record to the list in gui
         }
         
         public void clear() {
                //clientList.clear();
                ui.clientListModel.removeAllElements();
         }
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
			 e.printStackTrace();
		 } // end catch io exception
		 
	 } // end writeClientList
	 
	 
	//*****************************************************
    // Purpose: get the client list from disk file, called from gui
    // Interface: IN: none
    // Returns: none
    // *****************************************************
	 protected void getClientList(){
             ArrayList<Client> list = null;
		 try{
			 FileInputStream fis = new FileInputStream("client.tmp");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 
			 try{
				 list = (ArrayList<Client>)ois.readObject();
			 } // end try to read client list from disk
			 catch(ClassNotFoundException e){
				 
			 } // end catch class not found
		 } // end try to open streams
		 catch(IOException e){
			 
		 } // end catch IOException
		 
                 if (list!=null)
                    ui.loadClientListModel(list);
		 
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
