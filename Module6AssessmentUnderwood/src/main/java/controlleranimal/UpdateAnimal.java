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
 * Servlet implementation class UpdateAnimal
 */
@WebServlet("/updateAnimal")
public class UpdateAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAnimal() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnimalHelper helper = new AnimalHelper();
		
		String oldName = request.getParameter("oldName");
		String animalName = request.getParameter("animalName");
		Double weight = (Double.parseDouble(request.getParameter("weight")));
		Double length = (Double.parseDouble(request.getParameter("length")));

		Animal animalToUpdate = helper.searchAnimalByAnimalName(oldName);
		animalToUpdate.setAnimalName(animalName);
		animalToUpdate.setWeight(weight);
		animalToUpdate.setLength(length);
		helper.update(animalToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
