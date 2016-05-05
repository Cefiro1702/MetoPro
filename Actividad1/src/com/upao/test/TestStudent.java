/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.test;

import com.upao.ejercicio1.Student;

public class TestStudent 
{
    public static void main(String[] args) 
    {
        Student stu=new Student("Cayetano Azañero", "El milagro city");
        
        Student[] GrupoEstudiantil=new Student[50];
        
        stu.addCoursesGrades("\nMetodologia de la Programacion", 2);
        stu.addCoursesGrades("\nAlgebra Lineal", 2);
        stu.addCoursesGrades("\nFisica General", 3);
        stu.addCoursesGrades("\nCalculo Lineal", 4);
        
        stu.printGrades();
        
        System.out.print("\nThe average grade is : "+
                    stu.getAverageGrade());
        System.out.println("\n");
    }
    
}
