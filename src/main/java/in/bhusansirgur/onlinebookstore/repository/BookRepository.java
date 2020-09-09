package in.bhusansirgur.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bhusansirgur.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
