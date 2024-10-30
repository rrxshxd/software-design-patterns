package SAP.MVVM;

import SAP.MVVM.StudentViewModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;



@WebServlet("/students/*")
public class Student extends HttpServlet {
    private int id;
    private String name;
    private int age;
    private String course;

    private static int idCounter = 0;

    public Student(String name, int age, String course) {
        this.id = ++idCounter;  // Auto-increment ID
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private StudentViewModel studentViewModel = new StudentViewModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();

        String jsonArray = studentViewModel.getAllStudentsAsJson();
        out.print(jsonArray);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String course = req.getParameter("course");

        Student student = studentViewModel.addStudent(name, age, course);

        resp.setStatus(HttpServletResponse.SC_CREATED);
        resp.getWriter().write("{\"message\":\"Student added successfully\", \"id\":" + student.getId() + "}");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getPathInfo().substring(1));  // Get ID from URL path
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String course = req.getParameter("course");

        Optional<Student> updatedStudent = studentViewModel.updateStudent(id, name, age, course);

        if (updatedStudent.isPresent()) {
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("{\"message\":\"Student updated successfully\"}");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().write("{\"error\":\"Student not found\"}");
        }
    }
}
