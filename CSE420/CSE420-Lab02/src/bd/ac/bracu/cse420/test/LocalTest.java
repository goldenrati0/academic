package bd.ac.bracu.cse420.test;

import bd.ac.bracu.cse420.validator.parser.Local;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocalTest {

    Local local;

    @Before
    public void setUp() throws Exception {
        this.local = new Local();
    }

    @Test
    public void validateLocalPart() {
        Assert.assertTrue(this.local.validateLocalPart("farhana.shahid"));
        Assert.assertTrue(this.local.validateLocalPart("1205113.fs"));
        Assert.assertTrue(this.local.validateLocalPart("Bracu_CSE11"));

        Assert.assertFalse(this.local.validateLocalPart("fsh@263.37"));
        Assert.assertFalse(this.local.validateLocalPart("+@$*_"));
        Assert.assertFalse(this.local.validateLocalPart("\"+@$*_"));
        Assert.assertFalse(this.local.validateLocalPart("john..doe"));
        Assert.assertFalse(this.local.validateLocalPart("\"john..doe"));

        Assert.assertTrue(this.local.validateLocalPart("\"john..doe\""));
        Assert.assertTrue(this.local.validateLocalPart("cse420"));
        Assert.assertTrue(this.local.validateLocalPart("compiler"));

        Assert.assertFalse(this.local.validateLocalPart(".bracucse"));
    }
}