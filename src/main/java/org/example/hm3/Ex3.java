package org.example.hm3;

import org.example.hm3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 *  Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 *  Найти названия книг, в которых простое количество страниц,
 *  фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {

        Book book1 = new Book("Первый том", "Алюнов", 50, 2011, 2);
        Book book2 = new Book("Второй том", "Петров", 50, 2010, 8);
        Book book3 = new Book("Третий том", "Пашин", 50, 2015, 7);
        Book book4 = new Book("Девятый том", "Мишин", 50, 1994, 2);
        Book book5 = new Book("Конь", "Морковка", 50, 1982, 6);
        Book book6 = new Book("Муму", "Тургенев", 50, 1854, 2);


        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        char x = 'а';

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPage() % 2 != 0 || bookList.get(i).getPage() == 2) {
                if (is_Prime(i)) {
                    if(bookList.get(i).getYear() >= 2010 )
                        if(bookList.get(i).getAuthor().indexOf('а') >= 0 ||
                                bookList.get(i).getAuthor().indexOf('А') >= 0)
                            System.out.println( bookList.get(i).getName());

                }

            }
        }
    }

    public static boolean is_Prime(int p) {
        for (int i = 3; i * i <= p; i += 2) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

}


