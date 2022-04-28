package ru.sfedu.simpleBuilder.lab4.api;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.sfedu.simpleBuilder.lab4.model.list.BuildingList;

import java.util.*;
import java.util.stream.Collectors;

public class DataProviderListTest {
    static IDataProvider dp = new DataProvider();
    static List<String> notes = new ArrayList<>();
    static BuildingList Building = new BuildingList();

    @BeforeClass
    public static void testInsert() {
        notes.add("note10");
        notes.add("note20");
        Building.setMaterials(notes);
        dp.insert(Building);
    }

    @Test
    public void testGetById() {
        Optional<BuildingList> byID = dp.getById(BuildingList.class, Building.getId());
        if(byID.isPresent()){
            Assert.assertEquals(byID.get(), Building);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testUpdate() {
        notes = notes.stream().map(note -> note + "Updated").collect(Collectors.toList());
        BuildingList updated = new BuildingList(Building.getId(), notes);
        Assert.assertTrue(dp.update(updated));
    }

   // @AfterClass
    public static void testDelete() {
        dp.delete(Building);
    }
}