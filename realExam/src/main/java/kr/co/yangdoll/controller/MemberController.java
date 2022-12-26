package kr.co.yangdoll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.yangdoll.service.MemberService;
import kr.co.yangdoll.vo.MemberVO;

@Controller
@RequestMapping(value = "/member/")
public class MemberController {

	@Autowired
	MemberService service;

	/*
	 * @RequestMapping(value = "/login") public String login(String memId, String
	 * memPwd) {
	 * 
	 * MemberVO vo= service.getMember(memId, memPwd); return "mem/login" ; }
	 */

	/*
	 * @RequestMapping(value="/loginA") public String loginA(){ return }
	 */
	//
	/*
	 * @PostMapping(value = "/login") public String loginProc(String memId, String
	 * memPwd, HttpSession session) { MemberVO vo = service.getMember(memId);
	 * session.setAttribute("userInfo", vo); return "home"; }
	 */
	/*
	 * @RequestMapping(value = "/insertForm") public void insertForm() { return ; }
	 * 
	 * @RequestMapping(value = "/insertMember") public void insertMember() { return
	 * ; }
	 * 
	 * @RequestMapping(value = "/updateForm") public void updateForm() { return ; }
	 * 
	 * @RequestMapping(value = "/updateMember") public void updateMember() { return
	 * ; }
	 * 
	 * @RequestMapping(value = "/getMember") public void getMember() { return ; }
	 * 
	 * @RequestMapping(value = "/memManagement") public void memManagement() {
	 * return ; }
	 */
}
