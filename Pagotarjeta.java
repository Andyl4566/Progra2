/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagotarjeta;

/**
 *
 * @author umg
 */
public class Pagotarjeta extends Transaccion {

    private String numerotarjeta;
    
    public void Pagotargeta(double monto, String numerotargeta){
        super(monto,fecha);    
        this.numerotarjeta = numerotarjeta;

}
    
}