import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MainTest {

    public static Collection<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("Jack", "Davies", 4, Sex.MAN, Education.FURTHER),
            new Person("Harry", "Harris", 57, Sex.MAN, Education.SECONDARY),
            new Person("George", "Brown", 20, Sex.MAN, Education.SECONDARY),
            new Person("Harry", "Young", 34, Sex.MAN, Education.ELEMENTARY),
            new Person("Jack", "Davies", 26, Sex.MAN, Education.FURTHER),
            new Person("Samuel", "Brown", 95, Sex.WOMAN, Education.FURTHER),
            new Person("Jack", "Young", 25, Sex.WOMAN, Education.SECONDARY),
            new Person("Samuel", "Davies", 71, Sex.WOMAN, Education.HIGHER),
            new Person("Harry", "Brown", 30, Sex.MAN, Education.ELEMENTARY),
            new Person("Harry", "Brown", 77, Sex.WOMAN, Education.HIGHER),
            new Person("John", "Harris", 58, Sex.MAN, Education.ELEMENTARY),
            new Person("Jack", "Davies", 71, Sex.WOMAN, Education.SECONDARY),
            new Person("George", "Adamson", 68, Sex.MAN, Education.FURTHER),
            new Person("Connor", "Evans", 54, Sex.MAN, Education.HIGHER),
            new Person("George", "Harris", 10, Sex.WOMAN, Education.SECONDARY),
            new Person("Samuel", "Young", 70, Sex.MAN, Education.ELEMENTARY),
            new Person("Jack", "Evans", 94, Sex.MAN, Education.HIGHER),
            new Person("John", "Wilson", 1, Sex.MAN, Education.FURTHER),
            new Person("Samuel", "Wilson", 96, Sex.WOMAN, Education.HIGHER),
            new Person("Connor", "Adamson", 27, Sex.WOMAN, Education.SECONDARY),
            new Person("Samuel", "Harris", 87, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Wilson", 15, Sex.WOMAN, Education.HIGHER),
            new Person("John", "Harris", 28, Sex.MAN, Education.ELEMENTARY),
            new Person("Connor", "Young", 46, Sex.MAN, Education.SECONDARY),
            new Person("Samuel", "Davies", 38, Sex.MAN, Education.ELEMENTARY),
            new Person("Jack", "Davies", 57, Sex.WOMAN, Education.HIGHER),
            new Person("Connor", "Davies", 52, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Davies", 20, Sex.WOMAN, Education.SECONDARY),
            new Person("Samuel", "Young", 82, Sex.MAN, Education.FURTHER),
            new Person("John", "Young", 81, Sex.MAN, Education.ELEMENTARY),
            new Person("Connor", "Adamson", 72, Sex.WOMAN, Education.SECONDARY),
            new Person("George", "Brown", 2, Sex.MAN, Education.SECONDARY),
            new Person("Jack", "Evans", 64, Sex.MAN, Education.SECONDARY),
            new Person("Harry", "Young", 58, Sex.MAN, Education.HIGHER),
            new Person("Jack", "Brown", 84, Sex.WOMAN, Education.HIGHER),
            new Person("John", "Wilson", 8, Sex.MAN, Education.SECONDARY),
            new Person("John", "Brown", 83, Sex.WOMAN, Education.HIGHER),
            new Person("George", "Brown", 75, Sex.WOMAN, Education.HIGHER),
            new Person("Samuel", "Davies", 62, Sex.WOMAN, Education.SECONDARY),
            new Person("John", "Evans", 56, Sex.WOMAN, Education.SECONDARY),
            new Person("Harry", "Harris", 45, Sex.MAN, Education.HIGHER),
            new Person("Connor", "Wilson", 21, Sex.WOMAN, Education.HIGHER),
            new Person("Connor", "Harris", 47, Sex.WOMAN, Education.ELEMENTARY),
            new Person("Jack", "Adamson", 38, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Brown", 83, Sex.WOMAN, Education.ELEMENTARY),
            new Person("John", "Harris", 75, Sex.WOMAN, Education.ELEMENTARY),
            new Person("Connor", "Evans", 35, Sex.MAN, Education.HIGHER),
            new Person("John", "Davies", 19, Sex.WOMAN, Education.HIGHER),
            new Person("Samuel", "Wilson", 88, Sex.MAN, Education.ELEMENTARY),
            new Person("Harry", "Adamson", 80, Sex.WOMAN, Education.FURTHER),
            new Person("Jack", "Davies", 74, Sex.MAN, Education.HIGHER),
            new Person("Connor", "Wilson", 73, Sex.MAN, Education.ELEMENTARY),
            new Person("Connor", "Evans", 44, Sex.MAN, Education.ELEMENTARY),
            new Person("Harry", "Brown", 10, Sex.MAN, Education.FURTHER),
            new Person("John", "Brown", 70, Sex.WOMAN, Education.ELEMENTARY),
            new Person("Jack", "Adamson", 6, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Evans", 51, Sex.MAN, Education.HIGHER),
            new Person("John", "Young", 90, Sex.MAN, Education.SECONDARY),
            new Person("George", "Harris", 56, Sex.WOMAN, Education.HIGHER),
            new Person("Jack", "Harris", 13, Sex.MAN, Education.HIGHER),
            new Person("Connor", "Davies", 39, Sex.WOMAN, Education.HIGHER),
            new Person("George", "Young", 52, Sex.MAN, Education.HIGHER),
            new Person("Jack", "Wilson", 11, Sex.MAN, Education.ELEMENTARY),
            new Person("George", "Evans", 74, Sex.MAN, Education.ELEMENTARY),
            new Person("John", "Wilson", 53, Sex.WOMAN, Education.SECONDARY),
            new Person("Samuel", "Brown", 13, Sex.WOMAN, Education.ELEMENTARY),
            new Person("George", "Adamson", 34, Sex.MAN, Education.ELEMENTARY),
            new Person("John", "Evans", 56, Sex.WOMAN, Education.HIGHER),
            new Person("Connor", "Harris", 92, Sex.WOMAN, Education.HIGHER),
            new Person("George", "Harris", 38, Sex.MAN, Education.FURTHER),
            new Person("Jack", "Adamson", 60, Sex.MAN, Education.HIGHER),
            new Person("George", "Brown", 10, Sex.WOMAN, Education.HIGHER),
            new Person("George", "Evans", 81, Sex.WOMAN, Education.SECONDARY),
            new Person("Jack", "Davies", 56, Sex.WOMAN, Education.FURTHER),
            new Person("Connor", "Harris", 72, Sex.MAN, Education.ELEMENTARY),
            new Person("George", "Wilson", 36, Sex.MAN, Education.FURTHER),
            new Person("George", "Brown", 15, Sex.MAN, Education.ELEMENTARY),
            new Person("George", "Young", 15, Sex.WOMAN, Education.FURTHER),
            new Person("Jack", "Wilson", 34, Sex.WOMAN, Education.HIGHER),
            new Person("John", "Young", 77, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Brown", 3, Sex.WOMAN, Education.HIGHER),
            new Person("Connor", "Harris", 85, Sex.MAN, Education.SECONDARY),
            new Person("Connor", "Evans", 65, Sex.WOMAN, Education.FURTHER),
            new Person("Samuel", "Brown", 81, Sex.MAN, Education.SECONDARY),
            new Person("Connor", "Brown", 64, Sex.MAN, Education.FURTHER),
            new Person("Jack", "Brown", 0, Sex.WOMAN, Education.HIGHER),
            new Person("Samuel", "Young", 69, Sex.MAN, Education.FURTHER),
            new Person("Connor", "Brown", 7, Sex.WOMAN, Education.FURTHER),
            new Person("Connor", "Brown", 97, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Young", 33, Sex.WOMAN, Education.SECONDARY),
            new Person("Samuel", "Adamson", 20, Sex.WOMAN, Education.FURTHER),
            new Person("John", "Adamson", 2, Sex.MAN, Education.SECONDARY),
            new Person("George", "Wilson", 48, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Brown", 0, Sex.MAN, Education.ELEMENTARY),
            new Person("Samuel", "Brown", 78, Sex.MAN, Education.SECONDARY),
            new Person("Connor", "Wilson", 63, Sex.WOMAN, Education.SECONDARY),
            new Person("George", "Wilson", 99, Sex.WOMAN, Education.ELEMENTARY),
            new Person("Connor", "Davies", 98, Sex.WOMAN, Education.FURTHER),
            new Person("Jack", "Davies", 34, Sex.WOMAN, Education.HIGHER),
            new Person("Samuel", "Evans", 60, Sex.MAN, Education.SECONDARY)
    ));;

    /* This tests does not implement any real logic. They just show some functionality. */

    @Test
    public void testGetUnder18Amount(){
        // given
        long expectedUnder18Amount = 19;

        // when
        long actualUnder18Amount = Main.getUnder18Amount(persons);

        // then
        assertThat(expectedUnder18Amount, equalTo(actualUnder18Amount));
    }

    @Test
    public void testGetArmyList(){
        // given
        List<String> expectedArmyList = Arrays.asList("George", "Jack");

        // when
        List<String> actualArmyList = Main.getArmyList(persons);

        // then
        assertThat(expectedArmyList, equalTo(actualArmyList));
        assertThat(expectedArmyList.get(0), equalToIgnoringCase(expectedArmyList.get(0)));
    }

    @Test
    public void testGetWorkList(){
        // given
        List<String> expectedWorkList = Arrays.asList(
                "Connor", "Connor", "Connor", "Connor", "George",
                "George", "Harry", "Harry", "Jack", "Jack", "Jack",
                "Jack", "Jack", "John", "John", "Samuel"
        );

        // when
        List<String> actualWorkList = Main.getWorkList(persons);

        // then
        assertThat(expectedWorkList, equalTo(actualWorkList));
        assertThat(List.of(expectedWorkList), hasItems(actualWorkList));
    }

    @Test
    public void testPerson(){
        //given
        Person person = new Person("Connor", "Brown", 7, Sex.WOMAN, Education.FURTHER);

        //when
        String desiredString = "Person{name='Connor', family='Brown', age=7, sex=WOMAN, education=FURTHER}";

        //then
        assertThat(person, hasToString(desiredString));
        assertThat(person, hasProperty("education"));
    }

    @Test
    public void testMethodToTest(){
        // given
        double actualValue = Main.methodToTest(1,10) * 3;

        // when
        double desiredValue = 0.3d;

        // then
        assertThat(actualValue, is(closeTo(desiredValue, 0.000001)));
    }
}
