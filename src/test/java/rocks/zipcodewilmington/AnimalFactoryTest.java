package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        //Given
        AnimalFactory factory = new AnimalFactory();
        String name = "Rover";
        Date birthDate = new Date();
        //When
        Dog actual = factory.createDog(name, birthDate);
        //Then

        Assert.assertEquals(birthDate, actual.getBirthDate());
        Assert.assertEquals(name, actual.getName());


    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        //Given
        AnimalFactory factory = new AnimalFactory();
        String name = "Puss";
        Date birthDate = new Date();
        //When
        Cat actual = factory.createCat(name, birthDate);
        //Then
        Assert.assertEquals(birthDate, actual.getBirthDate());
        Assert.assertEquals(name, actual.getName());
    }
}
