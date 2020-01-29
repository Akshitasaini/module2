package comm.example.dto;

import org.mapstruct.Mapper;

import comm.example.model.Customer;

@Mapper
public interface CustomerDTOImpl {

	public Customer customerDTOToCustomer(CustomerDTO dto);
	public CustomerDTO customertoCustomerDTO(Customer customer);
	
}
