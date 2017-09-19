package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.model.vehicle.*;
import demo.model.engine.*;
import demo.utility.*;

@WebServlet("/processvehicleselection.html")
public class ProcessVehicleSelectionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String vehicle = request.getParameter("preferredVehicle");

		// Now we create an object based on the client's preference
		ToyotaVehicle sasakyan = new VehicleFactory().getVehicle(vehicle);

		// set the engine
		Engine engine = new EngineFactory().getEngine(vehicle);

		// set the ownership of the created engine to the vehicle created.
		sasakyan.setEngine(engine);

		// perform data binding on request
		request.setAttribute("behikulo", sasakyan);

		// once the relation has been set
		// forward the result to a jsp file
		request.getRequestDispatcher("display.jsp").forward(request, response);

	}

}
