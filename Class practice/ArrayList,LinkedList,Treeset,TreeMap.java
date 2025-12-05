package practice;
import java.util.*;

public class ClassPractice {

    public static void main(String[] args) {
        
           //ArrayList
           
       ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        
        for(Integer element: arr){
            System.out.println(element);
        }
        
        System.out.println("The element is at: " + arr.lastIndexOf(3));
        
        //Removing element
        arr.remove(4);
         for(Integer element: arr){
            System.out.println(element);
        }
         
        //adding element
        System.out.println("\n");  
        arr.set(2, 10);
        for(Integer element: arr){
           System.out.println(element);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(arr);
         System.out.println("arr1: " + arr);
         System.out.println("arr2: " + arr2);
            
           //Linked List

        LinkedList link = new LinkedList();
        link.add("Hello");
        link.add(2);
        link.add("you");
        
        Iterator it = link.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
            for(Object item : link){
                System.out.println(item);
                }

          System.out.println(link);
          
          //TreeSet
         TreeSet ks= new TreeSet();
         ks.add(8);
         ks.add(2);
         ks.add(4);
         ks.add(2);
         System.out.println(ks);
         
         //TreeMap
   
         TreeMap<String, String> no = new TreeMap<>();
            no.put("g","ket");
            no.put("0","jer");
            System.out.println(no);

            for (Map.Entry<String, String> element : no.entrySet()) {
             System.out.println(element.getKey() + " => " + element.getValue());
                }
    }}