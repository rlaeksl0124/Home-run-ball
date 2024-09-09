package com.homerunball.review.dao;

import com.homerunball.cart.dao.CartDao;
import com.homerunball.customer.dao.CustDao;
import com.homerunball.review.domain.ReviewDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ReviewDaoTest {
    @Autowired
    private ReviewDao reviewDao;
    private CartDao cartDao;

    @Test
    public void count() throws Exception {
        reviewDao.deleteAll();
        assertTrue(reviewDao.count()==0);

        ReviewDto review = new ReviewDto("APP000003-04", 100017, "revw content", "revw file num", 3);
        assertTrue(reviewDao.insert(review)==1);
        assertTrue(reviewDao.count()==1);
        System.out.println(reviewDao.allReview("APP000003-04"));

        assertTrue(reviewDao.insert(review)==1);
        assertTrue(reviewDao.count()==2);

    }

    /* 리뷰 게시물 전체 목록 읽기 */
    @Test
    public void allReview() throws Exception{
        reviewDao.deleteAll();
        assertTrue(reviewDao.count()==0);

        List<ReviewDto> list = reviewDao.allReview("APP000003-04");
        assertTrue(list.size()==0);

        ReviewDto review1 = new ReviewDto("APP000003-04", 100017, "revw content", "revw file num", 3);
        assertTrue(reviewDao.insert(review1)==1);
        System.out.println(review1);
        System.out.println(reviewDao.count());
        assertTrue(list.size()==1);


        ReviewDto review2 = new ReviewDto("APP000003-04", 100017, "revw content", "revw file num", 3);
        assertTrue(reviewDao.insert(review2)==1);

        assertTrue(list.size()==2);

        System.out.println(list);



    }

    @Test
    public void selectReviewOne() {
    }

    @Test
    public void reviewWrite() {
    }

    @Test
    public void reviewDelete() {
    }

    @Test
    public void reviewDeleteAll() {
    }

    @Test
    public void reviewUpdate() {
    }
}