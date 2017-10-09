import java.lang.ref.PhantomReference;

public class Person implements Greeter{

    protected String firstName;
    protected String lastName;




    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        try {
         if (!firstName.equals(null) || !lastName.equals(null));

        }catch (IllegalArgumentException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

public String sayHello(String hello){
   return "hello " + this.firstName  + " " + this.lastName;
}

}


