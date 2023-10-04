package controlleranimal;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.AnimalHelper;
import model.Animal;

/**
 * Servlet implementation class ShowAnimal
 */
@WebServlet("/showAnimal")
public class ShowAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAnimal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnimalHelper helper = new AnimalHelper();
		
		List<Animal> animalList = helper.showAllAnimals();

		request.setAttribute("allAnimals", animalList);
		
		String path = "/show.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	
}
