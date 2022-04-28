package ru.sfedu.simpleBuilder.lab4.model.set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class BuildingSet {
    private static int count = 0;
    @Id
    @Column(name = "id")
    Long id = (System.currentTimeMillis() + count);

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable (
            name = "Materialset"
    )
    Set<String> materials = new HashSet<>();

    public BuildingSet() {
    }

    public BuildingSet(Set<String> materials) {
        this.materials = materials;
    }

    public BuildingSet(Long id, Set<String> materials) {
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
    
    public Set<String> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<String> materials) {
        this.materials = materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BuildingSet BuildingSet = (BuildingSet) o;

        return new EqualsBuilder().append(getId(), BuildingSet.getId()).append(getMaterials(), BuildingSet.getMaterials()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getId()).append(getMaterials()).toHashCode();
    }
}
