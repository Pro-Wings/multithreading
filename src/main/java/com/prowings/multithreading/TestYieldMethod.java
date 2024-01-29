package com.prowings.multithreading;

public class TestYieldMethod {
	
    public static void main(String[]args)  
    {  
        JavaYieldExp t1 = new JavaYieldExp();  
        JavaYieldExp t2 = new JavaYieldExp();  
        
        t1.setPriority(5);
        t2.setPriority(1);
        // this will call run() method  
        t1.start();  
        t2.start();  
        for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  


}
