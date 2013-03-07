package com.heeere.python27;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : sliceobject.h:8</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PySliceObject extends StructObject {
	public PySliceObject() {
		super();
	}
	/// C type : Py_ssize_t
	@Ptr 
	@Field(0) 
	public long ob_refcnt() {
		return this.io.getSizeTField(this, 0);
	}
	/// C type : Py_ssize_t
	@Ptr 
	@Field(0) 
	public PySliceObject ob_refcnt(long ob_refcnt) {
		this.io.setSizeTField(this, 0, ob_refcnt);
		return this;
	}
	/// C type : _typeobject*
	@Field(1) 
	public Pointer<PyTypeObject > ob_type() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : _typeobject*
	@Field(1) 
	public PySliceObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/**
	 * not NULL<br>
	 * C type : PyObject*
	 */
	@Field(2) 
	public Pointer<PyObject > start() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * not NULL<br>
	 * C type : PyObject*
	 */
	@Field(2) 
	public PySliceObject start(Pointer<PyObject > start) {
		this.io.setPointerField(this, 2, start);
		return this;
	}
	/**
	 * not NULL<br>
	 * C type : PyObject*
	 */
	@Field(3) 
	public Pointer<PyObject > stop() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * not NULL<br>
	 * C type : PyObject*
	 */
	@Field(3) 
	public PySliceObject stop(Pointer<PyObject > stop) {
		this.io.setPointerField(this, 3, stop);
		return this;
	}
	/**
	 * not NULL<br>
	 * C type : PyObject*
	 */
	@Field(4) 
	public Pointer<PyObject > step() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * not NULL<br>
	 * C type : PyObject*
	 */
	@Field(4) 
	public PySliceObject step(Pointer<PyObject > step) {
		this.io.setPointerField(this, 4, step);
		return this;
	}
	public PySliceObject(Pointer pointer) {
		super(pointer);
	}
}
