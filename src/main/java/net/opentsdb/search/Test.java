package net.opentsdb.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.opentsdb.utils.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Test {

    public static void main(String[] args) {
        // JsonNodeFactory nodeFactory = JsonNodeFactory.instance;
        // JsonNode tagNode = nodeFactory.textNode("a");
        // ((ObjectNode) tagNode).put("tagk", "tagv");
        //
        // ObjectMapper mapper = new ObjectMapper();
        //
        // // JsonNode rootNode = m.readTree(oldJsonString);
        // try {
        // String newJsonString = m.writeValueAsString(tagNode);
        // System.out.println(newJsonString);
        // } catch (JsonProcessingException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        ObjectMapper mapper = new ObjectMapper();

        String oldJsonString = "{\"version\":\"1.0\"}";

        try {




            Map<String, String> tagMap = new HashMap<String, String>();
            tagMap.put("host", "web1");
            tagMap.put("user", "3001");

            Map<String, Object> oldRootMap = mapper.readValue(oldJsonString, Map.class);

            oldRootMap.put("tags", tagMap);

            String newJsonString;

            newJsonString = mapper.writeValueAsString(oldRootMap);
            System.out.println(newJsonString);

        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
