/**
 * Created by 时光与你 on 2017/5/13.
 */
public class Item implements Comparable {
    /*
    Compareable只有一个方法CompareTo，返回一个整数
     */
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;

    public Item(String idIn, String nameIn, String retailIn, String qIn) {
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);

        if (quantity > 400){
            price = retail * .5D;
        }else if (quantity > 200){
            price = retail * .6D;
        }else {
            price = retail * .7D;
        }
        //Math.floor方法将小数舍入为与之最接近且不大于它的数
        price = Math.floor(price * 100 + .5) / 100;   //四舍五入
    }
    /*
    CompareTo比较类的两个对象，当前对象和作为参数传递该方法的对象，返回值指定了这个类对象的排列顺序
    如果当前对象排在另一个对象之前，返回-1；
    如果当前对象排在另一个对象之后，返回1；
    如果两个对象相等，返回0
     */
    @Override
    public int compareTo(Object o) {
        Item temp = (Item) o;
        if (this.price < temp.price){
            return 1;
        }else if (this.price > temp.price){
            return -1;
        }
        return 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
