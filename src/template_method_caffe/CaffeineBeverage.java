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
public abstract class CaffeineBeverage {
    protected void prepareRecipe ()
    {
        System.out.println("Chuẩn Bị Nguyên liệu");
    }
    protected void boildwater()
    {
        System.out.println("Đun sôi nước");
    }
    protected void pourlnCup()
    {
        System.out.println("Rót ra cốc");
    }
    protected abstract void brew();
    protected abstract void addCondiment();
     public final void PhaThucUong() {
        prepareRecipe();
        boildwater();
        brew();
        pourlnCup();
        addCondiment();
    }
    
}
