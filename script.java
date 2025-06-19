//usr/bin/env jbang "$0" "$@" ; exit $?
//SOURCES script@scratches
//PREVIEW
//JAVA 25

import org.springframework.context.annotation.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.*;


// FILES src/main/resources/application.properties


@Component
static class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, World!");
    }
}


void main(String[] args) {
    ScriptRun.from(Runner.class).run(args);
}
