package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Criteria;
import com.example.domain.ReplyVO;
import com.example.mapper.ReplyMapper;

import lombok.extern.java.Log;

@Service
@Log
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyMapper mapper;
	
	@Override
	public int register(ReplyVO vo) {
		
		log.info("register........." + vo);
		
		return mapper.insert(vo);
	}
	
	@Override
	public ReplyVO get(Long rno) {
		
		log.info("get............" + rno);
		
		return mapper.read(rno);
	}

	@Override
	public int modify(ReplyVO vo) {
		
		log.info("modify............" + vo);
		
		return mapper.update(vo);
	}

	@Override
	public int remove(Long rno) {
		
		log.info("remove.............." + rno);
		
		return mapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		
		log.info("get Reply List of a Board " + bno);
		
		return mapper.getListWithPaging(cri, bno);
//		return List<ReplyVO>	
	}
	

}
