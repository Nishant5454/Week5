package org.JSON.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;

public class validateJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper=new ObjectMapper();
        try{
            JsonNode jsonNodeschema=objectMapper.readTree(new File("schema.json"));
            JsonNode jsonNodeuser=objectMapper.readTree(new File("user.json"));
            JsonSchemaFactory factory=JsonSchemaFactory.byDefault();
            JsonSchema schema= factory.getJsonSchema(jsonNodeschema);
            ProcessingReport processingReport=schema.validate(jsonNodeuser);
            if(processingReport.isSuccess()){
                System.out.println("Json is Validate");
            }
            else{
                System.out.println("Json is not Validate");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
