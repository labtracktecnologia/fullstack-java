package com.andrebongiolo.lavanderia.handler;

import com.andrebongiolo.lavanderia.exception.ValidaDocumentoException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ElementKind;
import javax.validation.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.*;

@Provider
public class ValidacaoDocumentoHandler implements ExceptionMapper<ValidaDocumentoException> {

    @Override
    public Response toResponse(ValidaDocumentoException ex) {


        return Response.status(Response.Status.BAD_REQUEST)
                .entity(ex.getMessage())
                .build();
    }
    
     private String printPropertyPath(Path path) {
        if (path == null) {
            return "UNKNOWN";
        }

        String propertyPath = "";
        Path.Node parameterNode = null;
        // Construct string representation of property path.
        // This will strip away any other nodes added by RESTEasy (method, parameter, ...).
        for (Path.Node node : path) {
            if (node.getKind() == ElementKind.PARAMETER) {
                parameterNode = node;
            }

            if (node.getKind() == ElementKind.PROPERTY) {
                if (!propertyPath.isEmpty()) {
                    propertyPath += ".";
                }
                propertyPath += node;
            }
        }

        if (propertyPath.isEmpty() && parameterNode != null) {
            // No property path constructed, assume this is a validation failure on a request parameter.
            propertyPath = parameterNode.toString();
        }
        return propertyPath;
    }

}
