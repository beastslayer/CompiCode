import java.util.*;



class testing{

    public static int  getint()
    {
        int n;
        Scanner scanner_obj=new Scanner(System.in);
        n=scanner_obj.nextInt();
        scanner_obj.close();
        return n;
    }

    public static int multiply(int arrays[],int number,int index)
    {
        int temp=0,h;
        int cur_ind;
        for( cur_ind=0;cur_ind<=index;cur_ind++)
        {
            h=(number*arrays[cur_ind])+temp;
            arrays[cur_ind]=h%10;
            temp=h/10;
            System.out.println("program to multiply: cur_index is "+cur_ind);
            System.out.println("program to multiply: temp is "+temp);
        }

        if(temp!=0)
        {
            while(temp>0)
            {
                arrays[cur_ind++]=temp%10;
                temp/=10;
            }


        }
        return index=cur_ind-1;
    }

    public static void main (String[] args)
    {
        int[] array=new int[200];
        int n=getint();
        int copy=n-1;

        System.out.println("Value of Copy var initially is :"+copy);

        int index=0;

        //now we will store the int into the ARRAYS
        System.out.println("Now the int is settled into the array");

        while(n>0)
        {
            array[index++]=n%10;
            n=n/10;
        }

        //now well check the array for its correctness

        int debug_index=--index;

        System.out.print("Value of Debug_index is :"+ debug_index);

        for(;copy>0;copy--)
        {
            int z=multiply(array,copy,index);
            System.out.println("index :"+z);
            index=z;
        }

    while(index>=0)
        {
            System.out.print(array[index--]);
        }
    }
}
