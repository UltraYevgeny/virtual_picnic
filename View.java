import java.util.*;

/**
 * @apiNote Класс обращается к классу обработки данных
 * @apiNote и выводит результаты в консоль
 */
public class View {

    public void showDataVirtualPicnic(List<String> products) {

        WordsWork productsData = new WordsWork();

        System.out.print("Количество слов в файле: ");
        System.out.println(productsData.countWords(products) + "\n");

        System.out.print("Самые длинные слова: ");
        System.out.println(productsData.longestWordFromAll(products) + "\n");

        System.out.println("Подсчет количества каждого из продуктов: ");
        Map<String, Integer> basketProducts = new HashMap<>(productsData.basket(products));

        // вывод продуктов и их количества в более читабельном формате
        Integer count = 0;
        Set<String> setKeys = basketProducts.keySet();
        for(String key: setKeys){
            System.out.print("Продукт " + key + " " + basketProducts.get(key) + "шт; ");
            count++;
            if (count == 6) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();

    }
}
