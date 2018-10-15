package com.altran.liferay.hook.indexer;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexerPostProcessor;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.model.User;

public class UserPostIndexer extends BaseIndexerPostProcessor {

	private static final Log LOGGER = LogFactoryUtil.getLog(UserPostIndexer.class);
	
	public void postProcessDocument(Document document, Object object) throws Exception {
		
		try {
			User userEntity = (User) object;
			String indexerUserTitle = userEntity.getJobTitle();
			if (indexerUserTitle.length() > 0){
				document.addText(Field.TITLE, indexerUserTitle);
			}
		} catch (Exception e) {
			LOGGER.error("Error getting job title for user " + (User) object);
		}
		
	}

}
