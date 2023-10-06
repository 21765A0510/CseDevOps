package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTesting {
    @Test
    public void testCase1()
    {
    	 UserValidation uv=new  UserValidation();
    	 Assert.assertEquals(false,uv.check("bindu", "bindu@1234"));
    	 
    }
    public void testCase2()
    {
    	 UserValidation uv=new  UserValidation();
    	 Assert.assertEquals(false,uv.check("srinu", "srinu@124"));
    	 
    }
    public void testCase3()
    {
    	 UserValidation uv=new  UserValidation();
    	 Assert.assertEquals(true,uv.check("lbrce", "lbrce@76"));
    	 
    }
    public void testCase4()
    {
    	 UserValidation uv=new  UserValidation();
    	 Assert.assertEquals(false,uv.check("ammu", "ammu@234"));
    	 
    }
    public void testCase5()
    {
    	 UserValidation uv=new  UserValidation();
    	 Assert.assertEquals(false,uv.check("prema", "prema@1234"));
    	 
    }
}
