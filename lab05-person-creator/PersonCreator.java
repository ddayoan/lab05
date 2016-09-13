
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
    
    public void getSocialSecurityNumber(String userSocialSecurityNumber)
    {
        socialSecurityNumber= userSocialSecurityNumber;
    }
    
    public void getAddress(String housenumber, String streetname, String city, String state, String zipcode)
    {
        address= housenumber + streetname + city + state + zipcode;
    }
    
    public void getPhoneNumber(String userPhonenumber)
    {
        phoneNumber= userPhonenumber;
    }
    
    public void getDob(String userDob)
    {
        dob= userDob;
    }
}
