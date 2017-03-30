
package com.devzb.api.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devzb.api.dao.mapper.KksTagMapperExt;
import com.devzb.api.dao.model.KksTag;
import com.devzb.api.dao.model.KksTagExample;
import com.devzb.api.service.TagService;

@Service
public class TagServiceImpl implements TagService {
	@Autowired
	private KksTagMapperExt kksTagMapperExt;

	@Override
	public List<KksTag> getTags() {
		KksTagExample example = new KksTagExample();
		example.setOrderByClause("id desc limit 10");
		return kksTagMapperExt.selectByExample(example);
	}

	@Override
	@Transactional
	public void saveTag(KksTag kksTag) {
		kksTag.setId("b");
		kksTag.setName("测试");
		kksTag.setTag("a,b,c");
		kksTag.setUserId("1");
		kksTag.setGmtCreated(new Date());
		kksTag.setGmtModified(new Date());

		kksTagMapperExt.insertSelective(kksTag);

		int a = 1;
		int b = 2;

		if (a == b) {
			throw new RuntimeException("Test Transactional");
		}
	}

}
