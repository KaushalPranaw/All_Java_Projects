package com.app.core;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Student{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id,String name,double cgpa)
    {
        super();
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCGPA()
    {
        return cgpa;
    }
}
class Priorities 
{
   public List < Student > getStudents(List < String > events) 
   {
        PriorityQueue < Student > student_queue = new PriorityQueue(Comparator.comparing(Student::getCGPA).reversed()
        .thenComparing(Student::getName)
        .thenComparing(Student::getId));
        List < Student > students = new ArrayList < Student > ();
        for (String e: events) {
            Scanner in =new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();

                Student student = new Student(id, name, cgpa);
                student_queue.add(student);
            } else if (event.equals("SERVED")) {
                Student first = student_queue.poll();
            } in .close();
        }
        Student first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = student_queue.poll();

            }
            return students;
        }

    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}