
package car;
public class Car {
   
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    
    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    public void setYear(int year) {
        this.year = year;
    }

  
    public String getCompanyName() {
        return company_name;
    }

    public String getModelName() {
        return model_name;
    }

    public int getYear() {
        return year;
    }

   
    public double getMileage() {
        return mileage;
    }

  
    public Car(double mileage) {
        this.mileage = mileage;
    }


    public void displayInfo() {
        System.out.println("Company Name: " + getCompanyName());
        System.out.println("Model Name: " + getModelName());
        System.out.println("Year: " + getYear());
        System.out.println("Mileage: " + getMileage() + " km/l");
    }


    public static void main(String[] args) {
        Car car = new Car(18.5); 

        car.setCompanyName("Toyota");
        car.setModelName("Corolla");
        car.setYear(2022);

        car.displayInfo();
    }
}

