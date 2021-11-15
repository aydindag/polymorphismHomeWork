import java.util.ArrayList;

public class ProductManager implements ProductService {
	//Dependency Injection
		private ProductDao productDao;
		
		public ProductManager(ProductDao productDao) { //o interface için dao yonetmi ver
			this.productDao = productDao;
		}
		
		@Override
		public void save(Product product) {
			//customer.getNationalIdentity();
			
			productDao.save(product);
			
		}

		
}
