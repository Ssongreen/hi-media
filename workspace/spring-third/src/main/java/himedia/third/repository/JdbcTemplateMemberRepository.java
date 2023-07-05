package himedia.third.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import himedia.third.domain.Member;

@Primary
@Repository
public class JdbcTemplateMemberRepository implements MemberRepository{
	private final JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateMemberRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	private RowMapper<Member> memberRowMapper(){
		
		return (rs, rowNum) -> {
			Member member = new Member();
			member.setId(rs.getLong("id"));
			member.setName(rs.getString("name"));
			return member;
		
};
		}
	
	
	@Override
	public Member save(Member member) {
		//insert 실행 
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		// 자동으로 생성 되는 값 지정
		jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");
		
		// memberTable에 저장할 데이터를 HashMap에 저장해용
		// 컬럼이 여러 가지 일 수 있기에 OBJECT 사용!
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("name", member.getName());
//		parameters.put("age", member.getAge());
//		parameters.put("adrress", member.getAdrress());
		
		// key에 변수로 넣고 실제적인 쿼리 실행은 요기서 된다 아래에서 비교
		Number key = jdbcInsert.executeAndReturnKey(parameters);
		//객체에 넘어 온 값을 타입 지정 해용 key.STH
		member.setId(key.longValue());
		
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		//파라 미터 변수 값 설정을 마지막에 넣어주세용
		List<Member> result = jdbcTemplate.query("select*from member where id = ?", memberRowMapper(), id);
		return result.stream().findAny();
	}

	@Override
	public Optional<Member> findByName(String name) {
		List<Member> result = jdbcTemplate.query("select*from member where name like?", memberRowMapper(), name);
		return result.stream().findAny();
	}

	@Override
	public List<Member> findAll() {
		return jdbcTemplate.query("select*from member", memberRowMapper());
	}
	
}
