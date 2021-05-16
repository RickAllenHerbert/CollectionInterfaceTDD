/**
 * @Author: Rick Allen Herbert
 * @Student Number: 219014337
 * @Date: 14/05/2021
 * @Description: Model class for a rts game unit.
 */
package za.ac.cput.assignment2.model;

public class Unit {

    private String name;
    private String allegiance;
    private String speciality;
    private int strength;
    private int vitality;
    private int dexterity;
    private double mana;

    public Unit() {

    }
    public Unit(String name, String allegiance, String speciality, int strength, int vitality, int dexterity) {
        this.name = name;
        this.allegiance = allegiance;
        this.speciality = speciality;
        this.strength = strength;
        this.vitality = vitality;
        this.dexterity = dexterity;
        mana = (strength / 2) + vitality + dexterity;
    }

    public String getName() {
        return name;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getStrength() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public int getDexterity() {
        return dexterity;
    }

    public double getMana() {
        return mana;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void walk() {
        System.out.println("Unit is walking");
    }

    public String toString() {
        return "Unit{ name: " + name+ " allegiance: " + allegiance + " speciality: " + speciality + " mana: " + mana + " }";
    }
}
