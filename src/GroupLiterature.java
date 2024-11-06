public class GroupLiterature
{
    //переменные
    private ObjectLiterature[] stack;
    private int capacity = 0;

    //конструкторы
    GroupLiterature(){};
    GroupLiterature(ObjectLiterature[] stack)
    {
        this.stack = stack;
        capacityOfStack();
    }

    //гетеры и сетеры
    public ObjectLiterature getLiteratureObject(int number)
    {
        return stack[number];
    }
    public ObjectLiterature[] getStack()
    {
        return stack;
    }
    public void setLiteratureObject(ObjectLiterature object, int index)
    {
        if(index < capacity && index >= 0)
            stack[index] = object;
        else
            System.err.println("Не верный индекс!!");
    }
    public void setStack (ObjectLiterature[] stack)
    {
        this.stack = stack;
    }

    //методы
    private void capacityOfStack()
    {
        capacity = stack.length;
    }
    public void addLiterature(ObjectLiterature object)
    {
        ObjectLiterature[]stack = new ObjectLiterature[capacity + 1];
        for (int i = 0; i < capacity; i++)
        {
            stack[i] = this.stack[i];
        }
        stack[capacity] = object;
        setStack(stack);
        capacity++;
    }
    public void deleteFromLiterature(int index)
    {
        ObjectLiterature[]stack = new ObjectLiterature[capacity - 1];
        for (int i = 0, j = 0; i < capacity; i++)
        {
            if(i != index)
            {
                stack[j] = this.stack[i];
                j++;
            }
        }
        setStack(stack);
        capacity--;
    }
    public void sortLiterature()
    {
        int j;
        for (int i = 1; i < stack.length; i++) {
            int swap = stack[i].getYearOfPublication();
            ObjectLiterature swap2 = stack[i];
            for (j = i; j > 0 && swap < stack[j - 1].getYearOfPublication(); j--) {
                stack[j] = stack[j - 1];
            }
            stack[j] = swap2;
        }
    }
    @Override
    public String toString()
    {
        String str = "\n";
        for (int i = 0; i < capacity; i++)
            str += stack[i].toString();
        return str;
    }
}
