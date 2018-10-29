import java.util.*;

public class Listtest


{

public static void main(String[] args)
{
Map<Integer,String> m=new HashMap();
m.put(1,"Lakshay");
List<String> a=new ArrayList();
a.add("Lakshay");

System.out.println("Size "+a.size()+" Size of Map "+m.size());

for(String b:a)
{
System.out.println("Item "+b);
}

for(int d:m.keySet())
{
System.out.println("Key "+d);
}
}

}
