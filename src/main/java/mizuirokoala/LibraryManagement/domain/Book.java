package mizuirokoala.LibraryManagement.domain;
import javax.persistence.*;


@Entity
@Table(name= "Book")
public class Book {

	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookID;
}
