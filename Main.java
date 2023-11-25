public class Main {
    public static void main(String[] args) {
        //Створіть чотири строки: Hello, Hello, Good-Bye, HELLO. Порівняйте першу строку з іншими.
        // Потім порівняйте першу з четвертою не враховуючи регістр.
        String string = new String("Hello");
        String string1 = new String("Hello");
        String string2 = new String("Good-Bye");
        String string3 = new String("HELLO");

        System.out.println(string.equals(string1));
        System.out.println(string.equals(string2));
        System.out.println(string.equals(string3));

        //Перевірте чи починаєть строка Foobar зі слова Foo, чи закінчується на bar, чи містить оо
        String string4 = new String("Foobar");
        System.out.println("-------------");
        System.out.println(string4.startsWith("Foo"));
        System.out.println(string4.endsWith("bar"));
        System.out.println(string4.contains("oo"));
        //Отримайте символ с зі строки abc
        String string5 = new String("abc");
        System.out.println("-------------");
        System.out.println(string5.charAt(2));
        //Створіть строку “Для роботи зі строками у Java використовуються класи String, StringBuilder
        // та StringBuffer.”. Дізнайтеся за яким індексом знаходиться елемент ‘S’. Дізнайтеся за яким
        // індексом находиться останній символ ‘r’. З якого індексу починається підрядок ‘String’, а
        // також з якого починється його останнє згадування.
        String string6 = new String("ytyy String StringBuilder StringBuffer");
        System.out.println("-------------");
        System.out.println( string6.indexOf("S"));
        System.out.println( string6.lastIndexOf("r"));
        System.out.println( string6.indexOf("String"));
        System.out.println( string6.lastIndexOf("String"));
        System.out.println("-------------");
        //Об’єднайте строки Hello та World. Приведіть їх до нижнього регістру. Потім до верхнього.
        String string7 = new String("Hello");
        String string8 = new String(" World");
        System.out.println(string7 + string8);
        System.out.println((string7 + string8).toLowerCase());
        System.out.println((string7 + string8).toUpperCase());
        System.out.println("-------------");
//        Створіть змінні типу double, long та будь-який об’єкт свого класу. Приведіть усі ці змінні до строки.
        long a = 45L;
        double b = 56.7;
        Car car = new Car("Dodge");
        String str = Double.toString(b) + " " + Long.toString(a) + String.valueOf(car.name);
        System.out.println(str);

        //Створіть строку “Welcome to Dnipro”. Виріжіть усі елементи починаючи з 10.
        // Виріжіть усі елементи з 10 по 18
        String str1 = "Welcome to Dnipro";
        System.out.println(str1.substring(10));
        System.out.println(str1.substring(10, 17));
        System.out.println("-------------");

        //Напишіть метод, який у рядку замінює кожне входження «object-oriented programming»
        // (не враховуємо регістр символів) на «OOP». Наприклад, рядок
        //"Object-oriented programming is a programming language model organized around objects rather than
        //"actions"
        // and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
        // має бути перетворена на  "OOP is a programming language model organized around objects rather than
        // "actions" and data rather than logic. OOP blabla. OOP bla."
        String str2 = "Object-oriented programming is a programming language model organized around objects" +
                " rather than \"actions\" and data rather than logic. Object-oriented programming blabla." +
                " Object-oriented programming bla.";
        System.out.println(Rep.Replace(str2));
        System.out.println("-------------");
//        Напишіть метод, який приймає як параметр будь-який рядок, наприклад “I like Java!!!”.
//        Уся подальша робота відбувається у методі.
//        Роздрукувати останній символ рядка. Використовуємо метод String.charAt().
//        Перевірити, чи закінчується ваш рядок підрядком "!!!". Використовуємо метод String.endsWith().
//        Перевірити, чи починається ваш рядок підрядком "I like". Використовуємо метод String.startsWith().
//        Перевірити, чи містить ваш рядок підрядок "Java". Використовуємо метод String.contains().
//        Знайти позицію підрядка “Java” у рядку “I like Java!!!”.
//        Замінити всі символи "а" на "про".
//        Перетворіть рядок на верхній регістр.
//        Перетворіть рядок на нижній регістр.
//        Вирізати рядок Java за допомогою методу String.substring().
        String str3 = "I like Java!!!";
        MethodString.MethodStringWorking(str3);
        System.out.println("-------------");
//        Дано два числа, наприклад 3 і 56, необхідно скласти такі рядки:
//        3 + 56 = 59
//        3 - 56 = -53
//        3 * 56 = 168.
//        Використовуємо метод StringBuilder.append().
//         Замініть символ “=” на слово “дорівнює”. Використовуйте методи StringBuilder.insert(),
//                StringBuilder.deleteCharAt().

        StringBuilder builder = new StringBuilder();
        builder.append(3);
        builder.append(" + ");
        builder.append(56);
        builder.append(" = ");
        builder.append(59);
        builder.insert(8,"дорівнює");
        builder.deleteCharAt(7);
        builder.append("\n");
        builder.append(3);
        builder.append(" - ");
        builder.append(56);
        builder.append(" = ");
        builder.append(-53);
        builder.insert(26,"дорівнює");
        builder.deleteCharAt(34);
        builder.append("\n");
        builder.append(3);
        builder.append(" * ");
        builder.append(56);
        builder.append(" = ");
        builder.append(168);
        builder.insert(46,"дорівнює");
        builder.deleteCharAt(54);
        System.out.println(builder);
        System.out.println("-------------");
        //Дано рядки різної довжини (довжина - парне число), необхідно повернути її два середні знаки.
        // Наприклад, якщо даний рядок "string" результат буде "ri", для рядка "code" результат "od", для
        // "Practice" результат "ct".
        String str4 = "code";
        int i = str4.length()/2;
        int j = str4.length()/2 - 1;
        System.out.println(str4.charAt(j) + "" + str4.charAt(i));
    }
}
