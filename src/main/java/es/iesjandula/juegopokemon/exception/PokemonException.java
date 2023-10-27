package es.iesjandula.juegopokemon.exception;

/**
 *
 * @author 2DAM
 */
public class PokemonException extends Exception
{
    /**
     * Complete exception constructor
     * @param error
     * @param ex 
     */
    public PokemonException(String error,Exception ex)
    {
        super(error,ex);
    }
    /**
     * Constructor that creates a exception using a simple String
     * @param error 
     */
    public PokemonException(String error)
    {
        super(error);
    }
}
