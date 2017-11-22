/**                       Customer.java
 *作者：
 *创建日期：2017年11月15日
 *修改订者：
 *修订日期：
 *文件描述：
 *修改订内容：             
 */
package cn.com.zhanghb.SpringBoot.Entity;

/**
 * @author zhanghb
 *
 */
public class Customer {
	private long id;
	private String firstName, lastName;

	public Customer(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[ID=%d,FirstName='%s',LastName='%s']", id, firstName, lastName);
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
