package co.edu.icesi.model;
import org.junit.*;
import org.junit.Assert;
public class Test{

    @org.junit.Test
    public void testBillboardMethods() throws Exception {
        InfrastructureDepartment in = new InfrastructureDepartment();
        double average = in.avarageH();
        Assert.assertEquals(2.0, average, 5.0);
    }

    @org.junit.Test
    public void testW()throws Exception{
        InfrastructureDepartment in = new InfrastructureDepartment();
        double average = in.avarageW();
        Assert.assertEquals(6.0, average, 9.5);

    }

    @org.junit.Test
    public void testA() throws Exception{
        InfrastructureDepartment in = new InfrastructureDepartment();
        double average = in.avarageA();
        Assert.assertEquals(6.0, average, 9.5);

    }




}

