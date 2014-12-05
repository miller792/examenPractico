package domain;

public class Payment {
  private float amount;

  public Payment(float cashTendered) {
    this.amount = cashTendered;
  }

  public float getAmount() {
    return amount;
  }

public float getBalance(Sale sale)
{
	return getAmount() - sale.total();
}

}
