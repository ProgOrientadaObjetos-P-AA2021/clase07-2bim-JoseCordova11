/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author Asus
 */
public class APIDisney implements APIMovie{
    
    private String apiKey;
    
    public void establecerApiKey (String apk){
        apiKey = apk+"77777";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
