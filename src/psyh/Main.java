package psyh;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Написати программу “Калькулятор“

Обов’язкові вимоги
Калькулятор command line application. Користувач запускає його з консолі і вводить дані через консоль.
Калькулятор вміє виконувати операції додавання, віднімання, множення та ділення з двома числами:
a + b, a - b, a * b, a / b
Калькулятор вміє працювати з арабськими і римськими числами. Вираз містить числа одного типу: II + 2 - не валідний вираз.
Калькулятор працює з цілими числами.
Калькулятор вміє працювати з арабськими числами від 0 до 10. З римськими числами від І до X.
Зверни увагу на правила ООП. Обдумай структуру класів. Завдання в яких весь код в одному класі будуть оцінені низько.
НЕ обов’язкові вимоги
Обробка виразів з декількома операціями - НЕ обов’язкова.
Обробка чисел більше 10 - НЕ обов’язкова.*/

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("It is a little command line application Calculator, \n" +
                "that can solve 4 math functions, like addition '+', subtraction '-', multiplying '*' and dividing '/' with remainder. \n" +
                "Input the data in format a + b, a - b, a * b or a / b (Attention! Between symbols must be spacebar.) and press Enter.\n" +
                "Where a and b must be an integer in arabic or roman style.\n" +
                "And you must remember that roman style doesn't have symbol for 'zero'.\n" +
                "For roman numbers, please, input numbers from 1 to 999 inclusively and answer can't be more then 3999.\n" +
                "Data that looks like 'V + 5' will be correct, but we will consider you, like strange user.\n" +
                "When you want stop it, just input 'stop'. Let's calculate!" );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (Recognising.bool) {
            Recognising.answer = br.readLine().toUpperCase();
            if (Recognising.answer.equals("STOP")) {
                Recognising.bool = false; break;}
            Recognising.splitter(Recognising.answer);
            Recognising.recognizeFunction(Recognising.f);
            Recognising.answer = String.valueOf(Recognising.result);
            System.out.print(Recognising.a + " " + Recognising.f + " " + Recognising.b + " = ");
            if (!(Converter.isInt(Recognising.a)))
                Recognising.answer = Converter.toRoman(Recognising.result);
            if (Recognising.remainder!=0){
                if (!(Converter.isInt(Recognising.answer)))
                Recognising.answer += (" and remained " + Converter.toRoman(Recognising.remainder));
                else
                Recognising.answer += (" and remained " + Recognising.remainder);
            }

            System.out.println(Recognising.answer);
            Recognising.remainder = 0;
        }
        System.out.println("Good bye!");
        br.close();
    }
}
