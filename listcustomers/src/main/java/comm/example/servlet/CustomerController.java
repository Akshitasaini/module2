package comm.example.servlet;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.Dto.CustomerDto;
import comm.example.Dto.CustomerDtoImpl;
import comm.example.mapper.CustomerMapper;
import comm.example.model.Customer;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	private CustomerDtoImpl impl;
	@Override
	public void init() throws ServletException {
		service = new CustomerServiceImpl();
		impl = new CustomerMapper();
	}

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");
		// CustomerDTOImpl impl = null;
		CustomerDto cDto = new CustomerDto(UUID.randomUUID().toString(), fName, lName, email);
		Customer customer = service.createCustomer(impl.customerDtoToCustomer(cDto));
		if (customer != null) {
			
			RequestDispatcher view = request.getRequestDispatcher("homecontroller.do");
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("error.jsp");
			view.forward(request, response);
		}
	}
}