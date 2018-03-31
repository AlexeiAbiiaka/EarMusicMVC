package earmusicmvc;

/********************************************************************
 * Programmer:	Alexei Abiiaka
 * Class:  CS30S
 *
 * Assignment: Ax Qy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;

public class EarMusicMVC {  // begin class
    
    public static void main(String[] args) {  // begin main

    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		        // delimiter string for splitting input string
    	String tabSpace = "      ";	        // six spaces
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name:		Alexei Abiiaka");
    	System.out.println("Class:		CS30S");
    	System.out.println("Assignment:	        Ax Qy");
    	System.out.println("*******************************************");

    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		Alexei Abiiaka\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	Ax Qy\n";
    	bannerOut += "*******************************************\n\n";

    // ************************ processing ***************************
	
    EarMusicGUI earMusicGUI = new EarMusicGUI();
    earMusicGUI.setVisible(true);

    Controller controller = new Controller();
		
    earMusicGUI.addController(controller);  // register controller with view
    controller.addUI(earMusicGUI);	    // register view with controller    

 
    // ************************ print output ****************************
    
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
    }  // end main
}  // end class