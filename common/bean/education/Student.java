/**
 * 
 */
package bean.education;

import java.io.Serializable;
import java.util.List;


/**
 * 学生信息
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午3:27:53
 *
 */
public class Student extends Person implements Serializable {

	private static final long serialVersionUID = -4897687701584156505L;
	
	private List<MClass> classes;
	
	private List<Payment> payments;
	
	/**
	 * @return the classes
	 */
	public List<MClass> getClasses( )
	{
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses( List<MClass> classes )
	{
		this.classes = classes;
	}

	/**
	 * @return the payments
	 */
	public List<Payment> getPayments( )
	{
		return payments;
	}
	
	/**
	 * @param payments the payments to set
	 */
	public void setPayments( List<Payment> payments )
	{
		this.payments = payments;
	}

}