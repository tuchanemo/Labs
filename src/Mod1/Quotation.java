/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod1;

/**
 * Worker class for module 1
 * @author Taurus
 */
public class Quotation {
    
    /**
     * Displays author's name and quotation on the new line with indent
     * @param author name of the author
     * @param quotation text of the quotation
     */
    public static void DisplayQuotation(String author , String quotation )
    {
        System.out.println(author+ " says: "+"\n\t'"+quotation+"'"); //to show quotation on the new line with indent
    }
    
}
