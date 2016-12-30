package bl.decorators;

import java.util.List;
import java.util.logging.Logger;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import bl.qualifiers.Discount;
import bl.service.Computable;
import data.Item;
import data.PurchaseOrder;

/*
 * The @Decorator annotation specifies that this class is a Decorator
 * Decorators are not enabled by default , So we need to specify them in beans.xml
 * for activation
 */
@Decorator
public abstract class PurchaseOrderDecorator implements Computable {
	
	/*
	 * A decorator must have exactly one delegation point
	 */
	@Inject @Delegate
	private Computable purchaseOrderService; 
	
	@Inject
	private Logger logger;
	
	@Inject @Discount
	private Float discount;
	
	@Override
	public PurchaseOrder compute(List<Item> items) {
		PurchaseOrder purchaseOrder = purchaseOrderService.compute(items);
		logger.info(" ## Decorator - Original Purchase Total Before Discount"+purchaseOrder);
		purchaseOrder.setTotalAfterDiscount(purchaseOrder.getTotal() - (purchaseOrder.getTotal() * (discount / 100)));
		logger.info(" ## Decorator - Reduced Purchase Total After Discount"+purchaseOrder);
		return purchaseOrder;
	}

}
