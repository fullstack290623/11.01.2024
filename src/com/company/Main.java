package com.company;

import com.utils.MyClass;

public class Main {

    public static void main(String[] args) {

        Car _honda = new Car(2024, 260, "Honda", "Civic", 5, 2000, false, false);
        Car honda = new Car(2024, 260, "Honda", "Civic", 5, 2000);
        honda.brand = "Honda";
        honda.model = "Civic";

        honda.startEngine();

        MyClass mc = new MyClass();

        // create class MobilePhone
        // with fields:
        // String os
        // bool isAndroid
        // bool isIphone
        // float screenSize
        // String color
        // int memory
        // int howManyCpu

        // create ctor thich gets all
        // create ctor which only gets os, isAndroid, screenSize, color -- and for other fields uses values you decide
        //               and calls the first ctor you wrote
        // create ctor which only gets os, isAndroid, -- and for other fields uses values you decide
        //               and calls the second ctor you wrote
        // create 3 phones using the 3 ctor



    }

}
