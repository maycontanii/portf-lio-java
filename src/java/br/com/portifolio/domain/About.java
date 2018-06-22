package br.com.portifolio.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "About")
public class About implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id = 1;
    @Column(length = 255, nullable = false)
    private String description;
    @Column(length = 255, nullable = false)
    private String title;
    @Column(length = 255, nullable = true)
    private String titleskill;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleskill() {
        return titleskill;
    }

    public void setTitleskill(String titleskill) {
        this.titleskill = titleskill;
    }    
}
