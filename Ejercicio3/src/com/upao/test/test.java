
package com.upao.test;

import com.upao.ejercicio.Author;
import com.upao.ejercicio.Book;

public class test {

    public static void main(String[] args) 
    {
        Author h=new Author("Cayetano ", "cesar17_0297@hotmail.com", 'M');
        Book b=new Book("El amanecer del import", h, 99, 5);
        System.out.println(b);
    }
    
}
