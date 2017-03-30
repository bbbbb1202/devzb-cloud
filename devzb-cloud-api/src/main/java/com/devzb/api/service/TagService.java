package com.devzb.api.service;

import java.util.List;

import com.devzb.api.dao.model.KksTag;

public interface TagService {

	public List<KksTag> getTags();

	public void saveTag(KksTag kksTag);
}
