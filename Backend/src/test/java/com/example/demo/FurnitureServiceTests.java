package com.example.demo;

import com.example.demo.services.FurnitureService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FurnitureServiceTests {

    @Autowired
    private FurnitureService furnitureService;

    @Test
    void furnitureShouldBePersisted() {
        /*BigDecimal price = new BigDecimal("34.12");
        FurnitureDTO furnitureDTO = FurnitureDTO.builder().price(price).width(2.6).length(8.2)
                .description("A new confortable bed")
                .furnitureType(FurnitureType.BED)
                .imageURL("url").build();

        assertNotNull(furnitureService.save(furnitureDTO));*/

    }

    @Test
    void furnitureShouldBeUpdated() {
        /*BigDecimal price = new BigDecimal("34.12");
        FurnitureDTO furnitureDTO = FurnitureDTO.builder().price(price).width(3.6).length(9.2)
                .description("A good confortable bed")
                .furnitureType(FurnitureType.BED)
                .imageURL("urldeimage").build();
        Furniture furniture = furnitureService.save(furnitureDTO);
        furniture.setDescription("A not Confortable bed");
        assertEquals("A not Confortable bed", furnitureService.updateFurniture(furniture).getDescription());*/
    }

    @Test
    void furnitureShouldBeDeleted() {
        /*BigDecimal price = new BigDecimal("34.12");
        FurnitureDTO furnitureDTO = FurnitureDTO.builder().price(price).width(3.6).length(9.2)
                .description("A furniture that will be deleted")
                .furnitureType(FurnitureType.BED)
                .imageURL("urlimage").build();
        Furniture furniture = furnitureService.save(furnitureDTO);
        furnitureService.deleteFurniture(furniture.getIdFurniture());

        assertEquals(null, furnitureService.retrieveFurnitureById(furniture.getIdFurniture()));*/

    }

    @Test
    void furnitureListShouldNotBeEmpty() {
       /* BigDecimal price = new BigDecimal("34.12");
        FurnitureDTO furnitureDTO = FurnitureDTO.builder().price(price).width(3.6).length(9.2)
                .description("A good confortable bed")
                .furnitureType(FurnitureType.BED)
                .imageURL("nvurl").build();

        furnitureService.save(furnitureDTO);

        assertFalse(furnitureService.retrieveAllFurniture().isEmpty());*/

    }

}
