package com.heeere.python27;
import com.heeere.python27.Python27Library.Py_ssize_t;
import com.heeere.python27.Python27Library._frame;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : traceback.h:9</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyTracebackObject extends StructObject {
	public PyTracebackObject() {
		super();
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public Pointer<Py_ssize_t > ob_refcnt() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public PyTracebackObject ob_refcnt(Pointer<Py_ssize_t > ob_refcnt) {
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
	public PyTracebackObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/// C type : _traceback*
	@Field(2) 
	public Pointer<PyTracebackObject > tb_next() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : _traceback*
	@Field(2) 
	public PyTracebackObject tb_next(Pointer<PyTracebackObject > tb_next) {
		this.io.setPointerField(this, 2, tb_next);
		return this;
	}
	/// C type : _frame*
	@Field(3) 
	public Pointer<_frame > tb_frame() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : _frame*
	@Field(3) 
	public PyTracebackObject tb_frame(Pointer<_frame > tb_frame) {
		this.io.setPointerField(this, 3, tb_frame);
		return this;
	}
	@Field(4) 
	public int tb_lasti() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public PyTracebackObject tb_lasti(int tb_lasti) {
		this.io.setIntField(this, 4, tb_lasti);
		return this;
	}
	@Field(5) 
	public int tb_lineno() {
		return this.io.getIntField(this, 5);
	}
	@Field(5) 
	public PyTracebackObject tb_lineno(int tb_lineno) {
		this.io.setIntField(this, 5, tb_lineno);
		return this;
	}
	public PyTracebackObject(Pointer pointer) {
		super(pointer);
	}
}
