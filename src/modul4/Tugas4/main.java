package modul4.Tugas4;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static Object MembershipFactory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();
        System.out.println("======Musical and Elektronic Instrumens Store======");

        items.add(new Gitar("Yamaha", "C315", "37000000", true, 10, 0.05f));
        items.add(new GitarElektrik("Gibson", "Les paul", "20000000", false, 5, 0.1f) {
            @Override
            public float getDiscountedPrice(float price, float discount) {
                return 0;
            }
            @Override
            public void tampilkanAlatElektronik() {

            }
        });

        System.out.println("Masukkan Harga Barang: ");
        float price = scanner.nextFloat();

        Cashier cashier = new Cashier();
        cashier.setPrice(price);

        System.out.println("Apakah Anda Member? (Y/N)");
        String isMember = scanner.next();

        if (isMember.equalsIgnoreCase("Y")){
            System.out.println("Masukkan Member Type (Premium/Gold/Silver)");
            String memberType = scanner.next();
        }

        System.out.println("Apakah Anda Karyawan? (Y/N)");
        String isEmployee = scanner.next();

        if (isEmployee.equalsIgnoreCase("Y")){
            cashier.setDiscount(cashier.getDiscount() + Karyawan.DISCOUNT);
        }

        System.out.println("\nBarang Yang Tersedia:");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.printf("%d %s %s  - Rp. %d", i+1, item.getBrand(), item.getModel(), item.getPrice());
            if (item.isOnSale()) {
                System.out.printf(" (sale %.0f%%)", item.getDiscount()*100);
            }
            System.out.printf("\n   Stok: %d\n", item.getStock());
        }

        System.out.print("\nMasukkan Nomer Item: ");
        int itemNumber = scanner.nextInt();
        Item selectedItem = items.get(itemNumber-1);

        System.out.printf("Masukkan Kuantitas (max %d): ", selectedItem.getStock());
        int quantity = scanner.nextInt();

        // calculate total price
        float total = cashier.getTotal(selectedItem, quantity);
        System.out.printf("\nTotal price: Rp.%,.0f\n", total);
    }
}
