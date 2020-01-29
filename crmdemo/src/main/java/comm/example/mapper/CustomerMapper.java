package comm.example.mapper;

import comm.example.dto.CustomerDTO;
import comm.example.dto.CustomerDTOImpl;
import comm.example.model.Customer;

public class CustomerMapper implements CustomerDTOImpl {

	@Override
	public Customer customerDTOToCustomer(CustomerDTO dto) {
		if(dto==null)
		{
			return null;
		}
		else
		{
			Customer customer=new Customer();
			customer.setUId(dto.getUId());
			customer.setFristName(dto.getFristName());
			customer.setLastName(dto.getLastName());
			customer.setEmail(dto.getEmail());
			return customer;
		}
	}

	@Override
	public CustomerDTO customertoCustomerDTO(Customer customer) {
		
		
			if(customer==null)
			{
				return null;
			}
			else {
				CustomerDTO cDto=new CustomerDTO();
				cDto.setUId(customer.getUId());
				cDto.setFristName(customer.getFristName());
				cDto.setLastName(customer.getLastName());
				cDto.setEmail(customer.getEmail());
				return cDto;
			}
		}
}

