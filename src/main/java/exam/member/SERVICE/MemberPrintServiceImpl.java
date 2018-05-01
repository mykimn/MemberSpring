package exam.member.SERVICE;

import exam.member.VO.MemberVo;

public class MemberPrintServiceImpl implements MemberPrintService {

	public void print(MemberVo member) {
		// 결과물 출력할 메시지
		System.out.printf("회원정보 : 아이디 = %d, 이메일 = %s, 이름 = %s, 비번 = %s "+ "등록일 = %tF\n",member.getId(),member.getEmail(),member.getName(),member.getPassword(),member.getRegisterDate());
	}
}
