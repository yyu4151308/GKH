


import java.util.*;

/**
 *
 */
public class ider {
    public static void printRandomBySort() {
        Random random = new Random(); // 创建随机数生成器List
        List list = new ArrayList();// 生成10 个随机数，并放在集合list 中
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1000));
        }
        Collections.sort(list); // 对集合中的元素进行排序
        Iterator it = list.iterator();
        int count = 0;
        while (it.hasNext()) { // 顺序输出排序后集合中的元素
            System.out.println(++count + ": " + it.next());
        }
    }

    public static void main(String[] args){
        System.out.println(Double.valueOf("10579.54"));
    }

}

