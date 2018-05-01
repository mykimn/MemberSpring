package exam.member.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exam.member.VO.MemberVo;

public class MemberDaoImpl implements MemberDao {

	private static long nextId = 0; // 정적(클래스멤버), id가 증가할때
	// 데이터 저장할떄, 초기화할때 맵 이용
	private Map<String,MemberVo> map = new HashMap<String,MemberVo>();
	@Override
	public MemberVo selectByEmail(String email) {
		return map.get(email);
		// email 키에 대한 값 얻기
	}

	@Override
	public void insert(MemberVo member) {
		member.setId(++nextId); // 등록되는 id값 설정 --> 1234식으로
		map.put(member.getEmail(), member); // map에 값 추가 삽입
	}

	@Override
	public void update(MemberVo member) {
		map.put(member.getEmail(), member);
	}

	@Override
	public Collection<MemberVo> selectAll() {
		return map.values(); // map에 있는 값 모두 출력
	}

}
