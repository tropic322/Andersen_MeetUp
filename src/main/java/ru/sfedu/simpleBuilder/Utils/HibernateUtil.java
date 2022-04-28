package ru.sfedu.simpleBuilder.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import ru.sfedu.simpleBuilder.*;


import ru.sfedu.simpleBuilder.Utils.ConfigurationUtil;

import ru.sfedu.simpleBuilder.lab4.model.component.*;
import ru.sfedu.simpleBuilder.lab4.model.list.BuildingList;
import ru.sfedu.simpleBuilder.lab4.model.map.BuildingMap;
import ru.sfedu.simpleBuilder.lab4.model.set.BuildingSet;


import java.io.File;
import java.io.IOException;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static final Logger logger = LogManager.getLogger(HibernateUtil.class);

    public static SessionFactory getSessionFactory(String configFile) {
        logger.info("start getSessionFactory()");
        File file = new File(configFile);
        String consoleConfig = null;
        try {
            consoleConfig = ConfigurationUtil.getConfigurationEntry(Constants.DEFAULT_HBN_CFG);
        } catch (IOException e) {
            logger.error(e);
        }
        if (consoleConfig != null) {
            file = new File(consoleConfig);
        }
        if (!file.exists()) {
            file = new File(Constants.DEFAULT_HBN_CONFIG_PATH);
        }
        logger.debug("file name: " + file.getName());
        Configuration configuration = new Configuration().configure(file);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);



//        metadataSources.addAnnotatedClass(ClientEntity.class);
//        metadataSources.addAnnotatedClass(ExerciseEntity.class);
//        metadataSources.addAnnotatedClass(FeedbackEntity.class);
//        metadataSources.addAnnotatedClass(TrainerEntity.class);
//        metadataSources.addAnnotatedClass(WorkoutEntity.class);

       /* metadataSources.addAnnotatedClass(BuildingTemplate_JT.class);
        metadataSources.addAnnotatedClass(RoofMaterial_JT.class);
        metadataSources.addAnnotatedClass(MainPartMaterial_JT.class);
        metadataSources.addAnnotatedClass(BasementMaterial_JT.class);
        metadataSources.addAnnotatedClass(RoofTemplate_JT.class);
        metadataSources.addAnnotatedClass(MainPartTemplate_JT.class);
        metadataSources.addAnnotatedClass(BasementTemplate_JT.class);

        metadataSources.addAnnotatedClass(BuildingTemplate_MSC.class);
        metadataSources.addAnnotatedClass(RoofMaterial_MSC.class);
        metadataSources.addAnnotatedClass(MainPartMaterial_MSC.class);
        metadataSources.addAnnotatedClass(BasementMaterial_MSC.class);
        metadataSources.addAnnotatedClass(RoofTemplate_MSC.class);
        metadataSources.addAnnotatedClass(MainPartTemplate_MSC.class);
        metadataSources.addAnnotatedClass(BasementTemplate_MSC.class);

        metadataSources.addAnnotatedClass(RoofMaterial_ST.class);
        metadataSources.addAnnotatedClass(MainPartMaterial_ST.class);
        metadataSources.addAnnotatedClass(BasementMaterial_ST.class);
        metadataSources.addAnnotatedClass(RoofTemplate_ST.class);
        metadataSources.addAnnotatedClass(MainPartTemplate_ST.class);
        metadataSources.addAnnotatedClass(BasementTemplate_ST.class);
        metadataSources.addAnnotatedClass(BuildingTemplate_ST.class);

        metadataSources.addAnnotatedClass(RoofMaterial_PC.class);
        metadataSources.addAnnotatedClass(MainPartMaterial_PC.class);
        metadataSources.addAnnotatedClass(BasementMaterial_PC.class);
        metadataSources.addAnnotatedClass(RoofTemplate_PC.class);
        metadataSources.addAnnotatedClass(MainPartTemplate_PC.class);
        metadataSources.addAnnotatedClass(BasementTemplate_PC.class);
        metadataSources.addAnnotatedClass(BuildingTemplate_PC.class);*/

        metadataSources.addAnnotatedClass(MaterialComponent.class);
        metadataSources.addAnnotatedClass(BuildingComponent.class);
        metadataSources.addAnnotatedClass(BuildingList.class);
        metadataSources.addAnnotatedClass(BuildingMap.class);
        metadataSources.addAnnotatedClass(BuildingSet.class);



        sessionFactory = metadataSources.buildMetadata().buildSessionFactory();
        logger.info("end getSessionFactory()");
        return sessionFactory;
    }
}
