package org.blade.spring.dubbo.sample;

import javax.annotation.Resource;

import org.blade.spring.dubbo.sample.bean.Student;
import org.blade.spring.dubbo.sample.rpc.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@EnableAutoConfiguration
@ImportResource({"classpath*:applicationContext-dubboServer.xml"})
public class SampleController {

	@Resource
	StudentService studentService;
	
    @RequestMapping("/")
    @ResponseBody
    Student home() {
    	
        return studentService.get();
    }
    
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}