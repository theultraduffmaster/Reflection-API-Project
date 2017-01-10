package ie.gmit.sw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class ReflectionAlgoStrings
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{


	     // Reading Jar
		//Instantiating the class to reflect which is AlgoStrings
		 System.out.println("JAR Information:");
		JarInputStream in = new JarInputStream(new FileInputStream(new File("C:/Users/Declan/Desktop/Java Reflection API Project/src/ie/gmit/sw/string-service.jar")));
		JarEntry next = in.getNextJarEntry();
		while (next != null)
		{
		 if (next.getName().endsWith(".class"))
		 {
		 String name = next.getName().replaceAll("/", "\\.");
		 name = name.replaceAll(".class", "");
		 if (!name.contains("$")) name.substring(0, name.length() - ".class".length());
		 System.out.println(name);
		 }
		 next = in.getNextJarEntry();
		}
		System.out.println();

	     // Instantiating the class to reflect which is AlgoStrings
		Class reflectClass = Class.forName("ie.gmit.sw.AlgoStrings");

	     // Get the class name
	     String className = reflectClass.getName();
	     System.out.println("The Class Name:");
	     System.out.println(className + "\n");

	     // Package declaration section
	     // Getting the package name
	     Package pack = reflectClass.getPackage();
	     System.out.println("The Package Name:");
	     System.out.println(pack + "\n");

	     // Fields Section
	     // Getting the Field Name
	     Field[] fields = reflectClass.getFields();
	     System.out.println("The Field Name:");
	     System.out.println(fields + "\n");

	     // Getting the Super class name for AlgoStrings
	     Class Super = reflectClass.getSuperclass();
	     System.out.println("Superclass name:");
	     System.out.println(Super.getName() + "\n");

	     //Section for modifiers present
	     //public class check inside AlgoStrings
	     int publicClass = reflectClass.getModifiers();
	     System.out.println("Public class present inside the class AlgoStrings");
	     System.out.println(Modifier.isPublic(publicClass) + "\n");

	     //Private class check inside AlgoStrings?
	     int privateClass = reflectClass.getModifiers();
	     System.out.println("Private class present inside the class AlgoStrings");
	     System.out.println(Modifier.isPrivate(privateClass) + "\n");

	     //Abstract class check inside AlgoStrings?
	     int AbstractClass = reflectClass.getModifiers();
	     System.out.println("Abstract class present inside the class AlgoStrings");
	     System.out.println(Modifier.isAbstract(AbstractClass) + "\n");

	     //Final class check inside AlgoStrings?
	     int finalClass = reflectClass.getModifiers();
	     System.out.println("Final class present inside the class AlgoStrings");
	     System.out.println(Modifier.isFinal(finalClass) + "\n");

	   //Static class present inside AlgoStrings?
	     int staticClass = reflectClass.getModifiers();
	     System.out.println("Static class present inside the class AlgoStrings");
	     System.out.println(Modifier.isStatic(staticClass) + "\n");

	     //Interface present inside AlgoStrings?
	     int interfaceClass = reflectClass.getModifiers();
	     System.out.println("Interface present inside the class AlgoStrings");
	     System.out.println(Modifier.isInterface(interfaceClass) + "\n");

	  // Methods, return types, parameters using an array
	     Method[] Methods = reflectClass.getMethods();

	  // Get the objects methods, return type and parameter type and uses an array
	     for(Method m : Methods){

	         // Get the method name inside AlgoStrings
	         System.out.println("What is the name of the methods inside AlgoStrings? " + m.getName());

	         // Check if the method inside AlgoStrings is a getter or setter
	         if(m.getName().startsWith("get"))
	         {
	             System.out.println("Getter Method present inside AlgoStrings");
	         }
	         else if(m.getName().startsWith("set"))
	         {
	             System.out.println("Setter Method present inside AlgoStrings");
	         }

	         // Get the methods inside AlgoStrings's return type
	         System.out.println("The Return Type inside AlgoStrings: " + m.getReturnType());

	         Class[] parameterType = m.getParameterTypes();

	         // List parameters for a method inside AlgoStrings
	         System.out.println("The Parameters inside AlgoStrings:");

	         for(Class parameter : parameterType)
	         {
	             System.out.println(parameter.getName());
	         }
	         System.out.println();
	     }

	     // Reflecting constructors

	     Constructor constructor = null;
	     Object constructor2 = null;

        // To return an array of constructors inside AlgoStrings
	     System.out.println("The Constructors inside AlgoStrings:");
        Constructor[] constructors = reflectClass.getConstructors();
        ReflectionAlgoStrings Ref = new ReflectionAlgoStrings();
        return;
}
	public static void ReflectionAlgoStringsReference() throws FileNotFoundException, IOException, ClassNotFoundException
	{

		 // Reading Jar
		//Instantiating the class to reflect which is AlgoStrings
		 System.out.println("JAR Information:");
		JarInputStream in = new JarInputStream(new FileInputStream(new File("C:/Users/Declan/Desktop/Reflection/Java Reflection API Project/src/ie/gmit/sw/string-service.jar")));
		JarEntry next = in.getNextJarEntry();
		while (next != null)
		{
		 if (next.getName().endsWith(".class"))
		 {
		 String name = next.getName().replaceAll("/", "\\.");
		 name = name.replaceAll(".class", "");
		 if (!name.contains("$")) name.substring(0, name.length() - ".class".length());
		 System.out.println(name);
		 }
		 next = in.getNextJarEntry();
		}
		System.out.println();

	     // Instantiating the class to reflect which is AlgoStrings
		Class reflectClass = Class.forName("ie.gmit.sw.AlgoStrings");

	     // Get the class name
	     String className = reflectClass.getName();
	     System.out.println("The Class Name:");
	     System.out.println(className + "\n");

	     // Package declaration section
	     // Getting the package name
	     Package pack = reflectClass.getPackage();
	     System.out.println("The Package Name:");
	     System.out.println(pack + "\n");

	     // Fields Section
	     // Getting the Field Name
	     Field[] fields = reflectClass.getFields();
	     System.out.println("The Field Name:");
	     System.out.println(fields + "\n");

	     // Getting the Super class name for AlgoStrings
	     Class Super = reflectClass.getSuperclass();
	     System.out.println("Superclass name:");
	     System.out.println(Super.getName() + "\n");

	     //Section for modifiers present
	     //public class check inside AlgoStrings
	     int publicClass = reflectClass.getModifiers();
	     System.out.println("Public class present inside the class AlgoStrings");
	     System.out.println(Modifier.isPublic(publicClass) + "\n");

	     //Private class check inside AlgoStrings?
	     int privateClass = reflectClass.getModifiers();
	     System.out.println("Private class present inside the class AlgoStrings");
	     System.out.println(Modifier.isPrivate(privateClass) + "\n");

	     //Abstract class check inside AlgoStrings?
	     int AbstractClass = reflectClass.getModifiers();
	     System.out.println("Abstract class present inside the class AlgoStrings");
	     System.out.println(Modifier.isAbstract(AbstractClass) + "\n");

	     //Final class check inside AlgoStrings?
	     int finalClass = reflectClass.getModifiers();
	     System.out.println("Final class present inside the class AlgoStrings");
	     System.out.println(Modifier.isFinal(finalClass) + "\n");

	   //Static class present inside AlgoStrings?
	     int staticClass = reflectClass.getModifiers();
	     System.out.println("Static class present inside the class AlgoStrings");
	     System.out.println(Modifier.isStatic(staticClass) + "\n");

	     //Interface present inside AlgoStrings?
	     int interfaceClass = reflectClass.getModifiers();
	     System.out.println("Interface present inside the class AlgoStrings");
	     System.out.println(Modifier.isInterface(interfaceClass) + "\n");

	  // Methods, return types, parameters using an array
	     Method[] Methods = reflectClass.getMethods();

	  // Get the objects methods, return type and parameter type and uses an array
	     for(Method m : Methods){

	         // Get the method name inside AlgoStrings
	         System.out.println("What is the name of the methods inside AlgoStrings? " + m.getName());

	         // Check if the method inside AlgoStrings is a getter or setter
	         if(m.getName().startsWith("get"))
	         {
	             System.out.println("Getter Method present inside AlgoStrings");
	         }
	         else if(m.getName().startsWith("set"))
	         {
	             System.out.println("Setter Method present inside AlgoStrings");
	         }

	         // Get the methods inside AlgoStrings's return type
	         System.out.println("The Return Type inside AlgoStrings: " + m.getReturnType());

	         Class[] parameterType = m.getParameterTypes();

	         // List parameters for a method inside AlgoStrings
	         System.out.println("The Parameters inside AlgoStrings:");

	         for(Class parameter : parameterType)
	         {
	             System.out.println(parameter.getName());
	         }
	         System.out.println();
	     }

	     // Reflecting constructors

	     Constructor constructor = null;
	     Object constructor2 = null;

         // To return an array of constructors inside AlgoStrings
	     System.out.println("The Constructors inside AlgoStrings:");
         Constructor[] constructors = reflectClass.getConstructors();
         ReflectionAlgoStrings Ref = new ReflectionAlgoStrings();
         return;

	}
}
