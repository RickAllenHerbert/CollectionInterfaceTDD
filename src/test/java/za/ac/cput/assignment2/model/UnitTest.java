/**
 * @Author: Rick Allen Herbert
 * @Student Number: 219014337
 * @Date: 14/05/2021
 * @Description: TTD for Collection, Map, Set, List using a model class of Unit.
 */
package za.ac.cput.assignment2.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    Collection unitCollection;
    Map<Integer, Unit> unitMap;
    Set<Unit> unitSet;
    List<Unit> unitList;

    Unit unit1;
    Unit unit2;

    @BeforeEach
    public void setUp() {
        //Declaration
        unitCollection = new LinkedList<>();
        unitMap = new HashMap<>();
        unitSet = new HashSet<>();
        unitList = new ArrayList<>();

        //Unit declaration
        unit1 = new Unit("Grindelwald","Evil", "Mage", 5, 10, 5);
        unit2 = new Unit("Darkstrikes", "Evil", "Assassin", 3, 15, 10);

        //Collection population
        unitCollection.add(unit1);
        unitCollection.add(unit2);

        //Map population
        unitMap.put(1, unit1);
        unitMap.put(2, unit2);

        //Set population
        unitSet.add(unit1);
        unitSet.add(unit2);

        //List population
        unitList.add(unit1);
        unitList.add(unit2);

    }
    //COLLECTION
    @Test
    void testAddToCollection() {
        Unit unit3 = new Unit("Scarlet Eyes","Good", "Ninja", 7, 3, 15);
        unitCollection.add(unit3);

        assertEquals(3, unitCollection.size());

    }
    @Test
    void testRemoveFromCollection() {
        unitCollection.remove(unit2);
        System.out.println(unitCollection);

        assertTrue(unitCollection.size()==1);

    }
    @Test
    void testFindInCollection() {
        for (Object unit : unitCollection) {
            if(((Unit)unit).getName().equals("Darkstrikes")) {
                System.out.println("Darkstrikes is within the collection.");
            }
        }

        assertTrue(unitCollection.contains(unit2));

    }

    //MAP
    @Test
    void testAddToMap() {
        Unit unit3 = new Unit("The Ethereal Shield","Good", "Soldier", 10, 8, 6);
        unitMap.put(3, unit3);

        assertEquals(3, unitMap.size());

    }
    @Test
    void testRemoveFromMap() {
        unitMap.remove(1);
        System.out.println("MAP: "+ unitMap);

        assertTrue(unitMap.size()==1);

    }
    @Test
    void testFindInMap() {
        if(unitMap.containsKey(1)) {
            System.out.println(unitMap.get(1));
        }
        assertTrue(unitMap.containsKey(1));
    }


    //SET
    @Test
    void testAddToSet() {
        unitSet.add(new Unit("Wolfman","Good", "Soldier", 10, 8, 6));
        unitSet.add(new Unit("Kesefeon","Good", "Archer", 4, 15, 10));

        assertEquals(4, unitSet.size());

    }
    @Test
    void testRemoveFromSet() {
        unitSet.remove(unit1);

        for (Unit unit : unitSet) {
            System.out.println(unit);
        }
        assertTrue(unitSet.size()==1);

    }
    @Test
    void testFindInSet() {
        unitSet.add(new Unit("Illitran","Good", "Soldier", 10, 8, 6));
        unitSet.add(new Unit("Tiarsus","Good", "Archer", 4, 15, 10));

        for (Object unit : unitSet) {
            if(((Unit)unit).getName().equals("Tiarsus")) {
                System.out.println("Tiarsus is within the collection.");
            }
        }
        assertTrue(unitSet.contains(unit1));
        assertTrue(unitSet.contains(unit2));
    }


    //LIST
    @Test
    void testAddToList() {
        unitList.add(new Unit("Illitran","Good", "Soldier", 10, 8, 6));
        unitList.add(new Unit("Tiarsus","Good", "Archer", 4, 15, 10));

        assertEquals(4, unitList.size());

    }
    @Test
    void testRemoveFromList() {
        unitList.remove(1);

        System.out.println(unitList);

        assertTrue(unitList.size()==1);

    }
    @Test
    void findItemInList() {
        for (Object unit : unitList) {
            if(((Unit)unit).getName().equals("Grindelwald")) {
                System.out.println("Grindelwald found within the List");
            }
        }
        assertTrue(unitSet.contains(unit1));

    }

}