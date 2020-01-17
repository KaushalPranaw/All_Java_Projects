package core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Test test = new Test();

		// Get Class Name
		Class class1 = test.getClass();
		System.out.println("Name of the class : " + class1.getName());

		// Get Constructpr

		/*
		 * Constructor constructor = class1.getConstructor();
		 * System.out.println(constructor.getName());
		 * 
		 * //public method of the class Method[] method=class1.getMethods(); for(Method
		 * m:method) { System.out.print(m.getName()+" "); }
		 */

		Method methodcall1 = class1.getDeclaredMethod("method2", int.class);
		// invokes the method at runtime
		methodcall1.invoke(test, 19);

		// creates object of the desired field by providing
		// the name of field as argument to the
		// getDeclaredField method
		Field field = class1.getDeclaredField("s");

		// allows the object to access the field irrespective
		// of the access specifier used with the field
		field.setAccessible(true);

		// takes object and the new value to be assigned
		// to the field as arguments
		field.set(test, "JAVA");

		// Creates object of desired method by providing the
		// method name as argument to the getDeclaredMethod
		Method methodcall2 = class1.getDeclaredMethod("method1");

		// invokes the method at runtime
		methodcall2.invoke(test);

		// Creates object of the desired method by providing
		// the name of method as argument to the
		// getDeclaredMethod method
		Method methodcall3 = class1.getDeclaredMethod("method3");

		// allows the object to access the method irrespective
		// of the access specifier used with the method
		methodcall3.setAccessible(true);

		// invokes the method at runtime
		methodcall3.invoke(test);

	}
}
