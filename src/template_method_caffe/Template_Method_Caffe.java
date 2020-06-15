/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template_method_caffe;

/**
 *
 * @author Nhan
 */
public class Template_Method_Caffe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cách Pha Caffe");
        CaffeineBeverage phacaffe = new Coffe();
        phacaffe.PhaThucUong();
        
         System.out.println("Cách Pha Trà");
         CaffeineBeverage phatea = new Tea();
         phatea.PhaThucUong();;
    }
    
}
