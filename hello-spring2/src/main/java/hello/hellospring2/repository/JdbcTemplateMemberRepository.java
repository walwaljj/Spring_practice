package hello.hellospring2.repository;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import hello.hellospring2.domain.Member;

public class JdbcTemplateMemberRepository implements MemberRepository{

	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcTemplateMemberRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Member save(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Member> findByName(String name) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
