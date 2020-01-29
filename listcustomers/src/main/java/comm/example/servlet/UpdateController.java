package comm.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Customer;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;


public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service=new CustomerServiceImpl();
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c=service.findBuyId(Integer.parseInt(request.getParameter("customerId")));
		request.setAttribute("customer", c);
		RequestDispatcher view=request.getRequestDispatcher("updatecustomer.jsp");
		view.forward(request, response);
	}
}
