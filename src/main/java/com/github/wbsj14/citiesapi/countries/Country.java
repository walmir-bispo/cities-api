package com.github.wbsj14.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Disse ao Spring que isso é uma entidade, a entidade Country(Pais)
@Table(name = "pais") // Estou dando um nome a esta tabela de paises, dei o nome de "pais"
public class Country {

    //Vamos mapear as colunas do BD para esta entidade. Temos as colunas : ID, nome, nome_pt, bacen e sigla

    //Mapeamento do ID. Suponho que poderia ser feito assim tb "@Column(name = "id")"
    // Quando o nome da entity é igual a coluna do banco de dados, nao é necessário mapear;
    @Id
    private Integer id;

    @Column(name = "nome") //Mapeamento do nome. Perceba que como eu atribui "name", "name" nao está na coluna do meu BD, logo preciso mapear.
    private String name;

    @Column(name = "nome_pt") //Mapeamento do nome_pt
    private String portugueseName;

    @Column(name = "sigla") //Mapeamento da sigla
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
