package list;

import java.util.Date;

public class Person {
	 
	    private String name;   
	    private String address;  
	    private Date dob;  


	    public Person( ){
	        name = null;
	        address = null;  
	        dob = null;
	    }

	    public Person(String nameValue, String newAddress, Date newDob){  
	        name = nameValue;
	        address = newAddress;
	        dob = newDob;  
	    }


	    public String getName(){
	        return name;
	    }

	    public void setName(String nameValue){
	        name = nameValue;
	    }

	    public String getAddress(){
	        return address;
	    }

	    public void setAddress(String newAddress){
	        address = newAddress;
	    }

	    public Date getDateOfBirth(){
	        return dob;

}}
