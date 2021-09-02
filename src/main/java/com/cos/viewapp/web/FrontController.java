package com.cos.viewapp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// RestContorller(데이터를 리턴한다)
// Controller - ViewResolver가 파일 리턴에 관여함
// 어노테이션 중에 위의 2가지는 DI를 할 수 없음
// 디스패쳐 서블릿 - 모든 컨트롤러를 관리

@Controller
public class FrontController {      // FrontController-서버실행시에 열림
   

   
   // http://localhost:8080/home
   // 디스패쳐 서블릿 /home 파싱
   // IoC 컨테이너에 @RestController, @Controller로 생성된 객체만 찾는다.
   // Method를 호출한다.
   

   @GetMapping("/home")
   public String home(Model model) {      // request == model
      // ViewResolver 클래스
      // src/main/resources/templates (prefix)
      // .mustache (suffix)
      
      String name = "조현래";
      model.addAttribute("name", name);
      
      List<Board> boards = new ArrayList<>();
      boards.add(new Board(1, "제목1"));
      boards.add(new Board(2, "제목2"));
      
      model.addAttribute("boards", boards);
      
      return "home"; // RequestDispatcher가 자동 작동
   }
}





//package com.cos.viewapp.web;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//// RestController (Data 를 Return 한다)
//// Controller     (File 을 Return 한다)
//
//@Controller
//public class FrontController {
//	
//	public FrontController() {
//		
//		
//		
//	}
//
//	// http://localhost:8080/home
//	// Dispatcher Servlet /home Parsing
//	// IoC Container 에 @RestController 와 @Controller 로 Creat 된 Object만 찾으면 된다
//	// Call Method  Method 를 Call 한다
//	
//	@GetMapping("/home")
//	public String home(Model model) { // request == model
//		// ViewResolver Class
//		// src/main/resources/templates (prefix)
//		// .mustache (suffix)
//		
//		String name = "여규호";
//		model.addAttribute("name",name);
//		
//		List<Integer> nums = new ArrayList<>();
//		nums.add(1);
//		nums.add(2);
//		nums.add(3);
//		
//		return "home"; // RequestDispatcher 가 Automatically Operating  자동 작동
//	}
//
//	@GetMapping("/home")
//	public String home1() {
//		return "home1";
//		
//	}
//
//}
