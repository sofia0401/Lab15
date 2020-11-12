package Task1;

public class MyCollection {

    private static int[] array;
    private static int size;

    public static int getSize(){
        return size;
    }

    public  MyCollection(){
        array = new int[0];
    }

    public void Add(int x) {
        if (array.length == 0)
            array = new int[1];
        else {
            int[] temp = new int[array.length + 1];
            System.arraycopy(array, 0, temp, 0, temp.length - 1);
            array = new int[array.length + 1];
            System.arraycopy(temp, 0, array, 0, array.length-1);
        }
        array[array.length - 1] = x;
        size++;
    }
    public void Remove(int x) {
        int[] temp=new int[array.length-1];
        System.arraycopy(array,0,temp,0,x);
        System.arraycopy(array,x+1,temp,x,temp.length-x);
        array=new int[array.length-1];
        System.arraycopy(temp,0,array,0, array.length);
        size--;
    }
    public boolean valueSearch(int x) {
        boolean flag=false;
        for (int i=0;i<array.length;++i) {
            if (array[i]==x)
                flag=true;
            break;
        }
        return flag;
    }

    public void indexSearch(int x) {
        if (x<array.length) {
            System.out.println(array[x]);
            System.out.println("Элемент найден");
        }
        else
            System.out.println("Элемент не найден");
    }

    public int Maximum() {
        int x=array[0];
        for (int i=1;i<array.length;++i) {
            if (array[i]>x)
                x=array[i];
        }
        return x;
    }

    public int Minimum() {
        int x=array[0];
        for (int i=1;i<array.length;++i) {
            if (array[i]<x)
                x=array[i];
        }
        return x;
    }

    public double Average() {
        double s=0;
        for (int i=0;i<array.length;++i)
            s+=array[i];
        return s/(array.length);
    }
}
