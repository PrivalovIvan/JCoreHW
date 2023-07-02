import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import Enum.Gender;
import Enum.Percent;
import Exception.AmountException;
import Exception.CustomerException;
import Exception.ProductException;
import Exception.TooMuchSaleException;

public class Main {
    static Customer[] customers = new Customer[2];
    static Product[] products = new Product[5];

    public static void main(String[] args) {
        customers[0] = new Customer("Mark", "Markov", "Olegovich", 35, "111", Gender.MAN);
        customers[1] = new Customer("Markola", "Markova", "Ivanovna", 27, "222", Gender.WOMAN);

        products[1] = new Product("Tea", 125, 0, "Standart", 0);
        products[0] = new Product("Chease", 500, 0, "Premium", 0);
        products[2] = new Product("Tomato", 200, 0, "Standart", 0);
        products[3] = new Product("PopCorn", 300, 0, "Standart", 0);
        products[4] = new Product("Cofe", 700, 0, "Premium", 0);

        Order[] order = new Order[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < order.length; i++) {
            String numberPhone;
            String title;
            Integer qty;
            try {

                System.out.print("Enter your number phone: ");
                numberPhone = scanner.next();
                System.out.print("Enter name product: ");
                title = scanner.next();
                System.out.print("Enter quatity product: ");
                qty = scanner.nextInt();

                order[i] = makeApurchase(numberPhone, title, qty);

            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
                break;
            } catch (TooMuchSaleException e) {
                System.out.println(e.getMessage());
                continue;
            }

        }
        scanner.close();

        CheckOrder(order);

        // for (int i = 0; i < order.length; i++) {
        // Random r = new Random();
        // Integer x = r.nextInt(products.length);
        // Integer c = r.nextInt(customers.length);
        // Integer q = r.nextInt(120) - 50;

        // try {
        // System.out.println("Customer: " + customers[c].getNumberPhone());
        // System.out.println("Product: " + products[x].getTitle());
        // System.out.println("Quantity: " + q);
        // order[i] = makeApurchase(customers[c].getNumberPhone(),
        // products[x].getTitle(), q);

        // } catch (ProductException e) {
        // e.getMessage();
        // } catch (AmountException e) {
        // } catch (CustomerException e) {
        // e.getMessage();
        // }
        // }
        // CheckOrder(order);

    }

    public static Order makeApurchase(String numberPhone, String title, Integer qty)
            throws CustomerException, ProductException, TooMuchSaleException {
        Customer customer = null;
        Product product = null;
        Integer discont = 0;

        try {
            if (qty > 100 || qty < 1)
                throw new AmountException("Quantity uncorrected! The quantity will be equalto 1!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            qty = 1;
        }

        for (int i = 0; i < customers.length; i++) {
            if ((customers[i].getNumberPhone().equals(numberPhone))) {
                customer = customers[i];
            }
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i].getTitle().equals(title)) {
                product = products[i];
                discont = randomPercent(product);
                product.setPercent(discont);
                product.setPriceDiscount(discountedProduct(product, discont));
                if (product.getCategory().equals("Premium") && discont > 15) {
                    throw new TooMuchSaleException(
                            "A discount of more than 15% is not possible on premium goods! The price remains unchanged.");
                }
            }

        }
        if (customer == null) {
            throw new CustomerException("Castomer not found!");
        }
        if (product == null) {
            throw new ProductException("Product not found! Cancellation of purchase!");
        }

        return new Order(product, customer, qty, orderAmount(product.getPriceDiscount(), qty),
                product.getPriceDiscount(), discont);
    }

    public static Integer CheckOrder(Order[] order) {
        int length = order.length;

        for (Order item : order) {
            if (item == null) {
                length--;
            }
        }

        System.out.println(Arrays.toString(order));
        System.out.println("Number of completed orders: " + length);
        return length;
    }

    public static double discountedProduct(Product product, Integer percent) {
        double priceDiscount = (product.getPriceStandart() - (product.getPriceStandart() / 100 * percent));
        return priceDiscount;
    }

    public static double orderAmount(double d, Integer qty) {
        return d * qty;
    }

    public static Integer randomPercent(Product product) {
        Percent[] percents = Percent.values();
        Random r = new Random();
        Integer rPercent = r.nextInt(percents.length);
        Integer percent = (Integer.parseInt(percents[rPercent].getPercent()));
        return percent;
    }
}