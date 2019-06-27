package fun.dqgs.consumer.service.Hystrix;

import fun.dqgs.consumer.service.Remote.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String Hello(String name) {
        return "hello "+name+",this message send failed";
    }
}
