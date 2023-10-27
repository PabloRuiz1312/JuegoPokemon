package es.iesjandula.juegopokemon.classes;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import es.iesjandula.juegopokemon.exception.PokemonException;
/**
 *
 * @author Pablo Ruiz Canovas
 */
public class ParsePokemon 
{
    /**Class logegr*/
    Logger log = LogManager.getLogger();
    /**Array of strings that stores a pokemon*/
    private String [] pokemonInfo;
    /**
     * Constructor that initialize the pokemon info
     * @param pokemonInfo 
     */
    public ParsePokemon(String[] pokemonInfo) 
    {
        this.pokemonInfo = pokemonInfo;
    }
    /**
     * Getter hat return the pokemon info
     * @return the pokemon info
     */
    public String[] getPokemonInfo() 
    {
        return this.pokemonInfo;
    }
    
    public Pokemon parse() throws PokemonException
    {
        int id=0;
        String name="";
        String type="";
        String type2="";
        int hp = 0;
        String simpleAtk="";
        String specialAtck="";
        int dmgSmpAtk=0;
        int dmgSpcAtk=0;
        boolean legendary=false;
        int incDmg1=0;
        int incDmg2=0;
        int healSmplAtk=0;
        int healSpcAtk=0;
        String url="";
        String attToParse = "";
        id = this.parseNumber(this.pokemonInfo[0]);
        name = this.removeSpaces(this.pokemonInfo[1]);
        type = this.removeSpaces(this.pokemonInfo[2]);
        type2 = this.removeSpaces(this.pokemonInfo[3]);
        attToParse = this.removeSpaces(this.pokemonInfo[4]);
        hp = this.parseNumber(attToParse);
        simpleAtk = this.removeSpaces(this.pokemonInfo[5]);
        specialAtck = this.removeSpaces(this.pokemonInfo[6]);
        attToParse = this.removeSpaces(this.pokemonInfo[7]);
        dmgSmpAtk = this.parseNumber(attToParse);
        attToParse = this.removeSpaces(this.pokemonInfo[8]);
        dmgSpcAtk = this.parseNumber(attToParse);
        attToParse = this.removeSpaces(this.pokemonInfo[9]);
        if(attToParse.contains("true"))
        {
            legendary = true;
        }
        else
        {
            legendary = false;
        }
        attToParse = this.removeSpaces(this.pokemonInfo[10]);
        incDmg1 = this.parseNumber(attToParse);
        attToParse = this.removeSpaces(this.pokemonInfo[11]);
        incDmg2 = this.parseNumber(attToParse);
        attToParse = this.removeSpaces(this.pokemonInfo[12]);
        healSmplAtk = this.parseNumber(attToParse);
        attToParse = this.removeSpaces(this.pokemonInfo[13]);
        healSpcAtk = this.parseNumber(attToParse);
        url = this.removeSpaces(this.pokemonInfo[14]);
        
        return new Pokemon(id,name,type,type2,hp,simpleAtk,specialAtck,dmgSmpAtk,dmgSpcAtk,legendary,incDmg1,incDmg2,healSmplAtk,healSpcAtk,url);   
        
    }
    /**
     * Method that parse a String to number
     * @param numberToParse
     * @return the number parsed or -1 if there is a error
     * @throws PokemonException 
     */
    private int parseNumber(String numberToParse) throws PokemonException
    {
        int numberParsed = -1;
        try
        {
            numberParsed = Integer.parseInt(numberToParse);
        }
        catch(NumberFormatException ex)
        {
            String error = "Error parsing numbers";
            log.error(error,ex);
            throw new PokemonException(error,ex);
        }
        return numberParsed;
    }
    /**
     * Method that removes the first space of the attribute
     * @param attribute
     * @return the string withou space
     */
    private String removeSpaces(String attribute)
    {
        String newAttribute = attribute;
        if(attribute.startsWith(" "))
        {
            newAttribute = attribute.substring(0);
        }
        return newAttribute;
    }
    
    
}
