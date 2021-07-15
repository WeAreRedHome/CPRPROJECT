package com.CPR.redHome.service.admin.member;

import com.CPR.redHome.dto.member.MemberDto;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;

public interface MemberAdminService {

    // 전체 회원 조회
    List<MemberDto> selectAllMembers();

    // memberId로 회원 조회
    MemberDto selectMemberById(int memberId);

    // 수정된 member update
    void updateMember(MemberDto memberDto);

    // @@@@@@@ 회원 통계 @@@@@@@@
    // 연령대 별 회원 수 조회
    JSONObject selectMemberByAge();

    // 지역 별 회원 수 조회
    JSONObject selectMemberByLocation();

    // 등급 별 회원 수 조회
    JSONObject selectMemberByGrade();


}