import org.junit.Before;
import org.junit.Test;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CodeupCryptTests {

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        String password = "Password";
        String expectedHash = "P4ssw0rd";

        String hashedPassword = CodeupCrypt.hashPassword(password);

        assertEquals(expectedHash, hashedPassword);
        assertEquals("P13", CodeupCrypt.hashPassword("Pie"));
        assertEquals("J9n1t", CodeupCrypt.hashPassword("JUnit"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("Password and hash are not the same.", CodeupCrypt.checkPassword("Magallan", "M4g4ll4n"));
        assertFalse(CodeupCrypt.checkPassword("Magallan", "Magallan"));
    }

}
