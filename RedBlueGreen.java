import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class RedBlueGreen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int length=input.nextInt();
        char[] color=new char[length];
        for(int i=0;i<length;i++)
        {
            color[i]=input.next().charAt(0);
        }
       LinkedHashMap<Character,Integer> count=countingColors(color);
        for(Map.Entry<Character,Integer> colour:count.entrySet())
        {
            printingColor(colour.getKey(),colour.getValue());
        }
    }

    public static LinkedHashMap<Character,Integer> countingColors(char[] color)
    {
        LinkedHashMap<Character,Integer> count= new LinkedHashMap<>();
        int value=0;
        for(char i:color)
        {
            if(count.containsKey(i))
            {
                count.replace(i,count.get(i),count.get(i)+1);
            }
            else
            {
                count.put(i,value+1);
            }
        }
        return count;
    }
    public static void printingColor(char color,int count)
    {
        for(int i=0;i<count;i++)
        {
            System.out.print(color);
        }
    }
}