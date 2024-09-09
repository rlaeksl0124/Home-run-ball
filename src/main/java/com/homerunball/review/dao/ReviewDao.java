package com.homerunball.review.dao;

import com.homerunball.review.domain.ReviewDto;

import java.util.List;

public interface ReviewDao {
    int count() throws Exception;

    /* 리뷰 게시물 전체 목록 읽기 */
    List<ReviewDto> allReview(String pd_id) throws Exception;

    /* 리뷰 게시물 하나 읽기 */
    ReviewDto selectOne(String pd_id, Integer revw_id, Integer c_id) throws Exception;

    /* 게시물 작성 */
    int insert(ReviewDto reviewDto) throws Exception;

    /* 리뷰 한건 삭제 */
    int reviewDelete(String pd_id, Integer revw_id, Integer c_id) throws Exception;

    /* 리뷰 전체 삭제 */
    int deleteAll() throws Exception;

    /* 리뷰 수정 */
    int update(ReviewDto reviewDto) throws Exception;
}
