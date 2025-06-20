//usr/bin/env jbang  "$0" "$@" ; exit $?
//SOURCES script@scratches
//PREVIEW
//DEPS org.springframework.boot:spring-boot-starter-web
//JAVA 25

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
static class HelloController {

    @GetMapping("/hi")
    Map<String, String> hello() {
        return Map.of("message", "hi");
    }
}

@Bean
ApplicationRunner standalone() {
    return _ -> System.out.println("standalone!");
}

void main(String[] args) {
    SpringScript.run(args);
}
