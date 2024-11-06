import static java.lang.Math.random;
public class ObjectLiterature
{
    //переменные
    private static int ID = 1;
    private int id;
    private int sourceCodeOfLiterature;
    private int yearOfPublication;
    private int numberOfPages = 0;
    private String typeOfLiterature;
    private String name;
    private String nameOfPublisher;
    private String author = "";

    //конструкторы
    public ObjectLiterature(){this.id = ID++;}
    public ObjectLiterature(int sourceCodeOfLiterature, int yearOfPublication, String typeOfLiterature, String name, String nameOfPublisher)
    {
        this.sourceCodeOfLiterature = sourceCodeOfLiterature;
        this.yearOfPublication = yearOfPublication;
        this.typeOfLiterature = typeOfLiterature;
        this.name = name;
        this.nameOfPublisher = nameOfPublisher;
        this.id = ID++;
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
        String str = "" + sourceCodeOfLiterature;
        if (str.length() <= 7)
            this.sourceCodeOfLiterature = sourceCodeOfLiterature;
        else
            System.err.println("Код литературы не может быть больше 7 знаков!");
    }
    public void setYearOfPublication(int yearOfPublication)
    {
        if(yearOfPublication <= 2024 && yearOfPublication > 0)
            this.yearOfPublication = yearOfPublication;
        else
            System.err.println("Вы живёте не в нашем мире!");
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
        if (numberOfPages <= 4959 && numberOfPages > 0)
            this.numberOfPages = numberOfPages;
        else
            System.err.println("Слишком много страниц в книге!");
    }

    //методы
    public void addLiterature(int sourceCodeOfLiterature, int yearOfPublication, String typeOfLiterature, String name, String nameOfPublisher)
    {
        setSourceCodeOfLiterature(sourceCodeOfLiterature);
        setYearOfPublication(yearOfPublication);
        setTypeOfLiterature(typeOfLiterature);
        setName(name);
        setNameOfPublisher(nameOfPublisher);
    }
    @Override
    public String toString()
    {
        String str = "Название: " + name +
                "\nКод источника литературы: " + sourceCodeOfLiterature +
                "\nГод издательства: " + yearOfPublication +
                "\nТип литературы: " + typeOfLiterature +
                "\nНазвание издательства: " + nameOfPublisher;;
        if (numberOfPages != 0)
            str += "\nКоличество страниц: " + numberOfPages;
        if (author != "")
            str +="\nАвтор: " + author;
        str += "\n\n";
        return str;
    }
}
