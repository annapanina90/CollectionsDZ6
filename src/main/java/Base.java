/*Задание №6:
Есть входной файл с набором слов, написанных через пробел
Необходимо:
Прочитать слова из файла.
Отсортировать в алфавитном порядке.
Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class Base {



    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner( new File( "C:\\Users\\user\\IdeaProjects\\dz6\\src\\main\\resources\\Words.txt" ) );
        // вычислить сколько раз слово встречается в файле и отсортировать по алфавиту
        Map<String, Integer> sorted = new TreeMap<>();

        while (scanner.hasNext()) {
            Integer count;
            String word = scanner.useDelimiter( "\\s+" ).next();
            count = sorted.get( word );
            if (count == null) {
                count = 0;
            }
            sorted.put( word,++count );


            }
            System.out.println( sorted );

            assert sorted != null;
            Collection<Integer> values = sorted.values();
            Integer max = Collections.max( values );
            Set<String> result = new HashSet<>();
            for (Map.Entry<String, Integer> entry : sorted.entrySet()) {

                if (max.equals( entry.getValue() )) {
                    result.add( entry.getKey() );
                    System.out.println( String.format( "Слово с максимальным количеством повторений это %s = %d",result,max ) );
                }
            }



    }
}
