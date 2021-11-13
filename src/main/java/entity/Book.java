package entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "books")
public class Book  extends BasicEntity{


    @Column(name = "title")
    private String title;
    @Column(name = "pages_number")
    private short pagesNumber;
    @Column(name = "isbn")
    private long isbn;

    @ManyToOne
    @JoinColumn (name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn (name = "publisher_id")
    private Publisher publisher;


}
