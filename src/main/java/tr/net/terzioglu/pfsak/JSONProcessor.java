package tr.net.terzioglu.pfsak;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import tr.net.terzioglu.pfsak.module.JSONConfig;

public class JSONProcessor {

    public byte[] deserializeJSON(byte[] data, JSONConfig config) throws Exception {

        Configuration c = Configuration.defaultConfiguration().addOptions(Option.ALWAYS_RETURN_LIST);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);

        List<Object> jsonNode = JsonPath.compile(config.getJSonData()).read(inputStream, c);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        for (Object o : jsonNode) {

            if (o instanceof Map) {
                arrayOutputStream.write(new JSONObject((Map<String, ?>) o).toJSONString().getBytes("UTF-8"));
            } else if (o instanceof JSONArray) {
                arrayOutputStream.write(((JSONArray) o).toJSONString().getBytes("UTF-8"));

            } else {
                arrayOutputStream.write(o.toString().getBytes("UTF-8"));
            }
        }
        return arrayOutputStream.toByteArray();

    }

}
