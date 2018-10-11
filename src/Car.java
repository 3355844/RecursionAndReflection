import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Car implements Serializable {
    private static final String GAZ = "OIL";
    private long id = UUID.randomUUID().getLeastSignificantBits()*-1;
    private Date yearCreation;
    private String brand;
    private String color;
    private boolean transIsMechanic;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car info " +
                ", yearCreation=" + yearCreation +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", transIsMechanic=" + transIsMechanic +
                '}';
    }

//    public static long LastCarId (){
//        ArrayList<Car> cars = new ArrayList<>();
//        cars = FileManager.readFromFile("fileCars.txt");
//        long max = 0;
//        for (Car car : cars) {
//            if (car.getId() > max){
//                max = car.getId();
//            }
//        }
//
//        return max;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getId() == car.getId() &&
                isTransIsMechanic() == car.isTransIsMechanic() &&
                Objects.equals(getYearCreation(), car.getYearCreation()) &&
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getYearCreation(), getBrand(), getColor(), isTransIsMechanic());
    }

    public Car(Date yearCreation, String brand, String color, boolean transIsMechanic) {
        this.yearCreation = yearCreation;
        this.brand = brand;
        this.color = color;
        this.transIsMechanic = transIsMechanic;
    }

    public void setYearCreation(Date yearCreation) {
        this.yearCreation = yearCreation;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransIsMechanic(boolean transIsMechanic) {
        this.transIsMechanic = transIsMechanic;
    }

    public long getId() {
        return id;
    }

    public Date getYearCreation() {
        return yearCreation;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean isTransIsMechanic() {
        return transIsMechanic;
    }
}
