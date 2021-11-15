import java.util.ArrayList;

public interface ProductDao {
	void save(Product product);
	ArrayList<Product> list();
}
