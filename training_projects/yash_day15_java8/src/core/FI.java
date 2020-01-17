package core;

import javax.xml.bind.annotation.XmlElementRef.DEFAULT;

@FunctionalInterface
public interface FI {
	void fun();
	
	@Override
	String toString();
	
	
	/*@Override
	default int hashCode()
	{
		
	}*/
	
	
	
}
