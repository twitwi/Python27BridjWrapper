package com.heeere.python27;
import com.heeere.python27.Python27Library.Py_ssize_t;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : classobject.h:27</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyMethodObject extends StructObject {
	public PyMethodObject() {
		super();
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public Pointer<Py_ssize_t > ob_refcnt() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public PyMethodObject ob_refcnt(Pointer<Py_ssize_t > ob_refcnt) {
		this.io.setPointerField(this, 0, ob_refcnt);
		return this;
	}
	/// C type : _typeobject*
	@Field(1) 
	public Pointer<PyTypeObject > ob_type() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : _typeobject*
	@Field(1) 
	public PyMethodObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/**
	 * The callable object implementing the method<br>
	 * C type : PyObject*
	 */
	@Field(2) 
	public Pointer<PyObject > im_func() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * The callable object implementing the method<br>
	 * C type : PyObject*
	 */
	@Field(2) 
	public PyMethodObject im_func(Pointer<PyObject > im_func) {
		this.io.setPointerField(this, 2, im_func);
		return this;
	}
	/**
	 * The instance it is bound to, or NULL<br>
	 * C type : PyObject*
	 */
	@Field(3) 
	public Pointer<PyObject > im_self() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * The instance it is bound to, or NULL<br>
	 * C type : PyObject*
	 */
	@Field(3) 
	public PyMethodObject im_self(Pointer<PyObject > im_self) {
		this.io.setPointerField(this, 3, im_self);
		return this;
	}
	/**
	 * The class that asked for the method<br>
	 * C type : PyObject*
	 */
	@Field(4) 
	public Pointer<PyObject > im_class() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * The class that asked for the method<br>
	 * C type : PyObject*
	 */
	@Field(4) 
	public PyMethodObject im_class(Pointer<PyObject > im_class) {
		this.io.setPointerField(this, 4, im_class);
		return this;
	}
	/**
	 * List of weak references<br>
	 * C type : PyObject*
	 */
	@Field(5) 
	public Pointer<PyObject > im_weakreflist() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * List of weak references<br>
	 * C type : PyObject*
	 */
	@Field(5) 
	public PyMethodObject im_weakreflist(Pointer<PyObject > im_weakreflist) {
		this.io.setPointerField(this, 5, im_weakreflist);
		return this;
	}
	public PyMethodObject(Pointer pointer) {
		super(pointer);
	}
}
