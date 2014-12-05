package domain;

import java.util.*;

public class Sale {
	private Vector<SaleLineItem> lineItems = new Vector<SaleLineItem>();
	private Date date = new Date();
	private boolean isComplete = false;
	public Payment payment;

	public void becomeComplete()
	{
		isComplete = true;
	}

	public boolean isComplete() { return isComplete; }

	public void makeLineItem( ProductSpecification spec, int quantity )
	{
		lineItems.addElement( new SaleLineItem( spec, quantity ) );
	}

	public float total()
	{
		float total = 0;
		Enumeration<SaleLineItem>	e = lineItems.elements();

		while( e.hasMoreElements() )
			{
			total += e.nextElement().subtotal();
			}
		return total;
	}

	public void makePayment( float cashTendered )
	{
		payment = new Payment( cashTendered );
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
