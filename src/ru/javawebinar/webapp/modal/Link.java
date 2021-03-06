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
        if (!name.equals(link.name)) return false;
        if (url != null ? !url.equals(link.url) : link.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + i;
        return result;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
