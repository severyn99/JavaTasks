package use;

import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*
    Видалити з тексту всі слова, які містять неменше заданої кількості цифр всередині слова
    (наприклад слово  a12345b містить 5 цифр). Передбачити ситуацію, що між цифрами можуть бути дефіси.
    Текст  та кількість цифр слід ввести з консолі
*/
    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor();

        try {
            String textUse = processor.readTextFromConsole();
            textUse = processor.processText(textUse);
            processor.showResults(textUse);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class StringProcessor {
    int numberOfTimes;

    public String readTextFromConsole() throws IOException {
        Scanner input = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        String paragraph;
        while (!(paragraph = input.nextLine()).equals("")) {
            text = text.append(paragraph);

        }
        System.out.println("Enter number of times: ");
        numberOfTimes = input.nextInt();

        if (text.toString().equals("")) throw new IOException("Please, enter text");
        return text.append(" ").toString();
    }

    public String processText(String input) {
        int countOfNumbers;
        String newInput = "";

        String[] words = input.split("\\s");

        for (String word : words) {
            int from = 0;
            countOfNumbers = 0;

            Matcher matcher = Pattern.compile("[0-9]").matcher(word);

            while (matcher.find(from)) {
                countOfNumbers++;
                from = matcher.start() + 1;
            }

          if (countOfNumbers<=numberOfTimes) {
              newInput = newInput.concat(word + " ");

          }
        }


        return newInput;

    }

    public void showResults(String input) {
        System.out.println(input);

    }

}