package lesson02;

import ru.javawebinar.webapp.modal.Link;

/**
 * Akarak
 * 21.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Link l1 = new Link("JavaWebimar", "javawebimar.ru");
        Link l2 = l1;
        System.out.println(l1.equals(l2));

    }
}
