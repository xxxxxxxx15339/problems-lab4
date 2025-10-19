package problem2;

public class IntegerList
{
    int[] list;
    private int currentSize;
    
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize = 0;
    }
    
    private void increaseSize()
    {
        int[] newList = new int[list.length * 2];
        for (int i = 0; i < currentSize; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }
    
    public void addElement(int newVal)
    {
        if (currentSize >= list.length) {
            increaseSize();
        }
        list[currentSize] = newVal;
        currentSize++;
    }
    
    public void removeFirst(int newVal)
    {
        for (int i = 0; i < currentSize; i++) {
            if (list[i] == newVal) {
                for (int j = i; j < currentSize - 1; j++) {
                    list[j] = list[j + 1];
                }
                currentSize--;
                return;
            }
        }
    }
    
    public void removeAll(int newVal)
    {
        for (int i = 0; i < currentSize; i++) {
            if (list[i] == newVal) {
                for (int j = i; j < currentSize - 1; j++) {
                    list[j] = list[j + 1];
                }
                currentSize--;
                i--;
            }
        }
    }
    
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        currentSize = list.length;
    }
    
    public void print()
    {
        for (int i=0; i<currentSize; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    
    public int getCurrentSize()
    {
        return currentSize;
    }
}