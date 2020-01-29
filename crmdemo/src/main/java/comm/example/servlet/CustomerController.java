package comm.example.servlet;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dto.CustomerDTO;
import comm.example.dto.CustomerDTOImpl;
import comm.example.mapper.CustomerMapper;
import comm.example.model.Customer;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;


public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	private CustomerDTOImpl impl;
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service=new CustomerServiceImpl();
		impl=new CustomerMapper();
	}



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		//CustomerDTOImpl impl = null;
		CustomerDTO cDto=new CustomerDTO(UUID.randomUUID().toString(),fName, lName, email);
		Customer customer=service.createCustomer(impl.customerDTOToCustomer(cDto));
		if(customer!=null)
		{
			List<Customer> customers=service.getAllCustomer();
			request.setAttribute("SUCCESS", customers);
			RequestDispatcher view=request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
	}
}
