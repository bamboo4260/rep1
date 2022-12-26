package kr.co.yangdoll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.yangdoll.dao.MemberDAO;
import kr.co.yangdoll.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDAO dao;
	
	public MemberVO getMember(String memId,String memPwd){
	MemberVO vo= null;
	vo=dao.getMember(memId);
	if(vo!=null){if(memPwd.equals(vo.getMemPwd()))return vo;}
	
	return null;}


	/*
	 * @Override public MemberVO getMember() {
	 * 
	 * MemberVO vo=null; vo=dao.getMember(memId);
	 * if(vo!=null){if(memPwd.equals(vo.getMemPwd()))return vo;}
	 * 
	 * return null; }
	 */
}
