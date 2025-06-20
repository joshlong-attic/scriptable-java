//usr/bin/env jbang  "$0" "$@" ; exit $?
//SOURCES script@scratches
//PREVIEW
//DEPS org.springframework.boot:spring-boot-starter-web
//JAVA 25

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
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

@Component
static class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, World!");
    }
}


void main(String[] args) {
   SpringScript.run(args);
}
