package kounet.technologie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RefreshScope
@RestController
public class compagnieServiceRest {
@Value("${xparam}")
private int xparam;
    @Value("${yparam}")
    private int yparam;
    @Value("${me}")
    private String me;
    @GetMapping("/maconfiguration")
     public Map<String ,Object> myconfig(){
   Map<String,Object> map = new HashMap<>();
   map.put("xparam", xparam);
        map.put("yparam", yparam);
        map.put("me", me);
        map.put("thrad", Thread.currentThread().getName());
        return map;
     }

}
