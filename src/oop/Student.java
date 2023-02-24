package oop;

public class Student {
    String name;
    int rollNumber;
    Batch batch;
    double psp;
    void attendClass(String name) {
        System.out.println(name + "is attending the class");
    }

    void chooseMentor(String mentorName) {
        System.out.println(mentorName + "is chosen as mentor");
    }
}
