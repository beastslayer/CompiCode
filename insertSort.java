import java.util.*;

class testing {
    static void insertSort(int[] array)
    {
        int temp;
        int n=array.length;
        for(int z=1;z<n;z++)
        {
            for(int c=0;c<z;c++)
            {
                if(array[c]>array[z])
                {
                    int tmp=array[c];
                    array[c]=array[z];
                    array[z]=tmp;
                }
            }

        }
    }


    public static void main(String[] args)
    {
        int[] array=new int[5];
        Scanner s=new Scanner(System.in);
        for (int y=0;y<5;y++)
        {
            array[y]=s.nextInt();
        }
        insertSort(array);

        for(int z=0;z<5;z++)
        {
            System.out.print(" "+array[z]);
        }

    }
}
