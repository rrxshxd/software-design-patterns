package SAP.MVVM;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentViewModel {
    private List<Student> students = new ArrayList<>();

    // Retrieve all students as a JSON string
    public String getAllStudentsAsJson() {
        StringBuilder jsonArray = new StringBuilder("[");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            jsonArray.append("{")
                    .append("\"id\":").append(student.getId()).append(",")
                    .append("\"name\":\"").append(student.getName()).append("\",")
                    .append("\"age\":").append(student.getAge()).append(",")
                    .append("\"course\":\"").append(student.getCourse()).append("\"")
                    .append("}");
            if (i < students.size() - 1) {
                jsonArray.append(",");
            }
        }
        jsonArray.append("]");
        return jsonArray.toString();
    }

    // Add a new student
    public Student addStudent(String name, int age, String course) {
        Student student = new Student(name, age, course);
        students.add(student);
        return student;
    }

    // Update an existing student
    public Optional<Student> updateStudent(int id, String name, int age, String course) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setCourse(course);
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
}