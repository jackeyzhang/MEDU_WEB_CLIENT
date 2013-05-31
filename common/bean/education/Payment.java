/**
 * 
 */
package bean.education;

import java.io.Serializable;
import java.util.Date;


/**
 * 消费情况
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午3:44:33
 *
 */
public class Payment implements Serializable{

	private static final long serialVersionUID = 9107652424920992716L;

	private float payed;//已付金额
	
	private Date payDate;//缴费日期

	private Person payee;//收款人
	
	private String payer;//付款人
	
	private String payWay;//收款方式 现金  cash,刷卡 card
	
	/**
	 * @return the payed
	 */
	public float getPayed( )
	{
		return payed;
	}

	
	/**
	 * @param payed the payed to set
	 */
	public void setPayed( float payed )
	{
		this.payed = payed;
	}


	
	/**
	 * @return the payDate
	 */
	public Date getPayDate( )
	{
		return payDate;
	}


	
	/**
	 * @param payDate the payDate to set
	 */
	public void setPayDate( Date payDate )
	{
		this.payDate = payDate;
	}


	
	/**
	 * @return the payee
	 */
	public Person getPayee( )
	{
		return payee;
	}


	
	/**
	 * @param payee the payee to set
	 */
	public void setPayee( Person payee )
	{
		this.payee = payee;
	}


	
	/**
	 * @return the payer
	 */
	public String getPayer( )
	{
		return payer;
	}


	
	/**
	 * @param payer the payer to set
	 */
	public void setPayer( String payer )
	{
		this.payer = payer;
	}


	
	/**
	 * @return the payWay
	 */
	public String getPayWay( )
	{
		return payWay;
	}


	
	/**
	 * @param payWay the payWay to set
	 */
	public void setPayWay( String payWay )
	{
		this.payWay = payWay;
	}

	
}
