public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car("Mazda6", 2006, 1.8);
        car.PrintCar();
        car.NewCar("Mazda3", 2008, 2.0);
        car.PrintCar();
        Literature book1 = new Literature(5947382, 2024, "Документальная проза", "Печаль о потеряных баллах", "КубГУ");
        Literature book2 = new Literature(7382473, 2024, "Художественная литература", "Кабинет 219", "КубГУ");
        Literature book3 = new Literature(9350163, 2023, "Мемуарная литература", "2 курс как смысл жизни", "ИС1");
        Literature book4 = new Literature(6382718, 2023, "Научная и научно-популярная литература", "Диффура", "ИС1");
        Literature book5 = new Literature();
        book5.AddLiterature(1825493, 2022, "Учебная литература", "Механика в физике", "ИС1");
        book4.SetAuthor("КубГУ");
        book4.SetNumberOfPages(9999);
        book5.SetAuthor("КубГУ");
        book5.SetNumberOfPages(251);
        Literature[] array = {book1, book2, book3, book4, book5};
        ObjectLiterature stack = new ObjectLiterature(array);
        stack.DeleteFromLiterature(4);
        stack.AddLiterature(book1);
        stack.AddLiterature(book5);
        stack.SortLiterature();
        stack.Print();
    }
}