package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Before
    public void setup() {
        DogHouse.clear();
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //Given
        Integer id = 12345;
        Dog expected = new Dog(null, null, id);
        DogHouse house = new DogHouse();

        //When
        house.add(expected);

        //Then
        //Dog is in the DogHouse
        Dog actual = house.getDogById(id);     //See if there is a Dog that has this ID in the house
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogFromHouseTest() {
        //Given
        Integer id = 12345;
        Dog expected = new Dog(null, null, id);
        DogHouse house = new DogHouse();
        house.add(expected); //Given that there is a Dog in the house

        //When
        house.remove(id);

        //Then
        //Dog is not in the Doghouse
        Dog actual = house.getDogById(id);
        Assert.assertNotEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        //Given
        Integer id = 12345;
        Dog expected = new Dog(null, null, id);
        DogHouse house = new DogHouse();
        house.add(expected); //Given that there is a Dog in the house

        //When
        house.remove(expected);

        //Then
        //Dog is not in the Doghouse
        Dog actual = house.getDogById(id);
        Assert.assertNotEquals(expected, actual);

    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIDTest() {
        //Given
        Integer expectedId = 9;
        Dog expectedDog = new Dog(null, null, expectedId);
        DogHouse house = new DogHouse();
        house.add(expectedDog);

        //When
        Dog actualDog = house.getDogById(expectedId);
        Integer actualId = actualDog.getId();


        //Then
        Assert.assertEquals(expectedDog, actualDog); //The Dog that I get should have the ID 9
        Assert.assertEquals(expectedId, actualId); //The Dog that I get should have the ID 9

    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest() {
        //Given
        Dog Dog = new Dog(null, null, null);
        DogHouse house = new DogHouse();
        house.add(Dog); //Dog is in the house
        Integer expected = 1;

        //When
        Integer actual = house.getNumberOfDogs(); //I check the house and count the Dogs
        //Then
        Assert.assertEquals(expected, actual);//The house should have the number of Dogs that I expect

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
