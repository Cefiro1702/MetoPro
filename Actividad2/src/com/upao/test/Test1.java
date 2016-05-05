
package com.upao.test;

import com.upao.ejericicios.Author;
import com.upao.ejericicios.Book;

public class Test1 {

    
    public static void main(String[] args) 
    {
       Author n2=new Author("Cayetano ", "cesar17_097@hotmail.com", 'M');
        System.out.println(n2);
        
        Book n1=new Book("Test de ejercicios",n2, 19.99, 3);
        System.out.println(n1);
    }
    
}
