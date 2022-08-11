package com.BikkadIT.HibernateUsingRestfull.Model;

<<<<<<< HEAD
import javax.persistence.Entity;
=======
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
>>>>>>> 5187c38cd920f0c055b88bfae4db08d631b27416
import javax.persistence.Id;

@Entity
public class Customer {
<<<<<<< HEAD
	@Id
	private Integer customerId;
	private String customerName;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	
=======
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int cId;
	private String cName;
	private String cAddress;
	private String cEmail;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cAddress=" + cAddress + ", cEmail=" + cEmail + "]";
	}
	
>>>>>>> 5187c38cd920f0c055b88bfae4db08d631b27416

}
