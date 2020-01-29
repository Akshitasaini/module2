package comm.example.mapper;

import comm.example.Dto.CustomerDto;
import comm.example.Dto.CustomerDtoImpl;

import comm.example.model.Customer;

public class CustomerMapper implements CustomerDtoImpl {

	@Override
	public Customer customerDtoToCustomer(CustomerDto dto) {
		if(dto==null)
		{
			return null;
		}
		else
		{
			Customer customer=new Customer();
			customer.setUId(dto.getUId());
			customer.setFirstName(dto.getFristName());
			customer.setLastName(dto.getLastName());
			customer.setEmail(dto.getEmail());
			return customer;
		}
	}

	@Override
	public CustomerDto customertoCustomerDto(Customer customer) {
		if(customer==null)
		{
			return null;
		}
		else {
			CustomerDto cDto=new CustomerDto();
			cDto.setUId(customer.getUId());
			cDto.setFristName(customer.getFirstName());
			cDto.setLastName(customer.getLastName());
			cDto.setEmail(customer.getEmail());
			return cDto;
		}
	}

}
