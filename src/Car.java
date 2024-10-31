public class Car
{
    //переменные
    private String brand;
    private int yearOfIssue;
    private double engineCapacity;

    //конструкторы
    public Car() {}
    public Car(String brand, int yearOfIssue, double engineCapacity)
    {
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.engineCapacity = engineCapacity;
    }

    //гетеры и сетеры
    public String getBrand()
    {
        return brand;
    }
    public int getYearOfIssue ()
    {
        return yearOfIssue;
    }
    public double getEngineCapacity()
    {
        return engineCapacity;
    }
    public void setBrand (String brand)
    {
        this.brand = brand;
    }
    public void setYearOfIssue(int yearOfIssue)
    {
        this.yearOfIssue = yearOfIssue;
    }
    public void setEngineCapacity(double engineCapacity)
    {
        this.engineCapacity = engineCapacity;
    }

    //методы
    public void newCar(String brand, int yearOfIssue, double engineCapacity)
    {
        setBrand(brand);
        setYearOfIssue(yearOfIssue);
        setEngineCapacity(engineCapacity);
    }
    public void printCar()
    {
        System.out.printf("Марка авто: %s Год производства: %d Объём двигателя: %.1f\n\n", brand, yearOfIssue, engineCapacity);
    }
}
