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

public class ReflectionStringService
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{


	     // Reading Jar
		//Instantiating the class to reflect which is StringService
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

	     // Instantiating the class to reflect which is StringService
		Class reflectClass = Class.forName("ie.gmit.sw.StringService");

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

	     //Section for modifiers present
	     //public class check inside StringService
	     int publicClass = reflectClass.getModifiers();
	     System.out.println("Public class present inside the class StringService");
	     System.out.println(Modifier.isPublic(publicClass) + "\n");

	     //Private class check inside StringService?
	     int privateClass = reflectClass.getModifiers();
	     System.out.println("Private class present inside the class StringService");
	     System.out.println(Modifier.isPrivate(privateClass) + "\n");

	     //Abstract class check inside StringService?
	     int AbstractClass = reflectClass.getModifiers();
	     System.out.println("Abstract class present inside the class StringService");
	     System.out.println(Modifier.isAbstract(AbstractClass) + "\n");

	     //Final class check inside StringService?
	     int finalClass = reflectClass.getModifiers();
	     System.out.println("Final class present inside the class StringService");
	     System.out.println(Modifier.isFinal(finalClass) + "\n");

	   //Static class present inside StringService?
	     int staticClass = reflectClass.getModifiers();
	     System.out.println("Static class present inside the class StringService");
	     System.out.println(Modifier.isStatic(staticClass) + "\n");

	     //Interface present inside StringService?
	     int interfaceClass = reflectClass.getModifiers();
	     System.out.println("Interface present inside the class StringService");
	     System.out.println(Modifier.isInterface(interfaceClass) + "\n");

	  // Methods, return types, parameters using an array
	     Method[] Methods = reflectClass.getMethods();

	  // Get the objects methods, return type and parameter type and uses an array
	     for(Method m : Methods){

	         // Get the method name inside StringService
	         System.out.println("What is the name of the methods inside StringService? " + m.getName());

	         // Check if the method inside StringService is a getter or setter
	         if(m.getName().startsWith("get"))
	         {
	             System.out.println("Getter Method present inside StringService");
	         }
	         else if(m.getName().startsWith("set"))
	         {
	             System.out.println("Setter Method present inside StringService");
	         }

	         // Get the methods inside StringService's return type
	         System.out.println("The Return Type inside StringService: " + m.getReturnType());

	         Class[] parameterType = m.getParameterTypes();

	         // List parameters for a method inside StringService
	         System.out.println("The Parameters inside StringService:");

	         for(Class parameter : parameterType)
	         {
	             System.out.println(parameter.getName());
	         }
	         System.out.println();
	     }

	     // Reflecting constructors

	     Constructor constructor = null;
	     Object constructor2 = null;

        // To return an array of constructors inside StringService
	     System.out.println("The Constructors inside StringService:");
        Constructor[] constructors = reflectClass.getConstructors();
        ReflectionStringService Ref = new ReflectionStringService();
        return;
}
	public static void ReflectionStringServiceReference() throws FileNotFoundException, IOException, ClassNotFoundException
	{

		 // Reading Jar
		//Instantiating the class to reflect which is StringService
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

	     // Instantiating the class to reflect which is StringService
		Class reflectClass = Class.forName("ie.gmit.sw.StringService");

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


	     //Section for modifiers present
	     //public class check inside StringService
	     int publicClass = reflectClass.getModifiers();
	     System.out.println("Public class present inside the class StringService");
	     System.out.println(Modifier.isPublic(publicClass) + "\n");

	     //Private class check inside StringService?
	     int privateClass = reflectClass.getModifiers();
	     System.out.println("Private class present inside the class StringService");
	     System.out.println(Modifier.isPrivate(privateClass) + "\n");

	     //Abstract class check inside StringService?
	     int AbstractClass = reflectClass.getModifiers();
	     System.out.println("Abstract class present inside the class StringService");
	     System.out.println(Modifier.isAbstract(AbstractClass) + "\n");

	     //Final class check inside StringService?
	     int finalClass = reflectClass.getModifiers();
	     System.out.println("Final class present inside the class StringService");
	     System.out.println(Modifier.isFinal(finalClass) + "\n");

	   //Static class present inside StringService?
	     int staticClass = reflectClass.getModifiers();
	     System.out.println("Static class present inside the class StringService");
	     System.out.println(Modifier.isStatic(staticClass) + "\n");

	     //Interface present inside StringService?
	     int interfaceClass = reflectClass.getModifiers();
	     System.out.println("Interface present inside the class StringService");
	     System.out.println(Modifier.isInterface(interfaceClass) + "\n");

	  // Methods, return types, parameters using an array
	     Method[] Methods = reflectClass.getMethods();

	  // Get the objects methods, return type and parameter type and uses an array
	     for(Method m : Methods){

	         // Get the method name inside StringService
	         System.out.println("What is the name of the methods inside StringService? " + m.getName());

	         // Check if the method inside StringService is a getter or setter
	         if(m.getName().startsWith("get"))
	         {
	             System.out.println("Getter Method present inside StringService");
	         }
	         else if(m.getName().startsWith("set"))
	         {
	             System.out.println("Setter Method present inside StringService");
	         }

	         // Get the methods inside StringService's return type
	         System.out.println("The Return Type inside StringService: " + m.getReturnType());

	         Class[] parameterType = m.getParameterTypes();

	         // List parameters for a method inside StringService
	         System.out.println("The Parameters inside StringService:");

	         for(Class parameter : parameterType)
	         {
	             System.out.println(parameter.getName());
	         }
	         System.out.println();
	     }

	     // Reflecting constructors

	     Constructor constructor = null;
	     Object constructor2 = null;

         // To return an array of constructors inside StringService
	     System.out.println("The Constructors inside StringService:");
         Constructor[] constructors = reflectClass.getConstructors();
         ReflectionStringService Ref = new ReflectionStringService();
         return;

	}
}
