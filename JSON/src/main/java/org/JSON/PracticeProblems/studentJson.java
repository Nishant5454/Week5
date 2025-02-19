
package org.JSON.PracticeProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class studentJson {
    public static void main(String[] args) {
        JSONArray skiils=new JSONArray();

        skiils.put("Java");
        skiils.put("SpringBoot");
        skiils.put("Hibernet");
        JSONObject object=new JSONObject();
        object.put("name","Nishant");
        object.put("age",12);
        object.put("Subjects",skiils);

        System.out.println(object.toString());



    }
}
/*
Create a JSON object for a Student with fields: name, age, and subjects (array).

 */
