public class User{



public static String isAdmin() {
    boolean isAdmin = true;
    Person user = new Person("carlo","cappellini");
    return user.firstName  +" "+ user.lastName +"\n" +user.sayHello("");

}

    public static void main(String[] args) {
        System.out.println(isAdmin());


    }
}
