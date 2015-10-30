package mx.gob.imss.cit.dictamen.contador.web.util;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * Clase de Utilerias para validar el Rol del Usuario que esta utilizando la aplicaci&oacute;n.
 * @author anavarrete
 *
 */
public class UsuarioUtil {

	private static User usuario;

	/**
	 * Obtiene el Rol.
	 * 
	 * @param idRol
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static boolean getRol(String idRol) throws PortalException, SystemException {
		FacesContext context = FacesContext.getCurrentInstance();
		PortletRequest portletRequest = (PortletRequest) context.getExternalContext().getRequest();
		ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		usuario = themeDisplay.getUser();
		List<Role> roles = RoleLocalServiceUtil.getUserRoles(usuario.getUserId());
		for (Role rol : roles) {
			if (rol.getName().equals(idRol)) {

				return true;
			}
		}
		return false;
	}

	/**
	 * Obtiene el Usuario.
	 * @return
	 */
	public static String getUsuario(){

		PortletRequest portletRequest = (PortletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);

		return themeDisplay.getUser().getScreenName();
	}

}
