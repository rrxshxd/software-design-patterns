package SAP.MVC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todos")
public class TodoController extends HttpServlet {
    private List<TodoItem> todoList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();

        StringBuilder jsonArray = new StringBuilder("[");
        for (int i = 0; i < todoList.size(); i++) {
            TodoItem todo = todoList.get(i);
            jsonArray.append("{")
                    .append("\"task\":\"").append(todo.getTask()).append("\",")
                    .append("\"done\":").append(todo.isDone())
                    .append("}");
            if (i < todoList.size() - 1) {
                jsonArray.append(",");
            }
        }
        jsonArray.append("]");

        out.print(jsonArray.toString());
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String task = req.getParameter("task");
        if (task != null && !task.isEmpty()) {
            todoList.add(new TodoItem(task));
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("Todo added successfully");
        } else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("Invalid input");
        }
    }

    public void addTodo(String task) {
        todoList.add(new TodoItem(task));
    }

    public void deleteTodo(int index) {
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
        }
    }
}
