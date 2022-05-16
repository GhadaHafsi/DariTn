package com.example.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FurnitureControllerTest {

    TestRestTemplate restTemplate;
    URL base;
    @LocalServerPort
    int port;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        restTemplate = new TestRestTemplate();
        base = new URL("http://localhost:" + port);
    }

    @Test
    public void whenDescriptionIsNullThenBAD_REQUEST(){
           /* throws IllegalStateException, IOException {
        FurnitureDTO furnitureDTO = FurnitureDTO.builder().width(3.6).length(9.2)
                .description(null)
                .furnitureType(FurnitureType.BED)
                .imageURL("url/").build();
        ResponseEntity<String> response = restTemplate.postForEntity(
                base.toString() + "/api/furniture/create-new-furniture",
                furnitureDTO,
                String.class);
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());*/
    }

    @Test
    public void whenRequestBodyIsValidShouldBeCREATED() {
       /* BigDecimal price = new BigDecimal("34.12");
        FurnitureDTO furnitureDTO = FurnitureDTO.builder().price(price).width(3.6).length(9.2)
                .description("A good confortable bed")
                .furnitureType(FurnitureType.BED)
                .imageURL("urlimg").build();
        ResponseEntity<String> response = restTemplate.postForEntity(
                base.toString() + "/api/furniture/create-new-furniture",
                furnitureDTO,
                String.class);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());*/

    }

}
