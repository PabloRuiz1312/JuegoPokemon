package es.iesjandula.juegopokemon.classes;
import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author Pablo Ruiz Canovas
 */
public class Starter 
{
    /**Class Logger*/
    private static Logger log = LogManager.getLogger();
    /**Pokemon list*/
    private List <Pokemon> pokemons;
    /**Id pokemon list*/
    private List <Integer> pokemonId;
    /**
     * Constructor that load all pokemons in the list
     * @param pokemons 
     */
    public Starter(List<Pokemon>pokemons)
    {
        this.pokemons = pokemons;
        this.pokemonId = new LinkedList<Integer>();
    }
    /**
     * Getter that return the pokemon list
     * @return the pokemon list
     */
    public List<Pokemon> getPokemons()
    {
        return this.pokemons;
    }
    /**
     * Method that return the 5 pokemons that will play the game
     * @return the pokemons
     */
    public List<Pokemon> selectPokemons()
    {
        int count = 0;
        List <Pokemon> playPokemon = new LinkedList<Pokemon>();
        int id = 0;
        while(count<5)
        {
            if(count==0)
            {
                id = (int)(Math.random()*this.pokemons.size()+1);
                if(!idRepeated(id))
                {
                    for(Pokemon p:this.pokemons)
                    {
                        if(id==p.getId())
                        {
                            playPokemon.add(p);
                            this.pokemonId.add(id);
                            break;
                        }
                    }
                    count++;
                }
                
            }
            else
            {
                id = (int)(Math.random()*this.pokemons.size()+1);
                if(this.idRepeated(id))
                {
                    count+=0;
                }
                else
                {
                    for(Pokemon p:this.pokemons)
                    {
                        if(id==p.getId())
                        {
                            playPokemon.add(p);
                            this.pokemonId.add(id);
                            break;
                        }
                    }
                    count++;
                }
            }
        }
        return playPokemon;
        
    }
    /**
     * This method check that the pokemon id doesnt repeat
     * @param id
     * @param ids
     * @return 
     */
    private boolean idRepeated(int id)
    {
        boolean repeat = false;
        for(Integer i:this.pokemonId)
        {
            if(i==id)
            {
                repeat = true;
                break;
            }
        }
        return repeat;
    }
    
    
    
}
