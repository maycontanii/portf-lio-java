package br.com.portifolio.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Home")
public class Home implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id = 1;
    @Column(length = 255, nullable = true)
    private String tituloHome;
    
    @Column(length = 255, nullable = true)
    private String subtituloHome;

    public Home() {
    }

    public String getTituloHome() {
        return tituloHome;
    }

    public void setTituloHome(String tituloHome) {
        this.tituloHome = tituloHome;
    }

    public String getSubtituloHome() {
        return subtituloHome;
    }

    public void setSubtituloHome(String subtituloHome) {
        this.subtituloHome = subtituloHome;
    }
}
