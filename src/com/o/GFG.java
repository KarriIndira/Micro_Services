package com.o;

class Cuboid {
    
    
    public double length;
    public double breadth;
    public double height;
}
 

class Application {
 
    
    public double get_total_volume(Cuboid[] geo_objects)
    {
        
        double vol_sum = 0;
 
        
        for (Cuboid geo_obj : geo_objects) {
             
            
            vol_sum += geo_obj.length * geo_obj.breadth
                       * geo_obj.height;
        }
 
        
        return vol_sum;
    }
}
 

public class GFG {
 

    public static void main(String args[])
    {
        
        Cuboid cb1 = new Cuboid();
 
        
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;
 
        
        Cuboid cb2 = new Cuboid();
 
        
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;
 
        
        Cuboid cb3 = new Cuboid();
 
        
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;
 
        
        Cuboid[] c_arr = new Cuboid[3];
        c_arr[0] = cb1;
        c_arr[1] = cb2;
        c_arr[2] = cb3;
 
        
        Application app = new Application();
         
        
        double vol = app.get_total_volume(c_arr);
         
        
        System.out.println("The total volume is " + vol);
    }
}