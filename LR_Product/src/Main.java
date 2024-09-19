//Скласти масив об'єктів. Вивести:
//        a) список товарів для заданого найменування;
//        b) список товарів для заданого найменування, ціна яких не перевищує задану;
//        c) список товарів, термін зберігання яких більше заданого.


import java.util.Scanner; // Import the Scanner class to read text files
public class Main {

    static void prodNaming(Product[] arr) {
        String name;
        System.out.println("Enter naming of products which you want to output ");
        Scanner myObj = new Scanner(System.in);
        name = myObj.nextLine();
        for(int i = 0; i < 10;i++ ){
            if(arr[i].getNaming().equals(name) ){
                String info = arr[i].toString();
                System.out.println(info);

            }
        }
    }
    static void namePrice(Product[] arr){
        String name;
        System.out.println("Enter naming of product which you want to output ");
        Scanner myObj = new Scanner(System.in);
        name = myObj.nextLine();
        System.out.println("Enter maximal price ");
        double price = myObj.nextDouble();
        for(int i = 0; i < 10;i++ ){
            if(arr[i].getNaming().equals(name) && arr[i].getPrice() <= price){
                String info = arr[i].toString();
                System.out.println(info);

            }
        }
    }
    static void expDate(Product[] arr){
        double days;
        System.out.println("Enter minimal ammount of days to expiration ");
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();
        for(int i = 0; i < 10;i++ ){
            if(arr[i].getDaysToExp() >= days){
                String info = arr[i].toString();
                System.out.println(info);
            }
        }

    }
    public static Product[] createArray(){
        Product[] arr;
        arr = new Product[10];
        arr[0] = new Product(1, "Wheat bread", "First bakery","05.04.2024",30,10.99,30);
        arr[1] = new Product(2, "Wheat bread", "Sam's bakery","16.04.2024",24,7.50,33);
        arr[2] = new Product(3, "Beans in tomato sauce", "Green farm","06.04.2024",720,15.99,20);
        arr[3] = new Product(4, "Chicken breast", "Organic meat","10.04.2024",14,40.99,100);
        arr[4] = new Product(5, "Apple", "Farmer's garden","01.04.2024",90,10,300);
        arr[5] = new Product(6, "Apple", "Organic food","13.04.2024",70,20.99,130);
        arr[6] = new Product(7, "Pasta", "Barilla","02.04.2024",240,30.99,41);
        arr[7] = new Product(8, "Water", "Alaskan beauty","09.04.2024",300,3.99,300);
        arr[8] = new Product(9, "Water", "Highlands spring","18.04.2024",300,4.99,321);
        arr[9] = new Product(10, "Shrimp", "Bubba Gump shrimp co.","19.03.2024",120,60.99,400);
        return arr;
    }
    public static void main(String[] args){
     int menu = 0;
     Scanner sc = new Scanner(System.in);
        Product[] arr = createArray();

        while(menu != 4){
            System.out.println("         MENU         \n" +
                    "Choose your option:\n1.Output product by specific name");
            System.out.println("2.Output product by specific name and  by maximal price\n" +
                    "3.Output products with more than N days to expiration\n4.Exit ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    prodNaming(arr);
                    break;
                case 2:
                    namePrice(arr);
                    break;
                case 3:
                    expDate(arr);
                    break;

              }
            }
          }
        }