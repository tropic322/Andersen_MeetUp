package ru.sfedu.simpleBuilder.lab4.model.component;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BUILDINGCOMPONENT")
public class BuildingComponent {
    private static int count = 0;
    @Id
    @Column(name = "id")
    Long id = (System.currentTimeMillis() + count);

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "MaterialComponent")
    Set<MaterialComponent> Materials = new HashSet<>();

    public BuildingComponent() {
    }

    public BuildingComponent(Set<MaterialComponent> materials) {
        Materials = materials;
    }

    public BuildingComponent(Long id, Set<MaterialComponent> Materials) {
        count++;
        this.id = id;
        this.Materials = Materials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<MaterialComponent> getMaterials() {
        return Materials;
    }

    public void setMaterials(Set<MaterialComponent> Materials) {
        this.Materials = Materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BuildingComponent that = (BuildingComponent) o;

        return new EqualsBuilder().append(id, that.id).append(Materials, that.Materials).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(Materials).toHashCode();
    }
}
