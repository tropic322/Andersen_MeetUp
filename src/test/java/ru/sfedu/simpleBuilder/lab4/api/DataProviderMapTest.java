package ru.sfedu.simpleBuilder.lab4.api;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.sfedu.simpleBuilder.lab4.model.map.BuildingMap;

import java.util.*;

public class DataProviderMapTest {
    static IDataProvider dp = new DataProvider();
    static Map<String, String> materials = new HashMap<>();
    static BuildingMap Building = new BuildingMap();

    @BeforeClass
    public static void testInsert() {
        materials.put("test01011", "testmmm");
        materials.put("test01211", "testmmm22");
        Building.setmaterials(materials);
        dp.insert(Building);
    }

    @Test
    public void testGetById() {
        Optional<BuildingMap> byID = dp.getById(BuildingMap.class, Building.getId());
        if(byID.isPresent()){
            Assert.assertEquals(byID.get(), Building);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testUpdate() {
//        materials = materials.values().stream().map(s -> s + "Updated").collect(Collectors.toMap(Map.Entry::getKey, a -> a.getValue()));
        materials.replaceAll((k, v) -> v + "Updated");
        BuildingMap updated = new BuildingMap(Building.getId(), materials);
        Assert.assertTrue(dp.update(updated));
    }

    //    @AfterClass
    public static void testDelete() {
        dp.delete(Building);
    }
}