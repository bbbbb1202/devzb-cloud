package com.devzb.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devzb.api.dao.model.KksTag;
import com.devzb.api.service.TagService;
import com.devzb.framework.web.BaseController;

/**
 * 用户controller
 * 
 * @author zhangbin
 *
 */
@RestController
@RequestMapping("tag")
public class TagController extends BaseController {

	@Autowired
	private TagService tagService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<KksTag> readTags() {
		return tagService.getTags();
	}

	@RequestMapping(value = "save")
	public void saveTag(KksTag kksTag) {
		tagService.saveTag(kksTag);
	}
}
