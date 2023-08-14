package MVVM;

class Book {
    private String title;
    private boolean isRead;

    public Book(String title) {
        this.title = title;
        this.isRead = false;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public boolean isRead() {
        return isRead;
    }

    @Override
    public String toString() {
        return title + (isRead ? " (прочитана)" : " (не прочитана)");
    }
}
// ViewModel будет обеспечивать форматированный вывод списка книг и предоставлять методы для маркировки книг как прочитанных.
