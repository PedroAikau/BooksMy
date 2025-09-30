CREATE TABLE books (
    id BIGSERIAL PRIMARY KEY,

    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,

    description TEXT NOT NULL,

    price NUMERIC(10, 2) NOT NULL,

    url_image VARCHAR(255) NOT NULL,

    isbn VARCHAR(13) NOT NULL UNIQUE,

    publisher VARCHAR(255) NOT NULL,

    publication_year SMALLINT NOT NULL,

    page_number INTEGER NOT NULL,

    main_category VARCHAR(50) NOT NULL
);

CREATE UNIQUE INDEX idx_books_isbn ON books (isbn);