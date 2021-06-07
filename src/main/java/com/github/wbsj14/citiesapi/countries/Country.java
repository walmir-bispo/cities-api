package com.github.wbsj14.citiesapi.countries;

import javax.persistence.*;

@Entity(name = "Country")
@Table(name = "pais")
public class Country {

    @Id
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Country() { }

    public Integer getId() { return id; }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }


}
