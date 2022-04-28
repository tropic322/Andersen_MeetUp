package ru.sfedu.simpleBuilder.lab4.model.map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class BuildingMap {
    private static int count = 0;
    @Id
    @Column(name = "id")
    Long id = (System.currentTimeMillis() + count);
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "MaterialMap")
    @MapKeyColumn
    Map<String, String> materials = new HashMap<>();

    public BuildingMap() {
    }

    public BuildingMap(Map<String, String> materials) {
        this.materials = materials;
    }

    public BuildingMap(Long id, Map<String, String> materials) {
        count++;
        this.id = id;
        this.materials = materials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<String, String> getmaterials() {
        return materials;
    }

    public void setmaterials(Map<String, String> materials) {
        this.materials = materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BuildingMap BuildingMap = (BuildingMap) o;

        return new EqualsBuilder().append(id, BuildingMap.id).append(materials, BuildingMap.materials).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(materials).toHashCode();
    }
}
