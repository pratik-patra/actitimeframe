package org.test;

import java.io.IOException;

import org.generics.Basetest;
import org.pom.FrameworkPOM;
import org.testng.annotations.Test;

public class FrameworkTEST extends Basetest
{

	@Test
	public void details() throws IOException
	{
		FrameworkPOM f=new FrameworkPOM(driver);
		f.submit();
	}

}
