package com.koreait.app.reply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.app.Execute;
import com.koreait.app.Result;
import com.koreait.app.reply.dao.ReplyDAO;
import com.koreait.app.reply.vo.ReplyVO;

public class UpdateOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");

		ReplyDAO replyDAO = new ReplyDAO();
		ReplyVO replyVO = new ReplyVO();
		
		String replyContent = req.getParameter("replyContent");
		int replyNumber = Integer.valueOf(req.getParameter("replyNumber"));
		
		replyVO.setReplyContent(replyContent);
		replyVO.setReplyNumber(replyNumber);
		
		replyDAO.update(replyVO);
		
		return null;
	}

}
