/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Direction_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Direction_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Direction_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Direction_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Direction_3(double x, double y, double z) {
    this(CGAL_KernelJNI.new_Direction_3__SWIG_0(x, y, z), true);
  }

  public Direction_3(Vector_3 v) {
    this(CGAL_KernelJNI.new_Direction_3__SWIG_1(Vector_3.getCPtr(v), v), true);
  }

  public Direction_3(Line_3 l) {
    this(CGAL_KernelJNI.new_Direction_3__SWIG_2(Line_3.getCPtr(l), l), true);
  }

  public Direction_3(Ray_3 r) {
    this(CGAL_KernelJNI.new_Direction_3__SWIG_3(Ray_3.getCPtr(r), r), true);
  }

  public Direction_3(Segment_3 s) {
    this(CGAL_KernelJNI.new_Direction_3__SWIG_4(Segment_3.getCPtr(s), s), true);
  }

  public double delta(int c) {
    return CGAL_KernelJNI.Direction_3_delta(swigCPtr, this, c);
  }

  public double dx() {
    return CGAL_KernelJNI.Direction_3_dx(swigCPtr, this);
  }

  public double dy() {
    return CGAL_KernelJNI.Direction_3_dy(swigCPtr, this);
  }

  public double dz() {
    return CGAL_KernelJNI.Direction_3_dz(swigCPtr, this);
  }

  public Vector_3 vector() {
    return new Vector_3(CGAL_KernelJNI.Direction_3_vector__SWIG_0(swigCPtr, this), true);
  }

  public void vector(Vector_3 ref) {
    CGAL_KernelJNI.Direction_3_vector__SWIG_1(swigCPtr, this, Vector_3.getCPtr(ref), ref);
  }

  public boolean equals(Direction_3 p) {
    return CGAL_KernelJNI.Direction_3_equals(swigCPtr, this, Direction_3.getCPtr(p), p);
  }

  public boolean not_equals(Direction_3 p) {
    return CGAL_KernelJNI.Direction_3_not_equals(swigCPtr, this, Direction_3.getCPtr(p), p);
  }

  public Direction_3 minus() {
    return new Direction_3(CGAL_KernelJNI.Direction_3_minus__SWIG_0(swigCPtr, this), true);
  }

  public void minus(Direction_3 ref) {
    CGAL_KernelJNI.Direction_3_minus__SWIG_1(swigCPtr, this, Direction_3.getCPtr(ref), ref);
  }

  public String toString() {
    return CGAL_KernelJNI.Direction_3_toString(swigCPtr, this);
  }

  public Direction_3 clone() {
    return new Direction_3(CGAL_KernelJNI.Direction_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Direction_3 other) {
    CGAL_KernelJNI.Direction_3_clone__SWIG_1(swigCPtr, this, Direction_3.getCPtr(other), other);
  }

}