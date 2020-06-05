import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Generic_Class_SLITT {
    

    public static void main(String[] args) {
        HashMap<String,Double> map1=new HashMap<String,Double>();
        map1.put("Deshan", 12.2);
        map1.put("Harshana", 32.2);
        map1.put("Nawarathna", 12.2);
        map1.put("Pemasiri", 14.2);

        MyMathClass<String, Double> myobj1=new MyMathClass<String,Double>();
        System.out.println(myobj1.Average(map1));
        System.out.println(Arrays.deepToString(myobj1.ConvertTo(map1).toArray()));
        






        HashMap<String,Integer> map2=new HashMap<String,Integer>();
        map2.put("Deshan", 12);
        map2.put("Harshana", 32);
        map2.put("Nawarathna", 11);
        map2.put("Pemasiri", 14);

        MyMathClass<String, Integer> myobj2=new MyMathClass<String,Integer>();
        System.out.println(myobj2.Average(map2));
        System.out.println(Arrays.deepToString(myobj2.ConvertTo(map2).toArray()));


        
    }
}


class MyMathClass<T,V extends Number>{

   


    public double Average(HashMap<T, V> map){
        double average=0.0;
        for(Number i: map.values()){
            average+=i.doubleValue();
        }
        return average/map.size();
    }

    public ArrayList<V> ConvertTo(HashMap<T,V> map){
        ArrayList<V> list=new ArrayList<V>();
        
        list.addAll(map.values());
        
        return list;
    }
}