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
 * Servlet implementation class UpdateZoo
 */
@WebServlet("/updateZoo")
public class UpdateZoo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateZoo() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ZooHelper helper = new ZooHelper();
		
		String oldName = request.getParameter("oldName");
		String name = request.getParameter("newName");
		String location = request.getParameter("location");

		Zoo zooToUpdate = helper.searchZooByName(oldName);
		zooToUpdate.setName(name);
		zooToUpdate.setLocation(location);
		helper.update(zooToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
