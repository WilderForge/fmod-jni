/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_STUDIO_INSTANCETYPE {
  FMOD_STUDIO_INSTANCETYPE_NONE,
  FMOD_STUDIO_INSTANCETYPE_SYSTEM,
  FMOD_STUDIO_INSTANCETYPE_EVENTDESCRIPTION,
  FMOD_STUDIO_INSTANCETYPE_EVENTINSTANCE,
  FMOD_STUDIO_INSTANCETYPE_PARAMETERINSTANCE,
  FMOD_STUDIO_INSTANCETYPE_BUS,
  FMOD_STUDIO_INSTANCETYPE_VCA,
  FMOD_STUDIO_INSTANCETYPE_BANK,
  FMOD_STUDIO_INSTANCETYPE_COMMANDREPLAY,
  FMOD_STUDIO_INSTANCETYPE_FORCEINT(FMODJNI.FMOD_STUDIO_INSTANCETYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_STUDIO_INSTANCETYPE swigToEnum(int swigValue) {
    FMOD_STUDIO_INSTANCETYPE[] swigValues = FMOD_STUDIO_INSTANCETYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_STUDIO_INSTANCETYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_STUDIO_INSTANCETYPE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_INSTANCETYPE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_INSTANCETYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_INSTANCETYPE(FMOD_STUDIO_INSTANCETYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

