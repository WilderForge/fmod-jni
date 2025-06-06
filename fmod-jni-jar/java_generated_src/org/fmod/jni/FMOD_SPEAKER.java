/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_SPEAKER {
  FMOD_SPEAKER_FRONT_LEFT,
  FMOD_SPEAKER_FRONT_RIGHT,
  FMOD_SPEAKER_FRONT_CENTER,
  FMOD_SPEAKER_LOW_FREQUENCY,
  FMOD_SPEAKER_SURROUND_LEFT,
  FMOD_SPEAKER_SURROUND_RIGHT,
  FMOD_SPEAKER_BACK_LEFT,
  FMOD_SPEAKER_BACK_RIGHT,
  FMOD_SPEAKER_TOP_FRONT_LEFT,
  FMOD_SPEAKER_TOP_FRONT_RIGHT,
  FMOD_SPEAKER_TOP_BACK_LEFT,
  FMOD_SPEAKER_TOP_BACK_RIGHT,
  FMOD_SPEAKER_MAX,
  FMOD_SPEAKER_FORCEINT(FMODJNI.FMOD_SPEAKER_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_SPEAKER swigToEnum(int swigValue) {
    FMOD_SPEAKER[] swigValues = FMOD_SPEAKER.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_SPEAKER swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_SPEAKER.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_SPEAKER() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_SPEAKER(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_SPEAKER(FMOD_SPEAKER swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

