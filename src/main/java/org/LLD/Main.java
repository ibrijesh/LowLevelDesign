package org.LLD;

import org.LLD.PrototypeDesign.Student;

public class Main {
    public static void main(String[] args) {

        Student obj = new Student(15, 21, "Krishna");
        Student cloneObj = (Student) obj.clone();

        System.out.println(obj);
        System.out.println(cloneObj);

        // it confirm it belong to different instance

        if(obj == cloneObj)
            System.out.println("obj == cloneObj");

        // but have same values
        if(obj.equals(cloneObj))
            System.out.println("obj equals cloneObj");
    }
}