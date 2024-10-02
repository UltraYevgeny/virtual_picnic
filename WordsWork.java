import java.util.*;


/**
 * @apiNote Класс обрабатывает данные
 * @apiNote три функции возвращают результаты:
 * @apiNote подсчет слов, самое длинное слово, частота слов
 */
public class WordsWork {

    /**
     * @apiNote возвращает количество слов
     * @param products
     * @return Integer products
     */
    public Integer countWords (List<String> products) {
        return products.size();
    }

    /**
     * @apiNote возвращает список самых длинных слов
     * @apiNote если слова разные, но количество букв совпадает
     * @param products
     * @return List<String> longestWords
     */
    public List<String> longestWordFromAll (List<String> products) {
        List<String> longestWords = new ArrayList<>();
        String longestOneWord = "";

        // при помощи коллекции Set убираем слова дубликаты,
        // для того чтобы снизить затраты на обработку данных в циклах
        Set<String> deleteDuplicates = new LinkedHashSet<>(products);
        List<String> productsWords = new ArrayList<>(deleteDuplicates);

        for (String word : productsWords) {
            if (longestOneWord.length() < word.length()) {
                longestOneWord = word;
            }
        }

        for (String word : productsWords){
            if (longestOneWord.length() == word.length()) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }

    /**
     * @apiNote возвращает наименование продуктов и их количество в списке
     * @param products
     * @return HashMap<String, Integer> productBaskets
     */
    public HashMap<String, Integer> basket(List<String> products) {
        HashMap<String, Integer> productBaskets = new HashMap<>();

        for (String product : products) {
            if (!productBaskets.containsKey(product)) {
                productBaskets.put(product, 1);
            } else {
                productBaskets.put(product, productBaskets.get(product) + 1);
            }
        }

        return productBaskets;
    }


}
