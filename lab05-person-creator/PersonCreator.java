  
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
    
    /*
     * Description:Creating a person (constructor)
     * Input: First name and last name
     * Output: A person
     * Purpose: Create a person
     * Example: "Delaney" "Dayoan"
     */
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
    
    /*
     * Description: Person's age
     * Input: years
     * Output: void
     * Purpose: Put a person's age into the program
     * Example: 18
     */
    public void setAge(int years)
    {
        age= years;
    }
    
    /*
     * Description: Person's sex
     * Input: sex
     * Output: void
     * Purpose: put a person's sex into the program
     * Example: "Female"
     */
    public void getSex(String userSex)
    {
        sex= userSex;
    }
    
    /*
     * Description: Person's height
     * Input: inches
     * Output: void
     * Purpose: put a person's height into the program
     * Example: 56
     */
    public void getHeight(int inches)
    {
        height= inches;
    }
    
    /*
     * Description: Perosn's weight
     * Input: pounds
     * Output: void
     * Purpose: put a perosn's weight into the program
     * Example: 120
     */
    public void getWeight(int pounds)
    {
        weight= pounds;
    }
    
    /*
     * Description: Perosn's Social Security Number
     * Input: number
     * Output: void
     * Purpose: put a perosn's social security number into the program
     * Example: 100-50-9000
     */
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
    
    /*
     * Description: Person's address
     * Input: address
     * Output: void 
     * Purpose: put a person's address into the program
     * Example: 1 South Ave, Garden City, NY, 11530
     */
    public void getAddress(String housenumber, String streetname, String city, String state, String zipcode)
    {
        address= housenumber + streetname + city + state + zipcode;
    }
    
    /*
     * Description: Person's phone number
     * Input: three intergers representing a person's phone number
     * Output: void
     * Purpose: put a person's phone number into the program
     * Example: 890-789-6758
     */
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
    
    /*
     * Description: Perosn's date of birth
     * Input: nothing
     * Output: void
     * Purpose: put a person's date of birth into the program
     * Example: "11-26-1997"
     */
    public void getDob(String userDob)
    {
        dob= userDob;
    }
    
    /*
     * Description: print ticket
     * Input: nothing
     * Output: void
     * Purpose: to print a ticket
     * Example: printPerson
     */
    /**
     * Print a ticket
     */
    public void printPerson()
    {
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("sex: "+ sex);
        System.out.println("height: "+ height);
        System.out.println("weight: "+ weight);
        System.out.println("socialSecurityNumber: "+ socialSecurityNumber);
        System.out.println("address: "+ address);
        System.out.println("phoneNumber: "+ phoneNumber);
        System.out.println("dob: "+ dob);
    }
}
         