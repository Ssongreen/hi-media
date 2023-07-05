package himedia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic") // class level mapping
public class BasicController {
	/**
	 * 문서 주석 Java Documentation Comment
	 * 
	 */

	/**
	 * view 저장 위치에 따른 웹 개발 종류
	 * 
	 * -------------------------------------------------------------------------------------
	 * 파일 					위치 							처리 
	 * 1.static content 		resources / static 				X
	 * 2.dynamic content 		resources /templates		ViewResolver 
	 * 3.API 					X 							HttpMessageConverter
	 * --------------------------------------------------------------------------------------
	 * 1. static content - 서버에서 파일을 그대로 웹 브라우저에 전송 - 파일 위치 : reources - static web
	 * page
	 * 
	 * 2. dynamic content - 서버에서 HTML을 동적 변경(처리) 하여 웹 브라우저에 전송 - 파일 위치 :
	 * resources/templates/{ViewName}.html - MVC : Model(data), view(html),
	 * controller(method, hander)
	 * 
	 * 3. API - JSON 포멧 형식으로 데이터 전송 - 객체를 넘길 수 있음 : HttpMessageCoverter
	 * 
	 */

	/**
	 * 2-1 MVC
	 * : handler level mapping
	 */
	@GetMapping("first-mvc")
	public String firstMvc() {
		return "/basic/first";	//논리적인 뷰 
	}
	
	//문제 bestsellser 요청에 대한 응답 페이지를 bestseller.htm 하시오
	@GetMapping("bestseller")
	public String bestseller() {
		return "/basic/book/bestseller";
	}
	/**
	 *  2-2 MVC 
	 *  :view template을 통해 데이터 표현
	 *  :template engine - thymeleaf
	 *  <body>
	 *	<h1>second 페이지 입니당</h1>
	 *	<p th:text= "${name}">이름</p>
	 * 	<p th:text= "${name} + '님 안녕하세요!'"></p>
	 *	</body>
	 */
	
	@GetMapping("second-mvc")
	public String secondMvc(Model model) {
		model.addAttribute("name", "홍길동");
		return "/basic/second";
	}
	
	
	
	/**
	 * 2-3 MVC
	 * : 쿼리 파라미터(query parameter)
	 * : 요청 -localhost:8080/third-mvc?fruit=사과
	 */
	
	
	@GetMapping("third-mvc")
	public String thirdMvc(@RequestParam("frult") String frult, 
			Model model){
		System.out.println("frult >>" + frult);
		System.out.println("요소 추가전 model >>" + model);
		//code
		model.addAttribute("frult", frult);
		System.out.println("요소 추가후 model >>" + model);
		return "/basic/third";
	}
	
	/**
	 * 문제 요청 - localhost:8080/frult?count=7&sort=딸기
	 * 쿼리 파라미터의 값을 quiz-frult-count 뷰에 표현 하시옹
	 *  @RequestParam 에 받은 키가 생략
	 */
//	int count = 10;
//	@GetMapping("frult")
//	public String frult(@RequestParam int count, Model model){
//		//code
//		
//		model.addAttribute("count", count);
//		return "quiz-frult-count";
//	}
	@GetMapping("frult")
	public String frult(@RequestParam int count, 
			@RequestParam ("sort") String sort, 
			Model model){
		//code
//		model.addAttribute("count", count);
//		model.addAttribute("sort", sort);
		
		model.addAttribute("sort", sort)
			.addAttribute("count", count);
		return "/basic/quiz-frult-count";
	}
	/**
	 * 3-1-1. API
	 * : String 전송
	 * @responseBody 는 문자열로 바로 출력되용
	 */
	@GetMapping("api-one")
	@ResponseBody
	public String apiOne() {
		return "return to ";
	}
	
	/**
	 * 3-1-2. API
	 * : String 전송
	 * 
	 */
	@GetMapping("api-test")
//	@ResponseBody
	public String apiTest() {
		return "test";
	}
	
	
	/**
	 * 3-2. API
	 * : Json 전송
	 * 
	 */
	@GetMapping("api-two")
	@ResponseBody
	public Student apiTwo(
			@RequestParam("name") String name ,
			@RequestParam("age") int age) {
		Student student = new Student();
		student.setAge(age);
		student.setName(name);
		
		return student;
	}
	class Student{
		private String name;
		private int age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
	
	
	
	
	
	
}
