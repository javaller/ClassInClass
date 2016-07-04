package day_6;

import java.util.Arrays;
import java.util.Comparator;

class Box implements Comparable {
        
    private class CmpBoxBySideA implements Comparator {
    public int compare(Object t1, Object t2) {
        Box b1 = (Box) t1;
        Box b2 = (Box) t2;
        return b1.a - b2.a;
    }
            }    
        
    public static Comparator bySideA() {
     //   return new CmpBoxBySideA();
    }
    
        private int a, b, c ;
        public Box(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }          
    }
             
    public class MySort {
        public static void main(String[] args) throws Exception {
        Box [] data ={ new Box(3,5,1), 
                        new Box(1,2,3), 
                        new Box(2,4,3) };
        
        Arrays.sort(data, Box.bySideA() );
        for (Box d:data) System.out.println(d);
        
        Class info = data[0].getClass();
        System.out.println(info.getName() );
        Method ms[] = info.getMethods();
        for (Method mi:ms)
            System.out.println(mi.getName() );               
//      Class info2 = Class.forName("java.lang.Double"); // должно быть полное имя в качестве параметра
//      info2.newInstance();
        
        }

    }
