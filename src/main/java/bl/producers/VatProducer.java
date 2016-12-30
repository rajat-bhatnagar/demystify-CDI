package bl.producers;

import javax.enterprise.inject.Produces;

import bl.qualifiers.Vat;

public class VatProducer {
	
	@Produces @Vat
	private Float vat = 10f;
}
