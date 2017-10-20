package ArtistaPOJO;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Artista {
   
    
    private String NombreArtista, Sexo, Genero;
    private int Edad;
    
    public String getNombreArtista(){
        return NombreArtista;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public String getSexo(){
        return Sexo;
    }
    
    public String getGenero(){
        return Genero;
    }
    
    public boolean setNombreArtista(String NombreArtista){
        if(!this.NombreArtista.isEmpty())
        {
            return true;
        }
        else
            return false;
    }
    
    public boolean setEdad(int Edad){
        if(Edad > 0){
            return true;
        }
        else
            return false;
    }
    
    public boolean setSexo(String Sexo){
        if(!Sexo.isEmpty()){
            return true;
        }
        else
            return false;
    }
    
    public boolean setGenero(String Genero){
        if(!Genero.isEmpty()){
            return true;
        }
        else
            return false;
    } 
}
