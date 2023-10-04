package controllerzoo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.ZooHelper;
import model.Zoo;




/**
 * Servlet implementation class ShowZoo
 */
@WebServlet("/showZoo")
public class ShowZoo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowZoo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ZooHelper helper = new ZooHelper();
		
		List<Zoo> zooList = helper.showAllZoos();

		request.setAttribute("allZoos", zooList);
		
		String path = "/showZoo.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


}
