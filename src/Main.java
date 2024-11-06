public class Main
{
    public static void main(String[] args)
    {
        ObjectLiterature book1 = new ObjectLiterature(5947382, 2024, "Документальная проза", "Печаль о потеряных баллах", "КубГУ");
        ObjectLiterature book2 = new ObjectLiterature(7382473, 2024, "Художественная литература", "Кабинет 219", "КубГУ");
        ObjectLiterature book3 = new ObjectLiterature(9350163, 2023, "Мемуарная литература", "2 курс как смысл жизни", "ИС1");
        ObjectLiterature book4 = new ObjectLiterature(6382718, 2023, "Научная и научно-популярная литература", "Диффура", "ИС1");
        ObjectLiterature book5 = new ObjectLiterature();
        book5.addLiterature(1825493, 2022, "Учебная литература", "Механика в физике", "ИС1");
        book4.setAuthor("КубГУ");
        book4.setNumberOfPages(4958);
        book5.setAuthor("КубГУ");
        book5.setNumberOfPages(251);
        ObjectLiterature[] array = {book1, book2, book3, book4, book5};
        GroupLiterature stack = new GroupLiterature(array);
        stack.deleteFromLiterature(4);
        stack.addLiterature(book1);
        stack.addLiterature(book5);
        stack.sortLiterature();
        System.out.println(stack.toString());
    }
}