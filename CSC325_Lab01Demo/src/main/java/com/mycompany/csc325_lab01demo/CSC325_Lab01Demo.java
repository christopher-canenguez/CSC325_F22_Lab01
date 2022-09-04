/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.csc325_lab01demo;

/**
 *
 * @author chriscanenguez
 */
public class CSC325_Lab01Demo {

    private static void sayHello()
    {
        System.out.println("Hello World! Currently using a sayHello method.");
    }
    
    private static void sayHello(String str, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World! Welcome to Java Programming");
        sayHello();
        sayHello("Hello World!, currently using an overloaded method:)", 3);
    }
}
