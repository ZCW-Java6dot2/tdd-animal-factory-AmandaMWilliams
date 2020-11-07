package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Before
    public void setup() {
        CatHouse.clear();
    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //Given
        Integer id = 12345;
        Cat expected = new Cat(null, null, id);
        CatHouse house = new CatHouse();

        //When
        house.add(expected);

        //Then
        //cat is in the cathouse
        Cat actual = house.getCatById(id);     //See if there is a cat that has this ID in the house
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatFromHouseTest() {
        //Given
        Integer id = 12345;
        Cat expected = new Cat(null, null, id);
        CatHouse house = new CatHouse();
        house.add(expected); //Given that there is a cat in the house

        //When
        house.remove(id);

        //Then
        //cat is not in the cathouse
        Cat actual = house.getCatById(id);
        Assert.assertNotEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        //Given
        Integer id = 12345;
        Cat expected = new Cat(null, null, id);
        CatHouse house = new CatHouse();
        house.add(expected); //Given that there is a cat in the house

        //When
        house.remove(expected);

        //Then
        //cat is not in the cathouse
        Cat actual = house.getCatById(id);
        Assert.assertNotEquals(expected, actual);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIDTest() {
        //Given
        Integer expectedId = 9;
        Cat expectedCat = new Cat(null, null, expectedId);
        CatHouse house = new CatHouse();
        house.add(expectedCat);

        //When
        Cat actualCat = house.getCatById(expectedId);
        Integer actualId = actualCat.getId();


        //Then
        Assert.assertEquals(expectedCat, actualCat); //The cat that I get should have the ID 9
        Assert.assertEquals(expectedId, actualId); //The cat that I get should have the ID 9

    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        CatHouse house = new CatHouse();
        house.add(cat); //cat is in the house
        Integer expected = 1;

        //When
        Integer actual = house.getNumberOfCats(); //I check the house and count the cats
        //Then
        Assert.assertEquals(expected, actual);//The house should have the number of cats that I expect

    }
}
