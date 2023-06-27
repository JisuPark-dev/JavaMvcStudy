package hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save(){
        //given
        Member member = new Member("jisu", 20);

        //when
        Member save = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(save.getId());
        org.assertj.core.api.Assertions.assertThat(findMember).isEqualTo(save);


    }
    


}