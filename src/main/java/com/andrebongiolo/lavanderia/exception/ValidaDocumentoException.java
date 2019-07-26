package com.andrebongiolo.lavanderia.exception;

import javax.persistence.PersistenceException;

public class ValidaDocumentoException extends PersistenceException {
	public ValidaDocumentoException() {
		super("O documento precisa conter apenas números ");
	}
}
