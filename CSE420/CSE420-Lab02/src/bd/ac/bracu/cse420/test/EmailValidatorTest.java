package bd.ac.bracu.cse420.validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmailValidatorTest {

    EmailValidator emailValidator;

    @Before
    public void setUp() throws Exception {
        this.emailValidator = new EmailValidator();
    }

    @Test
    public void validateEmail() {
        Assert.assertTrue(this.emailValidator.validateEmail("farhana.shahid@bracu.ac.bd"));
        Assert.assertTrue(this.emailValidator.validateEmail("1205113.fs@ugrad.buet.ac.bd"));
        Assert.assertTrue(this.emailValidator.validateEmail("Bracu_CSE11@gmail.com"));

        Assert.assertFalse(this.emailValidator.validateEmail("fsh@263.37@ymail.com"));
        Assert.assertFalse(this.emailValidator.validateEmail("+@$*_@gmail.com"));
        Assert.assertFalse(this.emailValidator.validateEmail("cse420@8932843"));
        Assert.assertFalse(this.emailValidator.validateEmail("compiler@-outlook.com"));
        Assert.assertFalse(this.emailValidator.validateEmail(".bracucse@bracu.edu.bd"));
    }
}