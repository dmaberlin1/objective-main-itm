package task0523;

/* 
Конструктор
Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Метод main изменять нельзя.
3. Программа должна вывести слово "Red" на экран.
4. Метод getDescription класса Color должен возвращать значение переменной description.
5. Метод setDescription класса Color должен устанавливать значение переменной description.
*/

public class Circle {
    public Color color;

    public Circle() {
        color = new Color();
    }



    public static class Color {
        String description;



        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
