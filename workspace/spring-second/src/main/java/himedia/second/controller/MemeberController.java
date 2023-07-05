package himedia.second.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import himedia.second.domain.Member;
import himedia.second.domain.MemberForm;
import himedia.second.domain.NewMember;
import himedia.second.service.MemberService;

@Controller
public class MemeberController {
	// [service를 만들기 위함]
	// 첫번째 방법
//	private final MemberService memberService = new MemberService();
	// 두번째 방법
	// 생성자
	private final MemberService memberService;

	// DI (dependency Injection) 의존성 주입
	// 생성자를 통한 의존성 주입..
	// Bean을 자동 주입
	// 객체 생성이 외부에서 결정
	// 모듈간(작성이된 class파일)의 결합도가 낮아지고 유연성이 높아짐
	@Autowired
	public MemeberController(MemberService memberService) {
		System.out.println("MemberController 실행");
		this.memberService = memberService;
	}

	@GetMapping("/member/new")
	public String form() {
		return "/member/new-form";
	}

	@PostMapping("/member/new")
	public String crate(MemberForm form) {
		System.out.println("post 이름 >>> " + form.getName());

		// service code
		Member member = new Member();
		member.setName(form.getName());
		memberService.join(member);
		return "redirect:/";
	}

	@GetMapping("/member/list")
	public String list(Model model) {
		List<Member> members = memberService.findMember();
		model.addAttribute("members", members);
		return "/member/member-list";
	}


////방법 1 ###
//	@GetMapping("/member/search")
//	public String memberSearch(@RequestParam(name = "id", required = false) Long id, 
//						@RequestParam(name = "name") String name,
//						@RequestParam String name,
//						String name, name의 파라미터 키가 있어야 축약가능
//			Model model) {
//
//		System.out.println("id check ~ " + id);
//		System.out.println("name check ~ " + name);
//		Member member = new Member(); //빈객체
//
//		// service 객체을 가져와야 됨
////		Optional<Member> member = memberService.findId(id);
//		if (id != null) {
//			member = memberService.findId(id).get();
//		}else if(!name.isEmpty()){
//			member = memberService.findName(name).get();
//		}
//	
//		System.out.println("controller member >>" + member);
//		model.addAttribute("member", member);
//		
//		return "/member/search";
//	}

////방법 1 ###
//	형태 1
//	@GetMapping("/member/search")
//	public String memberSerch(@RequestParam(name = "id", required = false) Long id, 
//						@RequestParam(name = "name") String name,
//			Model model) {

//		Member member = new Member(); //빈객체

//		// service 객체을 가져와야 됨
//		if (id != null) {
//			member = memberService.findId(id).get();
//		}else if(!name.isEmpty()){
//			member = memberService.findName(name).get();
//		}
//		model.addAttribute("member", member);
//		
//		return "/member/search";
//	}

// 형태 2
//	@GetMapping("/member/search")
//	public String memberSerch(@RequestParam(name = "id", required = false) Long id, 
//				String name, 
//				Model model) {
//
//		Member member = new Member(); //빈객체
//
//		// service 객체을 가져와야 됨
//		if (id != null) {
//			member = memberService.findId(id).get();
//		}else if(!name.isEmpty()){
//			member = memberService.findName(name).get();
//		}
//		model.addAttribute("member", member);
	
	
	/**
	 * 방법 2 reflection [리플렉션 기법] view >> controller 자동으로 setter 실행 -->> 데이터 자동 처리
	 * 
	 * [parameter] 에 사용되는 @ModelAttribute 와 model 차이
	 * 
	 * @modelAttribute : view -> controller로 데이터 넘어 올떄때 MOdel : controller -> view로
	 *                 데이터 넘길 때
	 */
	// 형태 1

//	@GetMapping("/member/search")
//	public String memberSearch(@ModelAttribute NewMember member , Model model) {
//		
//		System.out.println("member : id >>" + member.getId());
//		System.out.println("member : name >>" + member.getName());
//		Member searchMember =new Member();
//		System.out.println("member.getname() >> " + "".equals(member.getName()));
//		
//		
//		if (member.getId() != null) 
//			searchMember = memberService.findId(member.getId()).get();
//		else if(!member.getName().isEmpty())
//			searchMember = memberService.findName(member.getName()).get();
//		model.addAttribute("member", searchMember);
//		
//		return "member/search";
//	}
//}
	
	
	
	// [형태 2]
	// --------------------------------------------------------------------------------
	@GetMapping("/member/search")
	public String memberSearch(NewMember member, Model model) {
//			Member searchMember = new Member();	// 빈 객체

		// if(member.getId() != null)
		// searchMember = memberService.findId(member.getId()).get();
		// else if(!member.getName().isEmpty())
		// searchMember = memberService.findName(member.getName()).get();

		// model.addAttribute("member", searchMember);
		// return "member/search";
		// Optional<Member> searchMember = Optional.empty();
		// if(member.getId() != null)
		// searchMember = memberService.findId(member.getId());
		// else if (!member.getName().isEmpty())
		// searchMember = memberService.findName(member.getName());

		// if(searchMember.isPresent())
		// model.addAttribute("member", searchMember.get());
		// else
		// model.addAttribute("member", new Member());
		// return "/member/search";

		Optional<Member> searchMember = Optional.empty();
		if (member.getId() != null)
			searchMember = memberService.findId(member.getId());
		else if (!member.getName().isEmpty())
			searchMember = memberService.findName(member.getName());

		if (searchMember.isPresent())
			model.addAttribute("member", searchMember.get());
//		 else
//		 model.addAttribute("member", new Member());
		return "/member/search";

	}
}