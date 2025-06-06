/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_GUID {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_GUID(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_GUID obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_GUID(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_GUID)) return false;
    return this.swigCPtr == ((FMOD_GUID)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setData1(long value) {
    FMODJNI.FMOD_GUID_Data1_set(swigCPtr, this, value);
  }

  public long getData1() {
    return FMODJNI.FMOD_GUID_Data1_get(swigCPtr, this);
  }

  public void setData2(int value) {
    FMODJNI.FMOD_GUID_Data2_set(swigCPtr, this, value);
  }

  public int getData2() {
    return FMODJNI.FMOD_GUID_Data2_get(swigCPtr, this);
  }

  public void setData3(int value) {
    FMODJNI.FMOD_GUID_Data3_set(swigCPtr, this, value);
  }

  public int getData3() {
    return FMODJNI.FMOD_GUID_Data3_get(swigCPtr, this);
  }

  public void setData4(SWIGTYPE_p_unsigned_char value) {
    FMODJNI.FMOD_GUID_Data4_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getData4() {
    long cPtr = FMODJNI.FMOD_GUID_Data4_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public FMOD_GUID() {
    this(FMODJNI.new_FMOD_GUID(), true);
  }

}
