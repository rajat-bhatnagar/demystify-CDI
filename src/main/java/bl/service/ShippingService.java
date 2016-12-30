package bl.service;

import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import data.PurchaseOrder;

public class ShippingService {
	
	@Inject
	private Logger logger;
	
	public void addItems(@Observes PurchaseOrder purchaseOrder){
		logger.info(" # Shipping Service - Puchase Order to be shipped : "+purchaseOrder.getTotalAfterDiscount());
	}
}
