import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Product {
    float price;
    String validDate;
    float weight;
}

class AnimalProduct extends Product {
    String animProdType;
    float storageTemp;
}

class VegetalProduct extends Product {
    String vegProdType;
    String vitamins;
}

public class StoreProblem {

    public static void main(String[] args) {
        List stock = new ArrayList();
        System.out.println("1. Create product and add it to stock");
        System.out.println("2. Sell product");
        System.out.println("3. Display daily sales report");
        System.out.println("4. Exit");

        Scanner keyboard = new Scanner(System.in);
        int choice1 = keyboard.nextInt();
        //create product and add to stock
        if (choice1 == 1) {
            System.out.println("Product type (1 - animal; 2 - vegetable):");
            int choice2 = keyboard.nextInt();
            if (choice2 == 1) {
                System.out.println("Please insert the price, validity date, weight, type and " +
                        "storage temperature for the animal product");
                AnimalProduct prodAnimal = new AnimalProduct();
                prodAnimal.price = keyboard.nextFloat();
                prodAnimal.validDate = keyboard.nextLine();
                prodAnimal.weight = keyboard.nextFloat();
                prodAnimal.animProdType = keyboard.nextLine();
                prodAnimal.storageTemp = keyboard.nextFloat();

                //pot adauga asa in lista stock un obiect?
                stock.add(prodAnimal);

            }
            if (choice2 == 2) {
                System.out.println("Please insert the price, validity date, weight, type and its " +
                        "vitamins for the vegetal product");
                VegetalProduct prodVegetal = new VegetalProduct();
                prodVegetal.price = keyboard.nextFloat();
                prodVegetal.validDate = keyboard.nextLine();
                prodVegetal.weight = keyboard.nextFloat();
                prodVegetal.vegProdType = keyboard.nextLine();
                prodVegetal.vitamins = keyboard.nextLine();


                //pot adauga asa in lista stock un obiect?
                stock.add(prodVegetal);
            }
        }
        //sell product
        if (choice1 == 2) {
            for (int i=0; i < stock.size(); i++)
                System.out.println(stock.get(i));
        }
        //daily sales report
        if (choice1 == 3) {
            //String Date = = keyboard.nextLine();
            //aici ar trebui sa citeasca o data si sa afiseze toate comenzile din acea data
            //for (int i=0; i < stock.size(); i++)
            //if ( stock.get(i).)
        }
        //exit
        if (choice1 == 4) {
            System.exit(0);
        }

    }
}