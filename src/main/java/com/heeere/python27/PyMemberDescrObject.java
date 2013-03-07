package com.heeere.python27;
import com.heeere.python27.Python27Library.PyMemberDef;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : descrobject.h:40</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyMemberDescrObject extends StructObject {
	public PyMemberDescrObject() {
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
	public PyMemberDescrObject ob_refcnt(long ob_refcnt) {
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
	public PyMemberDescrObject ob_type(Pointer<PyTypeObject > ob_type) {
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
	public PyMemberDescrObject d_type(Pointer<PyTypeObject > d_type) {
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
	public PyMemberDescrObject d_name(Pointer<PyObject > d_name) {
		this.io.setPointerField(this, 3, d_name);
		return this;
	}
	/// C type : PyMemberDef*
	@Field(4) 
	public Pointer<PyMemberDef > d_member() {
		return this.io.getPointerField(this, 4);
	}
	/// C type : PyMemberDef*
	@Field(4) 
	public PyMemberDescrObject d_member(Pointer<PyMemberDef > d_member) {
		this.io.setPointerField(this, 4, d_member);
		return this;
	}
	public PyMemberDescrObject(Pointer pointer) {
		super(pointer);
	}
}
