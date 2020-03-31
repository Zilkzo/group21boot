package kz.bitlab.group21boot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "author")
    private Users author;

    @ManyToOne
    @JoinColumn(name = "categories")
    private Categories categories;

    public Items(String name, String description, int price, Users author, Categories categories) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.author = author;
        this.categories = categories;
    }
}
