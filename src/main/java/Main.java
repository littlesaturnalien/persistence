import dao.StudentDAO;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao_student = new StudentDAO();
        Student karen = new Student();
        karen.setId_student(23010471L);
        karen.setName_student("Karen Fonseca");
        karen.setMajor_student("Ingeniería en Sistemas de Información");

        //dao_student.save(karen);

        Student silvio = new Student();
        silvio.setId_student(18010053L);
        silvio.setName_student("Silvio Mora");
        silvio.setMajor_student("Ingeniería en Sistemas de Información");

        //dao_student.save(silvio);

        Student cesar = new Student();
        cesar.setId_student(22011275L);
        cesar.setName_student("Cesar Silva");
        cesar.setMajor_student("Ingeniería en Sistemas de Información");

        //dao_student.save(cesar);
    }
}
