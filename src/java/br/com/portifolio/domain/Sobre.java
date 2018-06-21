package br.com.portifolio.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sobre")
public class Sobre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;

    @Column(length = 255, nullable = false)
    private String info;

    public Sobre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
