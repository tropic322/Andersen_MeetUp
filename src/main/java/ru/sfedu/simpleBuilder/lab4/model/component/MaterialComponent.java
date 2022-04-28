package ru.sfedu.simpleBuilder.lab4.model.component;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MaterialComponent {
    @Column
    String name;
    @Column
    String someField;



    public MaterialComponent() {
    }

    public MaterialComponent(String name, String someField) {
        this.name = name;
        this.someField = someField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MaterialComponent that = (MaterialComponent) o;

        return new EqualsBuilder().append(name, that.name).append(someField, that.someField).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(someField).toHashCode();
    }
}
