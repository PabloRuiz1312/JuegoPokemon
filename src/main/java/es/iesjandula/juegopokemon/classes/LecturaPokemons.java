package es.iesjandula.juegopokemon.classes;
import java.io.File;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author Pablo Ruiz Canovas
 */
public class LecturaPokemons 
{
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

    @Override
    public String toString() {
        return "LecturaPokemons{" + "pokemonsFile=" + pokemonsFile + ", normalPokeList=" + normalPokeList + ", legendaryPokeList=" + legendaryPokeList + '}';
    }
    
    
    
    
    
    
}
