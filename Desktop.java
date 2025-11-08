
package desktop;
public class Desktop {
   
    private String brand;
    private String processor;
    private int ramSize; 

   
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

   
    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRamSize() {
        return ramSize;
    }

   
    public void upgradeRam(int additionalRam) {
        if (additionalRam > 0) {
            ramSize += additionalRam;
            System.out.println("RAM upgraded by " + additionalRam + "GB successfully!");
        } else {
            System.out.println("Invalid RAM value! Must be positive.");
        }
    }

    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
    }

   
    public static void main(String[] args) {
        Desktop desktop = new Desktop();

        desktop.setBrand("Dell");
        desktop.setProcessor("Intel i7");
        desktop.setRamSize(16);

        System.out.println("Before RAM upgrade:");
        desktop.displayInfo();

        System.out.println("\nUpgrading RAM by 16GB...");
        desktop.upgradeRam(16);

        System.out.println("\nAfter RAM upgrade:");
        desktop.displayInfo();
    }
}

