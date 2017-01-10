package ie.gmit.sw;

import junit.framework.*;
import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.*;
import java.util.*;

import org.junit.Test;

import jdepend.*;
import jdepend.framework.*;
import jdepend.framework.JDepend;
import jdepend.framework.JavaPackage;

public class StabilityMetrics
{
	@Test
	public void AfferentEfferentCouplings() throws IOException
	{
		JDepend _jdepend = new JDepend();

		_jdepend.addDirectory("C:/Users/Declan/Desktop/Java-Reflection-API-Project/src/ie/gmit/sw");

		_jdepend.analyze();

		JavaPackage p = _jdepend.getPackage("ie.gmit.sw");
		System.out.println(p);
		// error handling to fix null pointer here but still couldn't fix it
		//if(p == null){
			//_jdepend.addDirectory("C:/Users/Declan/Desktop/Reflection/Java Reflection API Project/src/ie/gmit/sw");

			//_jdepend.analyze();

			//JavaPackage p2 = _jdepend.getPackage("Java Reflection API Project/src/ie/gmit/sw");
			//System.out.println(p2);
		//}
		// Null pointer won't allow this code to run
		assertNotNull(p);

		int afferentCouplings = p.afferentCoupling();
		int efferentCouplings = p.efferentCoupling();

		assertEquals("Afferent Couplings: "+p.getName(),
				afferentCouplings, p.afferentCoupling());

		assertEquals("Efferent Couplings: "+p.getName(),
				efferentCouplings, p.efferentCoupling());

		System.out.println("Is there any afferent couplings?" + afferentCouplings);

		System.out.println("Is there any efferent couplings?" + efferentCouplings);
	}
}