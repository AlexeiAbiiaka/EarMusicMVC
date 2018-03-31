package earmusicmvc;

// **********************************************************************
// Programmer:	Alexei Abiiaka
// Class:		CS30S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class Client
 {  // begin class
 	
        private static int nextID = 1000;
    
 	// *********** class constants **********
        
        private static final int beatsRate = 300;
        private static final int boseRate = 150;
 	private static final int jblRate = 200;
        private static final int skullCandyRate = 100;
        
        private static final int headphonesHeadset = 20;
        private static final int earbudsHeadset = 10;
        
        private static final int wirelessRate = 50;
        private static final int noneWirelessRate = 5;
        
        private static final int microphoneRate = 20;
        private static final int noneMicrophoneRate = 5;
        
 	// ********** instance variable **********
        
        private String firstName;
        private String lastName;
        
        private int id = 0;    
        
        private char brandType;
        private char headsetType;
        private char wirelessType;
        private char microphoneType;
 	
 	// ********** constructors ***********
        
         public Client(){
         id = nextID++;                                     // assign id and increment global next id value
         
         brandType = 'X';
         headsetType = 'X';
         wirelessType = 'X';
         microphoneType = 'X';
         
         System.out.println("creating new client.");
        } // end default construcor
 	
             
        public Client(String fn,                 // first name
                      String ln,                 // last name
                      char bt,                   // brand type
                      char ht,                   // headset type
                      char wt,                   // wireless type
                      char mt){                  // microphone type
         firstName = fn;
         lastName = ln;
         
         id = nextID++;          // assign id and increment global next id value      
         brandType = bt;
         headsetType = ht;
         wirelessType = wt;
         microphoneType = mt;
         
         System.out.println("creating new client.");         
        } // end initialized constructor 
 	// ********** accessors **********
        
           //*****************************************************
    // Purpose: get the clients id number
    // Interface: IN: na
    // Returns: id
    // *****************************************************   
     public int getId(){
         return id;
     } // end getId
     
    //*****************************************************
    // Purpose: calculate and return the cost of type of headset
    // Interface: IN: na
    // Returns: headset cost
    // *****************************************************   
     public int getHeadsetCost(){
         int headsetCost = 0;
         
         switch (headsetType) {
             case 'I':
                 headsetCost = headphonesHeadset;
                 break;
             default:
                 headsetCost = earbudsHeadset;
                 break;
         }
         return headsetCost;
     } // end get headset cost
     
    //*****************************************************
    // Purpose: calculate and return the brand cost
    // Interface: IN: na
    // Returns: brand cost
    // *****************************************************   
     public int getBrandCost(){
         int brandCost = 0;
         
         switch (brandType) {
             case 'X':
                 brandCost = beatsRate;
                 break;
             case 'N':
                 brandCost = boseRate;
                 break;
             case 'V':
                 brandCost = jblRate;
                 break;
             default:
                 brandCost = boseRate;
                 break;
         }
         return brandCost;
     } // end get brand cost
     
    //*****************************************************
    // Purpose: calculate and return the cost of wireless
    // Interface: IN: na
    // Returns: wirless cost
    // *****************************************************   
     public int getWirelessCost(){
         int wirelessCost = 0;
         
         switch (wirelessType) {
             case 'I':
                 wirelessCost = wirelessRate;
                 break;
             default:
                 wirelessCost = noneWirelessRate;
                 break;
         }
         return wirelessCost;
     } // end get tv cost
     
    //*****************************************************
    // Purpose: calculate and return the cost of microphone
    // Interface: IN: na
    // Returns: microphone cost
    // *****************************************************   
     public int getmicrophoneCost(){
         int microphoneCost = 0;
         
         switch (microphoneType) {
             case 'I':
                 microphoneCost = microphoneRate;
                 break;
             default:
                 microphoneCost = noneMicrophoneRate;
                 break;
         }
         return microphoneCost;
     } // end get phone cost
     
    //*****************************************************
    // Purpose: calculate and return the total cost
    // Interface: IN: na
    // Returns: total cost
    // *****************************************************
     public int getTotalCost(){
        return this.brandType + this.headsetType + this.microphoneType + this.wirelessType;
     } // end get total bill
     
    // *****************************************************   
     
    // ********** mutators **********
     
    //*****************************************************
    // Purpose: change the headset type code for a client
    // Interface: IN: new headset type code
    // Returns: na
    // *****************************************************
     public void setHeadsetType(char ht){
        headsetType = ht;
     } // end set headset type
     
    //*****************************************************
    // Purpose: change the brand type code for a client
    // Interface: IN: new brand type code
    // Returns: na
    // *****************************************************
     public void setBrandType(char bt){
        brandType = bt;
     } // end set brand type    
     
    //*****************************************************
    // Purpose: change the wireless type code for a client
    // Interface: IN: new wireless type code
    // Returns: na
    // *****************************************************
     public void setWirelessType(char wt){
        wirelessType = wt;
     } // end set wireless type
     
    //*****************************************************
    // Purpose: change the microphone type code for a client
    // Interface: IN: new microphone type code
    // Returns: na
    // *****************************************************
     public void setMicrophoneType(char mt){
        microphoneType = mt;
     } // end set microphone type
     
    //*****************************************************
    // Purpose: set next id to last loaded client id + 1
    // Interface: IN: new next id number
    // Returns: na
    // *****************************************************
     public void setNextId(int n){
        nextID = n;
     } // end set NextId type 
     
//*****************************************************
// Purpose: override the toString method
// Interface: IN: na
// Returns: formatted output
// *****************************************************
     public String toString(){
            String strout = "ID: " + id + " " + headsetType +  " " + brandType +  " " + wirelessType +  " " + microphoneType;
         return strout;
     } // end getHeadsetCost
 }  // end class
