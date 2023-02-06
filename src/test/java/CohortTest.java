import java.util.ArrayList;
import java.util.List;

public class CohortTest {
    public static void testAddStudent(){
        List<Student> students = new ArrayList<>();
        Student students =new Student(3, "Kaylee");
        Cohort.addStudent(student);
    }
}
