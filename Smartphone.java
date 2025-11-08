
package smartphone;
public class Smartphone {
   
    private String brand;
    private String model;
    private int storageCapacity;

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

   
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

  
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            storageCapacity += additionalStorage;
            System.out.println("Storage increased by " + additionalStorage + "GB successfully!");
        } else {
            System.out.println("Invalid storage value! Must be positive.");
        }
    }

   
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }

  
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.setBrand("Samsung");
        phone.setModel("Galaxy S23");
        phone.setStorageCapacity(128);

        System.out.println("Before increasing storage:");
        phone.displayInfo();

        System.out.println("\nIncreasing storage by 64GB...");
        phone.increaseStorage(64);

        System.out.println("\nAfter increasing storage:");
        phone.displayInfo();
    }
}

