import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordComplexityTest {
    @Test
    public void password_complexity_true() {
        assertTrue(PasswordComplexity.passwordComplexity("Aru5ddaddd"));
    }
    @Test
    public void password_complexity_false() {
        assertFalse(PasswordComplexity.passwordComplexity("Arlllllddd"));
    }
}