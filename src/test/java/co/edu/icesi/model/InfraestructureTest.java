package co.edu.icesi.model;

import org.junit.Assert;
import org.junit.Test;

public class InfraestructureTest {

    @Test
    public void testBillboardMethods() throws Exception {
        InfrastructureDepartment in = new InfrastructureDepartment();
        double average = in.avarageH();
        Assert.assertEquals(2.0, average, 5.0);
    }
    


}
