package product;

import java.util.ArrayList;

public class ProductManager {
	
	private ArrayList<Product> productList;
    private ArrayList<Product> orderList;

    public ProductManager() {
        productList = new ArrayList<Product>();
        orderList = new ArrayList<Product>();

    }

    public void addProduct(String menu, int price) {
        Product newProduct = new Product(menu, price);
        productList.add(newProduct);
        orderList.add(newProduct);

    }

    public void printProductList() {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            System.out.println((i + 1) + "/" + product.getMenu() + " - " + product.getPrice() + "원");
        }
    }

    public void orderProduct(String menu, int count) {
        for (Product product : productList) {
            if (product.getMenu().equals(menu)) {
                Product orderProduct = new Product(menu, product.getPrice() * count);
                orderList.add(orderProduct);
                break;
            }
        }
    }

    public void printOrderList() {
        int totalPrice = 0;
        for (int i = 0; i < orderList.size(); i++) {
            Product product = orderList.get(i);
            System.out.println((i + 1) + "/" + product.getMenu() + " - " + product.getPrice() + "원");
            totalPrice += product.getPrice();
        }
        System.out.println("총금액 : " + totalPrice + " 원");
    }
    
    public ArrayList<Product> getOrderList() {
        return orderList;
    }

}


