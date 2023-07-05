package himedia.second.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
// 라이브러리 추가해야 함
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import himedia.second.domain.Member;

//@Repository
public class JdbcMemberRepository  implements MemberRepository {
	
	private final DataSource dataSource;
	
	//생성자
	@Autowired
	public JdbcMemberRepository(DataSource dataSource) {
		this.dataSource = dataSource;
	}
		
	@Override
	public Member save(Member member) {
		String sql = "insert into member(name) values(?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection(); //연결 준비
			//연결 고리 설정
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//준비 값 설정 
			pstmt.setString(1, member.getName());
			//실행 , 테이블 변경 row 추가 
			pstmt.executeUpdate();
			//자동으로 생성 되는 키로 데이터를 받음
			rs = pstmt.getGeneratedKeys();
			//DB에 기록 될 때 , 한 문단까지만 받는다.
			if (rs.next()) {
				//아이디를 DB에서 결정 되어 있어서 ID만 출력
				member.setId(rs.getLong(1));
			} else {
				throw new SQLException("id 조회 실패");
			}
			return member;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}
	//자바 코드 작성  ########### spring boot 는 기본적인 key 값은 정의 함.
	@Override
	public Optional<Member> findById(Long id) {
		String sql = "select * from member where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				return Optional.of(member);
			} else {
				return Optional.empty();
			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}

	@Override
	public List<Member> findAll() {
		String sql = "select * from member";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Member> members = new ArrayList<>();
			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				members.add(member);
			}
			return members;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}

	@Override
	public Optional<Member> findByName(String name) {
		String sql = "select * from member where name = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				return Optional.of(member);
			}
			return Optional.empty();
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}

	private Connection getConnection() {
		return DataSourceUtils.getConnection(dataSource);
	}

	private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				close(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close(Connection conn) throws SQLException {
		DataSourceUtils.releaseConnection(conn, dataSource);
	}
}