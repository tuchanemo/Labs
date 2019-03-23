/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod1;

/**
 * Test class for module 1
 * @author Taurus
 */
public class QuotationTest {
    
    /**
     * Uses Quotation class to display quotation
     * @see Quotation#DisplayQuotation(java.lang.String, java.lang.String) 
     */
    public static void main(String[] args) {
        Quotation.DisplayQuotation("Confucius", "Wherever you go, go with all your heart");
        Quotation.DisplayQuotation(args[0], args[1]);
    }
    
}
