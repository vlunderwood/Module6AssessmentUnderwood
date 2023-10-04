package controlleranimal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.AnimalHelper;
import model.Animal;

/**
 * Servlet implementation class AddAnimal
 */
@WebServlet("/addAnimal")
public class AddAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAnimal() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Animal a = new Animal();
		AnimalHelper helper = new AnimalHelper();
		a.setAnimalName(request.getParameter("animalName"));
		a.setWeight(Double.parseDouble((request.getParameter("weight"))));
		a.setLength(Double.parseDouble((request.getParameter("length"))));
		a.getZoo().setName(request.getParameter("zooName"));
		helper.add(a);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
