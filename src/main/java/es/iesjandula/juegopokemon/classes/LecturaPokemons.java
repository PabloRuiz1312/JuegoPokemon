package es.iesjandula.juegopokemon.classes;
import es.iesjandula.juegopokemon.exception.PokemonException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 *
 * @author Pablo Ruiz Canovas
 */
public class LecturaPokemons 
{
    /**Class logger*/
    Logger log = LogManager.getLogger();
    /**File that read all pokemon information*/
    private final File pokemonsFile;
    /**List that stores all normal pokemons*/
    private List <Pokemon> normalPokeList; 
    /**List that stores all legendaries pokemons*/
    private List <Pokemon> legendaryPokeList;

    /**
     * Default constructor that instance the 
     */
    public LecturaPokemons() 
    {
        this.pokemonsFile = new File("src/main/resources/pokemons.txt");
        this.normalPokeList = new LinkedList<Pokemon>();
        this.legendaryPokeList = new LinkedList<Pokemon>();
    }
    /**
     * Getter thet return the pokemons file
     * @return the pokemon file
     */
    public File getPokemonsFile() 
    {
        return this.pokemonsFile;
    }
    /**
     * Getter thet return the pokemons file
     * @return the normal pokemon list
     */
    public List<Pokemon> getNormalPokeList() 
    {
        return this.normalPokeList;
    }
    /**
     * Getter thet return the legendary pokemon list
     * @return the legendary pokemon list
     */
    public List<Pokemon> getLegendaryPokeList() 
    {
        return this.legendaryPokeList;
    }
    
    public void readNormalPokemons() throws PokemonException
    {
        String line = "";
        String [] attributes = null;
        Pokemon pokemon = null;
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader(this.pokemonsFile);
            br = new BufferedReader(fr);
            line = br.readLine();
            while(line!=null)
            {
                attributes = line.split(" ");
                ParsePokemon parser = new ParsePokemon(attributes);
                pokemon = parser.parse();
                this.normalPokeList.add(pokemon);
            }
        }
        catch(FileNotFoundException ex)
        {
            String error = "Problem to find the pokemons file";
            log.fatal(error,ex);
            throw new PokemonException(error,ex);
        }
        catch(IOException ex)
        {
            String error = "Error loading pokemons";
            log.fatal(error,ex);
            throw new PokemonException(error,ex);
        }
    }
    @Override
    public String toString() {
        return "LecturaPokemons{" + "pokemonsFile=" + pokemonsFile + ", normalPokeList=" + normalPokeList + ", legendaryPokeList=" + legendaryPokeList + '}';
    }
    
    
    
    
    
    
}
