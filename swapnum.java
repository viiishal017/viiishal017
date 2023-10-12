import java.util.*;
import java.util.Collections;
public class swapnum 
{
    public static void swap(ArrayList<Integer>list,int indx1,int indx2)
    {
        int temp=list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }
    public static void main(String args[])

    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(69);
        list.add(24);
        list.add(38);
        list.add(40);
        list.add(53);
        int indx1=1;
        int indx2=4;
        System.out.println(list);
        swap(list,indx1,indx2);
        System.out.println(list);

        //sorting in ascending order
        Collections.sort(list);
        System.out.println(list);
        

        //sorting in descending order
        
        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);

    }
    
}
