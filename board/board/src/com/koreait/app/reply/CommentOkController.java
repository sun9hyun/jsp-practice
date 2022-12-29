package com.koreait.app.reply;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.koreait.app.Execute;
import com.koreait.app.Result;
import com.koreait.app.reply.dao.ReplyDAO;
import com.koreait.app.reply.vo.ReplyVO;

public class CommentOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		
		
		String replyContent = req.getParameter("replyContent");
		int boardNumber = Integer.valueOf(req.getParameter("boardNumber"));
		int memberNumber = Integer.valueOf(req.getParameter("memberNumber"));
		
	    ReplyDAO replyDAO = new ReplyDAO(); 
	    ReplyVO replyVO = new ReplyVO(); 
	
	    replyVO.setReplyContent(replyContent);
	    replyVO.setBoardNumber(boardNumber);
	    replyVO.setMemberNumber(memberNumber);
	    
	    replyDAO.insert(replyVO);
	    
		return null;
	}

}
