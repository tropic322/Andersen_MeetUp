package ru.sfedu.simpleBuilder.lab4.api;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.sfedu.simpleBuilder.lab4.model.set.BuildingSet;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DataProviderSetTest {
    static IDataProvider dp = new DataProvider();
    static Set<String> materials = new HashSet<>();
    static BuildingSet Building = new BuildingSet();

    @BeforeClass
    public static void testInsert() {
        materials.add("test");
        materials.add("test2");
        Building.setMaterials(materials);
        dp.insert(Building);
    }

    @Test
    public void testGetById() {
        Optional<BuildingSet> byID = dp.getById(BuildingSet.class, Building.getId());
        if(byID.isPresent()){
            Assert.assertEquals(byID.get(), Building);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testUpdate() {
        materials = materials.stream().map(medicine -> medicine + "Updated").collect(Collectors.toSet());
        BuildingSet updated = new BuildingSet(Building.getId(), materials);
        Assert.assertTrue(dp.update(updated));
    }

    //@AfterClass
    public static void testDelete() {
        dp.delete(Building);
    }
}