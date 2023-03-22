package com.dev2.maridaoExpress.handlers;

import java.io.Serializable;

public class FIeldMessage implements Serializable {

        private static final long serialVersionUID = 1l;

        private String fieldName;
        private String message;

        public FIeldMessage(String fieldName) {
                super();
        }

        public FIeldMessage(String fieldName, String message) {
                super();
                this.fieldName = fieldName;
                this.message = message;
        }

        public String getFieldName() {
                return fieldName;
        }

        public void setFieldName(String fieldName) {
                this.fieldName = fieldName;
        }

        public String getMessage() {
                return message;
        }

        public void setMessage(String message) {
                this.message = message;
        }
}

