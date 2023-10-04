package controllerzoo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.ZooHelper;
import model.Zoo;

/**
 * Servlet implementation class AddZoo
 */
@WebServlet("/addZoo")
public class AddZoo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddZoo() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Zoo a = new Zoo();
		ZooHelper helper = new ZooHelper();
		a.setName(request.getParameter("name"));
		a.setLocation(request.getParameter("location"));
		helper.add(a);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
