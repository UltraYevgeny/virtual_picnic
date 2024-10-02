
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @apiNote Работа с файлом, извлечение данных
 */
public class FileWork {

    /**
     * @apiNote возвращает список слов из файла
     * @return List<String> products
     */
    public List<String> getProducts() {
        List<String> products  = new ArrayList<String>();
        try
        {
            File file = new File("0e4efd58caaed117fa0b01f7e96d4da9.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while(line!=null){
                String[] product = line.split(" ");

                // проверка пустой строки
                if (!line.isEmpty()) {
                    for (int i = 0; i < product.length; i++) {
                        // Проверка пустого элемента массива
                        if (!product[i].isEmpty()) {
                            products.add(product[i]);
                            }
                        }
                }

                line = reader.readLine();
            }

            if (products.size() == 0) {
                System.out.println("Файл пуст.");
                reader.close();
                System.exit(0);
            }

            reader.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        return products;
    }


}


