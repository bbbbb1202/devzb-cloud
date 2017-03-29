package com.devzb.example.service;

import java.util.List;

import com.devzb.example.dao.model.KksTag;

public interface TagService {

	public List<KksTag> getTags();

	public void saveTag(KksTag kksTag);
}
