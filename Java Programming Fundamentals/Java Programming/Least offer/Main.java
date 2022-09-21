import java.util.*;
class product implements Comparable<product>{
        private final String name;
        private final double price;
        private final double discount;
        
    public product(String name,double price,double discount){
        this.name=name;
        this.price=price;
        this.discount=discount;
    }
    public Double getDiscountPrice(){
        return price*discount/100;
    }
    @Override
    public int compareTo(product other){
        return this.getDiscountPrice().compareTo(other.getDiscountPrice());
        
    }
    @Override
    public String toString(){
        return name;
    }
    
        
    }
    public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     List<product> products=new ArrayList<product>();
     int n=sc.nextInt();
     for(int i=0;i<n;i++){
         String[] inputs=sc.next().split(",");
         String name=inputs[0];
         double price=Double.parseDouble(inputs[1]);
         double discount=Double.parseDouble(inputs[2]);
         
         product prod=new product(name,price,discount);
         products.add(prod);
     }
     products.stream()
                .filter((product) -> product.getDiscountPrice().equals(Collections.min(products).getDiscountPrice()))
                .forEach(System.out::println);
        
    }
}