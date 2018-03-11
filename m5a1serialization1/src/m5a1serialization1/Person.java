/*
 *
 *  Project    :  m5a1serialization1
 *  Assignment :
 *  File       :  Person.java
 *  Name       :  Kelly Tidwell
 *  Date       :  Mar 11, 2018
 *
 *  Description : (Narrative desciption, not code)
 *
 *		a Person class with name and cell phone number
 *
 ********************************************************/

package m5a1serialization1;

import java.io.Serializable;

public class Person implements Serializable {
	private String firstName;
	private String lastName;
	
	private String cellPhone;
	
	public Person(String fn, String ln, String phone)
	{
		this.setFirstName(fn);
		this.setLastName(ln);
		this.setCellPhone(phone);
		
	}
	
	public Person()
	{
		this.setFirstName("");
		this.setLastName("");
		this.setCellPhone("");
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the cellPhone
	 */
	public String getCellPhone() {
		return cellPhone;
	}

	/**
	 * @param cellPhone the cellPhone to set
	 */
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	@Override
	public String toString()
	{
		return (String.format("%s %s %s", this.getFirstName(), this.getLastName(), this.getCellPhone()));
	}
	

}
