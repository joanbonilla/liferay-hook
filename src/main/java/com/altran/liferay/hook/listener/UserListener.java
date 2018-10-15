package com.altran.liferay.hook.listener;

import java.util.Date;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.model.ModelListener;

public class UserListener implements ModelListener {

	@Override
	public void onAfterAddAssociation(Object arg0, String arg1, Object arg2) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterCreate(Object arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterRemove(Object arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterRemoveAssociation(Object arg0, String arg1, Object arg2) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterUpdate(Object arg0) throws ModelListenerException {
		
		Date now = new Date();
		System.out.println("User updated with date " + now.getTime());
		
	}

	@Override
	public void onBeforeAddAssociation(Object arg0, String arg1, Object arg2) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeCreate(Object arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeRemove(Object arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeRemoveAssociation(Object arg0, String arg1, Object arg2) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeUpdate(Object arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

}
