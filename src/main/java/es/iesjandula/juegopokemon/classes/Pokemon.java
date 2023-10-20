package es.iesjandula.juegopokemon.classes;
import java.io.Serializable;

/**
 *
 * @author Pablo Ruiz Canovas
 */
public class Pokemon implements Serializable
{
    /**Pokemon id */
    private int id;
    /**Pokemon name*/
    private String name;
    /**Main type of the pokemon */
    private String type1;
    /**Secondary type of the pokemon*/
    private String type2;
    /**Hp of the pokemon*/
    private int hp;
    /**Simple attack that do the pokemon */
    private String simpleAttack;
    /**Special attack that do the pokemon */
    private String specialAttack;
    /**Damage of the simple attack*/
    private int simpleAttackDmg;
    /**Damage of the special attack*/
    private int specialAttackDmg;
    /**The pokemon is legendary?*/
    private boolean legendary;
    /**The damage of the simple attack increments? */
    private int incDamage1;
    /**The damage of the special attack increments? */
    private int incDamage2;
    /**The simple attack heals the pokemon */
    private int healSimpleAttack;
    /**The special attack heals the pokemon */
    private int healSpecialAttack;
    
    /**
     * Complete constructor
     * @param id
     * @param name
     * @param type1
     * @param type2
     * @param hp
     * @param simpleAttack
     * @param specialAttack
     * @param simpleAttackDmg
     * @param specialAttackDmg
     * @param legendary
     * @param incDamage1
     * @param incDamage2
     * @param healSimpleAttack
     * @param healSpecialAttack 
     */
    public Pokemon(int id, String name, String type1, String type2, int hp, String simpleAttack, String specialAttack, int simpleAttackDmg, int specialAttackDmg, boolean legendary, int incDamage1, int incDamage2, int healSimpleAttack, int healSpecialAttack) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.simpleAttack = simpleAttack;
        this.specialAttack = specialAttack;
        this.simpleAttackDmg = simpleAttackDmg;
        this.specialAttackDmg = specialAttackDmg;
        this.legendary = legendary;
        this.incDamage1 = incDamage1;
        this.incDamage2 = incDamage2;
        this.healSimpleAttack = healSimpleAttack;
        this.healSpecialAttack = healSpecialAttack;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getType1() 
    {
        return type1;
    }

    public void setType1(String type1) 
    {
        this.type1 = type1;
    }

    public String getType2() 
    {
        return type2;
    }

    public void setType2(String type2) 
    {
        this.type2 = type2;
    }

    public int getHp() 
    {
        return hp;
    }

    public void setHp(int hp) 
    {
        this.hp = hp;
    }

    public String getSimpleAttack() 
    {
        return simpleAttack;
    }

    public void setSimpleAttack(String simpleAttack) 
    {
        this.simpleAttack = simpleAttack;
    }

    public String getSpecialAttack() 
    {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) 
    {
        this.specialAttack = specialAttack;
    }

    public int getSimpleAttackDmg() 
    {
        return simpleAttackDmg;
    }

    public void setSimpleAttackDmg(int simpleAttackDmg) 
    {
        this.simpleAttackDmg = simpleAttackDmg;
    }

    public int getSpecialAttackDmg() 
    {
        return specialAttackDmg;
    }

    public void setSpecialAttackDmg(int specialAttackDmg) 
    {
        this.specialAttackDmg = specialAttackDmg;
    }

    public boolean isLegendary() 
    {
        return legendary;
    }

    public void setLegendary(boolean legendary) 
    {
        this.legendary = legendary;
    }

    public int getIncDamage1() 
    {
        return incDamage1;
    }

    public void setIncDamage1(int incDamage1) 
    {
        this.incDamage1 = incDamage1;
    }

    public int getIncDamage2() 
    {
        return incDamage2;
    }

    public void setIncDamage2(int incDamage2) 
    {
        this.incDamage2 = incDamage2;
    }

    public int getHealSimpleAttack() 
    {
        return healSimpleAttack;
    }

    public void setHealSimpleAttack(int healSimpleAttack) 
    {
        this.healSimpleAttack = healSimpleAttack;
    }

    public int getHealSpecialAttack() 
    {
        return healSpecialAttack;
    }

    public void setHealSpecialAttack(int healSpecialAttack) 
    {
        this.healSpecialAttack = healSpecialAttack;
    }

    @Override
    public String toString() 
    {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", type1=" + type1 + ", type2=" + type2 + ", hp=" + hp + ", simpleAttack=" + simpleAttack + ", specialAttack=" + specialAttack + ", simpleAttackDmg=" + simpleAttackDmg + ", specialAttackDmg=" + specialAttackDmg + ", legendary=" + legendary + ", incDamage1=" + incDamage1 + ", incDamage2=" + incDamage2 + ", healSimpleAttack=" + healSimpleAttack + ", healSpecialAttack=" + healSpecialAttack + '}';
    }
    
    
    
    
}
