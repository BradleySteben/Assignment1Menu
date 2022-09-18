package com.example.drinksservice;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.junit.jupiter.api.Assertions.*;
@ContextConfiguration("/applicationContext.xml")
@ExtendWith(SpringExtension.class)
@WebMvcTest(DrinkController.class)
class DrinkControllerTest {

    @Test
    void hello(){
        DrinkController controller = new DrinkController();
        String response = controller.hello("fred");
        assertEquals("Hello fred", response);
    }
    @Autowired
    private MockMvc mvc;

    @Test
    void retrieveDrinkValue() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/drinks/id/1");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("pepsi",result.getResponse().getContentAsString());
    }

    @Test
    void deleteById() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/drinks/delete/id/1");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("deleted",result.getResponse().getContentAsString());
    }
}