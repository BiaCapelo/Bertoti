/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bertoti.flor;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bianc
 */


public class Jardim {
    
    private List<Flor> flores = new LinkedList<Flor>();
    
    public void cadastrarFlor(Flor flor){
        flores.add(flor);
        
    }
    
    public List<Flor> buscarFlorPorPropriedade(Propriedades prop){
        
       List<Flor> floresEncontradas = new LinkedList<Flor>();
       for(Flor flor:flores){
           if(flor.getProp().comparar(prop)) floresEncontradas.add(flor);
           
       }
       return floresEncontradas;
       
    }
    
    public Flor buscarFlorPorCor(String cor){
        for (Flor flor:flores){
            if(flor.getCor().equals(cor)) return flor;
            
        }
        return null;
        
    }
    
    public List<Flor> getFlores(){
        return flores;
        
    }
}
