  
/**
 * I am creating a person.
 * 
 * @author (Delaney Dayoan) 
 * @version (September 13, 2016)
 */
public class PersonCreator
{
    private String name; 
    private int age;
    private String sex;
    private int height;
    private int weight;
    private String socialSecurityNumber;
    private String address;
    private String phoneNumber;
    private String dob;
    
    public PersonCreator(String first, String last)
    {
        name= first + " " + last;
        age= 0;
        sex= " ";
        height= 0;
        weight= 0;
        socialSecurityNumber= " ";
        address= " ";
        phoneNumber= " ";
        dob= " ";
    }
    
    public void getAge(int years)
    {
        age= years;
    }
    
    public void getSex(String userSex)
    {
        sex= userSex;
    }
    
    public void getHeight(int inches)
    {
        height= inches;
    }
    
    public void getWeight(int pounds)
    {
        weight= pounds;
    }
    
    public void getSocialSecurityNumber(int firstNum, int secondNum, int thirdNum)
    {
        if (firstNum < 100 || firstNum > 999) {
            System.err.println("Please use a valid number");
        } else if (secondNum < 10 || secondNum > 99) {
            System.err.println("Please use a valid number");
        } else if (thirdNum < 1000 || thirdNum > 9999) {
            System.err.println("Please use a valid number");
        } else {
        socialSecurityNumber= firstNum + "-" + secondNum + "-" + thirdNum;
    }
    }
    
    public void getAddress(String housenumber, String streetname, String city, String state, String zipcode)
    {
        address= housenumber + streetname + city + state + zipcode;
    }
    
    public void getPhoneNumber(int areaCode, int numBegin, int numEnd)
    {
        if (areaCode < 100 || areaCode > 999) {
            System.err.println("Please use a valid number");
        } else if (numBegin < 100 || numBegin > 999) {
            System.err.println("Please use a valid number");
        } else if (numEnd < 1000 || numEnd > 9999) {
            System.err.println("Please use a valid number");
        } else {
        phoneNumber= areaCode + "-" + numBegin + "-" + numEnd;
    }
    }
    
    public void getDob(String userDob)
    {
        dob= userDob;
    }
    
    /**
     * Print a ticket
     */
    public void printPerson()
    {
        System.out.println("name: "+name);
        System.out.println("age");
        System.out.println("sex");
        System.out.println("height");
        System.out.println("weight");
        System.out.println("socialSecurityNumber");
        System.out.println("adress");
        System.out.println("phoneNumber");
        System.out.println("dob");
    }
}
