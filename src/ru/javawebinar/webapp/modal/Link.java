package ru.javawebinar.webapp.modal;
// Настройка Settings -> Edition -> File and Code Templates -> Includes -> File Header

/**
 * Akarak
 * 16.02.2016.
 */
public class Link {
    private final String name;
    private String url;
    private int i;

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    // Копия метода
    public Link(Link link) {
        this.name = link.name;
        this.url = link.url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (i != link.i) return false;
        if (name != null ? !name.equals(link.name) : link.name != null) return false;
        if (!url.equals(link.url)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + url.hashCode();
        result = 31 * result + i;
        return result;
    }
}
