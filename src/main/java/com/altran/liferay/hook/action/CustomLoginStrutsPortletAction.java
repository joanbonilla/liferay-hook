package com.altran.liferay.hook.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

public class CustomLoginStrutsPortletAction extends BaseStrutsPortletAction {

	public void processAction(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		System.out.println("Custom ProcessAction Struts Action: " + themeDisplay.getUserId());

		originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest,
				actionResponse);
	}

	public String render(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {

		System.out.println("Custom Render Struts Action");

		return originalStrutsPortletAction.render(null, portletConfig, renderRequest, renderResponse);
	}

	public void serveResource(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws Exception {

		originalStrutsPortletAction.serveResource(originalStrutsPortletAction, portletConfig, resourceRequest,
				resourceResponse);
	}

}
