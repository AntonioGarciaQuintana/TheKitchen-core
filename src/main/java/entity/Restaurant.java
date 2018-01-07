package entity;

import javax.persistence.*;

/**
 * Created by antonio on 03/01/2018.
 */
@Entity
@Table(name = "tbl_restaurant", schema = "cat")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
