class Product{
    int id = 78;
    String name = "Amul";
    
    void display(){
        System.out.println("Product id: " +id);
        System.out.println("Product Name: "+name);
    }
}

class A extends Product{
    int count = 50;
    String category = "Butter";
    
     void display(){
        super.display();
        System.out.println("Count: " +count);
        System.out.println("Category: "+category);
    }
}

class B extends Product{
    int count = 90;
    String category = "Milk";
    
     void display(){
        super.display();
        System.out.println("Count: " +count);
        System.out.println("Category: "+category);
    }
}

class C extends Product{
    int count = 56;
    String category = "Choco";
    
     void display(){
        super.display();
        System.out.println("Count: " +count);
        System.out.println("Category: "+category);
    }
} 

class subA extends A{
    int price = 30;
    
    void totalPrice(){
        int total = count * price;
        display();
        System.out.println("price: " +price);
        System.out.println("Total Price: "+total);
        System.out.println("-----------------------");
    }
}

class subB extends B{
    int price = 10;
    
    void totalPrice(){
        int total = count * price;
        display();
        System.out.println("price: " +price);
        System.out.println("Total Price: "+total);
        System.out.println("-----------------------");
    }
}

public class ProductDetails{
    public static void main (String[] args) {
        subA obj1 = new subA();
        obj1.totalPrice();
        
        subB obj2 = new subB();
        obj2.totalPrice();
        
        C obj3 = new C();
        obj3.display();
    }
}
