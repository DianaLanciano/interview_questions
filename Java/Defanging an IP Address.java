package interviewQuestions;

public class Q4 {
	
	/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

		A defanged IP address replaces every period "." with "[.]".*/
	
    public String defangIPaddr(String address) {
        
    	String newString = address.replace(".", "[.]");
    	System.out.println(newString);
    	return newString;
        
    }

}
