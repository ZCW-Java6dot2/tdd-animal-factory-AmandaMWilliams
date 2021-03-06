package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        // given
        String expected = "bark!";
        Dog dog = new Dog(null, null, null);
        //When
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        // given
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();
        //When
        dog.setBirthDate(expected);

        //Then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        // given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        int preEatNumberOfMeals = dog.getNumberOfMealsEaten();
        int expectedNumberOfMealsEaten = preEatNumberOfMeals + 1;

        //When
        dog.eat(food);

        //Then
        int actualNumberOfMealsEaten = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        // given
        Integer expected = 12345;
        Dog dog = new Dog(null, null, expected);

        //When
        Integer actual = dog.getId();
        //Then
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        // given
        Dog dog = new Dog(null, null, null);

        //When
        boolean isAnimal = dog instanceof Animal;

        // then
        Assert.assertTrue(isAnimal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        // given
        Dog dog = new Dog(null, null, null);

        //When
        boolean isAnimal = dog instanceof Animal;

        // then
        Assert.assertTrue(isAnimal);

    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
