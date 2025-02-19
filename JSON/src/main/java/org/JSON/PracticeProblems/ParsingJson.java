package org.JSON.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;

public class ParsingJson {
    public static void main(String[] args) throws Exception{
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            JsonNode jsonNode= objectMapper.readTree(new File("parsjson.json"));
            ArrayNode filteredArray=objectMapper.createArrayNode();
            if(jsonNode.isArray()) {
                for (JsonNode node : jsonNode) {
                    JsonNode agenode = node.get("Age");

                    if (agenode != null && agenode.asInt() > 25) {
                        filteredArray.add(node);
                    }
                }
            }
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("filteredJson.json"),filteredArray);
            System.out.println("Filtered data get written in seperate file");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
