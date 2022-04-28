package ru.sfedu.simpleBuilder;


import ru.sfedu.simpleBuilder.lab4.api.DataProvider;
import ru.sfedu.simpleBuilder.lab4.api.IDataProvider;
import ru.sfedu.simpleBuilder.lab4.model.set.BuildingSet;

import java.util.*;

/**
 * Hello world!
 *
 */
public class YourApi
{
    public static void main( String[] args )
    {
        IDataProvider dp = new DataProvider();
       /* Set<MaterialComponent> smc = new HashSet<>();
        MaterialComponent mc1 = new MaterialComponent("12222","test");
        smc.add(mc1);
        mc1 = new MaterialComponent("022222","abc");
        smc.add(mc1);
        BuildingComponent bc = new BuildingComponent(smc);
        dp.insert(bc);*/


        /*List<String> list= new ArrayList<>();
        list.add("test_list");
        list.add("test_list2");
       list.add("test_list3");
       BuildingList bl = new BuildingList(list);
       dp.insert(bl);*/



        Set<String> materialss = new HashSet<>();
        materialss.add("testset1");
        materialss.add("testset2");
        BuildingSet Buildings = new BuildingSet(materialss);
        dp.insert(Buildings);

        /*        Map<String, String> materials = new HashMap<>();
        materials.put("testmap1", "aaa");
        materials.put("testmap2", "bb");
        BuildingMap Building = new BuildingMap(materials);
        //dp.insert(Building);
        HibernateDataProvider5 hp5 = new HibernateDataProvider5();

        Template Template = new Template(13L, 60);
        Template Template1 = new Template(23L, 50);
        Material Material = new Material(13L, "name", "form", "date");
        BuildingTemplate buildingTemplate = new BuildingTemplate(13L);

        Template.setBuildingTemplate(buildingTemplate);
        Template1.setBuildingTemplate(buildingTemplate);
        Set<Template> Templates = new HashSet<>();
        Templates.add(Template);
        Templates.add(Template1);
        buildingTemplate.setName("name");
        buildingTemplate.setMaterial(Material);
        buildingTemplate.setTemplates(Templates);*/
       // hp5.insert(buildingTemplate);
       // CriteriaDataProvider5 criteriaDP = new CriteriaDataProvider5();
       // System.out.println( criteriaDP.getById(buildingTemplate.getId()).get());

       // dp.insert(Buildings);

        //Building.setMaterials(materials);

        /*BuildingTemplate_JT b = new BuildingTemplate_JT("test",2,1,1,1,1,1);
        RoofMaterial_JT rm = new RoofMaterial_JT(228,"test",1,1);
        dp.insert(rm);
        System.out.println(dp.getById(RoofMaterial_JT.class, rm.getId()));
        RoofMaterial_JT rm1 = new RoofMaterial_JT(228,"test1",12,12);
        //dp.update(rm1);
        MainPartMaterial_JT mm = new MainPartMaterial_JT("test",1,1);
        BasementMaterial_JT bm = new BasementMaterial_JT("test1",1,1,1);
        RoofTemplate_JT rt = new RoofTemplate_JT("test2",1,true,true);
        MainPartTemplate_JT mt = new MainPartTemplate_JT("test3",1,true,1);
        BasementTemplate_JT bt = new BasementTemplate_JT("test4",1,true);*/
       // dp.insert(b);

       //
        //MainPartMaterial mm = new MainPartMaterial("test",1,1);
        //BasementMaterial bm = new BasementMaterial("test1",1,1,1);
        //RoofTemplate rt = new RoofTemplate("test2",1,true,true);
        //MainPartTemplate mt = new MainPartTemplate("test3",1,true,1);
        //BasementTemplate bt = new BasementTemplate("test4",1,true);
        /*RoofMaterial_MSC rm = new RoofMaterial_MSC("test",1,1);
        MainPartMaterial_MSC mm = new MainPartMaterial_MSC("test",1,1);
        BasementMaterial_MSC bm = new BasementMaterial_MSC("test1",1,1,1);
        RoofTemplate_MSC rt = new RoofTemplate_MSC("test2",1,true,true);
        MainPartTemplate_MSC mt = new MainPartTemplate_MSC("test3",1,true,1);
        BasementTemplate_MSC bt = new BasementTemplate_MSC("test4",1,true);*/
        //RoofMaterial_JT bm = new RoofMaterial_JT(100,"test",1,1);
        //dp.insert(bm);
       // dp.delete(bm);
/**/
       /* BuildingTemplate_PC b= new BuildingTemplate_PC("test",2,1,1,1,1,1);
        RoofMaterial_PC rm = new RoofMaterial_PC(1,"test",1,1);
        dp.insert(rm);
       MainPartMaterial_PC mm = new MainPartMaterial_PC(1,"test",1,1);
        dp.insert(mm);
        BasementMaterial_PC bm = new BasementMaterial_PC(1,"test1",1,1,1);
        dp.insert(bm);
        RoofTemplate_PC rt = new RoofTemplate_PC(2,"test2",1,true,true);
        dp.insert(rt);
        MainPartTemplate_PC mt = new MainPartTemplate_PC(1,"test3",1,true,1);
        dp.insert(mt);
        BasementTemplate_PC bt = new BasementTemplate_PC(1,"test4",1,true);

        dp.insert(bt);
        dp.insert(b);*/
       // System.out.println(dp.getById(BasementTemplate_PC.class, b.getId()));




        /*RoofTemplate_ST rt = new RoofTemplate_ST("test2",1,true,true);
       // dp.insert(rt);
      //  MainPartTemplate_ST mt = new MainPartTemplate_ST("test3",1,true,1);
       // dp.insert(mt);
        BasementTemplate_ST bt = new BasementTemplate_ST("test4",1,true);
       // dp.insert(bt);
        RoofMaterial_ST rm = new RoofMaterial_ST("test",1,1);
       // dp.insert(rm);
        MainPartMaterial_ST mm = new MainPartMaterial_ST("test",1,1);
       // dp.insert(mm);
        BasementMaterial_ST bm = new BasementMaterial_ST("test1",1,1,1);
        //dp.insert(bm);
        BuildingTemplate_ST b = new BuildingTemplate_ST("test",2,1,1,1,1,1);
        dp.insert(b);*/
     /*   BuildingTemplate_MSC b = new BuildingTemplate_MSC("test",2,1,1,1,1,1);
        RoofMaterial_MSC rm = new RoofMaterial_MSC("test",1,1);
        MainPartMaterial_MSC mm = new MainPartMaterial_MSC("test",1,1);
        BasementMaterial_MSC bm = new BasementMaterial_MSC("test1",1,1,1);
        RoofTemplate_MSC rt = new RoofTemplate_MSC("test2",1,true,true);
        MainPartTemplate_MSC mt = new MainPartTemplate_MSC("test3",1,true,1);
        BasementTemplate_MSC bt = new BasementTemplate_MSC("test4",1,true);
        IDataProvider provider = new DataProvider();*/

       // provider.insert(rm);
       // provider.insert(mm);
      // provider.insert(bm);
        //provider.insert(rt);
       // provider.insert(mt);
       // provider.insert(bt);
       // provider.insert(b);
       // dp.insert(rt);
        //dp.insert(mt);
       // dp.insert(bt);
       // dp.insert(bt);
    }
}
