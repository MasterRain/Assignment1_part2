import org.joda.time.LocalDate;
import org.joda.time.MonthDay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("ray",20,new LocalDate(1997,10,11), 15333866,new ArrayList<Course>(),new ArrayList<Module>());
        Student student2 = new Student("George",37,new LocalDate(1930,3,18), 66833351,new ArrayList<Course>(),new ArrayList<Module>());
        Student student3 = new Student("Catherine",19,new LocalDate(1922,1,1), 3351,new ArrayList<Course>(),new ArrayList<Module>());
        Module module1 = new Module("Soft eng", "Ct417", new ArrayList<Student>(),new ArrayList<Course>());
        Module module2 = new Module("Poetry", "PT404", new ArrayList<Student>(), new ArrayList<Course>());
        Module module3 = new Module("Finance", "FN$$$", new ArrayList<Student>(), new ArrayList<Course>());
        Course course1 = new Course("Computer Science", new ArrayList<Student>(), new ArrayList<Module>(), new LocalDate(2018, 7,3),new LocalDate(2018,12,7));
        Course course2 = new Course("Arts", new ArrayList<Student>(), new ArrayList<Module>(), new LocalDate(2018, 6,4),new LocalDate(2018,11,8));
        Course course3 = new Course("Money", new ArrayList<Student>(), new ArrayList<Module>(), new LocalDate(2017, 6,4),new LocalDate(2017,11,8));

        ArrayList<Student> sampleStudents1 = new ArrayList<Student>();
        ArrayList<Student> sampleStudents2 = new ArrayList<Student>();
        sampleStudents1.add(student1);
        sampleStudents1.add(student3);
        sampleStudents2.add(student2);

        ArrayList<Module> sampleModules1 = new ArrayList<Module>();
        ArrayList<Module> sampleModules2 = new ArrayList<Module>();
        sampleModules1.add(module1);
        sampleModules1.add(module2);
        sampleModules1.add(module3);
        sampleModules2.add(module3);

        ArrayList<Course> sampleCourses1 = new ArrayList<Course>();
        ArrayList<Course> sampleCourses2 = new ArrayList<Course>();
        sampleCourses1.add(course1);
        sampleCourses1.add(course3);
        sampleCourses2.add(course2);

        student1.setModules(sampleModules1);
        student1.setCourses(sampleCourses1);
        student2.setModules(sampleModules2);
        student2.setCourses(sampleCourses2);
        student3.setModules(sampleModules1);
        student3.setCourses(sampleCourses2);

        module1.setCourses(sampleCourses1);
        module2.setCourses(sampleCourses2);
        module3.setCourses(sampleCourses1);
        module1.setStudents(sampleStudents1);
        module2.setStudents(sampleStudents2);
        module3.setStudents(sampleStudents1);

        course1.setStudents(sampleStudents1);
        course2.setStudents(sampleStudents2);
        course3.setStudents(sampleStudents1);
        course1.setModules(sampleModules1);
        course2.setModules(sampleModules2);
        course3.setModules(sampleModules1);

        ArrayList<Course> allCourses = new ArrayList<Course>();
        allCourses.add(course1);
        allCourses.add(course2);
        allCourses.add(course3);

        for (Course current : allCourses) {

            System.out.println("For Course " + current.getName());

            System.out.println("These are the following modules");

            for (int j = 0; j < current.getModules().size(); j++) {
                Module currentModule = current.getModules().get(j);
                System.out.println(currentModule.getName());
            }

            System.out.println("These students are registered");
            for (int j = 0; j < current.getStudents().size(); j++) {
                Student currentStudent = current.getStudents().get(j);
                System.out.println(currentStudent.getName() + " : " + currentStudent.getUsername());

                System.out.println("This student is registered to these Modules");

                for (int k = 0; k < currentStudent.getModules().size(); k++) {
                    Module studentModule = currentStudent.getModules().get(k);
                    System.out.println(studentModule.getName());
                }

                System.out.println("This student is registered for the following courses");
                for (int k = 0; k < currentStudent.getCourses().size(); k++) {
                    Course studentCourse = currentStudent.getCourses().get(k);
                    System.out.println(studentCourse.getName());
                }

            }

        }

    }
}
