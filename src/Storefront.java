import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class Storefront {
    private LinkedList catalog = new LinkedList();
    //添加对象即商品
    public void addItem(String id, String name, String price, String quant){
        Item it = new Item(id,name,price,quant);
        catalog.add(it);
    }
    //返回相应实例
    public Item getItem(int i){
        return (Item)catalog.get(i);
    }
    //返回实例数量
    public int getSize(){
        return catalog.size();
    }
    //对所有实例排序
    public void sort(){
        Collections.sort(catalog);
    }
}
