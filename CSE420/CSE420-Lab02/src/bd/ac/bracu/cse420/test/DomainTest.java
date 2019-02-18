package bd.ac.bracu.cse420.test;

import bd.ac.bracu.cse420.validator.parser.Domain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DomainTest {

    Domain domain;

    @Before
    public void setUp() throws Exception {
        this.domain = new Domain();
    }

    @Test
    public void validateDomainPart() {
        Assert.assertTrue(this.domain.validateDomainPart("bracu.ac.bd"));
        Assert.assertTrue(this.domain.validateDomainPart("ugrad.buet.ac.bd"));
        Assert.assertTrue(this.domain.validateDomainPart("gmail.com"));
        Assert.assertTrue(this.domain.validateDomainPart("ymail.com"));

        Assert.assertFalse(this.domain.validateDomainPart("8932843"));
        Assert.assertFalse(this.domain.validateDomainPart("-outlook.com"));

        Assert.assertTrue(this.domain.validateDomainPart("bracu.edu.bd"));
    }
}