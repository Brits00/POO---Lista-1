import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    

    System.out.println("Enter client data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.next();
    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = (Date) sdf.parse(sc.next());


    Client client = new Client(name, email, birthDate);
    client.setName(name);
    client.setEmail(email);
    client.setBirth(birthDate);
    
    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());
    Date moment = new Date();
    
    Order order = new Order(status);
    order.setStatus(status);
    order.setMoment(moment);
    
    System.out.print("How many items to this order? ");
    int n = sc.nextInt();
    ArrayList<Object> produtos = new ArrayList<Object>();
    ArrayList<Object> valor = new ArrayList<Object>();
    ArrayList<Object> quantidade = new ArrayList<Object>();
    ArrayList<Object> total = new ArrayList<Object>();
    double totaly;
    
    for (int i=1; i<=n; i++) {
        System.out.println("Enter #" + i + " item data:");
        System.out.print("Product name: ");
        sc.nextLine();
        
        String productName = sc.nextLine();
        System.out.print("Product price: ");
        double productPrice = sc.nextDouble();
        Product product = new Product(productName, productPrice);
        produtos.add(product.setName(productName));

        
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        OrderItem orderItem = new OrderItem(quantity, productPrice, product); 
        order.addItem(orderItem);
        quantidade.add(orderItem.setQuantity(quantity));
        valor.add(orderItem.setPrice(productPrice));

        totaly = quantity * productPrice;
        total.add(totaly);
        
        
        System.out.println();
        System.out.println("ORDER SUMMARY: " + i);
        System.out.println(" ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Cliente: " + client.getName() + ", " + client.getBirth() + ", " + client.getEmail());
        System.out.println("Order items: ");
        System.out.println("Produto: " + produtos.get(i-1) + ", $" + valor.get(i-1) + ", Quantity: " + quantidade.get(i-1) + ", Subtotal: $" + total.get(i-1));

    }
    
    sc.close();
}
}



