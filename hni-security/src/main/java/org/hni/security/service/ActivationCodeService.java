package org.hni.security.service;

import org.hni.common.service.BaseService;
import org.hni.security.om.ActivationCode;
import org.hni.user.om.User;

public interface ActivationCodeService extends BaseService<ActivationCode> {

	/**
	 * Given a 6 digit activation code, retrieve an ActivationCode entry from database
	 * @param authCode
	 * @return
	 */
	ActivationCode getByActivationCode(Long authCode);

	/**
	 * Validate whether an activation code is valid or not
	 * @param id
	 * @return
	 */
	<T> boolean validate(T id);
}
