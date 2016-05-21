package com.study.repository.mybatis;

import com.study.domain.cnu.CnuPost;
import com.study.domain.cnu.CnuPostComment;
import com.study.domain.jpa.JpaBoard;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CnuRepository {
   List<CnuPost> selectCnuPostList();
   List<CnuPostComment> selectCnuPostCommentList();



   int insertCnuPost(CnuPost obj);
   int insertCnuPostComment(CnuPostComment obj);

   CnuPost selectCnuBoard(int postId);
   int updateCnuBoard(CnuPost obj);
   int deleteCnuBoard(int postId, String password);
}