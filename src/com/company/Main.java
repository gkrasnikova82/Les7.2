package com.company;


//2. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
// Написать метод для получения информации о количестве.

class Construktor {  //класс

    static int NumberOfObjects =0;

    Construktor (){  //конструктор
               NumberOfObjects++;
    }

public static int GetNumberOfObjects() { //метод
        return (NumberOfObjects);

        }
}
public class Main {

    public static void main(String[] args) {
                Construktor Constr1 = new Construktor ();
        Construktor Constr2 = new Construktor ();
        System.out.println("Количество объектов класса "+Construktor.GetNumberOfObjects());

    }
}
