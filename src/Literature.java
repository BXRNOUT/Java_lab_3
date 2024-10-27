import static java.lang.Math.random;
public class Literature
{
    //переменные
    private int unique_code = (int)(random() * 100);
    private int source_code_of_literature;
    private int year_of_publication;
    private int number_of_pages = 0;
    private String type_of_literature;
    private String name;
    private String name_of_publisher;
    private String author = "";

    //конструкторы
    public Literature(){}
    public Literature(int source_code_of_literature, int year_of_publication, String type_of_literature, String name, String name_of_publisher)
    {
     this.source_code_of_literature = source_code_of_literature;
     this.year_of_publication = year_of_publication;
     this.type_of_literature = type_of_literature;
     this.name = name;
     this.name_of_publisher = name_of_publisher;
    }

    //гетеры и сеттеры
    private int GetSourceCodeOfLiterature()
    {
        return source_code_of_literature;
    }
    public int GetYearOfPublication()
    {
        return year_of_publication;
    }
    private int GetNumberOfPages()
    {
        return number_of_pages;
    }
    private String GetTypeOfLiterature()
    {
        return type_of_literature;
    }
    private String GetName()
    {
        return name;
    }
    private String GetNameOfPublisher()
    {
        return name_of_publisher;
    }
    private String GetAuthor()
    {
        return author;
    }

    private void SetSourceCodeOfLiterature(int source_code_of_literature)
    {
        this.source_code_of_literature = source_code_of_literature;
    }
    private void SetYearOfPublication(int year_of_publication)
    {
        this.year_of_publication = year_of_publication;
    }
    private void SetTypeOfLiterature(String type_of_literature)
    {
        this.type_of_literature = type_of_literature;
    }
    private void SetName(String name)
    {
        this.name = name;
    }
    private void SetNameOfPublisher(String name_of_publisher)
    {
        this.name_of_publisher = name_of_publisher;
    }

    public void SetAuthor(String author)
    {
        this.author = author;
    }
    public void SetNumberOfPages(int number_of_pages)
    {
        this.number_of_pages = number_of_pages;
    }

    //методы
    public void AddLiterature(int source_code_of_literature, int year_of_publication, String type_of_literature, String name, String name_of_publisher)
    {
        this.source_code_of_literature = source_code_of_literature;
        this.year_of_publication = year_of_publication;
        this.type_of_literature = type_of_literature;
        this.name = name;
        this.name_of_publisher = name_of_publisher;
    }
    public void Print()
    {
        if(source_code_of_literature != 0) {
            System.out.printf("Код источника литературы: %d\nТип литературы: %s\nНазвание: %s\nГод издательства: %d\nНазвание издательства: %s\n", source_code_of_literature, type_of_literature, name, year_of_publication, name_of_publisher);
            if (number_of_pages != 0)
                System.out.printf("Количество страниц: %d\n", number_of_pages);
            if (author != "")
                System.out.printf("Автор: %s\n", author);
        }
        System.out.println();
    }
    public void PrintYear()
    {
        System.out.println(year_of_publication);
    }

}
