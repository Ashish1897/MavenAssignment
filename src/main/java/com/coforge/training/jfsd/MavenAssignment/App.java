package com.coforge.training.jfsd.MavenAssignment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println();
        
        Customer c = new Customer(101,"Prashant",5,1700);
        
        c.display();
    }
}
