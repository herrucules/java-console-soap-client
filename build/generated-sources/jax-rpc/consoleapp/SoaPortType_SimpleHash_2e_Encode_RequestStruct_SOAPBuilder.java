// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package consoleapp;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class SoaPortType_SimpleHash_2e_Encode_RequestStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private consoleapp.SoaPortType_SimpleHash_2e_Encode_RequestStruct _instance;
    private java.lang.String string;
    private static final int mySTRING_INDEX = 0;
    
    public SoaPortType_SimpleHash_2e_Encode_RequestStruct_SOAPBuilder() {
    }
    
    public void setString(java.lang.String string) {
        this.string = string;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case mySTRING_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case mySTRING_INDEX:
                    _instance.setString((java.lang.String)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (consoleapp.SoaPortType_SimpleHash_2e_Encode_RequestStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
