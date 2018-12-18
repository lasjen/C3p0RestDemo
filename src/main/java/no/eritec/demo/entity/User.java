package no.eritec.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
public class User {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "USER_NAME", nullable = true, length = 255)
    private String name;

    @Column(name = "USER_SALARY", nullable = true, length = 10)
    private Integer salary;

    protected User() {
    }

    /* ****************************
     * Getters and Setters
     * **************************** */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
