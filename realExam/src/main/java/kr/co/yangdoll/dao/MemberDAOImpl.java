package kr.co.yangdoll.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.yangdoll.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession session;

	@Override
	public MemberVO getMember(String memId) {
		return session.selectOne("kr.co.yangdoll.dto.MemberDAO.getMember" , memId);
	}
}
