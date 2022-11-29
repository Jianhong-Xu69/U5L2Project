public class Person {

    private String firstName;
    private String lastName;
    private String email;

    public Person(String fn, String ln, String em)//FirstName, LastName, EMail
    {
        firstName = fn;
        lastName = ln;
        email = em;
    }
    public Person(String fn, String ln)
    {
        firstName = fn;
        lastName = ln;
        email = "none";
    }

    public void introduce()
    {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String em)
    {
        email = em;
    }
}
