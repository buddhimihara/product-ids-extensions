/*
 * An XML document type.
 * Localname: getRenderingTypesResponse
 * Namespace: http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803
 * Java type: org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.impl;
/**
 * A document containing one getRenderingTypesResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803) element.
 *
 * This is a complex type.
 */
public class GetRenderingTypesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRenderingTypesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRENDERINGTYPESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "getRenderingTypesResponse");
    
    
    /**
     * Gets the "getRenderingTypesResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse getGetRenderingTypesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse)get_store().find_element_user(GETRENDERINGTYPESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRenderingTypesResponse" element
     */
    public void setGetRenderingTypesResponse(org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse getRenderingTypesResponse)
    {
        generatedSetterHelperImpl(getRenderingTypesResponse, GETRENDERINGTYPESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getRenderingTypesResponse" element
     */
    public org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse addNewGetRenderingTypesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse target = null;
            target = (org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse)get_store().add_element_user(GETRENDERINGTYPESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getRenderingTypesResponse(@http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803).
     *
     * This is a complex type.
     */
    public static class GetRenderingTypesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.GetRenderingTypesResponseDocument.GetRenderingTypesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetRenderingTypesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RENDERINGTYPE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803", "renderingType");
        
        
        /**
         * Gets array of all "renderingType" elements
         */
        public javax.xml.namespace.QName[] getRenderingTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RENDERINGTYPE$0, targetList);
                javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
                return result;
            }
        }
        
        /**
         * Gets ith "renderingType" element
         */
        public javax.xml.namespace.QName getRenderingTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "renderingType" elements
         */
        public org.apache.xmlbeans.XmlQName[] xgetRenderingTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RENDERINGTYPE$0, targetList);
                org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "renderingType" element
         */
        public org.apache.xmlbeans.XmlQName xgetRenderingTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "renderingType" element
         */
        public int sizeOfRenderingTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENDERINGTYPE$0);
            }
        }
        
        /**
         * Sets array of all "renderingType" element
         */
        public void setRenderingTypeArray(javax.xml.namespace.QName[] renderingTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(renderingTypeArray, RENDERINGTYPE$0);
            }
        }
        
        /**
         * Sets ith "renderingType" element
         */
        public void setRenderingTypeArray(int i, javax.xml.namespace.QName renderingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setQNameValue(renderingType);
            }
        }
        
        /**
         * Sets (as xml) array of all "renderingType" element
         */
        public void xsetRenderingTypeArray(org.apache.xmlbeans.XmlQName[]renderingTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(renderingTypeArray, RENDERINGTYPE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "renderingType" element
         */
        public void xsetRenderingTypeArray(int i, org.apache.xmlbeans.XmlQName renderingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RENDERINGTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(renderingType);
            }
        }
        
        /**
         * Inserts the value as the ith "renderingType" element
         */
        public void insertRenderingType(int i, javax.xml.namespace.QName renderingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RENDERINGTYPE$0, i);
                target.setQNameValue(renderingType);
            }
        }
        
        /**
         * Appends the value as the last "renderingType" element
         */
        public void addRenderingType(javax.xml.namespace.QName renderingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGTYPE$0);
                target.setQNameValue(renderingType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "renderingType" element
         */
        public org.apache.xmlbeans.XmlQName insertNewRenderingType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(RENDERINGTYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "renderingType" element
         */
        public org.apache.xmlbeans.XmlQName addNewRenderingType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(RENDERINGTYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "renderingType" element
         */
        public void removeRenderingType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENDERINGTYPE$0, i);
            }
        }
    }
}
