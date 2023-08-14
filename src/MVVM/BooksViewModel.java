package MVVM;


// ViewModel


import java.util.List;

class BooksViewModel {
    private final List<Book> books;

    public BooksViewModel(List<Book> books) {
        this.books = books;
    }

    public String getDisplayableBooks() {
        StringBuilder builder = new StringBuilder("Список книг:\n");
        for (int i = 0; i < books.size(); i++) {
            builder.append((i + 1)).append(". ").append(books.get(i).toString()).append("\n");
        }
        return builder.toString();
    }

    public void markBookAsRead(int index) {
        books.get(index).markAsRead();
    }
}
// View будет обеспечивать интерактивный интерфейс для пользователя, чтобы он мог отмечать книги как прочитанные.

