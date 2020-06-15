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
public class Tea extends CaffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("Pha Trà");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Thêm Chanh Muối");
    }
    
}
