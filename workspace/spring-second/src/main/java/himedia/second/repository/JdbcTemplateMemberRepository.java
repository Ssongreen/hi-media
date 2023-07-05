package himedia.second.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import himedia.second.domain.Member;

/**
 * JDBC : Java Database Connectivity API 타입이다. Spring boot JDBC
 *
 */

@Repository
public class JdbcTemplateMemberRepository implements MemberRepository{
	private final JdbcTemplate jdbcTemplate;

	public JdbcTemplateMemberRepository(DataSource dataSource) {
		System.out.println("JdbcTemplateMemberRepository 실행");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	private RowMapper<Member> memberRowMapper() {
		return new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				return member;
			}
		};

	}

	@Override
	public Member save(Member member) {
		//데이터 저장을 쉽게 하는 insert 
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		// name 찾기 . 자동으로 생성 되는 값 지정
		jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");
		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("name", member.getName());
		
		Number key = jdbcInsert.executeAndReturnKey(parameters);
		System.out.println("[save method] DB에 데이터 저장후 리턴 받은 key >>" + key);
		member.setId(key.longValue());
		
		
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		List<Member> result = jdbcTemplate.query("select * from member where id = ?" , memberRowMapper(), id);
		// 방법 1 for문 사용
//		for(Member member : result) {
//			if(member.getId().equals(id)) {
//				return Optional.of(member);
//		}
//		}
//		System.out.println(" 실행 되용 ?");
//		return Optional.empty();
		
		
		//방법 2 
		return result.stream()
				.findAny();
	}

	@Override
	//문제 
	public Optional<Member> findByName(String name) {
		List<Member> result = jdbcTemplate.query("select * from member where name = ?", memberRowMapper(), name);
		return result.stream().findAny();
		
	}
	@Override
	public List<Member> findAll() {
		return jdbcTemplate.query("select * from member", memberRowMapper());
	}

}
