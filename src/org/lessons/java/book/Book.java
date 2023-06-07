package org.lessons.java.book;

class Book {
    private String title;
    private int numPages;
    private String author;
    private String publisher;

    public Book(String title, int numPages, String author, String publisher) throws Exception {
        setTitle(title);
        setNumPages(numPages);
        setAuthor(author);
        setPublisher(publisher);
    }

    // Getter e setter per il titolo
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (title.isEmpty()) {
            throw new Exception("Il titolo non può essere vuoto");
        }
        this.title = title;
    }

    // Getter e setter per il numero di pagine
    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) throws Exception {
        if (numPages <= 0) {
            throw new Exception("Il numero di pagine deve essere maggiore di 0");
        }
        this.numPages = numPages;
    }

    // Getter e setter per l'autore
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws Exception {
        if (author.isEmpty()) {
            throw new Exception("L'autore non può essere vuoto");
        }
        this.author = author;
    }

    // Getter e setter per l'editore
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws Exception {
        if (publisher.isEmpty()) {
            throw new Exception("L'editore non può essere vuoto");
        }
        this.publisher = publisher;
    }

    // Metodo toString per la rappresentazione del libro come stringa

    @Override
    public String toString() {
        return "Lista libri: " + '\'' +
                "Titolo del Libro " + title + '\'' +
                ", Pagine: " + numPages +
                ", Autore: " + author + '\'' +
                ", Editore: " + publisher + '\'';
    }
}