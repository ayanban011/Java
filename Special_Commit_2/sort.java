import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(Student a, Student b)
    {
        if(a.getCgpa()==b.getCgpa())
        {
            if(a.getFname()==b.getFname())
            {
                return a.getId()-b.getId();
            }
            else
            {
                return a.getFname().compareTo(b.getFname());
            }
        }
        else if(a.getCgpa()>b.getCgpa())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, new Sortbyroll());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



