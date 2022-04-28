package ru.sfedu.simpleBuilder.lab4.model.list;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BuildingList {
    private static int count = 0;
    @Id
    @Column(name = "id")
    Long id = (System.currentTimeMillis() + count);
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "MaterialList")
    //@OrderColumn(name="aaa")
    @OrderColumn
    List<String> materials = new ArrayList<>();

    public BuildingList() {
    }

    public BuildingList(List<String> materials) {
        this.materials = materials;
    }

    public BuildingList(Long id, List<String> Materials) {
        count++;
        this.id = id;
        this.materials = Materials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public void setMaterials(List<String> Materials) {
        this.materials = Materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BuildingList BuildingList = (BuildingList) o;

        return new EqualsBuilder().append(id, BuildingList.id).append(materials, BuildingList.materials).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(materials).toHashCode();
    }
}
