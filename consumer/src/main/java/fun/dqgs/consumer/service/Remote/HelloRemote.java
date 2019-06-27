package fun.dqgs.consumer.service.Remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("producer")
public interface HelloRemote {
    @RequestMapping("/hello")
    public String Hello(@RequestParam(value = "name") String name);
}
