/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ynsdm
 */
public class SourceCube {
     private Customer customer;
	private Product product;
	private Timestamp timestamp;

	public SourceCube() {
			
	}
	
	public SourceCube(Customer newCustomer, Product newProduct, Timestamp newTimestamp) {
		this.customer = newCustomer;
		this.product = newProduct;
		this.timestamp = newTimestamp;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
}
