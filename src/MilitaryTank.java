public class MilitaryTank implements Vehicle  {
    private Driver driver;

    private int myAge = 25;
    private String type = "Tank";
    private int milesToGo = 2000;
    private  int milesDriven = 5;
    boolean noDriver = false;

    public MilitaryTank(){
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
