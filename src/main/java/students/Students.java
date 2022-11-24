package students;

import calculator.Calculator;

import java.util.ArrayList;

public class Students {
    public static void main(String[] args) {
        String students1 = "Sarwat";
        //System.out.println(students1);
        String students2 = new String("Sarwat");
        String st3 = new String("Yusuf");
        String st4 = new String("Reza");
        String st5  = new String("Leon");
        String st6 = new String("Asheek");
        int a = 4;

        /**
         * 1. How to create the container(object or variable)? studentsList
         * 2. How to insert value into the container?
         * 3. How to get value form the container?
         * 4. How to update value in a container?
         * 5. How to delete value from container?
         * 6. How to calculate how many element/value inside the container?
         *
         * */

//        String[] myArray = new String[4];
//        myArray[0] = students1;
        // <> Generic Sign - ArrayList takes any Object Type Data -
        // In other word it does not take any primitive types
        ArrayList<String> studentsList = new ArrayList<String>();
        // 2. How to insert value into the container?
        studentsList.add(students1);
        studentsList.add(students2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
        studentsList.add(st6);
        // 3. How to get value form the container?
        System.out.println(studentsList.get(0));

        System.out.println("******* Using fro loop ********");
         int i;
        for(i=0; i<=5; i++){
           String studentName = studentsList.get(i);
           System.out.println(studentName);
        }

        /**
         *
         * For each loop/statement
         * It is almost same as for loop
         * But you do not have to define from where to start and how to
         * increment and how to stop
         *
         **/
        System.out.println("******* Using fro each loop ********");
        for( String t : studentsList  ){
            System.out.println(t);
        }

        System.out.println("******* Using foreach() method ********");
        studentsList.forEach(str -> System.out.println(str));

    }
}
