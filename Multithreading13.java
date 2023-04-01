import javax.lang.model.util.ElementScanner14;

import Multithreading.Synchronized;

class Library implements Runnable
{
    String res1=new String("java");
    String res2= new String("SQL");
    String  res3 = new String("DSA");

    public void Run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("STUDENT1"));
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("student 1 has acc"+res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("student 1 has acc"+res2);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("student 1 has acc"+res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problrem");
            }
        }
        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("student 2 has acc"+res3);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("student 2 has acc"+res2);
                        Thread.sleep(3000);
                        synchronized(res1)
                        {
                            System.out.println("student 2 has acc"+ res1);
                            Thread.sleep(3000);
                        }
                    
                    }
                }
            }
        
            catch(Exception e)
            {
                     System.out.println("some problem");
            }    
         }
    }
}

    

public class Multithreading13 {
    public static void main(String[] args) {
        Library lib = new Library();
        Thread t1= new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("STUDNT1");
        t2.setName("STUDENT2");

        t1.start();
        t2.start();

        
    }
}
