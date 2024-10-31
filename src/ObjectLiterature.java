public class ObjectLiterature
{
    //переменные
    private Literature[] stack;
    private int capacity;

    //конструкторы
    ObjectLiterature(){};
    ObjectLiterature(Literature[] stack)
    {
        this.stack = stack;
        capacityOfStack();
    }

    //гетеры и сетеры
    public Literature getLiteratureObject(int number)
    {
        return stack[number];
    }
    public Literature[] getStack()
    {
        return stack;
    }
    public void setLiteratureObject(Literature object, int index)
    {
        stack[index] = object;
    }
    public void setStack (Literature[] stack)
    {
        this.stack = stack;
    }

    //методы
    private void capacityOfStack()
    {
        capacity = stack.length;
    }
    public void addLiterature(Literature object)
    {
        Literature[]stack = new Literature[capacity + 1];
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
        Literature[]stack = new Literature[capacity - 1];
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
            Literature swap2 = stack[i];
            for (j = i; j > 0 && swap < stack[j - 1].getYearOfPublication(); j--) {
                stack[j] = stack[j - 1];
            }
            stack[j] = swap2;
        }
    }
    public void print()
    {
        for(int i = 0; i < capacity; i++)
            stack[i].print();
    }
    public void printYear()
    {
        for(int i = 0; i < capacity; i++)
            stack[i].printYear();
    }
}
