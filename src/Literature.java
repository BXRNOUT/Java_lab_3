import static java.lang.Math.random;
public class Literature
{
    //переменные
    private int uniqueCode = (int)(random() * 100);
    private int sourceCodeOfLiterature;
    private int yearOfPublication;
    private int numberOfPages = 0;
    private String typeOfLiterature;
    private String name;
    private String nameOfPublisher;
    private String author = "";

    //конструкторы
    public Literature(){}
    public Literature(int sourceCodeOfLiterature, int yearOfPublication, String typeOfLiterature, String name, String nameOfPublisher)
    {
     this.sourceCodeOfLiterature = sourceCodeOfLiterature;
     this.yearOfPublication = yearOfPublication;
     this.typeOfLiterature = typeOfLiterature;
     this.name = name;
     this.nameOfPublisher = nameOfPublisher;
    }

    //гетеры и сеттеры
    public int getSourceCodeOfLiterature()
    {
        return sourceCodeOfLiterature;
    }
    public int getYearOfPublication()
    {
        return yearOfPublication;
    }
    public int getNumberOfPages()
    {
        return numberOfPages;
    }
    public String getTypeOfLiterature()
    {
        return typeOfLiterature;
    }
    public String getName()
    {
        return name;
    }
    public String getNameOfPublisher()
    {
        return nameOfPublisher;
    }
    public String getAuthor()
    {
        return author;
    }

    public void setSourceCodeOfLiterature(int sourceCodeOfLiterature)
    {
        this.sourceCodeOfLiterature = sourceCodeOfLiterature;
    }
    public void setYearOfPublication(int yearOfPublication)
    {
        this.yearOfPublication = yearOfPublication;
    }
    public void setTypeOfLiterature(String typeOfLiterature)
    {
        this.typeOfLiterature = typeOfLiterature;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNameOfPublisher(String nameOfPublisher)
    {
        this.nameOfPublisher = nameOfPublisher;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    //методы
    public void addLiterature(int sourceCodeOfLiterature, int yearOfPublication, String typeOfLiterature, String name, String nameOfPublisher)
    {
        this.sourceCodeOfLiterature = sourceCodeOfLiterature;
        this.yearOfPublication = yearOfPublication;
        this.typeOfLiterature = typeOfLiterature;
        this.name = name;
        this.nameOfPublisher = nameOfPublisher;
    }
    public void print()
    {
        if(sourceCodeOfLiterature != 0) {
            System.out.printf("Код источника литературы: %d\nТип литературы: %s\nНазвание: %s\nГод издательства: %d\nНазвание издательства: %s\n", sourceCodeOfLiterature, typeOfLiterature, name, yearOfPublication, nameOfPublisher);
            if (numberOfPages != 0)
                System.out.printf("Количество страниц: %d\n", numberOfPages);
            if (author != "")
                System.out.printf("Автор: %s\n", author);
        }
        System.out.println();
    }
    public void printYear()
    {
        System.out.println(yearOfPublication);
    }

}
