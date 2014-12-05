package workflow;

import domain.*;


public class POST {
	private ProductCatalog productCatalog;
	public Sale sale;

	public POST( ProductCatalog catalog )
	{
		productCatalog = catalog;
	}

	public void EnterItem( int upc, int quantity )
	{
		if( productCatalog.isNewSale(this) )
		{
			sale = new Sale();
		}
		ProductSpecification spec = productCatalog.specification( upc );
		sale.makeLineItem( spec, quantity );
	}

	public void makePayment( float cashTendered )
	{
		sale.makePayment( cashTendered );
	}

	public float getTotal()
        {
          return sale.total();
        }

	public Sale getSale()
	{
		return sale;
	}
}
