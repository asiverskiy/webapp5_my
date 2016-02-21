package ru.javawebinar.webapp.modal;
// Настройка Settings -> Edition -> File and Code Templates -> Includes -> File Header
/**
 * Akarak
 * 16.02.2016.
 */
public class Link {
    private final String name;
    private String url;

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }
    // Копия метода
    public Link(Link link) {
        this.name = link.name;
        this.url = link.url;
    }
}
