package org.JSON.PracticeProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MergeJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode node1 = objectMapper.readTree(new File("json1.json"));
            JsonNode node2 = objectMapper.readTree(new File("json2.json"));
            ObjectNode mergedJson = objectMapper.createObjectNode();
            mergedJson.setAll((ObjectNode) node1);
            mergedJson.setAll((ObjectNode) node2);
            objectMapper.writeValue(new File("mergedjson.json"), mergedJson);
            System.out.println(mergedJson);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
/*
Merge two JSON objects into one.

 */
