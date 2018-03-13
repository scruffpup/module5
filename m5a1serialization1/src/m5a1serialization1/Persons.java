/*
 *
 *  Project    :  m5a1serialization1
 *  Assignment :
 *  File       :  Persons.java
 *  Name       :  Kelly Tidwell
 *  Date       :  Mar 12, 2018
 *
 *  Description : (Narrative desciption, not code)
 *
 *
 ********************************************************/

package m5a1serialization1;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public class Persons {
	
	@XmlElement(name="person")
	private ArrayList<Person> personList = new ArrayList<Person>();
	
	public ArrayList<Person> getPersonList()
	{
		return personList;
	}
}
