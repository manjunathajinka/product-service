package com.product.commons;

import com.product.exception.ServiceException;


public final class Preconditions {

        public static <T> void checkNotNull(T data, ServiceException ex) throws ServiceException {
        if (data == null) {
            throw ex;
        }
    }

}
