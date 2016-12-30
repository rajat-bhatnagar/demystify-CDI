package bl.producers;

import javax.enterprise.inject.Produces;

import bl.qualifiers.Discount;
import bl.qualifiers.Vat;

public class VatAndDiscountProducer {
	
	@Produces @Vat
	private Float vat = 10f;
	
	@Produces @Discount
	private Float discount = 10f;
}
