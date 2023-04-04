
/** Required package class namespace */
package controllers;

/** Required imports */
import data.DataStructures;
import data.Receipt;
import java.awt.List;
import javax.swing.JFrame;
import userinterfaces.MenuUI;
import userinterfaces.ViewReceiptUI;

/**
 * ViewReceiptController.java - this class is connected to the view receipt and 
 * receipts user interface for viewing all the receipts and the contents of each
 * receipt. This controller class stores all the methods and code to be run that
 * is associated with the view receipt UI and the receipts UI. This controller 
 * class connects to the view the user has of the view receipt user interface
 * and the receipts user interface
 * 
 * @author mikex
 */
public class ViewReceiptController {
    
    // Private/encapsulated property of this class
    private ViewReceiptUI viewReceiptUI;
    private List receiptList;

    /**
     * Constructor method that adds the passed receipt to the collection
     * 
     * @param receipt the receipt object 
     */
    public ViewReceiptController(Receipt receipt) {
        DataStructures.receipts.addToLinkedList(receipt);
    }
    
    /**
     * Constructor method that sets the viewReceiptUI property of the class
     * 
     * @param viewReceiptUI the viuewReceiptUI class
     */
    public ViewReceiptController(ViewReceiptUI viewReceiptUI) {
        this.viewReceiptUI = viewReceiptUI;
    }
    
    /**
     * Constructor method that sets the receiptList class property
     * @param receiptList the list that displays all the receipts in receipts UI
     */
    public ViewReceiptController(List receiptList) {
        this.receiptList = receiptList;
    }
    
    /**
     * Displays all the receipts that are stored in the data base (if there are
     * any) and error checks the listbox
     */
    public void displayAllReceipts() {
        // If there are no receipts collection (database)
        if (DataStructures.receipts.isEmpty() == true) {
            // Outputs there are no receipts collection (database
            DataStructures.dialogs.output("There are no receipts");
            return;         // Exits the method early
        }
        // Displays all receipts in the listbox
        DataStructures.receipts.displayAll(receiptList);
    }
    
    /**
     * Displays the contents of the receipt by instantiating a new view receipt
     * UI and error checks to make sure that a receipt was selected
     */
    public void displaySelectedReceipt() {
        // Gets the selected index of the listbox
        int index = receiptList.getSelectedIndex();
        // If nothing is selected (no index)
        if (index == -1) {
            // Prompts the user to select a receipt
            DataStructures.dialogs.output("Please select a receipt");
            return;         // Exits the method early
        }
        // Displays the contents of the selected receipt
        DataStructures.receipts.displaySelected(index);
    }
    
    /**
     * Deletes the selected receipt from the database and the listbox and error
     * checks to make sure that an receipt was selected
     */
    public void deleteSelectedReceipt() {
        // Gets the selected index of the listbox
        int index = receiptList.getSelectedIndex();
        // If nothing is selected (no index)
        if (index == -1) {
            // Prompts the user to select a receipt
            DataStructures.dialogs.output("Please select a receipt");
            return;         // Exits the method early
        }
        // Deletes the selected receipt from listbox and database
        DataStructures.receipts.deleteSelected(index, receiptList);
    }
    
    /**
     * When button is pressed, searches through all receipts for matching search
     * results based on the type of search and the text to search for after
     * checking to make sure list is not empty
     * 
     * @param receiptList the list the receipts are displayed in
     * @param choice the type of search to conduct
     * @param text the text to search for
     */
    public void searchAllReceipts(List receiptList, String choice, String text) {
        // If the list is empty then informs user the list is empty
        if (DataStructures.receipts.isEmpty() == true) {
            DataStructures.dialogs.output("There are no receipts");
            return;         // Ends method early
        }
        // Calls the search method
        DataStructures.receipts.search(receiptList, choice, text);
    }
    
    /**
     * Closes the a receipt UI and saves the receipt data to a permanent file
     * 
     * @param frame the JFrame to be disposed of
     */
    public void closing(JFrame frame) {
        DataStructures.receipts.closing();
        frame.dispose();
    }
    
    /**
     * Instantiates a new menu UI
     */
    public void menu() {
        new MenuUI();
    }
}
