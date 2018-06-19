package com.sungyeh.web;

import com.sungyeh.domain.Feature;
import com.sungyeh.domain.GeoJson;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GisController {
    @RequestMapping("/gis")
    public String test(){
        return "gis.html";
    }
    @RequestMapping("/road")
    public String road(){
        return "road-gis.html";
    }
    @GetMapping("/marker")
    @ResponseBody
    public GeoJson marker(){
        GeoJson geoJson=new GeoJson();

        List<Feature> features=new ArrayList<>();

        for(int i=0;i<3;i++){
            Feature feature=new Feature();
            double j=i*0.05;
            Map<String,Object> map1=new HashMap<>();
            map1.put("type","Point");
            double double1=120.474307+j;
            double double2=23.972969+j;
            map1.put("coordinates", new double[]{double1, double2});
            feature.setGeometry(map1);
            Map<String,String> map2=new HashMap<>();
            map2.put("icon","https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png");
            feature.setProperties(map2);
            feature.setType("Feature");
            features.add(feature);
        }
        for(int i=0;i<3;i++){
            Feature feature=new Feature();
            double j=i*0.05;
            Map<String,Object> map1=new HashMap<>();
            map1.put("type","Point");
            double double1=120.454307-j;
            double double2=23.972969-j;
            map1.put("coordinates", new double[]{double1, double2});
            feature.setGeometry(map1);
            Map<String,String> map2=new HashMap<>();
            map2.put("icon","http://localhost:8090/icon");
            feature.setProperties(map2);
            feature.setType("Feature");
            features.add(feature);
        }

        geoJson.setFeatures(features);
        geoJson.setType("FeatureCollection");
        return geoJson;
    }
    @RequestMapping(value = "/icon")
    public void getImage(HttpServletResponse response) throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/img/Disqus-1s-20px.gif");

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }
}
