package org.blade.spring.dubbo.sample.rpc.impl;

import org.blade.spring.dubbo.sample.bean.Student;
import org.blade.spring.dubbo.sample.rpc.StudentService;
import org.springframework.stereotype.Service;


/**
 * 
 * @author blade
 *
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	public Student get() {
        return new Student("abc",1);
	}

}
