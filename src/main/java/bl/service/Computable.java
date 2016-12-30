package bl.service;

import java.util.List;

import data.Item;
import data.PurchaseOrder;

public interface Computable {
	PurchaseOrder compute(List<Item> items);
	
	PurchaseOrder createPuchaseOrder(List<Item> items);
}
