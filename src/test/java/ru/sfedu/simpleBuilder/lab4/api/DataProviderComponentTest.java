package ru.sfedu.simpleBuilder.lab4.api;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.sfedu.simpleBuilder.lab4.model.component.MaterialComponent;
import ru.sfedu.simpleBuilder.lab4.model.component.BuildingComponent;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


public class DataProviderComponentTest {
    static IDataProvider dp = new DataProvider();
    static MaterialComponent Material = new MaterialComponent("test_andersen", "material1");
    static MaterialComponent Material1 = new MaterialComponent("test_andersen2", "material2");
    static BuildingComponent Building = new BuildingComponent();

    @BeforeClass
    public static void insert() {
        Set<MaterialComponent> set = new HashSet<>();
        set.add(Material);
        set.add(Material1);
        Building.setMaterials(set);
        dp.insert(Building);
    }

    @Test
    public void getById() {
        Optional<BuildingComponent> byId = dp.getById(BuildingComponent.class, Building.getId());
        if (byId.isPresent()) {
            Assert.assertEquals(byId.get(), Building);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void update() {
        Set<MaterialComponent> set = Building.getMaterials();
        set.forEach(MaterialComponent -> MaterialComponent.setSomeField(MaterialComponent.getSomeField() + "Updated"));
        Building.setMaterials(set);
        Assert.assertTrue(dp.update(Building));
    }

  // @AfterClass
    public static void delete() {
        dp.delete(Building);
    }
}