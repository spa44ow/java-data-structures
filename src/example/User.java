package example;

public class User implements IUser {

    public String name;
    public int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void sayHello(){
        System.out.println("My name is " + name + " And my Age is "+age);
    }


    @Override
    public void viewAge(int age) {

    }

    @Override
    public void viewName(String name) {

    }

    @Override
    public void viewGender(String gender) {

    }
}
