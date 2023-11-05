/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesjandula.juegopokemon.classes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author casaj
 */
public class MyObjectOutputStream extends ObjectOutputStream 
{
    public MyObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }
    
    @Override
    protected void writeStreamHeader()
    {
        
    }
}
