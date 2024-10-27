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
        CapacityOfStack();
    }

    //гетеры и сетеры
    private Literature GetLiteratureObject(int number)
    {
        return stack[number];
    }
    private Literature[] GetStack()
    {
        return stack;
    }
    private void SetLiteratureObject(Literature object, int index)
    {
        stack[index] = object;
    }
    private void SetStack (Literature[] stack)
    {
        this.stack = stack;
    }

    //методы
    private void CapacityOfStack()
    {
        capacity = stack.length;
    }
    public void AddLiterature(Literature object)
    {
        Literature[]stack = new Literature[capacity + 1];
        for (int i = 0; i < capacity; i++)
        {
            stack[i] = this.stack[i];
        }
        stack[capacity] = object;
        SetStack(stack);
        capacity++;
    }
    public void DeleteFromLiterature(int index)
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
        SetStack(stack);
        capacity--;
    }
    public void SortLiterature()
    {
        int j;
        for (int i = 1; i < stack.length; i++) {
            int swap = stack[i].GetYearOfPublication();
            Literature swap2 = stack[i];
            for (j = i; j > 0 && swap < stack[j - 1].GetYearOfPublication(); j--) {
                stack[j] = stack[j - 1];
            }
            stack[j] = swap2;
        }
    }
    public void Print()
    {
        for(int i = 0; i < capacity; i++)
            stack[i].Print();
    }
    public void PrintYear()
    {
        for(int i = 0; i < capacity; i++)
            stack[i].PrintYear();
    }
}
