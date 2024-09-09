package com.homerunball.review.dao;

import com.homerunball.review.domain.ReviewDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReviewDaoImpl implements ReviewDao {
  @Autowired
  private SqlSession session;
  private static String namespace="com.homerunball.review.dao.ReviewDao.";

  @Override
  public int count() throws Exception {
    return session.selectOne(namespace+"selectCount");
  }

  /* 리뷰 게시물 전체 목록 읽기 */
  @Override
  public List<ReviewDto> allReview(String pd_id) throws Exception {
    return session.selectList(namespace+"selectAll", pd_id);
  }

  /* 리뷰 게시물 하나 읽기 */
  @Override
  public ReviewDto selectOne(String pd_id, Integer revw_id, Integer c_id) throws Exception {
    Map map = new HashMap();
    map.put("pd_id", pd_id);
    map.put("revw_id", revw_id);
    map.put("c_id", c_id);
    return session.selectOne(namespace+"selectOne", map);
  }

  /* 게시물 작성 */
  @Override
  public int insert(ReviewDto reviewDto) throws Exception {
    return session.insert(namespace+"reviewWriteOne", reviewDto);
  }

  /* 리뷰 한건 삭제 */
  @Override
  public int reviewDelete(String pd_id, Integer revw_id, Integer c_id) throws Exception {
    Map map = new HashMap();
    map.put("pd_id", pd_id);
    map.put("revw_id", revw_id);
    map.put("c_id", c_id);
    return session.delete(namespace+"deleteOne", map);
  }

  /* 리뷰 전체 삭제 */
  @Override
  public int deleteAll() throws Exception {
    return session.delete(namespace+"deleteAll");
  }

  /* 리뷰 수정 */
  @Override
  public int update(ReviewDto reviewDto) throws Exception {
    return session.update(namespace+"update");
  }
}
