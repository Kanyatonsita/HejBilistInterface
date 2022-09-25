public class Car implements Vehicle{
    private Driver driver;

    private int myAge = 18;
    private String type = "Car";
    private int milesToGo = 100;
    private int milesDriven = 10;
    boolean noDriver = false;

    public Car() {
        System.out.println(type + " create. " + milesToGo + " miles to go!");
    }

    public boolean checkAge(String name, int age) {
        if (age < myAge) {
            System.out.println("Driver not changed! " + name + " is "+ age + ", but must be "+ myAge + " or older to drive "+ type);
        }else {
            return true;
        }
        return false;
    }

    public void setDriver(Driver driver){
        if (checkAge(driver.name, driver.age)){
            this.driver = driver;
            System.out.println("Driver chaged to "+ driver.name);
            noDriver = true;
        }
    }

    public void drive(){
        if (!noDriver){
            System.out.println(type+ " didn't drive - there's no driver!");
        } else {
            milesToGo = milesToGo - milesDriven;
            System.out.println( type + " drove " + milesDriven + " miles - "+ milesToGo + " miles to go");
        }
    }
}
