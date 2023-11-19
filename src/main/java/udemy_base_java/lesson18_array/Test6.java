package udemy_base_java.lesson18_array;

public class Test6 {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'i', 'v', 'e','t'};

        //String s = new String(array); // объекту s присваивается значения массива array
        //System.out.println(s); // результат ptel

        StringBuilder sb1 = new StringBuilder("Hello world");
        //sb1.append(array,0,3); // добавляем в конец существующего StringBuilder sb1 элементы массива с индексом 1 и сколько элементов с этого индекса (1) мы дабавляем(2): "Hello worldpte"
        sb1.insert(2,array,1,3); // 2 - индекс, с которого начнётся вставка значения, 1 - индекс массива, 3 - колличество вставляемых элементов : "Herivllo world"
        System.out.println(sb1);
    }
}
