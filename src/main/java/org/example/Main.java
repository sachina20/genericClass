package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int name;
    String Id;

    public static void main(String[] args) {
           Main main = new Main();
            GenericClasses<Main> genericClasses= new GenericClasses<>(main);
            //genericClasses.setContaint();
            System.out.println(genericClasses.getContaint());
        }
    }
