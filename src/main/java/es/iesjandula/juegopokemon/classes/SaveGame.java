package es.iesjandula.juegopokemon.classes;

import java.util.List;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author casaj
 */
public class SaveGame 
{
    /**Class logger*/
    Logger log = LogManager.getLogger();
    /**First list of pokemons*/
    private List <Pokemon> pokeList1;
    /**Second list of pokemons*/
    private List <Pokemon> pokeList2;
    /**File were the pokemon will be save*/
    private final File file;
    
    /**
     * Complete constructor to initialize the lists and save them 
     * @param pokeList1
     * @param pokeList2 
     */
    public SaveGame(List<Pokemon> pokeList1, List<Pokemon> pokeList2) 
    {
        this.pokeList1 = pokeList1;
        this.pokeList2 = pokeList2;
        file = new File("src/main/resources/partidaGuardada.txt");
    }
    /**
     * Method that save the game by each iteraction
     */
    public void writeGame()
    {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        this.file.delete();
        try
        {
            if(this.file.exists())
            {
                fos = new FileOutputStream(this.file,true);
                oos = new MyObjectOutputStream(fos);
            }
            else
            {
                fos = new FileOutputStream(this.file,true);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(this.pokeList1);
            oos.writeObject(this.pokeList2);
            oos.flush();
        }
        catch(IOException ex)
        {
            log.error("Error al guardar la partida",ex);
        }
        finally
        {
            try
            {
                if(oos!=null)
                {
                    oos.close();
                }
                if(fos!=null)
                {
                    fos.close();
                }
            }
            catch(IOException ex)
            {
                log.error("Error al cerrar el fichero", ex);
            }
            
        }
        
    }
    
    
    
    
}
