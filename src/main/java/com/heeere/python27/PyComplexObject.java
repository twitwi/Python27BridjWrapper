package com.heeere.python27;
import com.heeere.python27.Python27Library.Py_ssize_t;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : complexobject.h:23</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyComplexObject extends StructObject {
	public PyComplexObject() {
		super();
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public Pointer<Py_ssize_t > ob_refcnt() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public PyComplexObject ob_refcnt(Pointer<Py_ssize_t > ob_refcnt) {
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
	public PyComplexObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/// C type : Py_complex
	@Field(2) 
	public Py_complex cval() {
		return this.io.getNativeObjectField(this, 2);
	}
	/// C type : Py_complex
	@Field(2) 
	public PyComplexObject cval(Py_complex cval) {
		this.io.setNativeObjectField(this, 2, cval);
		return this;
	}
	public PyComplexObject(Pointer pointer) {
		super(pointer);
	}
}
