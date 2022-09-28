public class Car {

    // Atrributer

    private String brand;
    private String make;
    private String honk;

    private boolean engineOn;

    private Driver driver;


    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setHonk(String honk) {
        this.honk = honk;
    }

    public String turnEngineOn() {
        if (driver != null){
            this.engineOn = true;
            return "Engine is on";
        }
        else {
            return "No driver";
        }
    }

    public void turnEngineOff(){
        this.engineOn = false;
    }


    // Getter

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public String getHonk() {
        return honk;
    }

    public boolean isEngineOn() {
        return engineOn;
    }


    // Kontruktør

    public Car(String brand, String make, String honk) {
        setBrand(brand);
        setMake(make);
        setHonk(honk);
        boolean engineOn = false;
        driver = null;
    }


    // Sound drive park metode

    public String sound() {
        if (driver != null) {
            return honk;
        }else{
            return "No driver";
        }

    }

    public String park() {
        if (driver != null) {
            return brand + " er parkeret";
        }else {
            return "No driver";
        }

    }

    // Engine metode
    public String drive() {
        if (engineOn){
            System.out.println("Something went wrong");
        } else{
            System.out.println(brand+make+"kører");
        }
        return "";
    }

    // Driver metode

    public void setDriver(Driver driver){
        this.driver = driver;
    }


}
