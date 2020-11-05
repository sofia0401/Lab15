package Task1;

import java.util.Vector;

public class MyCollection {

    Vector<Integer> vector = new Vector<Integer>();
    public void Add(int x) {
        vector.addElement(x);
    }
    public void Remove(int x) {
        vector.removeElement(x);
    }
    public void valueSearch(int x) {
        int flag=0;
        for (int i=0;i<vector.size();++i) {
            if (vector.get(i) ==x) {
                System.out.println("Found");
                flag=1;
                break;
            }
        }
        if (flag!=1) System.out.println("Not found");
    }
    public int indexSearch(int x) {
        return (vector.get(x));

    }
    public int minimum(int x) {
        x=vector.get(0);
        for (int i=1;i<vector.size();++i) {
            if (vector.get(i)<x)
                x=vector.get(i);
        }
        return x;
    }
    public int maximum(int x) {
        x=vector.get(0);
        for (int i=1;i<vector.size();++i) {
            if (vector.get(i)>x)
                x=vector.get(i);
        }
        return x;
    }
    public double Average() {
        double s=0;
        for (int i=0;i<vector.size();++i)
            s+=vector.get(i);
        return s/(vector.size());
    }
}
