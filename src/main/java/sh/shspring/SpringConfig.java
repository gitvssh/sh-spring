package sh.shspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sh.shspring.repository.MemberRepository;
import sh.shspring.repository.MemoryMemberRepository;
import sh.shspring.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
