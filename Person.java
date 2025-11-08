
package person;

public class Person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    
  
 public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Kawchar");
        p.setAge(22);
        p.setCountry("Bangladesh");
        p.displayInfo();
    }
}
