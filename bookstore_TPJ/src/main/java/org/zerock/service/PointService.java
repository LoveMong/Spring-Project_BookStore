package org.zerock.service;

import java.util.List;

import org.zerock.domain.Bs_PointVO;
import org.zerock.domain.PointSerchPD;

public interface PointService {
	public List<Bs_PointVO> read(String user_id);
	public List<Bs_PointVO> dateRead(PointSerchPD serchPD);
	public int dateReadCnt(PointSerchPD serchPD);
	public void insert(Bs_PointVO pVo);
		
}
