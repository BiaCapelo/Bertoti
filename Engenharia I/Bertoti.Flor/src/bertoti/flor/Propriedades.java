/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bertoti.flor;

/**
 *
 * @author bianc
 */
public class Propriedades {
    
    private String comestivel;
    private String venenosa;
    private String continentedeorigem;

    public Propriedades(String comestivel, String venenosa, String continentedeorigem) {
        this.comestivel = comestivel;
        this.venenosa = venenosa;
        this.continentedeorigem = continentedeorigem;
    }

    public String getComestivel() {
        return comestivel;
    }

    public void setComestivel(String comestivel) {
        this.comestivel = comestivel;
    }

    public String getVenenosa() {
        return venenosa;
    }

    public void setVenenosa(String venenosa) {
        this.venenosa = venenosa;
    }

    public String getContinentedeorigem() {
        return continentedeorigem;
    }

    public void setContinentedeorigem(String continentedeorigem) {
        this.continentedeorigem = continentedeorigem;
        
    }
    
    public boolean comparar(Propriedades propriedades){
        return this.comestivel.equals(propriedades.comestivel)&& this.venenosa.equals(propriedades.venenosa)&& this.continentedeorigem.equals(propriedades.continentedeorigem);      
        }            
    }
    
