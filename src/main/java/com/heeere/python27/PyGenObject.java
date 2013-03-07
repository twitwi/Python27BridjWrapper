package com.heeere.python27;
import com.heeere.python27.Python27Library._frame;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : genobject.h:15</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyGenObject extends StructObject {
	public PyGenObject() {
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
	public PyGenObject ob_refcnt(long ob_refcnt) {
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
	public PyGenObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/**
	 * Note: gi_frame can be NULL if the generator is "finished"<br>
	 * C type : _frame*
	 */
	@Field(2) 
	public Pointer<_frame > gi_frame() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * Note: gi_frame can be NULL if the generator is "finished"<br>
	 * C type : _frame*
	 */
	@Field(2) 
	public PyGenObject gi_frame(Pointer<_frame > gi_frame) {
		this.io.setPointerField(this, 2, gi_frame);
		return this;
	}
	/// True if generator is being executed.
	@Field(3) 
	public int gi_running() {
		return this.io.getIntField(this, 3);
	}
	/// True if generator is being executed.
	@Field(3) 
	public PyGenObject gi_running(int gi_running) {
		this.io.setIntField(this, 3, gi_running);
		return this;
	}
	/**
	 * The code object backing the generator<br>
	 * C type : PyObject*
	 */
	@Field(4) 
	public Pointer<PyObject > gi_code() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * The code object backing the generator<br>
	 * C type : PyObject*
	 */
	@Field(4) 
	public PyGenObject gi_code(Pointer<PyObject > gi_code) {
		this.io.setPointerField(this, 4, gi_code);
		return this;
	}
	/**
	 * List of weak reference.<br>
	 * C type : PyObject*
	 */
	@Field(5) 
	public Pointer<PyObject > gi_weakreflist() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * List of weak reference.<br>
	 * C type : PyObject*
	 */
	@Field(5) 
	public PyGenObject gi_weakreflist(Pointer<PyObject > gi_weakreflist) {
		this.io.setPointerField(this, 5, gi_weakreflist);
		return this;
	}
	public PyGenObject(Pointer pointer) {
		super(pointer);
	}
}
