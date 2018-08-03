package junitwebapp;

import org.junit.Assert;
import org.junit.Test;
//import static org.junit.Assert.*;

public class TestJunit {
	
	   @Test
	   public void testAdd() {
	      String str = "Junit is working fine";
	      Assert.assertEquals("Junit is working fine",str);
	   }
}
