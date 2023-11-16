/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bertoti.flor;

/**
 *
 * @author bianc
 */
public class Flor {

    private String cor;
    private Propriedades prop;

    public Flor(String cor, Propriedades prop) {
        this.cor = cor;
        this.prop = prop;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Propriedades getProp() {
        return prop;
    }

    public void setProp(Propriedades prop) {
        this.prop = prop;
    }
    
 
    
    
}
