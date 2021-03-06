package com.heeere.python27;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : descrobject.h:55</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyWrapperDescrObject extends StructObject {
	public PyWrapperDescrObject() {
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
	public PyWrapperDescrObject ob_refcnt(long ob_refcnt) {
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
	public PyWrapperDescrObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/// C type : PyTypeObject*
	@Field(2) 
	public Pointer<PyTypeObject > d_type() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : PyTypeObject*
	@Field(2) 
	public PyWrapperDescrObject d_type(Pointer<PyTypeObject > d_type) {
		this.io.setPointerField(this, 2, d_type);
		return this;
	}
	/// C type : PyObject*
	@Field(3) 
	public Pointer<PyObject > d_name() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : PyObject*
	@Field(3) 
	public PyWrapperDescrObject d_name(Pointer<PyObject > d_name) {
		this.io.setPointerField(this, 3, d_name);
		return this;
	}
	/// C type : wrapperbase*
	@Field(4) 
	public Pointer<wrapperbase > d_base() {
		return this.io.getPointerField(this, 4);
	}
	/// C type : wrapperbase*
	@Field(4) 
	public PyWrapperDescrObject d_base(Pointer<wrapperbase > d_base) {
		this.io.setPointerField(this, 4, d_base);
		return this;
	}
	/**
	 * This can be any function pointer<br>
	 * C type : void*
	 */
	@Field(5) 
	public Pointer<? > d_wrapped() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * This can be any function pointer<br>
	 * C type : void*
	 */
	@Field(5) 
	public PyWrapperDescrObject d_wrapped(Pointer<? > d_wrapped) {
		this.io.setPointerField(this, 5, d_wrapped);
		return this;
	}
	public PyWrapperDescrObject(Pointer pointer) {
		super(pointer);
	}
}
