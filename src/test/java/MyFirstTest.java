import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testIfNameIsEquals() {
        String expected = "Codeup";
        String actual = "CodeUp";

//        assertEquals(expected, actual); //Test fails because assertEquals is case-sensitive.
        assertNotEquals(expected, actual); //Test passes because the expected and actual values have different case-sensitivity properties.
    }

    @Test
    public void testIfNotSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages); //Test passes because they are not the same arrayList<>().
    }

    @Test
    public void testIfArrayEquals(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers); //Test passes because the "numbers" array is 1,2,3 and the "otherNumbers" has the proper values at the proper index, which equates to the test passing since they have the same index values.
    }

    @Test
    public void testIfTrueOrFalse(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue("H is in the string PHP", true);
        assertFalse("J is not in the string PHP", false);
//Similar to If statement?
    }

}
