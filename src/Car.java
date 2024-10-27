public class Car
{
    //переменные
    private String brand;
    private int year_of_issue;
    private double engine_capacity;

    //конструкторы
    public Car() {}
    public Car(String brand, int year_of_issue, double engine_capacity)
    {
        this.brand = brand;
        this.year_of_issue = year_of_issue;
        this.engine_capacity = engine_capacity;
    }

    //гетеры и сетеры
    private String GetBrand()
    {
        return brand;
    }
    private int GetYearOfIssue ()
    {
        return year_of_issue;
    }
    private double GetEngineCapacity()
    {
        return engine_capacity;
    }
    private void SetBrand (String brand)
    {
        this.brand = brand;
    }
    private void SetYearOfIssue(int year_of_issue)
    {
        this.year_of_issue = year_of_issue;
    }
    private void SetEngineCapacity(double engine_capacity)
    {
        this.engine_capacity = engine_capacity;
    }

    //методы
    public void NewCar(String _brand, int _year_of_issue, double _engine_capacity)
    {
        SetBrand(_brand);
        SetYearOfIssue(_year_of_issue);
        SetEngineCapacity(_engine_capacity);
    }
    public void PrintCar()
    {
        System.out.printf("Марка авто: %s Год производства: %d Объём двигателя: %.1f\n\n", brand, year_of_issue, engine_capacity);
    }
}
