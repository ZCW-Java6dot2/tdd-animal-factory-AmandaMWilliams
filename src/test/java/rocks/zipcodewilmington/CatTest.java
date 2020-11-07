package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        //Given
        String expected = "Kitty";
        Cat cat = new Cat(null, null, null);
        //When
        cat.setName(expected);
        //Then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //Given
        String expected = "meow!";
        Cat cat = new Cat(null, null, null);
        //When
        String actual = cat.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        Date expected = new Date();
        //When
        cat.setBirthDate(expected);

        //Then
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        int preEatNumberOfMeals = cat.getNumberOfMealsEaten();
        int expectedNumberOfMealsEaten = preEatNumberOfMeals + 1;

        //When
        cat.eat(food);

        //Then
        int actualNumberOfMealsEaten = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIDTest() {
        //Given
        Integer expected = 54321;
        Cat cat = new Cat(null, null, expected);
        //When
        Integer actual = cat.getId();
        //Then
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalInheritance(){
        //Given
        Cat cat = new Cat(null, null, null);
        //When
        boolean isAnimal = cat instanceof Animal;

        // then
        Assert.assertTrue(isAnimal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammalInheritance(){
        //Given
        Cat cat = new Cat(null, null, null);
        //When
        boolean isMammal = cat instanceof Mammal;
        //Then
        Assert.assertTrue(isMammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
