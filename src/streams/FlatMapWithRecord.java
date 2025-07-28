package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Assignment:
//1. Using map, find the persons whose name starts with 'A' from a list
//2. example on a flatmap

record Student(int id,String name,String course,int fees){}

public class FlatMapWithRecord {
    public static void main(String[] args) {
        List<String> randomNames = Arrays.asList ("maxx","john","dheere","fury","neil","brone","mikey","snow","vick","Rocky");
        Map<String,Integer> courses = Map .of ("Java",25000,"Pyrhon",20000,"DataScience",60000,"AI expert",15000,"Animation",300000,".Net",50000,"Machine Learrning",400000);
        List<Student> studentsData = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            int id = studentsData.size ()+1;
            String name = randomNames.get ((int)(Math.random()*10));
            String course = new ArrayList<> (courses.keySet()).get(new Random().nextInt(courses.size()));
            int fees = courses.get (course);
            studentsData.add (new Student (id,name,course,fees));
        }
        List response= studentsData.stream()
                .filter (student -> student.name ().startsWith ("i",1))
                .sorted (Comparator.comparingInt (s->s.id ()))
                .map (s->Arrays.asList (s.id(),s.name (),s.course (),s.fees ()))
                .flatMap (listOfList->listOfList.stream ())
                .collect(Collectors.toUnmodifiableList());
        System.out.println (response.toString ());
        //Weekly Assignment( inverview point ) (List / Object)
        //1) Getting Min salary emp from collection
        Stream<Student> studentStream = studentsData.stream()
                .sorted (Comparator.comparingInt (s->s.fees ()));
        System.out.println ("Minimum fees paying Student details are: "+studentStream.findFirst ());
        //2) Getting Max salary emp from Collection

        System.out.println ("Maximum fees paying Student details are: "+
                studentsData.stream ()
                        .sorted (Comparator.comparingInt (Student::fees).reversed ())
                        .findFirst ());
        //3) Getting Avg Salary of the employee
        System.out.println ("Average Student Paid will be: "+
                studentsData.stream ()
                        .mapToInt (s->s.fees ()).average ());
        //4) Group By
        System.out.println ("Students Studying Java Total Payment is: "+
                studentsData.stream ()
                        .filter (s->s.course ().equalsIgnoreCase ("Java"))
                        .mapToInt (s->s.fees ()).sum ()
        );
    }
}

