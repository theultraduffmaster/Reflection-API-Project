package ie.gmit.sw;

import junit.framework.TestCase;
import java.io.*;
import java.util.*;
import junit.framework.*;
import jdepend.*;
import jdepend.framework.*;
import jdepend.framework.JavaPackage;

public class MetricTest extends TestCase
{
	 /**  Tests that a single package does not contain
	    *  any package dependency cycles.
	 * @throws IOException
	    */
	 public void testOnePackageCycle() throws IOException
	 {

	  JDepend _jdepend = new JDepend();

	  _jdepend.addDirectory("C:/Users/owner/Desktop/Java Reflection API Project/src/ie/gmit/sw");

	  _jdepend.analyze();

	  JavaPackage p = _jdepend.getPackage("ie.gmit.sw");
	  assertNotNull(p);

	  assertEquals("Afferent Couplings Exist: " +p.getName(),
			  false, p.afferentCoupling());

	  assertEquals("Efferent Couplings Exist: " + p.getName(),
			  false, p.efferentCoupling());

	  assertEquals("Cycle exists: " + p.getName(),
	                false, p.containsCycle());
	 }
}
