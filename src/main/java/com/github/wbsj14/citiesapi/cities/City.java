package com.github.wbsj14.citiesapi.cities;

import com.github.wbsj14.citiesapi.staties.State;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity(name = "City")
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Integer id;

    @Column(name = "nome")
    private String name;

    private Integer ibge;

    // 1st
    @Column(name = "lat_lon")
    private String geolocation;

    // 2nd
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    @ManyToOne
    @JoinColumn(name="uf", referencedColumnName = "id")
    private State state;


    public City() {
    }

    public City(final Integer id, final String name, final Integer ibge,
                final String geolocation, final Point location, final State state) {
        this.id = id;
        this.name = name;
        this.ibge = ibge;
        this.geolocation = geolocation;
        this.location = location;
        this.state = state;
    }

    public Integer getId() { return id; }

    public String getName() { return name; }

    public Integer getIbge() { return ibge; }

    public String getGeolocation() {
        return geolocation;
    }

    public Point getLocation() {
        return location;
    }

    public State getState(){ return state; }


}
