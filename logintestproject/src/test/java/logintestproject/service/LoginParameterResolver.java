package logintestproject.service;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import logintestproject.model.Login;

public class LoginParameterResolver implements ParameterResolver {

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		
		        return parameterContext.getParameter().getType() == Login.class;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		return parameterContext.getParameter().getType() == Login.class
	            ? new Login("admin111", "password")
	            : null;
	}

}
