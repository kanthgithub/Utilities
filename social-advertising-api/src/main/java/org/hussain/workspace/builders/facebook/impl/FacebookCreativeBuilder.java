package org.hussain.workspace.builders.facebook.impl;

import java.util.List;

import org.hussain.workspace.builders.facebook.CreativeBuilder;
import org.hussain.workspace.builders.facebook.bean.AdCreative;
import org.hussain.workspace.crud.FacebookCRUD;

public class FacebookCreativeBuilder implements FacebookCRUD, CreativeBuilder {
	List<String> queue;

	public List<Boolean> update() {
		return null;
		// TODO Auto-generated method stub

	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	public List<AdCreative> read() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> create() {
		return null;

	}

	public void addCreative(Integer a) {
		// TODO Auto-generated method stub

	}

	public void addCreative(String a) {
		// TODO Auto-generated method stub

	}

	public void addCreative(Short a) {
		// TODO Auto-generated method stub

	}

	public void addLinkAd(String title, String body, String objectUrl,
			String imageFile, String imageHash, String name, String actorId) {
		// TODO Auto-generated method stub

	}

	public void addPageLikeAd(String obejctId, String body, String name,
			String linkUrl, String imageFile, String imageHash, String title) {
		// TODO Auto-generated method stub

	}

	public void addEventAd(String obejctId, String body, String name,
			String imageFile, String title) {
		// TODO Auto-generated method stub

	}

	public void addMobileAppInstall(String obejctStoreUrl, String imageHash,
			String body, String actorName, String name, String actorImageHash,
			String callToActionType, String videoId) {
		// TODO Auto-generated method stub

	}

	public void addMobileAppEngage(String obejctStoreUrl, String imageHash,
			String title, String callToActionType, String linkDeepLinkUrl,
			String body, String name, String actorImageHash) {
		// TODO Auto-generated method stub

	}

	public void addDesktopApp(String objectId, String imageHash, String body,
			String actorName, String urlTags, String linkUrl, String name,
			String actorImageHash) {
		// TODO Auto-generated method stub

	}

	public void addLinkAd(String accountId, String title, String body,
			String objectUrl, String imageFile, String imageHash, String name,
			String actorId) {
		// TODO Auto-generated method stub
		
	}

	public void addPageLikeAd(String accountId, String obejctId, String body,
			String name, String linkUrl, String imageFile, String imageHash,
			String title) {
		// TODO Auto-generated method stub
		
	}

	public void addEventAd(String accountId, String obejctId, String body,
			String name, String imageFile, String title) {
		// TODO Auto-generated method stub
		
	}

	public void addMobileAppInstall(String accountId, String obejctStoreUrl,
			String imageHash, String body, String actorName, String name,
			String actorImageHash, String callToActionType, String videoId) {
		// TODO Auto-generated method stub
		
	}

	public void addMobileAppEngage(String accountId, String obejctStoreUrl,
			String imageHash, String title, String callToActionType,
			String linkDeepLinkUrl, String body, String name,
			String actorImageHash) {
		// TODO Auto-generated method stub
		
	}

	public void addDesktopApp(String accountId, String objectId,
			String imageHash, String body, String actorName, String urlTags,
			String linkUrl, String name, String actorImageHash) {
		// TODO Auto-generated method stub
		
	}

	public void fetch(String accountId) {
		// TODO Auto-generated method stub
		
	}

	public void fetch(String accountId, String fields) {
		// TODO Auto-generated method stub
		
	}
}
