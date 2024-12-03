/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mills
 */
public class OldPhone implements Phone{

    /**
     * The brand of this OldPhone
    */

    private String brand;

    /**
     * Creates a new OldPhone with a given brand
     * @param the brand of this OldPhone
     */

    public OldPhone(String brand){
        this.brand = brand;
    }

    /**
     * return the brand of this OldPhone
     */

    public String getBrand(){
        return this.brand;
    }

    @Override
    public void call(String number) {

    }
}
