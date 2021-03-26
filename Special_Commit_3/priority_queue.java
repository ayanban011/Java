import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    public static final Comparator<Student> studentComparator = (s1, s2) -> (Comparator
            .comparingDouble(Student::getCgpa).reversed())
            .thenComparing(Student::getName)
            .thenComparingInt(Student::getId)
            .compare(s1, s2);

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(events.size(), studentComparator);
        for (String event : events) {
            String[] token = event.split(" ");
            String command = token[0];

            if (command.equals("ENTER")) {
                int id = Integer.parseInt(token[3]);
                String name = token[1];
                double cgpa = Double.parseDouble(token[2]);
                Student student = new Student(id, name, cgpa);
                pq.add(student);
            } else {
                pq.poll();
            }
        }

        List<Student> result = new ArrayList<>(pq.size());
        while (pq.size() > 0) {
            result.add(pq.poll());
        }
        return result;
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